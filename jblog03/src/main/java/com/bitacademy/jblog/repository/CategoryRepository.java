package com.bitacademy.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.CategoryVo;

@Repository
public class CategoryRepository {
	@Autowired
	private SqlSession sqlSession;

	public int insert(CategoryVo categoryVo) {
		return sqlSession.insert("category.insert", categoryVo);
		
	}
	
	public List<CategoryVo> findAll() {
		return sqlSession.selectList("category.findAll");
	}
}
