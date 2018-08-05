package com.rme.landOwner;

import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	private long id;
	private String uuid;
	private long profileView;
	private short star;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="discUser")
	private HashSet<Discussion> userDiscussion;
	
	public HashSet<Discussion> getUserDiscussion() {
		return userDiscussion;
	}
	public void setUserDiscussion(HashSet<Discussion> userDiscussion) {
		this.userDiscussion = userDiscussion;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public long getProfileView() {
		return profileView;
	}
	public void setProfileView(long profileView) {
		this.profileView = profileView;
	}
	public short getStar() {
		return star;
	}
	public void setStar(short star) {
		this.star = star;
	}
	
	
}
