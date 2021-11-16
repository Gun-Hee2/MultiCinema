package com.one.multicinemaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.ActorDao;
import com.one.multicinemaback.dto.ActorDto;

@Service
@Transactional
public class ActorService {
	
	@Autowired
	ActorDao dao;
	
	public void addActor(ActorDto actor)
	{
		dao.addActor(actor);
	}
}