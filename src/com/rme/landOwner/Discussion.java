package com.rme.landOwner;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Discussion {
	
	@Id
	@Column(name="did", updatable = false, nullable = false)
	private long did;
	private String uuid;
	private int like;
	private int dislike;
	private String body;
	private String title;
	@Column(name="Created_at")
	private Date createdAt;
	public Discussion() {
		super();
	}
	@Column(name="Updated_at")
	private Date updatedAt;
	private ArrayList<String> attachments;
	public Discussion(long did, int like, int dislike, Date createdAt,
			Date updatedAt) {
		super();
		this.did = did;
		this.like = like;
		this.dislike = dislike;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	@ManyToOne(cascade=CascadeType.ALL)
	private User discUser;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="repDiscus")
	private Set<Replies> disreplies=new HashSet<>();
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getDislike() {
		return dislike;
	}
	public void setDislike(int dislike) {
		this.dislike = dislike;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public ArrayList<String> getAttachments() {
		return attachments;
	}
	public void setAttachments(ArrayList<String> attachments) {
		this.attachments = attachments;
	}
	public User getDiscUser() {
		return discUser;
	}
	public void setDiscUser(User discUser) {
		this.discUser = discUser;
	}
	public long getDid() {
		return did;
	}
	public void setDid(long did) {
		this.did = did;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Set<Replies> getDisreplies() {
		return disreplies;
	}
	public void setDisreplies(HashSet<Replies> disreplies) {
		this.disreplies = disreplies;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
