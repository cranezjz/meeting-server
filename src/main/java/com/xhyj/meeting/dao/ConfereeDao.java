package com.xhyj.meeting.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xhyj.meeting.db.entity.MeetConferee;


/**
 * <p>Title: MeetBaseInfoDao.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月13日
 */
public interface ConfereeDao extends JpaRepository<MeetConferee, Integer> ,JpaSpecificationExecutor<MeetConferee>{

}