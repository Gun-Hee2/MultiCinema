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
	public void insertsbpay(SbPayDto dto) {
		dao.insertsbpay(dto);
	}
	
	public SbPayDto getsbpay(String tid) {
		return dao.getsbpay(tid);
	}
	
	public boolean delsbpay(String tid) {
		return dao.delsbpay(tid);
	}
	
	public List<SbPayDto> getSbPayList(String id) {
		return dao.getSbPayList(id);
	}
}
