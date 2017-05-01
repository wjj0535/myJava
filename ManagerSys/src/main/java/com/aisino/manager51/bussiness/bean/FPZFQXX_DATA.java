package com.aisino.manager51.bussiness.bean;

public class FPZFQXX_DATA {
    private String SIGN = "";//签名
    private String KPLX = "";//开票类型
    private String SYH = "";//索引号
    private String ZFSJ = "";//作废时间
    
    public void setSIGN(String sign){
        SIGN = sign;
    }
    public String getSIGN(){
        return SIGN;
    }
    public void setKPLX(String kplx){
        KPLX = kplx;
    }
    public String getKPLX(){
        return KPLX;
    }
    public void setSYH(String syh){
        SYH = syh;
    }
    public String getSYH(){
        return SYH;
    }
    public void setZFSJ(String zfsj){
        ZFSJ = zfsj;
    }
    public String getZFSJ(){
        return ZFSJ;
    }
}
