package com.aisino.manager51.webservice.Interface;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IHelloWorld {
	String sayHiToUser(@WebParam(name="text")String str);
}
