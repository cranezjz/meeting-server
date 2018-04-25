package com.xhyj.meeting.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Aspect
@Component
public class ServiceLogAspect {

	Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * com.xhyj.meeting.service..*.*(..))")
    public void webRequestLog() {}

    // @Order(5)
    @Before("webRequestLog()")
    public void doBefore(JoinPoint joinPoint) {
        try {
            //接收到请求，记录请求内容
            String beanName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            String params = "";
            Gson gson = new Gson();
            params = gson.toJson(joinPoint.getArgs());
            logger.debug("invoked: beanName=" + beanName + "; "+"methodName=" + methodName +
            		"; params=" + params);

        } catch (Exception e) {
            logger.error("***操作请求日志记录失败doBefore()***", e);
        }
    }

    @AfterReturning(returning = "result", pointcut = "webRequestLog()")
    public void doAfterReturning(Object result) {
        try {
        	logger.debug("service return : " + new ObjectMapper().writeValueAsString(result));
        } catch (Exception e) {
            logger.error("***操作请求日志记录失败doAfterReturning()***", e);
        }
    }
}