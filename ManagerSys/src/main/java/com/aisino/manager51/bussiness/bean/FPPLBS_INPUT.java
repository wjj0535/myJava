package com.aisino.manager51.bussiness.bean;

import java.util.ArrayList;

public class FPPLBS_INPUT {
    private String NSRSBH;      //纳税人识别号    
    private String FJH;         //分机号   
    private String FPZL;        //发票种类 
    private ArrayList<FPPLBS_FP> fpItems;
    
    public String getNSRSBH() {
        return NSRSBH;
    }
    public void setNSRSBH(String nSRSBH) {
        NSRSBH = nSRSBH;
    }
    public String getFJH() {
        return FJH;
    }
    public void setFJH(String fJH) {
        FJH = fJH;
    }
    public String getFPZL() {
        return FPZL;
    }
    public void setFPZL(String fPZL) {
        FPZL = fPZL;
    }
    public void setFpItems(ArrayList<FPPLBS_FP> items){
        fpItems = items;
    }
    public ArrayList<FPPLBS_FP> getFpItems(){
        return fpItems;
    }
}
