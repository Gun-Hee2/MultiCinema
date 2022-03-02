package com.one.multicinemaback.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.KakaoPayDto;

@Mapper
@Repository
public interface KakaoPayDao {
	void insertpay(KakaoPayDto dto);
	KakaoPayDto getspay(String tid);

}
