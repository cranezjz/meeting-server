/**
 * 
 */
package com.xhyj.meeting.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xhyj.meeting.db.entity.Organization;


/**
 * <p>Title: MeetBaseInfoDao.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月13日
 */
public interface OrganizationDao extends JpaRepository<Organization, Integer> ,JpaSpecificationExecutor<Organization>{
	List<Organization> findByName(String name);

}