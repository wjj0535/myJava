package com.aisino.manager51.bussiness;

import java.io.UnsupportedEncodingException;

import com.aisino.manager51.bussiness.bean.LJCS_OUTPUT;
import com.aisino.manager51.webutil.NetWorkCommunicate;

public class ProtocolOperator {
	/**
	 * ���Ӳ���
	 * 2017��4��5��
	 * wangjunjie
	 * @param ip
	 * @return
	 * @throws Exception 
	 * @throws UnsupportedEncodingException 
	 */
	public boolean LJCS(String ip)
	{
		//����
		String reqxml = XmlSendUtils.ljcs();
		NetWorkCommunicate nwc = new NetWorkCommunicate();
		//���ر���
		String repxml = nwc.SendDataTo51Box(ip, reqxml);
		LJCS_OUTPUT ret = null;
		try{
			ret = XmlAcceptUtils.getLjcs(repxml);
		}
		catch (UnsupportedEncodingException exception)
		{
			exception.printStackTrace();
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		//����Ϊ�ջ��߳���(������000000)
		if(null == ret || ret.getrETURN().getCODE().equals("000000"))
			return false;
		return true;
	}
	public static void main(String[] args) {
		ProtocolOperator po = new ProtocolOperator();
		System.out.println(po.LJCS("192.168.1.50"));
	}
}
