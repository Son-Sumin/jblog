package com.bitacademy.jblog.vo;

public class UserVo {
	private String id;
	private String name;
	private String password;
//	private String blogTitle;
//	private String blogProfile;
//	private long categoryNo;
//	private String categoryTitle;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserVo [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
//	public String getBlogTitle() {
//		return blogTitle;
//	}
//	public void setBlogTitle(String blogTitle) {
//		this.blogTitle = blogTitle;
//	}
//	public String getBlogProfile() {
//		return blogProfile;
//	}
//	public void setBlogProfile(String blogProfile) {
//		this.blogProfile = blogProfile;
//	}
//	public long getCategoryNo() {
//		return categoryNo;
//	}
//	public void setCategoryNo(long categoryNo) {
//		this.categoryNo = categoryNo;
//	}
//	public String getCategoryTitle() {
//		return categoryTitle;
//	}
//	public void setCategoryTitle(String categoryTitle) {
//		this.categoryTitle = categoryTitle;
//	}
//	@Override
//	public String toString() {
//		return "PostVo [id=" + id + ", name=" + name + ", password=" + password + ", blogTitle=" + blogTitle
//				+ ", blogProfile=" + blogProfile + ", categoryNo=" + categoryNo + ", categoryTitle=" + categoryTitle
//				+ "]";
//	}
}
