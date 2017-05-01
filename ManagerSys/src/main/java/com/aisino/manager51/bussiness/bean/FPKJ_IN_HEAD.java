package com.aisino.manager51.bussiness.bean;

public class FPKJ_IN_HEAD {
	private int id;
	private String NSRSBH;		//纳税人识别号	
	private String FJH;			//分机号	
	private String FPLSH;		//发票流水号	
	private String XPLSH;		//小票流水号	
	private String FPZL;		//发票种类	
	private String KPLX;		//开票类型	
	private String XSF_NSRSBH;	//销售方纳税人识别号	
	private String XSF_MC;		//销售方名称	
	private String XSF_DZDH;	//销售方地址、电话	
	private String XSF_YHZH;	//销售方银行账号	
	private String GMF_NSRSBH;	//购买方纳税人识别号	
	private String GMF_MC;		//购买方名称	
	private String GMF_DZDH;	//购买方地址、电话	
	private String GMF_YHZH;	//购买方银行账号	
	private String KPR;			//开票人	
	private String SKR;			//收款人	
	private String FHR;			//复核人	
	private String YFPDM;		//原发票代码	
	private String YFPHM;		//原发票号码	
	private String HPTZDBH;		//红票通知单编号	
	private String QDBZ;		//清单标志	
	private String JSHJ;		//价税合计	
	private String HJJE;		//合计金额(不含税)	
	private String HJSE;		//合计税额	
	private String BZ;			//备注	
	private String FPDM;		//发票代码	
	private String FPHM;		//发票代码		
	private String KPSJ;		//开票时间	
	private String FPMW;		//发票密文	
	private String FWM;			//防伪码	
	private String EWM;			//二维码	
	private String SIGN;		//签名	
	private String SYH;			//索引号	
	private String BSQS;		//报税期数	
	private String SL;			//税率
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSL() {
		return SL;
	}
	public void setSL(String sL) {
		SL = sL;
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
	public String getKPSJ() {
		return KPSJ;
	}
	public void setKPSJ(String kPSJ) {
		KPSJ = kPSJ;
	}
	public String getFPMW() {
		return FPMW;
	}
	public void setFPMW(String fPMW) {
		FPMW = fPMW;
	}
	public String getFWM() {
		return FWM;
	}
	public void setFWM(String fWM) {
		FWM = fWM;
	}
	public String getEWM() {
		return EWM;
	}
	public void setEWM(String eWM) {
		EWM = eWM;
	}
	public String getSIGN() {
		return SIGN;
	}
	public void setSIGN(String sIGN) {
		SIGN = sIGN;
	}
	public String getSYH() {
		return SYH;
	}
	public void setSYH(String sYH) {
		SYH = sYH;
	}
	public String getBSQS() {
		return BSQS;
	}
	public void setBSQS(String bSQS) {
		BSQS = bSQS;
	}
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
	public String getFPLSH() {
		return FPLSH;
	}
	public void setFPLSH(String fPLSH) {
		FPLSH = fPLSH;
	}
	public String getXPLSH() {
		return XPLSH;
	}
	public void setXPLSH(String xPLSH) {
		XPLSH = xPLSH;
	}
	public String getFPZL() {
		return FPZL;
	}
	public void setFPZL(String fPZL) {
		FPZL = fPZL;
	}
	public String getKPLX() {
		return KPLX;
	}
	public void setKPLX(String kPLX) {
		KPLX = kPLX;
	}
	public String getXSF_NSRSBH() {
		return XSF_NSRSBH;
	}
	public void setXSF_NSRSBH(String xSF_NSRSBH) {
		XSF_NSRSBH = xSF_NSRSBH;
	}
	public String getXSF_MC() {
		return XSF_MC;
	}
	public void setXSF_MC(String xSF_MC) {
		XSF_MC = xSF_MC;
	}
	public String getXSF_DZDH() {
		return XSF_DZDH;
	}
	public void setXSF_DZDH(String xSF_DZDH) {
		XSF_DZDH = xSF_DZDH;
	}
	public String getXSF_YHZH() {
		return XSF_YHZH;
	}
	public void setXSF_YHZH(String xSF_YHZH) {
		XSF_YHZH = xSF_YHZH;
	}
	public String getGMF_NSRSBH() {
		return GMF_NSRSBH;
	}
	public void setGMF_NSRSBH(String gMF_NSRSBH) {
		GMF_NSRSBH = gMF_NSRSBH;
	}
	public String getGMF_MC() {
		return GMF_MC;
	}
	public void setGMF_MC(String gMF_MC) {
		GMF_MC = gMF_MC;
	}
	public String getGMF_DZDH() {
		return GMF_DZDH;
	}
	public void setGMF_DZDH(String gMF_DZDH) {
		GMF_DZDH = gMF_DZDH;
	}
	public String getGMF_YHZH() {
		return GMF_YHZH;
	}
	public void setGMF_YHZH(String gMF_YHZH) {
		GMF_YHZH = gMF_YHZH;
	}
	public String getKPR() {
		return KPR;
	}
	public void setKPR(String kPR) {
		KPR = kPR;
	}
	public String getSKR() {
		return SKR;
	}
	public void setSKR(String sKR) {
		SKR = sKR;
	}
	public String getFHR() {
		return FHR;
	}
	public void setFHR(String fHR) {
		FHR = fHR;
	}
	public String getYFPDM() {
		return YFPDM;
	}
	public void setYFPDM(String yFPDM) {
		YFPDM = yFPDM;
	}
	public String getYFPHM() {
		return YFPHM;
	}
	public void setYFPHM(String yFPHM) {
		YFPHM = yFPHM;
	}
	public String getHPTZDBH() {
		return HPTZDBH;
	}
	public void setHPTZDBH(String hPTZDBH) {
		HPTZDBH = hPTZDBH;
	}
	public String getQDBZ() {
		return QDBZ;
	}
	public void setQDBZ(String qDBZ) {
		QDBZ = qDBZ;
	}
	public String getJSHJ() {
		return JSHJ;
	}
	public void setJSHJ(String jSHJ) {
		JSHJ = jSHJ;
	}
	public String getHJJE() {
		return HJJE;
	}
	public void setHJJE(String hJJE) {
		HJJE = hJJE;
	}
	public String getHJSE() {
		return HJSE;
	}
	public void setHJSE(String hJSE) {
		HJSE = hJSE;
	}
	public String getBZ() {
		return BZ;
	}
	public void setBZ(String bZ) {
		BZ = bZ;
	}
	
	
}
