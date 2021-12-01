package com.one.multicinemaback.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.BbsDto;
import com.one.multicinemaback.dto.BbsParam;

@Mapper
@Repository
public interface BbsDao extends Serializable {
	
	List<BbsDto> getbbslist(BbsParam param);
	
	int getbbscount(BbsParam param);
	
	boolean writeBbs(BbsDto bbs);
	
	BbsDto getBbs(int seq);
	
	void readcount(int seq);
	
	boolean answerup(BbsDto dto);
	
	boolean answerin(BbsDto dto);
	
	boolean updateBbs(BbsDto dto);
	
	boolean deleteBbs(BbsDto dto);
	
	List<BbsDto> mybbslist(String id);
}
