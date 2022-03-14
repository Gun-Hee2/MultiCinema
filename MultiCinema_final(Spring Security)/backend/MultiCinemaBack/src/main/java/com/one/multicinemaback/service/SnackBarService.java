package com.one.multicinemaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.SnackBarDao;
import com.one.multicinemaback.dto.SnackBarDto;

@Service
@Transactional
public class SnackBarService {
	
	@Autowired
	SnackBarDao dao;
	
	//스낵바 메뉴 추가
	public void addSnackBar(SnackBarDto product) {
		dao.addSnackBar(product);
	}
	
	//스낵바 리스트
	public List<SnackBarDto> snackbarlist(String category) {
		return dao.snackbarlist(category);
	}
	
	//스낵바 상품 상세정보
	public SnackBarDto snackbardetail(String product) {
		return dao.snackbardetail(product);
	}
}
