package com.aisino.manager51.bussiness.bean;

public class FPSC_DATA_PZ {
    private String FPZL = "";//发票种类
    private String SLXLH = "";//受理序列号
    
    public void setFPZL(String fpzl){
        FPZL = fpzl;
    }
    public String getFPZL(){
        return FPZL;
    }
    public void setSLXLH(String slxlh){
        SLXLH = slxlh;
    }
    public String getSLXLH(){
        return SLXLH;
    }
}
