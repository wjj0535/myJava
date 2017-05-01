package com.aisino.manager51.webservice.imp;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.aisino.manager51.webservice.Interface.IHelloWorld;

public class HelloWorldClient {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//�����Ҽ�run as ����com.hsy.server.webServiceApp�࣬Ȼ����������οͻ��˴���
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
		jwpfb.setServiceClass(IHelloWorld.class);
		jwpfb.setAddress("http://localhost:9988/helloWorld");
		IHelloWorld hw = (IHelloWorld) jwpfb.create();
        System.out.println(hw.sayHiToUser("123"));
        
    }
}
