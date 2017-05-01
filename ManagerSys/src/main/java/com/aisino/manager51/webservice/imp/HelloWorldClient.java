package com.aisino.manager51.webservice.imp;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.aisino.manager51.webservice.Interface.IHelloWorld;

public class HelloWorldClient {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//首先右键run as 运行com.hsy.server.webServiceApp类，然后再运行这段客户端代码
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
		jwpfb.setServiceClass(IHelloWorld.class);
		jwpfb.setAddress("http://localhost:9988/helloWorld");
		IHelloWorld hw = (IHelloWorld) jwpfb.create();
        System.out.println(hw.sayHiToUser("123"));
        
    }
}
