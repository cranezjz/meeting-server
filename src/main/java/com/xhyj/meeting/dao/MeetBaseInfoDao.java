/**
 * 
 */
package com.xhyj.meeting.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xhyj.meeting.db.entity.MeetBaseInfo;

/**
 * <p>Title: MeetBaseInfoDao.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月13日
 */
public interface MeetBaseInfoDao extends JpaRepository<MeetBaseInfo, Integer> ,JpaSpecificationExecutor<MeetBaseInfo>{

	
	@Query(value="select id,name,stt "
			+ "from meet_base_info where ",nativeQuery = true)
	List<MeetBaseInfo> query();
}