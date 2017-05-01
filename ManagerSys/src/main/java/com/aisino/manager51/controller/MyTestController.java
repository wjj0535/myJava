package com.aisino.manager51.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aisino.manager51.mybatis.service.IMyTestService;

@Controller
public class MyTestController {
	
	@Autowired
	IMyTestService mytestService;
	
	@RequestMapping("/mytest")
	ModelAndView mytest()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", mytestService.GetUserName());
		mv.setViewName("mytest");
		return mv;
	}
	
	public static void main(String[] args) {
		System.out.println("1");
	}
}
