package com.aisino.manager51.bussiness.bean;
public class FPKJ_FPMX {
	private int id;
	private String FPHXZ;	//发票行性质
	private String XMMC;	//项目名称
	private String GGXH;	//规格型号
	private String DW;		//单位
	private String XMSL;	//项目数量
	private String XMDJ;	//不含税单价
	private String XMJE;	//不含税金额
	private String SL;		//税率
	private String SE;		//税额
	private String HSDJ;	//含税单价
	private String HSJE;	//含税金额
	private String FPDM;	//发票代码
	private String FPHM;	//发票号码
	private String FPZL;		//发票种类
	private String bm;        //编码
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFPZL() {
		return FPZL;
	}
	public void setFPZL(String FPZL) {
		this.FPZL = FPZL;
	}
    
    public String getBm() {
        return bm;
    }
    
    public void setBm(String bm) {
        this.bm = bm;
    }
	public String getFPHXZ() {
		return FPHXZ;
	}
	public void setFPHXZ(String fPHXZ) {
		FPHXZ = fPHXZ;
	}
	public String getXMMC() {
		return XMMC;
	}
	public void setXMMC(String xMMC) {
		XMMC = xMMC;
	}
	public String getGGXH() {
		return GGXH;
	}
	public void setGGXH(String gGXH) {
		GGXH = gGXH;
	}
	public String getDW() {
		return DW;
	}
	public void setDW(String dW) {
		DW = dW;
	}
	public String getXMSL() {
		return XMSL;
	}
	public void setXMSL(String xMSL) {
		XMSL = xMSL;
	}
	public String getXMDJ() {
		return XMDJ;
	}
	public void setXMDJ(String xMDJ) {
		XMDJ = xMDJ;
	}
	public String getXMJE() {
		return XMJE;
	}
	public void setXMJE(String xMJE) {
		XMJE = xMJE;
	}
	public String getSL() {
		return SL;
	}
	public void setSL(String sL) {
		SL = sL;
	}
	public String getSE() {
		return SE;
	}
	public void setSE(String sE) {
		SE = sE;
	}
	public String getHSDJ() {
		return HSDJ;
	}
	public void setHSDJ(String hSDJ) {
		HSDJ = hSDJ;
	}
	public String getHSJE() {
		return HSJE;
	}
	public void setHSJE(String hSJE) {
		HSJE = hSJE;
	}
	public String getFPDM() {
		return FPDM;
	}
	public void setFPDM(String fPDM) {
		FPDM = fPDM;
	}
	public String getFPHM() {
		return FPHM;
	}
	public void setFPHM(String fPHM) {
		FPHM = fPHM;
	}
	
	
	
}
