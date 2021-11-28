package com.one.multicinemaback.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
