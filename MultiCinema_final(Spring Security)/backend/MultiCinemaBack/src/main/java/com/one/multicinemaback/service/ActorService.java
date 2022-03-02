package com.one.multicinemaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.ActorDao;
import com.one.multicinemaback.dto.ActorDto;
import com.one.multicinemaback.dto.MovieDto;

@Service
@Transactional
public class ActorService {
	
	@Autowired
	ActorDao dao;
	
	public void addActor(ActorDto actor)
	{
		dao.addActor(actor);
	}
	
	public List<ActorDto> getActor(int seq) {
		System.out.println("seq:" + seq);
		return dao.getActor(seq);
	}
	
	public ActorDto getActorInfo(int aid) {
		System.out.println("aid:" + aid);
		return dao.getActorInfo(aid);
	}
	
	public ActorDto getActorMovie(int aid) {
		return dao.getActorMovie(aid);
	}
	
	public ActorDto getAid(String actor) {
		return dao.getAid(actor);
	}
}