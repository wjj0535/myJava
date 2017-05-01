package com.aisino.manager51.bussiness;

import java.text.DecimalFormat;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

import com.aisino.manager51.bussiness.bean.FPCX_INPUT;
import com.aisino.manager51.bussiness.bean.FPKJ_FPMX;
import com.aisino.manager51.bussiness.bean.FPKJ_INPUT;
import com.aisino.manager51.bussiness.bean.FPKJ_IN_HEAD;
import com.aisino.manager51.bussiness.bean.FPPLBS_FP;
import com.aisino.manager51.bussiness.bean.FPPLBS_INPUT;
import com.aisino.manager51.bussiness.bean.FPPLJGXZ_INPUT;
import com.aisino.manager51.bussiness.bean.FPSC_INPUT;
import com.aisino.manager51.bussiness.bean.FPXF_INPUT;
import com.aisino.manager51.bussiness.bean.FPXXJS;
import com.aisino.manager51.bussiness.bean.FPZF;
import com.aisino.manager51.bussiness.bean.HPXXBJG;
import com.aisino.manager51.bussiness.bean.HPXXBJG_OUTPUT;
import com.aisino.manager51.bussiness.bean.HPXXBJG_REDINVREQBILLXX;
import com.aisino.manager51.bussiness.bean.PYWLXZ_INPUT;
import com.aisino.manager51.bussiness.bean.WLCSWH;
import com.aisino.manager51.bussiness.bean.WLSJ;


public class XmlSendUtils {

	private static String Error = null;
	private static String message = null;
	
	
	public static String getError() {
		return Error;
	}

	public static void setError(String error) {
		Error = error;
	}

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		XmlSendUtils.message = message;
	}

	/*
	 * 2.1.绋庢帶淇℃伅鏌ヨ
	 */
	public static DecimalFormat df = new DecimalFormat("0.00");
	
	/**
	 * 发送外部xml拼装
	 * @param xmlName
	 * @param data
	 * @param ID
	 * @return
	 */
	public static String sendOutString(String data, String ID){
		
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sb.append("<FPXT_INPUT>");
		sb.append("<ID>" + ID + "</ID>");
		sb.append("<DATA>");
		sb.append(data);
		sb.append("</DATA>");
		sb.append("</FPXT_INPUT>");

		return sb.toString().trim();
		
	}
	
	/**
	 * 2.1 税控信息查询
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String skxxcx(String nsrsbh, String fjh) {

		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");					//纳税人识别号
		sbBase.append(nsrsbh);
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//分机号
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}

	/**
	 * 2.2 企业参数同步
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String qycstb(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");					//纳税人识别号
		sbBase.append(nsrsbh);
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//分机号
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.3 金税盘状态查询
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String jspzt(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");					//纳税人识别号
		sbBase.append(nsrsbh);
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//分机号
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.11 金税盘发票查询
	 */
	public static String fpcx(FPCX_INPUT fpcx){
	    StringBuffer sbBase = new StringBuffer();
	    sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append("15000107051302807");			//纳税人识别号
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append("0");			//分机号
        sbBase.append("</FJH>");
        sbBase.append("<FPZL>");
        sbBase.append("2");			//发票种类
        sbBase.append("</FPZL>");
        sbBase.append("<FPDM>");
        sbBase.append("5000111650");			//发票代码
        sbBase.append("</FPDM>");
        sbBase.append("<FPHM>");
        sbBase.append("08855156");			//发票号码
        sbBase.append("</FPHM>");
        sbBase.append("<SYH>");
        sbBase.append("");			//索引号
        sbBase.append("</SYH>");
        sbBase.append("</INPUT>");
        return sbBase.toString().trim();
	}
	/**
	 * 2.4  金税盘发票库存查询
	 * @param nsrsbh	纳税人识别号
	 * @param fjh		分机号
	 * @param fpzl		发票种类
	 * @return
	 */
	public static String fpkccx(String nsrsbh, String fjh, String fpzl){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//分机号
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);					//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.5  金税盘发票卷查询
	 * @param nsrsbh	纳税人识别号
	 * @param fjh		分机号
	 * @param fpzl		发票种类
	 * @return
	 */
	public static String fpjcx(String nsrsbh, String fjh, String fpzl){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//分机号
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);					//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.6  金税盘可读入的最大发票份数
	 * @param nsrsbh	纳税人识别号
	 * @param fjh		分机号
	 * @param fpzl		发票种类
	 * @return
	 */
	public static String kdzdfpfs(String nsrsbh, String fjh, String fpzl){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//分机号
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);					//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.7 局端可下载票源获取
	 * @param nsrsbh	纳税人识别号
	 * @param fjh		分机号
	 * @return
	 */
	public static String kxzpyfs(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//分机号
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.8 主分机票源网络下载
	 * @return
	 */
	public static String pywlxz(PYWLXZ_INPUT pywlxz){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(pywlxz.getNSRSBH());					//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(pywlxz.getFJH());					//分机号
		sbBase.append("</FJH>");
		sbBase.append("<LSH>");
		sbBase.append(pywlxz.getLSH());					//流水号
		sbBase.append("</LSH>");
		sbBase.append("<FPZL>");
		sbBase.append(pywlxz.getFPZL());					//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("<FPDM>");
		sbBase.append(pywlxz.getFPDM());					//发票代码
		sbBase.append("</FPDM>");
		sbBase.append("<FPQSHM>");
		sbBase.append(pywlxz.getFPQSHM());					//发票起始号码
		sbBase.append("</FPQSHM>");
		sbBase.append("<FPSL>");
		sbBase.append(pywlxz.getFPSL());					//发票份数
		sbBase.append("</FPSL>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.9 发票开具
	 * @return
	 */
	public static String fpkj(FPKJ_INPUT fpkj){
		StringBuffer sbBase = new StringBuffer();
//		FPKJ_IN_HEAD head = fpkj.getHead();
//		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
//		sbBase.append("<INPUT>");
//		sbBase.append("<NSRSBH>");
//		sbBase.append("110105201604260001");					//纳税人识别号
//		sbBase.append("</NSRSBH>");
//		sbBase.append("<FJH>");
//		sbBase.append("0");					//分机号
//		sbBase.append("</FJH>");
//		sbBase.append("<FPLSH>");
//		sbBase.append("00000000000000000024");					//发票流水号
//		sbBase.append("</FPLSH>");
//		sbBase.append("<XPLSH>");
//		sbBase.append("10000000000000000002");					//小票流水号
//		sbBase.append("</XPLSH>");
//		sbBase.append("<FPZL>");
//		sbBase.append("2");					//发票种类
//		sbBase.append("</FPZL>");
//		sbBase.append("<KPLX>");
//		sbBase.append("0");					//开票类型
//		sbBase.append("</KPLX>");
//		sbBase.append("<XFSH>");
//		sbBase.append("110105201604260001");					//销售方纳税人识别号
//		sbBase.append("</XFSH>");
//		sbBase.append("<XFMC>");
//		sbBase.append("110105201604260001TEST");					//销售方名称
//		sbBase.append("</XFMC>");
//		sbBase.append("<XFDZDH>");
//		sbBase.append("销售方地址、电话");					//销售方地址、电话
//		sbBase.append("</XFDZDH>");
//		sbBase.append("<XFYHZH>");
//		sbBase.append("销售方银行账号");					//销售方银行账号
//		sbBase.append("</XFYHZH>");
//		sbBase.append("<GFSH>");
//		sbBase.append("123456789");					//购买方纳税人识别号
//		sbBase.append("</GFSH>");
//		sbBase.append("<GFMC>");
//		sbBase.append("购买方名称");					//购买方名称
//		sbBase.append("</GFMC>");
//		sbBase.append("<GFDZDH>");
//		sbBase.append("购买方地址、电话");					//购买方地址、电话
//		sbBase.append("</GFDZDH>");
//		sbBase.append("<GFYHZH>");
//		sbBase.append("购买方银行账号");					//购买方银行账号
//		sbBase.append("</GFYHZH>");
//		sbBase.append("<KPR>");
//		sbBase.append("开票人");					//开票人
//		sbBase.append("</KPR>");
//		sbBase.append("<SKR>");
//		sbBase.append("收款人");					//收款人
//		sbBase.append("</SKR>");
//		sbBase.append("<FHR>");
//		sbBase.append("复核人");					//复核人
//		sbBase.append("</FHR>");
//		sbBase.append("<YFPDM>");
//		sbBase.append("");					//原发票代码
//		sbBase.append("</YFPDM>");
//		sbBase.append("<YFPHM>");
//		sbBase.append("");					//原发票号码
//		sbBase.append("</YFPHM>");
//		sbBase.append("<HPTZDBH>");
//		sbBase.append("");					//红票通知单编号</
//		sbBase.append("</HPTZDBH>");
//		sbBase.append("<QDBZ>");
//		sbBase.append("N");					//清单标志
//		sbBase.append("</QDBZ>");
//		sbBase.append("<JSHJ>");
//		sbBase.append("117.00");					//价税合计
//		sbBase.append("</JSHJ>");
//		sbBase.append("<HJJE>");
//		sbBase.append("100.00");					//合计金额(不含税)</
//		sbBase.append("</HJJE>");
//		sbBase.append("<HJSE>");
//		sbBase.append("17.00");					//合计税额
//		sbBase.append("</HJSE>");
//		sbBase.append("<BZ>");
//		sbBase.append("备注");					//备注
//		sbBase.append("</BZ>");
//		
//		int mxcount = 1;
//		sbBase.append("<FPXMXX COUNT=\"" + mxcount + "\">");
//		
//		for(int i=0; i<mxcount; i++ ){
////			FPKJ_FPMX fpmx = fpkj.getList().get(i);
//			sbBase.append("<FPXM>");
//			sbBase.append("<FPHXZ>");
//			sbBase.append("0");					//发票行性质
//			sbBase.append("</FPHXZ>");
//			sbBase.append("<XMMC>");
//			sbBase.append("项目名称");					//项目名称
//			sbBase.append("</XMMC>");
//			sbBase.append("<GGXH>");
//			sbBase.append("规格型号");					//规格型号
//			sbBase.append("</GGXH>");
//			sbBase.append("<DW>");
//			sbBase.append("单位");					//单位
//			sbBase.append("</DW>");
//			sbBase.append("<XMSL>");
//			sbBase.append("1.00000000");					//项目数量
//			sbBase.append("</XMSL>");
//			sbBase.append("<XMDJ>");
//			sbBase.append("100.00000000");					//不含税单价
//			sbBase.append("</XMDJ>");
//			sbBase.append("<XMJE>");
//			sbBase.append("100.00");					//不含税金额
//			sbBase.append("</XMJE>");
//			sbBase.append("<SL>");
//			sbBase.append("0.17");					//税率
//			sbBase.append("</SL>");
//			sbBase.append("<SE>");
//			sbBase.append("17.00");					//税额
//			sbBase.append("</SE>");
//			sbBase.append("<HSDJ>");
//			sbBase.append("117.00000000");					//含税单价
//			sbBase.append("</HSDJ>");
//			sbBase.append("<HSJE>");
//			sbBase.append("117.00");					//含税金额
//			sbBase.append("</HSJE>");
//			sbBase.append("</FPXM>");
//		}
//		sbBase.append("</FPXMXX>");
//		sbBase.append("</INPUT>");

		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?><INPUT>	<NSRSBH>500105201606281145</NSRSBH>	<FJH>0</FJH>	<KPZDH></KPZDH>	<FPLSH>20160705084520</FPLSH>	<XPLSH>20160705084520</XPLSH>	<FPZL>2</FPZL>	<KPLX>0</KPLX>	<XFSH>500105201606281145</XFSH>	<XFMC>中云实达500105201606281145</XFMC>	<XFDZDH></XFDZDH>	<XFYHZH></XFYHZH>	<GFSH>000000000000000</GFSH>	<GFMC>个人</GFMC>	<GFDZDH></GFDZDH>	<GFYHZH></GFYHZH>	<KPR>admin</KPR>	<SKR>admin</SKR>	<FHR>admin</FHR>	<YFPDM></YFPDM>	<YFPHM></YFPHM>	<HPTZDBH></HPTZDBH>	<QDBZ></QDBZ>	<JSHJ>10.00</JSHJ>	<HJJE>8.85</HJJE>	<HJSE>1.15</HJSE>	<BMBBH></BMBBH>	<BZ></BZ>	<FPXMXX COUNT=\"1\">		<FPXM>			<FPHXZ></FPHXZ>			<XMMC>商品测试</XMMC>			<GGXH></GGXH>			<JLDW>福建</JLDW>			<XMSL>1.000</XMSL>			<XMDJ>8.85</XMDJ>			<XMJE>8.85</XMJE>			<SL>0.13</SL>			<SE>1.15</SE>			<HSDJ>10.00</HSDJ>			<HSJE>10.00</HSJE>			<SPBM>1010101020000000000</SPBM>			<QYZXBM></QYZXBM>			<SFYHZC></SFYHZC>			<YHZCNR></YHZCNR>			<LSLBS></LSLBS>		</FPXM>	</FPXMXX></INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
     * 2.12 已开发票作废（给定全票面信息）
     */
	public static String fpzfqxx(FPKJ_IN_HEAD data, List<FPKJ_FPMX> list){
        StringBuffer sbBase = new StringBuffer();
        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append("15000010661565722931");				//纳税人识别号
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append("1");				//分机号
        sbBase.append("</FJH>");
        sbBase.append("<FPZL>");
        sbBase.append("41");				//发票种类
        sbBase.append("</FPZL>");
        sbBase.append("<FPDM>");
        sbBase.append("150001201502");				//发票代码
        sbBase.append("</FPDM>");
        sbBase.append("<FPHM>");
        sbBase.append("50014254");				//发票号码
        sbBase.append("</FPHM>");
        sbBase.append("<SYH>");
        sbBase.append("00000009");				//索引号
        sbBase.append("</SYH>");
        sbBase.append("<KPLX>");
        sbBase.append("0");				//开票类型
        sbBase.append("</KPLX>");
        sbBase.append("<XSF_NSRSBH>");
        sbBase.append("15000010661565722931");				//销售方纳税人识别号
        sbBase.append("</XSF_NSRSBH>");
        sbBase.append("<XSF_MC>");
        sbBase.append("武志鹏升级版升级版升级版升级版ceshipan01");				//销售方名称
        sbBase.append("</XSF_MC>");
        sbBase.append("<XSF_DZDH>");
        sbBase.append("销售方地址、电话");				//销售方地址、电话
        sbBase.append("</XSF_DZDH>");
        sbBase.append("<XSF_YHZH>");
        sbBase.append("销售方银行账号");				//销售方银行账号
        sbBase.append("</XSF_YHZH>");
        sbBase.append("<GMF_NSRSBH>");
        sbBase.append("1234567890123");				//购买方纳税人识别号
        sbBase.append("</GMF_NSRSBH>");
        sbBase.append("<GMF_MC>");
        sbBase.append("购买方名称");				//购买方名称
        sbBase.append("</GMF_MC>");
        sbBase.append("<GMF_DZDH>");
        sbBase.append("购买方地址、电话");				//购买方地址、电话
        sbBase.append("</GMF_DZDH>");
        sbBase.append("<GMF_YHZH>");
        sbBase.append("购买方银行账号");				//购买方银行账号
        sbBase.append("</GMF_YHZH>");
        sbBase.append("<KPRQ>");
        sbBase.append("20100102");				//开票日期
        sbBase.append("</KPRQ>");
        sbBase.append("<KPR>");
        sbBase.append("开票人");				//开票人
        sbBase.append("</KPR>");
        sbBase.append("<SKR>");
        sbBase.append("收款人");				//收款人
        sbBase.append("</SKR>");
        sbBase.append("<FHR>");
        sbBase.append("复核人");				//复核人
        sbBase.append("</FHR>");
        sbBase.append("<YFPDM>");
        sbBase.append("");				//原发票代码
        sbBase.append("</YFPDM>");
        sbBase.append("<YFPHM>");
        sbBase.append("");				//原发票号码
        sbBase.append("</YFPHM>");
        sbBase.append("<HPTZDBH>");
        sbBase.append("");				//红票通知单编号
        sbBase.append("</HPTZDBH>");
        sbBase.append("<QDBZ>");
        sbBase.append("N");				//清单标志
        sbBase.append("</QDBZ>");
        sbBase.append("<JSHJ>");
        sbBase.append("117.00");				//价税合计
        sbBase.append("</JSHJ>");
        sbBase.append("<HJJE>");
        sbBase.append("100.00");				//合计金额
        sbBase.append("</HJJE>");
        sbBase.append("<HJSE>");
        sbBase.append("17.00");				//合计税额
        sbBase.append("</HJSE>");
        sbBase.append("<FPMW>");
        sbBase.append("60/5/220&lt;8-&lt;&lt;094+920157/&gt;98090-855+8&lt;+29+4/620068058&lt;&gt;2-4696&lt;40*40&gt;0*41237&gt;/261572&gt;98090-855+8&lt;+&gt;&lt;48735747-1");				//发票密文
        sbBase.append("</FPMW>");
        sbBase.append("<FWM>");
        sbBase.append("58842013333845749954");				//防伪码
        sbBase.append("</FWM>");
        sbBase.append("<BZ>");
        sbBase.append("备注");				//备注
        sbBase.append("</BZ>");
        
        int mxcount = 1;
        sbBase.append("<FPXMXX COUNT=\"" + mxcount + "\">");
        for(int i=0; i<mxcount; i++ ){
//            FPKJ_FPMX fpmx = list.get(i);
        	sbBase.append("<FPXM>");
			sbBase.append("<FPHXZ>");
			sbBase.append("0");					//发票行性质
			sbBase.append("</FPHXZ>");
			sbBase.append("<XMMC>");
			sbBase.append("项目名称");					//项目名称
			sbBase.append("</XMMC>");
			sbBase.append("<GGXH>");
			sbBase.append("规格型号");					//规格型号
			sbBase.append("</GGXH>");
			sbBase.append("<DW>");
			sbBase.append("单位");					//单位
			sbBase.append("</DW>");
			sbBase.append("<XMSL>");
			sbBase.append("1.00000000");					//项目数量
			sbBase.append("</XMSL>");
			sbBase.append("<XMDJ>");
			sbBase.append("100.00000000");					//不含税单价
			sbBase.append("</XMDJ>");
			sbBase.append("<XMJE>");
			sbBase.append("100.00");					//不含税金额
			sbBase.append("</XMJE>");
			sbBase.append("<SL>");
			sbBase.append("0.17");					//税率
			sbBase.append("</SL>");
			sbBase.append("<SE>");
			sbBase.append("17.00");					//税额
			sbBase.append("</SE>");
			sbBase.append("<HSDJ>");
			sbBase.append("117.00000000");					//含税单价
			sbBase.append("</HSDJ>");
			sbBase.append("<HSJE>");
			sbBase.append("117.00");					//含税金额
			sbBase.append("</HSJE>");
			sbBase.append("</FPXM>");
        }
        sbBase.append("</FPXMXX>");
        
        sbBase.append("</INPUT>");
        return sbBase.toString().trim();
	}

	/**
	 * 2.10 红字普通发票开具校验（电子发票）
	 * @param nsrsbh	纳税人识别号
	 * @param fjh		分机号
	 * @param yfpdm		原发票代码
	 * @param yfphm		原发票号码
	 * @return
	 */
	public static String hzkjjy(String nsrsbh, String fjh, String yfpdm, String yfphm){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);
		sbBase.append("</FJH>");
		sbBase.append("<YFPDM>");
		sbBase.append(yfpdm);
		sbBase.append("</YFPDM>");
		sbBase.append("<YFPHM>");
		sbBase.append(yfphm);
		sbBase.append("</YFPHM>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.27 ssl通道连接测试
	 * @return
	 */
	public static String sslljcs(){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<SERVER_IPADDR>");
		//sbBase.append("192.168.44.25");
		//sbBase.append("10.10.10.91");
		sbBase.append("124.127.114.68");
		
		sbBase.append("</SERVER_IPADDR>");
		sbBase.append("<SERVER_PORT>");
		//sbBase.append("7443");
		//sbBase.append("8092");
		sbBase.append("7026");
		sbBase.append("<SERVER_PORT>");
		sbBase.append("</INPUT>");
		//124.127.114.68:7026

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.26  服务器连接测试
	 * @return
	 */
	public static String ljcs(){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("</INPUT>");
		byte[] base64 = Base64.encodeBase64(sbBase.toString().getBytes());
		return sendOutString(new String(base64), "LJCS").trim();
	}
	
	/**
	 * 2.25  机器信息
	 * @return
	 */
	public static String jqxx(){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.24 网络升级
	 * @param nsrsbh	纳税人识别号
	 * @param fjh		分机号
	 * @param yfpdm		原发票代码
	 * @param yfphm		原发票号码
	 * @return
	 */
	public static String wlsj(WLSJ wlsj){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<EXEC_BIN>");
		sbBase.append("");					//应用程序
		sbBase.append("</EXEC_BIN>");
		sbBase.append("<LIBAWE>");
		sbBase.append("");					//数据库文件
		sbBase.append("</LIBAWE>");
		sbBase.append("<LIBADD_ARM9_SO>");
		sbBase.append("");					//
		sbBase.append("</LIBADD_ARM9_SO>");
		sbBase.append("<LIBREAD_ARM9_SO>");
		sbBase.append("");					//
		sbBase.append("</LIBREAD_ARM9_SO>");
		sbBase.append("<RM_FLAG>");
		sbBase.append("");					//清库标志
		sbBase.append("</RM_FLAG>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.23  网络ftp参数维护
	 * @param ftp_serverip	ftp服务器地址
	 * @param ftp_port		ftp端口号
	 * @param ftp_username		用户名
	 * @param ftp_passwd		原发票号码
	 * @return
	 */
	public static String wlftpsz(String ftp_serverip, String ftp_port, String ftp_username, String ftp_passwd){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<FTP_SERVERIP>");
		sbBase.append("");					//ftp服务器地址
		sbBase.append("</FTP_SERVERIP>");
		sbBase.append("<FTP_PORT>");
		sbBase.append("");					//ftp端口号
		sbBase.append("</FTP_PORT>");
		sbBase.append("<FTP_USERNAME>");
		sbBase.append("");					//用户名
		sbBase.append("</FTP_USERNAME>");
		sbBase.append("<FTP_PASSWD>");
		sbBase.append("");					//密码
		sbBase.append("</FTP_PASSWD>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.22  局端参数设置
	 * @param server_ipaddr		局端受理服务器IP地址
	 * @param server_port		局端受理服务器端口号
	 * @return
	 */
	public static String wlcssz(String server_ipaddr, String server_port){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<SERVER_IPADDR>");
		sbBase.append(server_ipaddr);					//局端受理服务器IP地址
		sbBase.append("</SERVER_IPADDR>");
		sbBase.append("<SERVER_PORT>");
		sbBase.append(server_port);					//局端受理服务器端口号
		sbBase.append("</SERVER_PORT>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	/**
	 * 2.13 发票批量上传（给定全票面信息）
	 * @return
	 */
	public static String fpsc(FPSC_INPUT input){
        StringBuffer sbBase = new StringBuffer();
//        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?><INPUT>  <FJH>0</FJH>  <FPXX COUNT=\"1\">    <FP>      <BMBBH></BMBBH>      <BSQS>1</BSQS>     <BZ></BZ>      <DKNSRSBH></DKNSRSBH>      <DKQYMC></DKQYMC>      <FHR>fhr</FHR>      <FPDM>5000161650</FPDM>      <FPHM>00183906</FPHM>      <FWM>64873142532815279215</FWM>      <GFDZDH>yhzh</GFDZDH>      <GFMC>gmfmc</GFMC>      <GFSH>nsrsbh</GFSH>      <GFYHZH>yhzh</GFYHZH>      <HPTZDBH></HPTZDBH>      <JE>96.15</JE>      <JSHJ>100.00</JSHJ>      <KPLX>0</KPLX>      <KPR>kpr</KPR>      <KPSJ>20160624154252</KPSJ>      <MW>NjQ3MzA3LzA3NCstOSo1MDg2NC8yLTw2NCoqLzwxMj4vMCoyNC0+NDQvMzAwMTM2NDw2NysrKzI1PDcyOTA0KzwqPDM4PjArNTM4KjQrMi08NjQvMC8+PDkwPD4qMjQtPjQ0LzMwNjE1Pi08</MW>      <MX COUNT=\"1\">        <MXXX>          <FPHXZ>0</FPHXZ>          <GGXH>sggxh</GGXH>          <HSDJ>100</HSDJ>          <HSJE>100.00</HSJE>          <JLDW>dw</JLDW>          <LSLBS></LSLBS>          <QYZXBM></QYZXBM>          <SE>3.85</SE>          <SFYHZC>0</SFYHZC>          <SL>0.04</SL>          <SPBM>lspbm</SPBM>          <XMDJ>96.15</XMDJ>          <XMJE>96.15</XMJE>          <XMMC>sipmc</XMMC>          <XMSL>1</XMSL>          <YHZCNR></YHZCNR>        </MXXX>      </MX>      <QDBZ>N</QDBZ>      <SE>3.85</SE>      <SIGN>MIIBOgYJKoZIhvcNAQcCoIIBKzCCAScCAQExCzAJBgUrDgMCGgUAMAsGCSqGSIb3DQEHATGCAQYwggECAgEBMGAwVTELMAkGA1UEBhMCY24xDTALBgNVBAseBABDAEExDTALBgNVBAgeBFMXTqwxGTAXBgNVBAMeEE4tVv16DlKhi6SLwU4tX8MxDTALBgNVBAceBFMXTqwCBwIBAAABFV8wCQYFKw4DAhoFADANBgkqhkiG9w0BAQEFAASBgKgTseQnUnCfsnPVjnulbMKERgekcNjsp8QeSlyXxOs5tm1HVxkrWm3cfanDyWmBMyDJfTozm9ujgAScErDd5+OgS03EmTsx64nOVV/+N7OsM8cOHOzE7DprjtMrL2itbXmC7Ln6gk78zjgKO9YCNpk3soBIOnevHFtus2/xF739</SIGN>      <SKR>skr</SKR>      <SYH>0000000b</SYH>      <XFDZDH></XFDZDH>      <XFMC>中云实达增普</XFMC>      <XFSH>1101052016006070001</XFSH>      <XFYHZH></XFYHZH>      <YFPDM></YFPDM>      <YFPHM></YFPHM>      <ZFSJ></ZFSJ>    </FP>  </FPXX>  <FPZL>2</FPZL>  <JSPBH>661565720943</JSPBH>  <NSRSBH>1101052016006070001</NSRSBH></INPUT>");
        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<XZSKL>00000000</XZSKL>");
        //sbBase.append("<XZSKL>12345678</XZSKL>");
        //sbBase.append("<XZSKL>11111111</XZSKL>");
        //sbBase.append("<XZSKL>00000000</XZSKL>");
        //sbBase.append("<NSRSBH>15000107051302807</NSRSBH><FJH>0</FJH>	<FPXX COUNT=\"1\"><FP>		<FPDM>5000111650</FPDM>		<FPHM>08855156</FPHM><SYH>00000107</SYH>	 </FP></FPXX>");
        //sbBase.append("<NSRSBH>15000107051302807</NSRSBH><FJH>0</FJH>		<FPDM>5000111650</FPDM>		<FPHM>08855156</FPHM><SYH>00000107</SYH>");
        sbBase.append("</INPUT>");
//       
//        sbBase.append("<NSRSBH>");
//        sbBase.append("15000010661565722931");				//纳税人识别号
//        sbBase.append("</NSRSBH>");
//        sbBase.append("<FJH>");
//        sbBase.append("0");				//分机号
//        sbBase.append("</FJH>");
//        sbBase.append("<FPZL>");
//        sbBase.append("41");				//发票种类
//        sbBase.append("</FPZL>");
//        sbBase.append("<JSPBH>");
//        sbBase.append("661565722931");				//金税盘编号 
//        sbBase.append("</JSPBH>");
//        
//        sbBase.append("<FPXX  COUNT=\"" + 1 + "\">");
//        for (int i = 0; i < 1; i++) {
////            FPSC_FP fp = input.getFpList().get(i);
//            sbBase.append("<FP>");
//            sbBase.append("<FPDM>");
//            sbBase.append("150001201502");				//发票代码 
//            sbBase.append("</FPDM>");
//            sbBase.append("<FPHM>");
//            sbBase.append("50012258");				//发票号码 
//            sbBase.append("</FPHM>");
//            sbBase.append("<SYH>");
//            sbBase.append("0000001a");				//索引号 
//            sbBase.append("</SYH>");
//            sbBase.append("<KPLX>");
//            sbBase.append("0");				//发票状态标志
//            sbBase.append("</KPLX>");
//            sbBase.append("<MW>");
//            sbBase.append("27912-&lt;4-&gt;+/&gt;855-52-&gt;+&gt;5&lt;52+/0*+73**-5&lt;1&lt;2482&lt;-476/3274&gt;213172765921&lt;38&lt;&gt;1-8+*/+/1+62+*&gt;4&gt;02&lt;*-*&lt;1&lt;248-&lt;//16");				//密文
//            sbBase.append("</MW>");
//            sbBase.append("<XFSH>");
//            sbBase.append("15000010661565722931");
//            sbBase.append("</XFSH>");
//            sbBase.append("<XFMC>");
//            sbBase.append("武志鹏升级版升级版升级版升级版ceshipan01");				//销方名称 
//            sbBase.append("</XFMC>");
//            sbBase.append("<XFDZDH>");
//            sbBase.append("销售方地址、电话");				//销方地址电话 
//            sbBase.append("</XFDZDH>");
//            sbBase.append("<XFYHZH>");
//            sbBase.append("销售方银行账号");				//销方银行账号 
//            sbBase.append("</XFYHZH>");
//            sbBase.append("<GFSH>");
//            sbBase.append("123456789");				//购方税号 
//            sbBase.append("</GFSH>");
//            sbBase.append("<GFMC>");
//            sbBase.append("购买方名称");				//购方名称 
//            sbBase.append("</GFMC>");
//            sbBase.append("<GFDZDH>");
//            sbBase.append("购买方地址、电话");				//购方地址电话 
//            sbBase.append("</GFDZDH>");
//            sbBase.append("<GFYHZH>");
//            sbBase.append("购买方银行账号");				//购方银行账号 
//            sbBase.append("</GFYHZH>");
//            sbBase.append("<KPRQ>");
//            sbBase.append("20160322014125");				//开票日期
//            sbBase.append("</KPRQ>");
//            sbBase.append("<ZFRQ>");
//            sbBase.append("");				//作废日期
//            sbBase.append("</ZFRQ>");
//            sbBase.append("<BSQS>");
//            sbBase.append("");				//报税期数 
//            sbBase.append("</BSQS>");
//            sbBase.append("<SL>");
//            sbBase.append("");				//税率
//            sbBase.append("</SL>");
//            sbBase.append("<JE>");
//            sbBase.append("");				//合计金额 
//            sbBase.append("</JE>");
//            sbBase.append("<SE>");
//            sbBase.append("");				//合计税额 
//            sbBase.append("</SE>");
//            sbBase.append("<JSHJ>");
//            sbBase.append("");				//价税合计 
//            sbBase.append("</JSHJ>");
//            sbBase.append("<BZ>");
//            sbBase.append("");				//备注
//            sbBase.append("</BZ>");
//            sbBase.append("<KPR>");
//            sbBase.append("");				//开票人 
//            sbBase.append("</KPR>");
//            sbBase.append("<SKR>");
//            sbBase.append("");				//收款人
//            sbBase.append("</SKR>");
//            sbBase.append("<FHR>");
//            sbBase.append("");				//复核人 
//            sbBase.append("</FHR>");
//            sbBase.append("<HPTZDBH>");
//            sbBase.append("");				//红票通知单编号
//            sbBase.append("</HPTZDBH>");
//            sbBase.append("<FWM>");
//            sbBase.append("");				//防伪码 
//            sbBase.append("</FWM>");
//            sbBase.append("<SIGN>");
//            sbBase.append("");				//签名
//            sbBase.append("</SIGN>");
//            sbBase.append("<YFPDM>");
//            sbBase.append("");				//对应红票发票代码
//            sbBase.append("</YFPDM>");
//            sbBase.append("<YFPHM>");
//            sbBase.append("");				//对应红票发票号码
//            sbBase.append("</YFPHM>");
//            sbBase.append("<DKNSRSBH>");
//            sbBase.append("");				//代开企业税号
//            sbBase.append("</DKNSRSBH>");
//            sbBase.append("<DKQYMC>");
//            sbBase.append("");				//代开企业名称
//            sbBase.append("</DKQYMC>");
//            sbBase.append("<QDBZ>");
//            sbBase.append("");				//清单标志
//            sbBase.append("</QDBZ>");
//            int mxcount = 10;
//            sbBase.append("<MX   COUNT=\"" + mxcount + "\">");
//            for (int j = 0; j < mxcount; j++){
////                FPSC_FP_MXXX data = fp.getMxList().get(j);
//                sbBase.append("<MXXX>");
//                sbBase.append("<MXXH>");
//                sbBase.append(j+1);				//明细序号 
//                sbBase.append("</MXXH>");
//                sbBase.append("<MC>");
//                sbBase.append("项目名称 ");				//商品名称 
//                sbBase.append("</MC>");
//                sbBase.append("<JE>");
//                sbBase.append("100.00");				//金额
//                sbBase.append("</JE>");
//                sbBase.append("<SL>");
//                sbBase.append("0.17");				//税率
//                sbBase.append("</SL>");
//                sbBase.append("<SE>");
//                sbBase.append("17.00");				//税额
//                sbBase.append("</SE>");
//                sbBase.append("<SHUL>");
//                sbBase.append("1.00000000");				//数量
//                sbBase.append("</SHUL>");
//                sbBase.append("<DJ>");
//                sbBase.append("100.00000000");				//不含税单价 
//                sbBase.append("</DJ>");
//                sbBase.append("<GGXH>");
//                sbBase.append("规格型号");				//规格型号
//                sbBase.append("</GGXH>");
//                sbBase.append("<JLDW>");
//                sbBase.append("单位");				//计量单位
//                sbBase.append("</JLDW>");
//                sbBase.append("<HSJE>");
//                sbBase.append("117.00");				//含税金额 
//                sbBase.append("</HSJE>");
//                sbBase.append("<HSDJ>");
//                sbBase.append("117.00000000");				//含税单价 
//                sbBase.append("</HSDJ>");
//                sbBase.append("</MXXX>");
//            }
//            sbBase.append("</MX>");
//            sbBase.append("</FP>");
//        }
//        sbBase.append("</FPXX>");
        /*
        sbBase.append("<NSRSBH>");
        sbBase.append("15000010661565722931");				//纳税人识别号
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append("0");				//分机号
        sbBase.append("</FJH>");
        sbBase.append("<FPXX COUNT=\"" + "1" + "\">");
        sbBase.append("<FP>");
        
        sbBase.append("<FPDM>");
        sbBase.append("150001201502");			
        sbBase.append("</FPDM>");
        
        sbBase.append("<FPHM>");
        sbBase.append("50012258");			
        sbBase.append("</FPHM>");
        
        sbBase.append("<SYH>");
        sbBase.append("0000001a");			
        sbBase.append("</SYH>");
        
        sbBase.append("</FP>");
        sbBase.append("</FPXX>");
       */ 
       
        
        return sbBase.toString().trim();
	}
	
	/**
	 * 2.21  网络参数维护
	 * @return
	 */
	public static String wlcswh(WLCSWH wlcswh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<ISDHCP>");
		sbBase.append(wlcswh.getISDHCP());
		sbBase.append("</ISDHCP>");
		sbBase.append("<LOCAL_IP>");
		sbBase.append(wlcswh.getLOCAL_IP());
		sbBase.append("</LOCAL_IP>");
		sbBase.append("<LOCAL_DEFAULTGATE>");
		sbBase.append(wlcswh.getLOCAL_DEFAULTGATE());
		sbBase.append("</LOCAL_DEFAULTGATE>");
		sbBase.append("<LOCAL_PORT>");
		sbBase.append(wlcswh.getLOCAL_PORT());
		sbBase.append("</LOCAL_PORT>");
		sbBase.append("<ISDHCP>");
		sbBase.append(wlcswh.getISDHCP());
		sbBase.append("</ISDHCP>");
		sbBase.append("<ISDHCP>");
		sbBase.append(wlcswh.getISDHCP());
		sbBase.append("</ISDHCP>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.20 金税盘离线发票查询
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String lxfpcx(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);				//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//分机号
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 *	2.19.金税盘发票信息检索
	 * @return
	 */
	public static String fpxxjs(FPXXJS fpxxjs){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append("");				//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append("");				//分机号
		sbBase.append("</FJH>");
		sbBase.append("<CXRQ>");
		sbBase.append("");				//查询日期
		sbBase.append("</CXRQ>");
		sbBase.append("<FPDM>");
		sbBase.append("");				//发票代码
		sbBase.append("</FPDM>");
		sbBase.append("<FPHM>");
		sbBase.append("");				//发票号码
		sbBase.append("</FPHM>");
        sbBase.append("<SYH>");
        sbBase.append("");				//发票索引号
        sbBase.append("</SYH>");
		sbBase.append("<FPZS>");
		sbBase.append("");				//发票张数
		sbBase.append("</FPZS>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.18.金税盘第一张发票查询
	 * @param nsrsbh
	 * @param fjh
	 * @param cxrq
	 * @return
	 */
	public static String swfpcx(String nsrsbh, String fjh, String cxrq){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);				//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//分机号
		sbBase.append("</FJH>");
		sbBase.append("<CXRQ>");
		sbBase.append(cxrq);				//查询日期
		sbBase.append("</CXRQ>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.17.金税盘最后一张发票查询
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String mwfpcx(String nsrsbh, String fjh) {

		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);				//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//分机号
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.16.远程清卡
	 * @param nsrsbh
	 * @param fjh
	 * @param fpzl
	 * @return
	 */
	public static String ycqk(String nsrsbh, String fjh, String fpzl) {

		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);				//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//分机号
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);				//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.15.上报汇总
	 * @param nsrsbh
	 * @param fjh
	 * @param fpzl
	 * @param sblx
	 * @return
	 */
	public static String sbhz(String nsrsbh, String fjh, String fpzl, String sblx) {

		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);				//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//分机号
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);				//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("<SBLX>");
		sbBase.append(sblx);				//上报类型
		sbBase.append("</SBLX>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}

	
	/**
	 * 3.1 设置发票卷
	 * @param nsrsbh
	 * @param fjh
	 * @param fpzl
	 * @param fpdm
	 * @param qshm
	 * @return
	 */
	public static String szfpj(String nsrsbh, String fjh, String fpzl, String fpdm, String qshm){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append("");				//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append("");				//分机号
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append("");				//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("<FPDM>");
		sbBase.append("");				//发票代码
		sbBase.append("</FPDM>");
		sbBase.append("<QSHM>");
		sbBase.append("");				//发票号码
		sbBase.append("</QSHM>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	
	/**
	 * 3.2.获取指定票种的当前代码、号码（上发票卷时可使用来确定发票卷是否正确）
	 * @param nsrsbh
	 * @param fjh
	 * @param fpzl
	 * @return
	 */
	public static String hqdmhm(String nsrsbh,String fjh,String fpzl){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);				//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//分机号
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);				//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
	 * 3.3.空白发票作废（单张）
	 * @param fplsh
	 * @param nsrsbh
	 * @param fjh
	 * @param fpzl
	 * @return
	 */
	public static String kbzf(String fplsh,String nsrsbh,String fjh,String fpzl ){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<FPLSH>");
		sbBase.append("20000000000000000003");				//发票流水号
		sbBase.append("</FPLSH>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);				//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//分机号
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);				//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
	 * 3.4.主分机网络票源退回（2.7的逆操作，暂未实现）
	 * @param nsrsbh
	 * @param fjh
	 * @param fpzl
	 * @param fpdm
	 * @param fphm
	 * @param fpfs
	 * @return
	 */
	public static String zfjpyth(String nsrsbh,String fjh,String fpzl,String fpdm,String fphm,String fpfs){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);
		sbBase.append("</FPZL>");
		sbBase.append("<FPDM>");
		sbBase.append(fpdm);
		sbBase.append("</FPDM>");
		sbBase.append("<FPHM>");
		sbBase.append(fphm);
		sbBase.append("</FPHM>");
		sbBase.append("<FPFS>");
		sbBase.append(fpfs);
		sbBase.append("</FPFS>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
	 * 3.5.发票分发（仅仅针对盘操作）
	 * @param nsrsbh
	 * @param fjh
	 * @param fpzl
	 * @param fpdm
	 * @param fphm
	 * @param fpfs
	 * @return
	 */
	public static String fpff(String nsrsbh,String fjh,String fpzl,String fpdm,String fphm,String fpfs){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//分机号
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);					//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("<FPDM>");
		sbBase.append("150001201502");					//发票代码
		sbBase.append("</FPDM>");
		sbBase.append("<FPHM>");
		sbBase.append("50014255");					//发票号码
		sbBase.append("</FPHM>");
		sbBase.append("<FPFS>");
		sbBase.append("1996");					//发票份数
		sbBase.append("</FPFS>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
	 * 3.6分机退回（仅仅针对盘操作，不可在主机做此业务）
	 * @param nsrsbh
	 * @param fjh
	 * @param fpzl
	 * @param fpdm
	 * @param fphm
	 * @param syfs
	 * @return
	 */
	public static String fjth(String nsrsbh,String fjh,String fpzl,String fpdm,String fphm,String syfs){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//分机号
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);					//发票种类
		sbBase.append("</FPZL>");
		sbBase.append("<FPDM>");
		sbBase.append("150001201502");					//发票代码
		sbBase.append("</FPDM>");
		sbBase.append("<FPHM>");
		sbBase.append("50014255");					//发票号码
		sbBase.append("</FPHM>");
		sbBase.append("<SYFS>");
		sbBase.append("1996");					//剩余份数
		sbBase.append("</SYFS>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
	 * 3.7.发票回收（仅仅针对盘操作）
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String fphs(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//纳税人识别号
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//分机号
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	/**
	 * 3.8.红字发票申请表上传（增专专用）
	 * @param nsrsbh
	 * @param fjh
	 * @param fpzl
	 * @param data
	 * @return
	 */
	public static String hpxxbsc(String nsrsbh,String fjh,String fpzl,HPXXBJG_OUTPUT data){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);
		sbBase.append("</FPZL>");
		sbBase.append("<REDINVREQBILL COUNT=\""+data.getdATA().getList().size()+"\">");
		for(HPXXBJG_REDINVREQBILLXX d : data.getdATA().getList()){
			sbBase.append("<REDINVREQBILLXX>");
			
			sbBase.append("<REQNSRSBH>");
			sbBase.append(d.getREQNSRSBH());
			sbBase.append("</REQNSRSBH>");
			sbBase.append("<KPJH>");
			sbBase.append(d.getKPJH());
			sbBase.append("</KPJH>");
			sbBase.append("<SBBH>");
			sbBase.append(d.getSBBH());
			sbBase.append("</SBBH>");
			sbBase.append("<REQBILLNO>");
			sbBase.append(d.getREQBILLNO());
			sbBase.append("</REQBILLNO>");
			sbBase.append("<BILLTYPE>");
			sbBase.append(d.getBILLTYPE());
			sbBase.append("</BILLTYPE>");
			sbBase.append("<TYPECODE>");
			sbBase.append(d.getTYPECODE());
			sbBase.append("</TYPECODE>");
			sbBase.append("<INVNO>");
			sbBase.append(d.getINVNO());
			sbBase.append("</INVNO>");
			sbBase.append("<SZLB>");
			sbBase.append(d.getSZLB());
			sbBase.append("</SZLB>");
			sbBase.append("<ISMUTIRATE>");
			sbBase.append(d.getISMUTIRATE());
			sbBase.append("</ISMUTIRATE>");
			sbBase.append("<DATE>");
			sbBase.append(d.getDATE());
			sbBase.append("</DATE>");
			sbBase.append("<BUYERNAME>");
			sbBase.append(d.getBUYERNAME());
			sbBase.append("</BUYERNAME>");
			sbBase.append("<BUYTAXCODE>");
			sbBase.append(d.getBUYTAXCODE());
			sbBase.append("</BUYTAXCODE>");
			sbBase.append("<SELLERNAME>");
			sbBase.append(d.getSELLERNAME());
			sbBase.append("</SELLERNAME>");
			sbBase.append("<SELLTAXCODE>");
			sbBase.append(d.getSELLTAXCODE());
			sbBase.append("</SELLTAXCODE>");
			sbBase.append("<AMOUNT>");
			sbBase.append(d.getAMOUNT());
			sbBase.append("</AMOUNT>");
			sbBase.append("<TAXRATE>");
			sbBase.append(d.getTAXRATE());
			sbBase.append("</TAXRATE>");
			sbBase.append("<TAX>");
			sbBase.append(d.getTAX());
			sbBase.append("</TAX>");
			sbBase.append("<REQMEMO>");
			sbBase.append(d.getREQMEMO());
			sbBase.append("</REQMEMO>");
			sbBase.append("<REDINVREQBILLMX COUNT=\"1\">");
			sbBase.append("<GOODSMX>");
			sbBase.append("<GOODSNAME>");
			sbBase.append(d.getgOODSMX().getGOODSNAME());
			sbBase.append("</GOODSNAME>");
			sbBase.append("<GOODSUNIT>");
			sbBase.append(d.getgOODSMX().getGOODSUNIT());
			sbBase.append("</GOODSUNIT>");
			sbBase.append("<GOODSPRICE>");
			sbBase.append(d.getgOODSMX().getGOODSPRICE());
			sbBase.append("</GOODSPRICE>");
			sbBase.append("<GOODSTAXRATE>");
			sbBase.append(d.getgOODSMX().getGOODSTAXRATE());
			sbBase.append("</GOODSTAXRATE>");
			sbBase.append("<GOODSGGXH>");
			sbBase.append(d.getgOODSMX().getGOODSGGXH());
			sbBase.append("</GOODSGGXH>");
			sbBase.append("<GOODSNUM>");
			sbBase.append(d.getgOODSMX().getGOODSNUM());
			sbBase.append("</GOODSNUM>");
			sbBase.append("<GOODSJE>");
			sbBase.append(d.getgOODSMX().getGOODSJE());
			sbBase.append("</GOODSJE>");
			sbBase.append("<GOODSSE>");
			sbBase.append(d.getgOODSMX().getGOODSSE());
			sbBase.append("</GOODSSE>");
			sbBase.append("<HS_BZ>");
			sbBase.append(d.getgOODSMX().getHS_BZ());
			sbBase.append("</HS_BZ>");
			sbBase.append("</GOODSMX>");
			sbBase.append("</REDINVREQBILLXX>");
		}
		sbBase.append("</REDINVREQBILL>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}

	/**
	 * 2.14 发票批量报送结果下载
	 */
	public static String fppljgxz(FPPLJGXZ_INPUT input){
        StringBuffer sbBase = new StringBuffer();
        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append("15000107051302807");				//纳税人识别号
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");				//分机号
        sbBase.append("0");
        sbBase.append("</FJH>");
        sbBase.append("<FPZL>");
        sbBase.append("2");				//发票种类
        sbBase.append("</FPZL>");
        sbBase.append("<SLXLH>");
        sbBase.append("9c45fa93d47f491fb4c9e6e296640dd1");				//受理序列号，可能存在多个
        sbBase.append("</SLXLH>");
        sbBase.append("</INPUT>");
        return sbBase.toString().trim();
	}
	
	/**
	 * 3.9.红字发票申请表审核结果下载（增专专用）
	 */
	public String hpxxbjg(HPXXBJG hpxxbjg){
        StringBuffer sbBase = new StringBuffer();
        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append(hpxxbjg.getNSRSBH());
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append(hpxxbjg.getFJH());
        sbBase.append("</FJH>");
        sbBase.append("<FPZL>");
        sbBase.append(hpxxbjg.getFPZL());
        sbBase.append("</FPZL>");
        sbBase.append("<SBBH>");
        sbBase.append(hpxxbjg.getSBBH());
        sbBase.append("</SBBH>");
        sbBase.append("<KPJH>");
        sbBase.append(hpxxbjg.getKPJH());
        sbBase.append("</KPJH>");
        sbBase.append("<YQZT>");
        sbBase.append(hpxxbjg.getYQZT());
        sbBase.append("</YQZT>");
        sbBase.append("<TKRQ_Q>");
        sbBase.append(hpxxbjg.getTKRQ_Q());
        sbBase.append("</TKRQ_Q>");
        sbBase.append("<TKRQ_Z>");
        sbBase.append(hpxxbjg.getTKRQ_Z());
        sbBase.append("</TKRQ_Z>");
        sbBase.append("<GFSH>");
        sbBase.append(hpxxbjg.getGFSH());
        sbBase.append("</GFSH>");
        sbBase.append("<XFSH>");
        sbBase.append(hpxxbjg.getXFSH());
        sbBase.append("</XFSH>");
        sbBase.append("<XXBBH>");
        sbBase.append(hpxxbjg.getXXBBH());
        sbBase.append("</XXBBH>");
        sbBase.append("<XXBFW>");
        sbBase.append(hpxxbjg.getXXBFW());
        sbBase.append("</XXBFW>");
        sbBase.append("<PAGENO>");
        sbBase.append(hpxxbjg.getPAGENO());
        sbBase.append("</PAGENO>");
        sbBase.append("<PAGESIZE>");
        sbBase.append(hpxxbjg.getPAGESIZE());
        sbBase.append("</PAGESIZE>");
        
        sbBase.append("</INPUT>");
        return sbBase.toString().trim();
	}
	

	/**
	 * 3.10.已开发票作废
	 */
	public String fpzf(FPZF fpzf){
        StringBuffer sbBase = new StringBuffer();
        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append(fpzf.getNSRSBH());
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append(fpzf.getFJH());
        sbBase.append("</FJH>");
        sbBase.append("<FPZL>");
        sbBase.append(fpzf.getFPZL());
        sbBase.append("</FPZL>");
        sbBase.append("<FPDM>");
        sbBase.append(fpzf.getFPDM());
        sbBase.append("</FPDM>");
        sbBase.append("<FPHM>");
        sbBase.append(fpzf.getFPHM());
        sbBase.append("</FPHM>");
        sbBase.append("<ZFR>");
        sbBase.append(fpzf.getZFR());
        sbBase.append("</ZFR>");
        
        sbBase.append("</INPUT>");
        return sbBase.toString().trim();
	}
	

	
	/**
	 * 4.1.执行命令
	 * @return
	 */
	public static String zxml(List<String> list){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<MLXX COUNT=\""+list.size()+"\">");
		for(int i=0; i< list.size(); i++){
			sbBase.append("<ML>");
			sbBase.append(list.get(i));
			sbBase.append("</ML>");
		}
		sbBase.append("</MLXX>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	

	/**
	 * 3.12 发票批量上传
	 */
	public String fpplbs(FPPLBS_INPUT input){
	    StringBuffer sbBase = new StringBuffer();
        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append(input.getNSRSBH());
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append(input.getFJH());
        sbBase.append("</FJH>");
        sbBase.append("<FPZL>");
        sbBase.append(input.getFPZL());
        sbBase.append("</FPZL>");
        
        sbBase.append("<FPXX COUNT=\"" + input.getFpItems().size() + "\">");
        for(int i=0; i<input.getFpItems().size(); i++ ){
            FPPLBS_FP fp = input.getFpItems().get(i);
            sbBase.append("<FP>");
            sbBase.append("<FPDM>");
            sbBase.append(fp.getFPDM());
            sbBase.append("</FPDM>");
            sbBase.append("<FPHM>");
            sbBase.append(fp.getFPHM());
            sbBase.append("</FPHM>");
            sbBase.append("<SYH>");
            sbBase.append(fp.getSYH());
            sbBase.append("</SYH>");
            sbBase.append("</FP>");
        }
        sbBase.append("</FPXX>");
        sbBase.append("</INPUT>");
        return sbBase.toString().trim();
	}
	
	/**
	 * 3.11.单张发票修复
	 */
	public String fpxf(FPXF_INPUT input){
	    StringBuffer sbBase = new StringBuffer();
        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append(input.getNSRSBH());
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append(input.getFJH());
        sbBase.append("</FJH>");
        sbBase.append("<FPDM>");
        sbBase.append(input.getFPDM());
        sbBase.append("</FPDM>");
        sbBase.append("<FPHM>");
        sbBase.append(input.getFPHM());
        sbBase.append("</FPHM>");
        sbBase.append("<SYH>");
        sbBase.append(input.getSYH());
        sbBase.append("</SYH>");
        sbBase.append("</INPUT>");
        return sbBase.toString().trim();
	}
	
	/**
	 * 2.29.税收分类编码下载
	 */
	public static String ssflbmxz(String nsrsbh, String fjh, String spbmbbh, String spbm){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append(nsrsbh);
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append(fjh);
        sbBase.append("</FJH>");
        sbBase.append("<SPBMBBH>");
        sbBase.append(spbmbbh);
        sbBase.append("</SPBMBBH>");
        sbBase.append("<SPBM>");
        sbBase.append(spbm);
        sbBase.append("</SPBM>");
        sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
	 * Reset
	 */
	public static String Reset(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	/**
	 * Reset
	 */
	public static String RebuildDB(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}		
	
}
