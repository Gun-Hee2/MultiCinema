package com.one.multicinemaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.SbPayDao;
import com.one.multicinemaback.dto.SbPayDto;

@Service
@Transactional
public class SbPayService {
	
	@Autowired
	SbPayDao dao;
	
	// 스낵바 카카오결제 내역 데이터 저장
	public void insertsbpay(SbPayDto dto) {
		dao.insertsbpay(dto);
	}
	
	// 스낵바 카카오결제 내역 데이터 불러오기
	public SbPayDto getsbpay(String tid) {
		return dao.getsbpay(tid);
	}
	
	// 내 결제 내역 불러오기(마이 페이지)
	public List<SbPayDto> getSbPayList(String id) {
		return dao.getSbPayList(id);
	}
}
