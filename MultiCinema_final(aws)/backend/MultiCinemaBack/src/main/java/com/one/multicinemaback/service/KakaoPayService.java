package com.one.multicinemaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.KakaoPayDao;
import com.one.multicinemaback.dto.KakaoPayDto;

@Service
@Transactional
public class KakaoPayService {
	
	@Autowired
	KakaoPayDao dao;
	
	public void insertpay(KakaoPayDto dto) {
		dao.insertpay(dto);
	}
	
	public KakaoPayDto getspay(String tid) {
		return dao.getspay(tid);
	}

}
