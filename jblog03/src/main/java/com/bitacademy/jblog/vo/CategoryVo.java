package com.bitacademy.jblog.vo;

public class CategoryVo {
	private long no;
	private String title;
	private long numPost;
	private String desc;
	private String id;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getNumPost() {
		return numPost;
	}
	public void setNumPost(long numPost) {
		this.numPost = numPost;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CategoryVo [no=" + no + ", title=" + title + ", numPost=" + numPost + ", desc=" + desc + ", id=" + id
				+ "]";
	}
}
