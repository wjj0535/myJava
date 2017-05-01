package com.aisino.manager51.bussiness.bean;

import java.util.ArrayList;

public class FPPLJGXZ_DATA {
    private String FPXX = "";
    private ArrayList<FPPLJGXZ_FP_FAIL> failItems;
    
    public void setFPXX(String FPXX){
        this.FPXX = FPXX;
    }
    public String getFPXX(){
        return FPXX;
    }
    public void setFailItems(ArrayList<FPPLJGXZ_FP_FAIL> items){
        failItems = items;
    }
    public ArrayList<FPPLJGXZ_FP_FAIL> getFailItems(){
        return failItems;
    }
}
