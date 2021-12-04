package com.one.multicinemaback.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.naver.NaverCloud;

@RestController
public class NaverAiController {
	
	@Autowired
	ServletContext servletContext;
		
	@RequestMapping(value = "/Chatbot", method = RequestMethod.POST)
	public String chatbot(String msg) {
		System.out.println("PdsController chatbot");
		
		String str = NaverCloud.chatBot(msg);
			
		return str;
	}

}
