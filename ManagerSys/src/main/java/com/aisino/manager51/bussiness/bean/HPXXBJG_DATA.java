package com.aisino.manager51.bussiness.bean;

import java.util.ArrayList;

public class HPXXBJG_DATA {
	
	private String ALLCOUNT;
    private ArrayList<HPXXBJG_REDINVREQBILLXX> list;
	public String getALLCOUNT() {
		return ALLCOUNT;
	}
	public void setALLCOUNT(String aLLCOUNT) {
		ALLCOUNT = aLLCOUNT;
	}
	public ArrayList<HPXXBJG_REDINVREQBILLXX> getList() {
		return list;
	}
	public void setList(ArrayList<HPXXBJG_REDINVREQBILLXX> list) {
		this.list = list;
	}
}
