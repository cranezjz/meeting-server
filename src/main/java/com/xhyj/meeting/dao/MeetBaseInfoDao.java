/**
 * 
 */
package com.xhyj.meeting.dao;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xhyj.meeting.db.entity.MeetBaseInfo;


/**
 * <p>Title: MeetBaseInfoDao.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月13日
 */
@DynamicUpdate
public interface MeetBaseInfoDao extends JpaRepository<MeetBaseInfo, String> ,JpaSpecificationExecutor<MeetBaseInfo>{

}