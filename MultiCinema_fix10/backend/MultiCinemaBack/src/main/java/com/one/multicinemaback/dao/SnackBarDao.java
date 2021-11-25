package com.one.multicinemaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.SnackBarDto;

@Mapper
@Repository
public interface SnackBarDao {
	void addSnackBar(SnackBarDto product);
	List<SnackBarDto> snackbarlist(String category);
	SnackBarDto snackbardetail(String product);
}
