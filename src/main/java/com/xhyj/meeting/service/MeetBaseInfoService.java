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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.xhyj.meeting.dao.MeetBaseInfoDao;
import com.xhyj.meeting.db.entity.MeetBaseInfo;


/**
 * <p>Title: MeetBaseInfoService.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月13日
 */
@Service
public class MeetBaseInfoService {
	@Autowired
	private MeetBaseInfoDao meetBaseInfoDao;
	public Page<MeetBaseInfo> findPage(MeetBaseInfo meetBaseInfo,int pageNum) {
		//Sort sort = new Sort(Sort.Direction.DESC,"insert_date");
		Specification<MeetBaseInfo> specification = getWhereClause(meetBaseInfo);
		Pageable page = PageRequest.of(pageNum, 5);
		Page<MeetBaseInfo> all = meetBaseInfoDao.findAll(specification, page);
		//return meetBaseInfoDao.findAll(page);
		return all;
	}
	
	/**
     * 动态生成where语句
     * @param searchArticle
     * @return
     */
    private Specification<MeetBaseInfo> getWhereClause(final MeetBaseInfo meetBaseInfo){
        return new Specification<MeetBaseInfo>() {
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<MeetBaseInfo> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicate = new ArrayList<>();
                if(meetBaseInfo.getName()!=null){
                    predicate.add(cb.like(root.get("name").as(String.class), "%"+meetBaseInfo.getName()+"%"));
                }
                if(meetBaseInfo.getStt()!=null){
                    predicate.add(cb.equal(root.get("stt").as(String.class), meetBaseInfo.getStt()));
                }
                /*
                if(searchArticle.getRecTimeStart()!=null){
                    predicate.add(cb.greaterThanOrEqualTo(root.get("recommendTime").as(Date.class), searchArticle.getRecTimeStart()));
                }
                if (searchArticle.getRecTimeEnd()!=null){
                    predicate.add(cb.lessThanOrEqualTo(root.get("recommendTime").as(Date.class), searchArticle.getRecTimeEnd()));
                }
                if (StringUtils.isNotBlank(searchArticle.getNickname())){
                    //两张表关联查询
                    Join<Article,User> userJoin = root.join(root.getModel().getSingularAttribute("user",User.class),JoinType.LEFT);
                    predicate.add(cb.like(userJoin.get("nickname").as(String.class), "%" + searchArticle.getNickname() + "%"));
                }*/
                Predicate[] pre = new Predicate[predicate.size()];
                return query.where(predicate.toArray(pre)).getRestriction();
			}
        };
    }
}
