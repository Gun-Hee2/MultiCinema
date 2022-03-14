package com.one.multicinemaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.SbPayDto;

@Mapper
@Repository
public interface SbPayDao {
	
	// 내 결제 내역 불러오기(마이 페이지)
	public List<SbPayDto> getSbPayList(String id);
	
	// 스낵바 카카오결제 내역 데이터 저장
	void insertsbpay(SbPayDto dto);
	
	// 스낵바 카카오결제 내역 데이터 불러오기
	SbPayDto getsbpay(String tid);

}
