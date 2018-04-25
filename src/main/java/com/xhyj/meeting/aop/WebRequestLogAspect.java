package com.xhyj.meeting.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.xhyj.util.annotation.AnnoHelper;

@Aspect
@Component
public class WebRequestLogAspect {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	private ThreadLocal<Long> threadStorage = new ThreadLocal<Long>();

    @Pointcut("execution(public * com.xhyj.meeting.controller..*.*(..))")
    public void webRequestLog() {}

    // @Order(5)
    @Before("webRequestLog()")
    public void doBefore(JoinPoint joinPoint) {
        try {
        	threadStorage.set(System.currentTimeMillis());
            //接收到请求，记录请求内容
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            String beanName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            String uri = request.getRequestURI();
            String remoteAddr = getIpAddr(request);
            String method = request.getMethod();
            String params = "";
            Gson gson = new Gson();
            params = gson.toJson(request.getParameterMap());
            logger.info("收到请求("+AnnoHelper.getLabelValue(beanName, methodName)+"):uri=" + uri + "; beanName=" + beanName + "; "+"methodName=" + methodName +
            		"; remoteAddr=" + remoteAddr + "; method="+method
            		+  "; params=" + params);
        } catch (Exception e) {
            logger.error("***操作请求日志记录失败doBefore()***", e);
        }
    }

    @AfterReturning(returning = "result", pointcut = "webRequestLog()")
    public void doAfterReturning(Object result) {
        try {
        	long useTime=System.currentTimeMillis()-threadStorage.get();
        	logger.info("返回信息 :("+useTime+") " + new ObjectMapper().writeValueAsString(result));
        } catch (Exception e) {
            logger.error("***操作请求日志记录失败doAfterReturning()***", e);
        }
    }


    /**
     * 获取登录用户远程主机ip地址
     * 
     * @param request
     * @return
     */
    private String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}