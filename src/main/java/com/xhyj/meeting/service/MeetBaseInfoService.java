/**
 * 
 */
package com.xhyj.meeting.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.xhyj.meeting.dao.MeetBaseInfoDao;
import com.xhyj.meeting.db.entity.MeetBaseInfo;
import com.xhyj.meeting.util.MyBeanUtil;
import com.xhyj.meeting.util.TokenUtl;


/**
 * <p>Title: MeetBaseInfoService.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月13日
 */
@Service
public class MeetBaseInfoService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Value(value = "${xhyj.page.size}")
	private int pageSize;
	@Autowired
	private MeetBaseInfoDao meetBaseInfoDao;
	/**
	 * 
	 * @param meetBaseInfo
	 * @param pageNum
	 * @return
	 */
	public Page<MeetBaseInfo> findPage(MeetBaseInfo meetBaseInfo,int pageNum) {
		Specification<MeetBaseInfo> specification = getWhereClause(meetBaseInfo);
		Pageable page =new PageRequest(pageNum, pageSize,Sort.Direction.ASC, "id");
		return meetBaseInfoDao.findAll(specification, page);
	}
	/**
	 * 
	 * @return
	 */
	public List<MeetBaseInfo> findAll() {
		return meetBaseInfoDao.findAll();
	}
	/**
	 * 
	 * @param meetBaseInfo
	 * @return
	 */
	public MeetBaseInfo findOneById(MeetBaseInfo meetBaseInfo) {
		return meetBaseInfoDao.findOne(meetBaseInfo.getId());
	}
	
	/**
	 * @param meetBaseInfo
	 * @return
	 */
	public MeetBaseInfo add(MeetBaseInfo meetBaseInfo) {
		MyBeanUtil.complementAddBean(meetBaseInfo, TokenUtl.getOperatorIdFromToken(""));
		logger.info(meetBaseInfo.toString());
		return meetBaseInfoDao.save(meetBaseInfo);
	}
	
	/**
	 * @param meetBaseInfo
	 * @return
	 */
    @Transactional
	public MeetBaseInfo update(MeetBaseInfo meetBaseInfo) {
    	MeetBaseInfo dbBean = meetBaseInfoDao.findOne(meetBaseInfo.getId());
    	dbBean.setName(meetBaseInfo.getName());
    	MyBeanUtil.setBean(meetBaseInfo, dbBean);
    	MyBeanUtil.complementUpdateBean(meetBaseInfo, TokenUtl.getOperatorIdFromToken(""));
    	meetBaseInfoDao.save(dbBean);
		return dbBean;
	}
    
    @Transactional
	public void delete(MeetBaseInfo meetBaseInfo) {
    	meetBaseInfoDao.delete(meetBaseInfo.getId());
	}
    /**
     * 动态生成where语句
     * @param searchArticle
     * @return
     */
    private Specification<MeetBaseInfo> getWhereClause(final MeetBaseInfo meetBaseInfo){
        return new Specification<MeetBaseInfo>() {
			@Override
			public Predicate toPredicate(Root<MeetBaseInfo> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicate = new ArrayList<>();
                if(!StringUtils.isEmpty(meetBaseInfo.getName())){
                    predicate.add(cb.like(root.get("name").as(String.class), "%"+meetBaseInfo.getName()+"%"));
                }
                if(!StringUtils.isEmpty(meetBaseInfo.getStt())){
                    predicate.add(cb.equal(root.get("stt").as(String.class), meetBaseInfo.getStt()));
                }
                Predicate[] pre = new Predicate[predicate.size()];
                return query.where(predicate.toArray(pre)).getRestriction();
			}
        };
    }
}
