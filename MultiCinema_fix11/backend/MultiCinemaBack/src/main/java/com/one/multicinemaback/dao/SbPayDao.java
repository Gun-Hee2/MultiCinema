package com.one.multicinemaback.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.SbPayDto;

@Mapper
@Repository
public interface SbPayDao {
	void insertsbpay(SbPayDto dto);
	SbPayDto getsbpay(String tid);
	boolean delsbpay(String tid);

}
