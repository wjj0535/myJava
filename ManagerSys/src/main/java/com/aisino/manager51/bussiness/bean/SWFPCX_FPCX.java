package com.aisino.manager51.bussiness.bean;

import java.util.List;

public class SWFPCX_FPCX {

	private String FPDM;					//发票代码					
	private String FPHM;					//发票号码					
	private String KPLX;					//开票类型					
	private String SCBZ;					//上传标志					
	private String KPSJ;					//开票时间					
	private String FWM;					//防伪码							
	private String EWM;					//二维码							
	private String FPMW;					//发票密文					
	private String XHDWDM;					//销货单位识别号	
	private String XHDWMC;					//销货单位名称		
	private String GHDWDM;					//购货单位识别号	
	private String GHDWMC;					//购货单位名称		
	private String HJJE;					//合计金额（不含税）
	private String HJSE;					//合计税额					
	private String JSHJ;					//价税合计					
	private String BZ;					//备注								
	private String SKR;					//收款人							
	private String KPR;					//开票人							
	private String FHR;					//复核人							
	private String YFPDM;					//原发票代码				
	private String YFPHM;					//原发票号码				
	private String ZFSJ;					//作废时间					
	private String ZFR;					//作废人							
	private String SIGN;					//签名<SIGN;				
	private String SYH;					//索引号							
	private String QDBZ;					//清单标志					
	private String BSQS;					//报税期数 （增普增专）								
	private String SL;					//税率	
	private List<SWFPCX_SFXM> list;
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
	public String getKPLX() {
		return KPLX;
	}
	public void setKPLX(String kPLX) {
		KPLX = kPLX;
	}
	public String getSCBZ() {
		return SCBZ;
	}
	public void setSCBZ(String sCBZ) {
		SCBZ = sCBZ;
	}
	public String getKPSJ() {
		return KPSJ;
	}
	public void setKPSJ(String kPSJ) {
		KPSJ = kPSJ;
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
	public String getFPMW() {
		return FPMW;
	}
	public void setFPMW(String fPMW) {
		FPMW = fPMW;
	}
	public String getXHDWDM() {
		return XHDWDM;
	}
	public void setXHDWDM(String xHDWDM) {
		XHDWDM = xHDWDM;
	}
	public String getXHDWMC() {
		return XHDWMC;
	}
	public void setXHDWMC(String xHDWMC) {
		XHDWMC = xHDWMC;
	}
	public String getGHDWDM() {
		return GHDWDM;
	}
	public void setGHDWDM(String gHDWDM) {
		GHDWDM = gHDWDM;
	}
	public String getGHDWMC() {
		return GHDWMC;
	}
	public void setGHDWMC(String gHDWMC) {
		GHDWMC = gHDWMC;
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
	public String getJSHJ() {
		return JSHJ;
	}
	public void setJSHJ(String jSHJ) {
		JSHJ = jSHJ;
	}
	public String getBZ() {
		return BZ;
	}
	public void setBZ(String bZ) {
		BZ = bZ;
	}
	public String getSKR() {
		return SKR;
	}
	public void setSKR(String sKR) {
		SKR = sKR;
	}
	public String getKPR() {
		return KPR;
	}
	public void setKPR(String kPR) {
		KPR = kPR;
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
	public String getZFSJ() {
		return ZFSJ;
	}
	public void setZFSJ(String zFSJ) {
		ZFSJ = zFSJ;
	}
	public String getZFR() {
		return ZFR;
	}
	public void setZFR(String zFR) {
		ZFR = zFR;
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
	public String getQDBZ() {
		return QDBZ;
	}
	public void setQDBZ(String qDBZ) {
		QDBZ = qDBZ;
	}
	public String getBSQS() {
		return BSQS;
	}
	public void setBSQS(String bSQS) {
		BSQS = bSQS;
	}
	public String getSL() {
		return SL;
	}
	public void setSL(String sL) {
		SL = sL;
	}
	public List<SWFPCX_SFXM> getList() {
		return list;
	}
	public void setList(List<SWFPCX_SFXM> list) {
		this.list = list;
	}
	
	
	
}
