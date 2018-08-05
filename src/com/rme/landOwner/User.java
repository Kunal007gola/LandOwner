package com.rme.landOwner;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@Column(nullable=false)
	private long id;
	@Column(nullable=false)
	private String uuid;
	private long profileView;
	private short star;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Discussion> userDiscussion=new HashSet<>();
	
	public User() {
		super();
	}
	public User(long id, String uuid, long profileView, short star) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.profileView = profileView;
		this.star = star;
	}
	public Set<Discussion> getUserDiscussion() {
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
