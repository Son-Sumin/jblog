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

	public int insertInit(CategoryVo categoryVo) {
		return sqlSession.insert("category.insertInit", categoryVo);
	}
	
	public List<CategoryVo> findAll() {
		return sqlSession.selectList("category.findAll");
	}
	
	public int insert(CategoryVo categoryVo) {
		return sqlSession.insert("category.insert", categoryVo);
	}

	public int deleteByNo(Long no) {
		return sqlSession.delete("category.delete", no);
		
	}
}
