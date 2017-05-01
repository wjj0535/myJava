package com.aisino.manager51.bussiness.bean;

import java.util.List;

public class FPKJ_INPUT {

	private FPKJ_IN_HEAD head;
	private List<FPKJ_FPMX> list;	//商品列表
	public FPKJ_IN_HEAD getHead() {
		return head;
	}
	public void setHead(FPKJ_IN_HEAD head) {
		this.head = head;
	}
	public List<FPKJ_FPMX> getList() {
		return list;
	}
	public void setList(List<FPKJ_FPMX> list) {
		this.list = list;
	}
	
}
