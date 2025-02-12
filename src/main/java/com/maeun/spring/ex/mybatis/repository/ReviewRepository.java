package com.maeun.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;

import com.maeun.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	// id가 5인 행 조회
	public Review selectReview();
}
