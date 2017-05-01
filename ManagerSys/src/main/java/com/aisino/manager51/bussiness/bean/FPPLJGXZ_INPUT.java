package com.aisino.manager51.bussiness.bean;

import java.util.ArrayList;

public class FPPLJGXZ_INPUT {
    private String NSRSBH = "";
    private String FJH = "";
    private ArrayList<FPSC_DATA_PZ> list;
    
    public void setNSRSBHT(String NSRSBH){
        this.NSRSBH = NSRSBH;
    }
    public String getNSRSBH(){
        return NSRSBH;
    }
    public void setFJH(String FJH){
        this.FJH = FJH;
    }
    public String getFJH(){
        return FJH;
    }
    public void setPzList(ArrayList<FPSC_DATA_PZ> list){
        this.list = list;
    }
    public ArrayList<FPSC_DATA_PZ> getPzList(){
        return this.list;
    }
}
