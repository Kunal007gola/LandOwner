package com.rme.landOwner;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Replies {

	@Id
	private int rid;
	private String uuid;
	private String rBody;
	private Date createdAt;
	@Column(name="Attachments")
	private ArrayList<String> img;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private HashSet<Discussion> repDiscus ;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="commReplie")
	private HashSet<Comments> repComments;
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getrBody() {
		return rBody;
	}
	public void setrBody(String rBody) {
		this.rBody = rBody;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public ArrayList<String> getImg() {
		return img;
	}
	public void setImg(ArrayList<String> img) {
		this.img = img;
	}
	public HashSet<Discussion> getRepDiscus() {
		return repDiscus;
	}
	public void setRepDiscus(HashSet<Discussion> repDiscus) {
		this.repDiscus = repDiscus;
	}
	public HashSet<Comments> getRepComments() {
		return repComments;
	}
	public void setRepComments(HashSet<Comments> repComments) {
		this.repComments = repComments;
	}
	
}
