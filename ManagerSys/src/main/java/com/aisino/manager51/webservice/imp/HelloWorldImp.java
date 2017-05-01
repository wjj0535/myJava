package com.aisino.manager51.webservice.imp;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.aisino.manager51.webservice.Interface.IHelloWorld;

@WebService(endpointInterface="com.aisino.manager51.webservice.Interface.IHelloWorld",serviceName="HelloWorld")
public class HelloWorldImp implements IHelloWorld{

	public String sayHiToUser(@WebParam(name = "text")String str) {
		// TODO Auto-generated method stub
		return "Œ“"+str;
	}
	public static void main(String[] args) {
		HelloWorldImp implementor = new HelloWorldImp();
         String address = "http://localhost:9988/helloWorld";
         Endpoint.publish(address, implementor);
	}
}
