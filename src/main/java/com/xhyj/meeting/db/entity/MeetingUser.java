package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MEETING_USER database table.
 * 
 */
@Entity
@Table(name="MEETING_USER")
@NamedQuery(name="MeetingUser.findAll", query="SELECT m FROM MeetingUser m")
public class MeetingUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String name;

	public MeetingUser() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}