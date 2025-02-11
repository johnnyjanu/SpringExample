package com.maeun.spring.ex.database.repository;

import java.util.List;

import com.maeun.spring.ex.database.domain.UsedGoods;

// 데이터베이스 관련 처리
// Mybatis Framework
public interface UsedGoodsRespository {
	
	// used_goods 테이블 모든 행 조회
	public List<UsedGoods> selectUsedGoodsList();
	
}
