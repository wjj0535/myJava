package com.aisino.manager51.mybatis.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aisino.manager51.mybatis.mapper.MyTestMapper;
import com.aisino.manager51.mybatis.service.IMyTestService;

@Service
public class MyTestServiceImp implements IMyTestService{
	
	@Autowired
	private MyTestMapper myTestMapper;
	
	@Override
	public String GetUserName() {
		// TODO Auto-generated method stub
		return myTestMapper.getName();
	}

	

}
