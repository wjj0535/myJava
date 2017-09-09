package com.wjj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wjj.mapper.TestDao;

@RestController
public class HelloWorldController {
	
//	@Autowired
//	private TestDao testDao;
	
	@RequestMapping("/test")
	public String helloWorld()
	{
//		return String.valueOf(testDao.getId());
		return "1";
	}

}
