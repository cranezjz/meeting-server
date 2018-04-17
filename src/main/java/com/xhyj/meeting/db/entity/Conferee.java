package com.xhyj.meeting.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * <p>Title: Conferee.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月17日
 */
@Entity
@Table(name = "meet_conferee")
public class Conferee {
	@Id
	public java.lang.String id;
	/**
	 * 会议id
	 */
	@Column
	public java.lang.String meet_id;
	/**
	 * 姓名
	 */
	@Column
	public java.lang.String name;
	/**
	 * 手机号
	 */
	@Column
	public java.lang.String mobile;
	/**
	 * 所属机构id
	 */
	@Column
	public java.lang.String organization_id;
	/**
	 * 所属机构名称
	 */
	@Column
	public java.lang.String organization_name;
	/**
	 * 部门
	 */
	@Column
	public java.lang.String department;
	/**
	 * 职务
	 */
	@Column
	public java.lang.String title;
	/**
	 * 职级
	 */
	@Column
	public double level;
	/**
	 * 角色（1：参会者；2：联系人；3：司机）
	 */
	@Column
	public java.lang.String role;
	/**
	 * 签到状态（0：未签到；1：已签到）
	 */
	@Column
	public java.lang.String stt;
	/**
	 * 报名方式(1:管理员添加；2：自主报名)
	 */
	@Column
	public java.lang.String apply_way;
	/**
	 * 是否拼住(0：不拼住；1：拼住)
	 */
	@Column
	public java.lang.String is_live_together;
	/**
	 * 报名会场(填写会场id，多个会场“，”分割)
	 */
	@Column
	public java.lang.String apply_meet_places;
	/**
	 * 申请的宴席（多个宴席用，分割）
	 */
	@Column
	public java.lang.String apply_meet_feasts;
	/**
	 * 签到方式
	 */
	@Column
	public java.lang.String sign_type;
	/**
	 * 签到时间
	 */
	@Column
	public java.lang.String sign_time;
	/**
	 * 创建时间
	 */
	@Column
	public java.lang.String insert_date;
	/**
	 * 最后修改日期
	 */
	@Column
	public java.lang.String modify_date;
	/**
	 * 操作员id
	 */
	@Column
	public java.lang.String operate_id;
}
