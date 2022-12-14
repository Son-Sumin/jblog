package com.bitacademy.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.BlogRepository;
import com.bitacademy.jblog.vo.BlogVo;

@Service
public class BlogService {
	@Autowired
	private BlogRepository blogRepository;
	
	public void addBlog(BlogVo blogVo) {
		blogRepository.insert(blogVo);
	}
}
