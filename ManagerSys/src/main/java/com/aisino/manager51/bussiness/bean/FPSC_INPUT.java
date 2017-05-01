package com.aisino.manager51.bussiness.bean;

import java.util.ArrayList;

public class FPSC_INPUT {
    private String NSRSBH = "";
    private String FJH = "";
    private String FPZL = "";
    private String JSPBH = "";
    private ArrayList<FPSC_FP> fpItems;
    
    public void setNSRSBH(String NSRSBH){
        this.NSRSBH = NSRSBH;
    }
    public String getNSRSBH(){
        return this.NSRSBH;
    }
    public void setFJH(String FJH){
        this.FJH = FJH;
    }
    public String getFJH(){
        return this.FJH;
    }
    public void setFPZL(String FPZL){
        this.FPZL = FPZL;
    }
    public String getFPZL(){
        return this.FPZL;
    }
    public void setJSPBH(String JSPBH){
        this.JSPBH = JSPBH;
    }
    public String getJSPBH(){
        return this.JSPBH;
    }
    public void setFpList(ArrayList<FPSC_FP> items){
        this.fpItems = items;
    }
    public ArrayList<FPSC_FP> getFpList(){
        return this.fpItems;
    }
}
