package com.rme.landOwner;

import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TrendingDiscussion {

	private int month;
	private int replies;
	private int repliesCount;
	private int viewCount;
	private int likeCount;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trend;
	@OneToOne(cascade=CascadeType.ALL)
	private Discussion trending;
	
	public TrendingDiscussion(int month, int replies, int repliesCount, int viewCount, int likeCount) {
		super();
		this.month = month;
		this.replies = replies;
		this.repliesCount = repliesCount;
		this.viewCount = viewCount;
		this.likeCount = likeCount;
	}
	public Discussion getTrending() {
		return trending;
	}
	public void setTrending(Discussion trending) {
		this.trending = trending;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getReplies() {
		return replies;
	}
	public void setReplies(int replies) {
		this.replies = replies;
	}
	public int getRepliesCount() {
		return repliesCount;
	}
	public void setRepliesCount(int repliesCount) {
		this.repliesCount = repliesCount;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	
}
