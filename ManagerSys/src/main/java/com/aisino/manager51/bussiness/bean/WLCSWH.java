package com.aisino.manager51.bussiness.bean;

public class WLCSWH {

	private String ISDHCP;		//是否自动分配IP
	private String LOCAL_IP;	//本机IP
	private String LOCAL_DEFAULTGATE;	//本机网关
	private String LOCAL_PORT;	//本机端口
	private String LOCAL_NETMASK;	//子网掩码
	private String LOCAL_DNSNAMEIP;	//DNS
	public String getISDHCP() {
		return ISDHCP;
	}
	public void setISDHCP(String iSDHCP) {
		ISDHCP = iSDHCP;
	}
	public String getLOCAL_IP() {
		return LOCAL_IP;
	}
	public void setLOCAL_IP(String lOCAL_IP) {
		LOCAL_IP = lOCAL_IP;
	}
	public String getLOCAL_DEFAULTGATE() {
		return LOCAL_DEFAULTGATE;
	}
	public void setLOCAL_DEFAULTGATE(String lOCAL_DEFAULTGATE) {
		LOCAL_DEFAULTGATE = lOCAL_DEFAULTGATE;
	}
	public String getLOCAL_PORT() {
		return LOCAL_PORT;
	}
	public void setLOCAL_PORT(String lOCAL_PORT) {
		LOCAL_PORT = lOCAL_PORT;
	}
	public String getLOCAL_NETMASK() {
		return LOCAL_NETMASK;
	}
	public void setLOCAL_NETMASK(String lOCAL_NETMASK) {
		LOCAL_NETMASK = lOCAL_NETMASK;
	}
	public String getLOCAL_DNSNAMEIP() {
		return LOCAL_DNSNAMEIP;
	}
	public void setLOCAL_DNSNAMEIP(String lOCAL_DNSNAMEIP) {
		LOCAL_DNSNAMEIP = lOCAL_DNSNAMEIP;
	}
	
	
	
}
