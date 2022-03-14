package com.one.multicinemaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.SnackBarDto;

@Mapper
@Repository
public interface SnackBarDao {
	//스낵바 메뉴 추가
	void addSnackBar(SnackBarDto product);
	
	//스낵바 리스트
	List<SnackBarDto> snackbarlist(String category);
	
	//스낵바 상품 상세정보
	SnackBarDto snackbardetail(String product);
}
