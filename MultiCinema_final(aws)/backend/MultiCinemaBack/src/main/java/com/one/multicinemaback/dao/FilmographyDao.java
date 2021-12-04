package com.one.multicinemaback.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FilmographyDao {	
	void addFilmo(int fseq, int faid);
}
