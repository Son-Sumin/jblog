package com.bitacademy.jblog.vo;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class UserVo {
	@NotEmpty
	@Length(min=2,max=10)
	private String id;
	@NotEmpty
	@Length(min=2, max=5)
	private String name;
	@NotEmpty
	@Length(min=4,max=16)
	private String password;
	private String role;
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
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "UserVo [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + "]";
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
