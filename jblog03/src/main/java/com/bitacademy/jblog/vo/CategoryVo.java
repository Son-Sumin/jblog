package com.bitacademy.jblog.vo;

public class CategoryVo {
	private long no;
	private String title;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CategoryVo [no=" + no + ", title=" + title + ", id=" + id + "]";
	}
}
