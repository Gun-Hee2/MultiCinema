package com.one.multicinemaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.FilmographyDao;

@Service
@Transactional
public class FilmographyService {
	
	@Autowired
	FilmographyDao dao;
	
	public void addFilmo(int fseq, int faid) {
		dao.addFilmo(fseq, faid);
	}
}
