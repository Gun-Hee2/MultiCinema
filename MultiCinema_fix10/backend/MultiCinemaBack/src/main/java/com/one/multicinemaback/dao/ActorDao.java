package com.one.multicinemaback.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.ActorDto;

@Mapper
@Repository
public interface ActorDao {
	void addActor(ActorDto actor);
}
