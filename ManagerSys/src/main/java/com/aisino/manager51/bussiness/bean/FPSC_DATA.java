package com.aisino.manager51.bussiness.bean;

import java.util.ArrayList;

public class FPSC_DATA {
    private int SUCC_COUNT = 0;
    private ArrayList<FPSC_DATA_PZ> list;
    
    public void setSUCC_COUNT(int count){
        SUCC_COUNT = count;
    }
    public int getSUCC_COUNTL(){
        return SUCC_COUNT;
    }
    public void setPzList(ArrayList<FPSC_DATA_PZ> list){
        this.list = list;
    }
    public ArrayList<FPSC_DATA_PZ> getSLXLH(){
        return this.list;
    }
}
