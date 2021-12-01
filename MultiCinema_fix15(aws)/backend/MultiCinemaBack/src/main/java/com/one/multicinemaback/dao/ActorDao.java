package com.one.multicinemaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.ActorDto;

@Mapper
@Repository
public interface ActorDao {
	void addActor(ActorDto actor);
	
	List<ActorDto> getActor(int seq);
	ActorDto getActorInfo(int aid);
	ActorDto getActorMovie(int aid);
	ActorDto getAid(String actor);
}
