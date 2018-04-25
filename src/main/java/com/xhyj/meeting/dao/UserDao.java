/**
 * 
 */
package com.xhyj.meeting.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xhyj.meeting.db.entity.UserBase;


/**
 * <p>Title: MeetBaseInfoDao.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月13日
 */
public interface UserDao extends JpaRepository<UserBase, Integer> ,JpaSpecificationExecutor<UserBase>{

}