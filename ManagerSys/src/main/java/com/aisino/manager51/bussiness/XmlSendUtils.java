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
	 * 2.1.税控信息查询
	 */
	public static DecimalFormat df = new DecimalFormat("0.00");
	
	/**
	 * �����ⲿxmlƴװ
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
	 * 2.1 ˰����Ϣ��ѯ
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String skxxcx(String nsrsbh, String fjh) {

		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");					//��˰��ʶ���
		sbBase.append(nsrsbh);
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}

	/**
	 * 2.2 ��ҵ����ͬ��
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String qycstb(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");					//��˰��ʶ���
		sbBase.append(nsrsbh);
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.3 ��˰��״̬��ѯ
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String jspzt(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");					//��˰��ʶ���
		sbBase.append(nsrsbh);
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.11 ��˰�̷�Ʊ��ѯ
	 */
	public static String fpcx(FPCX_INPUT fpcx){
	    StringBuffer sbBase = new StringBuffer();
	    sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append("15000107051302807");			//��˰��ʶ���
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append("0");			//�ֻ���
        sbBase.append("</FJH>");
        sbBase.append("<FPZL>");
        sbBase.append("2");			//��Ʊ����
        sbBase.append("</FPZL>");
        sbBase.append("<FPDM>");
        sbBase.append("5000111650");			//��Ʊ����
        sbBase.append("</FPDM>");
        sbBase.append("<FPHM>");
        sbBase.append("08855156");			//��Ʊ����
        sbBase.append("</FPHM>");
        sbBase.append("<SYH>");
        sbBase.append("");			//������
        sbBase.append("</SYH>");
        sbBase.append("</INPUT>");
        return sbBase.toString().trim();
	}
	/**
	 * 2.4  ��˰�̷�Ʊ����ѯ
	 * @param nsrsbh	��˰��ʶ���
	 * @param fjh		�ֻ���
	 * @param fpzl		��Ʊ����
	 * @return
	 */
	public static String fpkccx(String nsrsbh, String fjh, String fpzl){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);					//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.5  ��˰�̷�Ʊ���ѯ
	 * @param nsrsbh	��˰��ʶ���
	 * @param fjh		�ֻ���
	 * @param fpzl		��Ʊ����
	 * @return
	 */
	public static String fpjcx(String nsrsbh, String fjh, String fpzl){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);					//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.6  ��˰�̿ɶ�������Ʊ����
	 * @param nsrsbh	��˰��ʶ���
	 * @param fjh		�ֻ���
	 * @param fpzl		��Ʊ����
	 * @return
	 */
	public static String kdzdfpfs(String nsrsbh, String fjh, String fpzl){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);					//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.7 �ֶ˿�����ƱԴ��ȡ
	 * @param nsrsbh	��˰��ʶ���
	 * @param fjh		�ֻ���
	 * @return
	 */
	public static String kxzpyfs(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.8 ���ֻ�ƱԴ��������
	 * @return
	 */
	public static String pywlxz(PYWLXZ_INPUT pywlxz){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(pywlxz.getNSRSBH());					//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(pywlxz.getFJH());					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<LSH>");
		sbBase.append(pywlxz.getLSH());					//��ˮ��
		sbBase.append("</LSH>");
		sbBase.append("<FPZL>");
		sbBase.append(pywlxz.getFPZL());					//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("<FPDM>");
		sbBase.append(pywlxz.getFPDM());					//��Ʊ����
		sbBase.append("</FPDM>");
		sbBase.append("<FPQSHM>");
		sbBase.append(pywlxz.getFPQSHM());					//��Ʊ��ʼ����
		sbBase.append("</FPQSHM>");
		sbBase.append("<FPSL>");
		sbBase.append(pywlxz.getFPSL());					//��Ʊ����
		sbBase.append("</FPSL>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.9 ��Ʊ����
	 * @return
	 */
	public static String fpkj(FPKJ_INPUT fpkj){
		StringBuffer sbBase = new StringBuffer();
//		FPKJ_IN_HEAD head = fpkj.getHead();
//		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
//		sbBase.append("<INPUT>");
//		sbBase.append("<NSRSBH>");
//		sbBase.append("110105201604260001");					//��˰��ʶ���
//		sbBase.append("</NSRSBH>");
//		sbBase.append("<FJH>");
//		sbBase.append("0");					//�ֻ���
//		sbBase.append("</FJH>");
//		sbBase.append("<FPLSH>");
//		sbBase.append("00000000000000000024");					//��Ʊ��ˮ��
//		sbBase.append("</FPLSH>");
//		sbBase.append("<XPLSH>");
//		sbBase.append("10000000000000000002");					//СƱ��ˮ��
//		sbBase.append("</XPLSH>");
//		sbBase.append("<FPZL>");
//		sbBase.append("2");					//��Ʊ����
//		sbBase.append("</FPZL>");
//		sbBase.append("<KPLX>");
//		sbBase.append("0");					//��Ʊ����
//		sbBase.append("</KPLX>");
//		sbBase.append("<XFSH>");
//		sbBase.append("110105201604260001");					//���۷���˰��ʶ���
//		sbBase.append("</XFSH>");
//		sbBase.append("<XFMC>");
//		sbBase.append("110105201604260001TEST");					//���۷�����
//		sbBase.append("</XFMC>");
//		sbBase.append("<XFDZDH>");
//		sbBase.append("���۷���ַ���绰");					//���۷���ַ���绰
//		sbBase.append("</XFDZDH>");
//		sbBase.append("<XFYHZH>");
//		sbBase.append("���۷������˺�");					//���۷������˺�
//		sbBase.append("</XFYHZH>");
//		sbBase.append("<GFSH>");
//		sbBase.append("123456789");					//������˰��ʶ���
//		sbBase.append("</GFSH>");
//		sbBase.append("<GFMC>");
//		sbBase.append("��������");					//��������
//		sbBase.append("</GFMC>");
//		sbBase.append("<GFDZDH>");
//		sbBase.append("���򷽵�ַ���绰");					//���򷽵�ַ���绰
//		sbBase.append("</GFDZDH>");
//		sbBase.append("<GFYHZH>");
//		sbBase.append("���������˺�");					//���������˺�
//		sbBase.append("</GFYHZH>");
//		sbBase.append("<KPR>");
//		sbBase.append("��Ʊ��");					//��Ʊ��
//		sbBase.append("</KPR>");
//		sbBase.append("<SKR>");
//		sbBase.append("�տ���");					//�տ���
//		sbBase.append("</SKR>");
//		sbBase.append("<FHR>");
//		sbBase.append("������");					//������
//		sbBase.append("</FHR>");
//		sbBase.append("<YFPDM>");
//		sbBase.append("");					//ԭ��Ʊ����
//		sbBase.append("</YFPDM>");
//		sbBase.append("<YFPHM>");
//		sbBase.append("");					//ԭ��Ʊ����
//		sbBase.append("</YFPHM>");
//		sbBase.append("<HPTZDBH>");
//		sbBase.append("");					//��Ʊ֪ͨ�����</
//		sbBase.append("</HPTZDBH>");
//		sbBase.append("<QDBZ>");
//		sbBase.append("N");					//�嵥��־
//		sbBase.append("</QDBZ>");
//		sbBase.append("<JSHJ>");
//		sbBase.append("117.00");					//��˰�ϼ�
//		sbBase.append("</JSHJ>");
//		sbBase.append("<HJJE>");
//		sbBase.append("100.00");					//�ϼƽ��(����˰)</
//		sbBase.append("</HJJE>");
//		sbBase.append("<HJSE>");
//		sbBase.append("17.00");					//�ϼ�˰��
//		sbBase.append("</HJSE>");
//		sbBase.append("<BZ>");
//		sbBase.append("��ע");					//��ע
//		sbBase.append("</BZ>");
//		
//		int mxcount = 1;
//		sbBase.append("<FPXMXX COUNT=\"" + mxcount + "\">");
//		
//		for(int i=0; i<mxcount; i++ ){
////			FPKJ_FPMX fpmx = fpkj.getList().get(i);
//			sbBase.append("<FPXM>");
//			sbBase.append("<FPHXZ>");
//			sbBase.append("0");					//��Ʊ������
//			sbBase.append("</FPHXZ>");
//			sbBase.append("<XMMC>");
//			sbBase.append("��Ŀ����");					//��Ŀ����
//			sbBase.append("</XMMC>");
//			sbBase.append("<GGXH>");
//			sbBase.append("����ͺ�");					//����ͺ�
//			sbBase.append("</GGXH>");
//			sbBase.append("<DW>");
//			sbBase.append("��λ");					//��λ
//			sbBase.append("</DW>");
//			sbBase.append("<XMSL>");
//			sbBase.append("1.00000000");					//��Ŀ����
//			sbBase.append("</XMSL>");
//			sbBase.append("<XMDJ>");
//			sbBase.append("100.00000000");					//����˰����
//			sbBase.append("</XMDJ>");
//			sbBase.append("<XMJE>");
//			sbBase.append("100.00");					//����˰���
//			sbBase.append("</XMJE>");
//			sbBase.append("<SL>");
//			sbBase.append("0.17");					//˰��
//			sbBase.append("</SL>");
//			sbBase.append("<SE>");
//			sbBase.append("17.00");					//˰��
//			sbBase.append("</SE>");
//			sbBase.append("<HSDJ>");
//			sbBase.append("117.00000000");					//��˰����
//			sbBase.append("</HSDJ>");
//			sbBase.append("<HSJE>");
//			sbBase.append("117.00");					//��˰���
//			sbBase.append("</HSJE>");
//			sbBase.append("</FPXM>");
//		}
//		sbBase.append("</FPXMXX>");
//		sbBase.append("</INPUT>");

		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?><INPUT>	<NSRSBH>500105201606281145</NSRSBH>	<FJH>0</FJH>	<KPZDH></KPZDH>	<FPLSH>20160705084520</FPLSH>	<XPLSH>20160705084520</XPLSH>	<FPZL>2</FPZL>	<KPLX>0</KPLX>	<XFSH>500105201606281145</XFSH>	<XFMC>����ʵ��500105201606281145</XFMC>	<XFDZDH></XFDZDH>	<XFYHZH></XFYHZH>	<GFSH>000000000000000</GFSH>	<GFMC>����</GFMC>	<GFDZDH></GFDZDH>	<GFYHZH></GFYHZH>	<KPR>admin</KPR>	<SKR>admin</SKR>	<FHR>admin</FHR>	<YFPDM></YFPDM>	<YFPHM></YFPHM>	<HPTZDBH></HPTZDBH>	<QDBZ></QDBZ>	<JSHJ>10.00</JSHJ>	<HJJE>8.85</HJJE>	<HJSE>1.15</HJSE>	<BMBBH></BMBBH>	<BZ></BZ>	<FPXMXX COUNT=\"1\">		<FPXM>			<FPHXZ></FPHXZ>			<XMMC>��Ʒ����</XMMC>			<GGXH></GGXH>			<JLDW>����</JLDW>			<XMSL>1.000</XMSL>			<XMDJ>8.85</XMDJ>			<XMJE>8.85</XMJE>			<SL>0.13</SL>			<SE>1.15</SE>			<HSDJ>10.00</HSDJ>			<HSJE>10.00</HSJE>			<SPBM>1010101020000000000</SPBM>			<QYZXBM></QYZXBM>			<SFYHZC></SFYHZC>			<YHZCNR></YHZCNR>			<LSLBS></LSLBS>		</FPXM>	</FPXMXX></INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
     * 2.12 �ѿ���Ʊ���ϣ�����ȫƱ����Ϣ��
     */
	public static String fpzfqxx(FPKJ_IN_HEAD data, List<FPKJ_FPMX> list){
        StringBuffer sbBase = new StringBuffer();
        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append("15000010661565722931");				//��˰��ʶ���
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append("1");				//�ֻ���
        sbBase.append("</FJH>");
        sbBase.append("<FPZL>");
        sbBase.append("41");				//��Ʊ����
        sbBase.append("</FPZL>");
        sbBase.append("<FPDM>");
        sbBase.append("150001201502");				//��Ʊ����
        sbBase.append("</FPDM>");
        sbBase.append("<FPHM>");
        sbBase.append("50014254");				//��Ʊ����
        sbBase.append("</FPHM>");
        sbBase.append("<SYH>");
        sbBase.append("00000009");				//������
        sbBase.append("</SYH>");
        sbBase.append("<KPLX>");
        sbBase.append("0");				//��Ʊ����
        sbBase.append("</KPLX>");
        sbBase.append("<XSF_NSRSBH>");
        sbBase.append("15000010661565722931");				//���۷���˰��ʶ���
        sbBase.append("</XSF_NSRSBH>");
        sbBase.append("<XSF_MC>");
        sbBase.append("��־��������������������������ceshipan01");				//���۷�����
        sbBase.append("</XSF_MC>");
        sbBase.append("<XSF_DZDH>");
        sbBase.append("���۷���ַ���绰");				//���۷���ַ���绰
        sbBase.append("</XSF_DZDH>");
        sbBase.append("<XSF_YHZH>");
        sbBase.append("���۷������˺�");				//���۷������˺�
        sbBase.append("</XSF_YHZH>");
        sbBase.append("<GMF_NSRSBH>");
        sbBase.append("1234567890123");				//������˰��ʶ���
        sbBase.append("</GMF_NSRSBH>");
        sbBase.append("<GMF_MC>");
        sbBase.append("��������");				//��������
        sbBase.append("</GMF_MC>");
        sbBase.append("<GMF_DZDH>");
        sbBase.append("���򷽵�ַ���绰");				//���򷽵�ַ���绰
        sbBase.append("</GMF_DZDH>");
        sbBase.append("<GMF_YHZH>");
        sbBase.append("���������˺�");				//���������˺�
        sbBase.append("</GMF_YHZH>");
        sbBase.append("<KPRQ>");
        sbBase.append("20100102");				//��Ʊ����
        sbBase.append("</KPRQ>");
        sbBase.append("<KPR>");
        sbBase.append("��Ʊ��");				//��Ʊ��
        sbBase.append("</KPR>");
        sbBase.append("<SKR>");
        sbBase.append("�տ���");				//�տ���
        sbBase.append("</SKR>");
        sbBase.append("<FHR>");
        sbBase.append("������");				//������
        sbBase.append("</FHR>");
        sbBase.append("<YFPDM>");
        sbBase.append("");				//ԭ��Ʊ����
        sbBase.append("</YFPDM>");
        sbBase.append("<YFPHM>");
        sbBase.append("");				//ԭ��Ʊ����
        sbBase.append("</YFPHM>");
        sbBase.append("<HPTZDBH>");
        sbBase.append("");				//��Ʊ֪ͨ�����
        sbBase.append("</HPTZDBH>");
        sbBase.append("<QDBZ>");
        sbBase.append("N");				//�嵥��־
        sbBase.append("</QDBZ>");
        sbBase.append("<JSHJ>");
        sbBase.append("117.00");				//��˰�ϼ�
        sbBase.append("</JSHJ>");
        sbBase.append("<HJJE>");
        sbBase.append("100.00");				//�ϼƽ��
        sbBase.append("</HJJE>");
        sbBase.append("<HJSE>");
        sbBase.append("17.00");				//�ϼ�˰��
        sbBase.append("</HJSE>");
        sbBase.append("<FPMW>");
        sbBase.append("60/5/220&lt;8-&lt;&lt;094+920157/&gt;98090-855+8&lt;+29+4/620068058&lt;&gt;2-4696&lt;40*40&gt;0*41237&gt;/261572&gt;98090-855+8&lt;+&gt;&lt;48735747-1");				//��Ʊ����
        sbBase.append("</FPMW>");
        sbBase.append("<FWM>");
        sbBase.append("58842013333845749954");				//��α��
        sbBase.append("</FWM>");
        sbBase.append("<BZ>");
        sbBase.append("��ע");				//��ע
        sbBase.append("</BZ>");
        
        int mxcount = 1;
        sbBase.append("<FPXMXX COUNT=\"" + mxcount + "\">");
        for(int i=0; i<mxcount; i++ ){
//            FPKJ_FPMX fpmx = list.get(i);
        	sbBase.append("<FPXM>");
			sbBase.append("<FPHXZ>");
			sbBase.append("0");					//��Ʊ������
			sbBase.append("</FPHXZ>");
			sbBase.append("<XMMC>");
			sbBase.append("��Ŀ����");					//��Ŀ����
			sbBase.append("</XMMC>");
			sbBase.append("<GGXH>");
			sbBase.append("����ͺ�");					//����ͺ�
			sbBase.append("</GGXH>");
			sbBase.append("<DW>");
			sbBase.append("��λ");					//��λ
			sbBase.append("</DW>");
			sbBase.append("<XMSL>");
			sbBase.append("1.00000000");					//��Ŀ����
			sbBase.append("</XMSL>");
			sbBase.append("<XMDJ>");
			sbBase.append("100.00000000");					//����˰����
			sbBase.append("</XMDJ>");
			sbBase.append("<XMJE>");
			sbBase.append("100.00");					//����˰���
			sbBase.append("</XMJE>");
			sbBase.append("<SL>");
			sbBase.append("0.17");					//˰��
			sbBase.append("</SL>");
			sbBase.append("<SE>");
			sbBase.append("17.00");					//˰��
			sbBase.append("</SE>");
			sbBase.append("<HSDJ>");
			sbBase.append("117.00000000");					//��˰����
			sbBase.append("</HSDJ>");
			sbBase.append("<HSJE>");
			sbBase.append("117.00");					//��˰���
			sbBase.append("</HSJE>");
			sbBase.append("</FPXM>");
        }
        sbBase.append("</FPXMXX>");
        
        sbBase.append("</INPUT>");
        return sbBase.toString().trim();
	}

	/**
	 * 2.10 ������ͨ��Ʊ����У�飨���ӷ�Ʊ��
	 * @param nsrsbh	��˰��ʶ���
	 * @param fjh		�ֻ���
	 * @param yfpdm		ԭ��Ʊ����
	 * @param yfphm		ԭ��Ʊ����
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
	 * 2.27 sslͨ�����Ӳ���
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
	 * 2.26  ���������Ӳ���
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
	 * 2.25  ������Ϣ
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
	 * 2.24 ��������
	 * @param nsrsbh	��˰��ʶ���
	 * @param fjh		�ֻ���
	 * @param yfpdm		ԭ��Ʊ����
	 * @param yfphm		ԭ��Ʊ����
	 * @return
	 */
	public static String wlsj(WLSJ wlsj){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<EXEC_BIN>");
		sbBase.append("");					//Ӧ�ó���
		sbBase.append("</EXEC_BIN>");
		sbBase.append("<LIBAWE>");
		sbBase.append("");					//���ݿ��ļ�
		sbBase.append("</LIBAWE>");
		sbBase.append("<LIBADD_ARM9_SO>");
		sbBase.append("");					//
		sbBase.append("</LIBADD_ARM9_SO>");
		sbBase.append("<LIBREAD_ARM9_SO>");
		sbBase.append("");					//
		sbBase.append("</LIBREAD_ARM9_SO>");
		sbBase.append("<RM_FLAG>");
		sbBase.append("");					//����־
		sbBase.append("</RM_FLAG>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.23  ����ftp����ά��
	 * @param ftp_serverip	ftp��������ַ
	 * @param ftp_port		ftp�˿ں�
	 * @param ftp_username		�û���
	 * @param ftp_passwd		ԭ��Ʊ����
	 * @return
	 */
	public static String wlftpsz(String ftp_serverip, String ftp_port, String ftp_username, String ftp_passwd){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<FTP_SERVERIP>");
		sbBase.append("");					//ftp��������ַ
		sbBase.append("</FTP_SERVERIP>");
		sbBase.append("<FTP_PORT>");
		sbBase.append("");					//ftp�˿ں�
		sbBase.append("</FTP_PORT>");
		sbBase.append("<FTP_USERNAME>");
		sbBase.append("");					//�û���
		sbBase.append("</FTP_USERNAME>");
		sbBase.append("<FTP_PASSWD>");
		sbBase.append("");					//����
		sbBase.append("</FTP_PASSWD>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.22  �ֶ˲�������
	 * @param server_ipaddr		�ֶ����������IP��ַ
	 * @param server_port		�ֶ�����������˿ں�
	 * @return
	 */
	public static String wlcssz(String server_ipaddr, String server_port){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<SERVER_IPADDR>");
		sbBase.append(server_ipaddr);					//�ֶ����������IP��ַ
		sbBase.append("</SERVER_IPADDR>");
		sbBase.append("<SERVER_PORT>");
		sbBase.append(server_port);					//�ֶ�����������˿ں�
		sbBase.append("</SERVER_PORT>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	/**
	 * 2.13 ��Ʊ�����ϴ�������ȫƱ����Ϣ��
	 * @return
	 */
	public static String fpsc(FPSC_INPUT input){
        StringBuffer sbBase = new StringBuffer();
//        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?><INPUT>  <FJH>0</FJH>  <FPXX COUNT=\"1\">    <FP>      <BMBBH></BMBBH>      <BSQS>1</BSQS>     <BZ></BZ>      <DKNSRSBH></DKNSRSBH>      <DKQYMC></DKQYMC>      <FHR>fhr</FHR>      <FPDM>5000161650</FPDM>      <FPHM>00183906</FPHM>      <FWM>64873142532815279215</FWM>      <GFDZDH>yhzh</GFDZDH>      <GFMC>gmfmc</GFMC>      <GFSH>nsrsbh</GFSH>      <GFYHZH>yhzh</GFYHZH>      <HPTZDBH></HPTZDBH>      <JE>96.15</JE>      <JSHJ>100.00</JSHJ>      <KPLX>0</KPLX>      <KPR>kpr</KPR>      <KPSJ>20160624154252</KPSJ>      <MW>NjQ3MzA3LzA3NCstOSo1MDg2NC8yLTw2NCoqLzwxMj4vMCoyNC0+NDQvMzAwMTM2NDw2NysrKzI1PDcyOTA0KzwqPDM4PjArNTM4KjQrMi08NjQvMC8+PDkwPD4qMjQtPjQ0LzMwNjE1Pi08</MW>      <MX COUNT=\"1\">        <MXXX>          <FPHXZ>0</FPHXZ>          <GGXH>sggxh</GGXH>          <HSDJ>100</HSDJ>          <HSJE>100.00</HSJE>          <JLDW>dw</JLDW>          <LSLBS></LSLBS>          <QYZXBM></QYZXBM>          <SE>3.85</SE>          <SFYHZC>0</SFYHZC>          <SL>0.04</SL>          <SPBM>lspbm</SPBM>          <XMDJ>96.15</XMDJ>          <XMJE>96.15</XMJE>          <XMMC>sipmc</XMMC>          <XMSL>1</XMSL>          <YHZCNR></YHZCNR>        </MXXX>      </MX>      <QDBZ>N</QDBZ>      <SE>3.85</SE>      <SIGN>MIIBOgYJKoZIhvcNAQcCoIIBKzCCAScCAQExCzAJBgUrDgMCGgUAMAsGCSqGSIb3DQEHATGCAQYwggECAgEBMGAwVTELMAkGA1UEBhMCY24xDTALBgNVBAseBABDAEExDTALBgNVBAgeBFMXTqwxGTAXBgNVBAMeEE4tVv16DlKhi6SLwU4tX8MxDTALBgNVBAceBFMXTqwCBwIBAAABFV8wCQYFKw4DAhoFADANBgkqhkiG9w0BAQEFAASBgKgTseQnUnCfsnPVjnulbMKERgekcNjsp8QeSlyXxOs5tm1HVxkrWm3cfanDyWmBMyDJfTozm9ujgAScErDd5+OgS03EmTsx64nOVV/+N7OsM8cOHOzE7DprjtMrL2itbXmC7Ln6gk78zjgKO9YCNpk3soBIOnevHFtus2/xF739</SIGN>      <SKR>skr</SKR>      <SYH>0000000b</SYH>      <XFDZDH></XFDZDH>      <XFMC>����ʵ������</XFMC>      <XFSH>1101052016006070001</XFSH>      <XFYHZH></XFYHZH>      <YFPDM></YFPDM>      <YFPHM></YFPHM>      <ZFSJ></ZFSJ>    </FP>  </FPXX>  <FPZL>2</FPZL>  <JSPBH>661565720943</JSPBH>  <NSRSBH>1101052016006070001</NSRSBH></INPUT>");
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
//        sbBase.append("15000010661565722931");				//��˰��ʶ���
//        sbBase.append("</NSRSBH>");
//        sbBase.append("<FJH>");
//        sbBase.append("0");				//�ֻ���
//        sbBase.append("</FJH>");
//        sbBase.append("<FPZL>");
//        sbBase.append("41");				//��Ʊ����
//        sbBase.append("</FPZL>");
//        sbBase.append("<JSPBH>");
//        sbBase.append("661565722931");				//��˰�̱�� 
//        sbBase.append("</JSPBH>");
//        
//        sbBase.append("<FPXX  COUNT=\"" + 1 + "\">");
//        for (int i = 0; i < 1; i++) {
////            FPSC_FP fp = input.getFpList().get(i);
//            sbBase.append("<FP>");
//            sbBase.append("<FPDM>");
//            sbBase.append("150001201502");				//��Ʊ���� 
//            sbBase.append("</FPDM>");
//            sbBase.append("<FPHM>");
//            sbBase.append("50012258");				//��Ʊ���� 
//            sbBase.append("</FPHM>");
//            sbBase.append("<SYH>");
//            sbBase.append("0000001a");				//������ 
//            sbBase.append("</SYH>");
//            sbBase.append("<KPLX>");
//            sbBase.append("0");				//��Ʊ״̬��־
//            sbBase.append("</KPLX>");
//            sbBase.append("<MW>");
//            sbBase.append("27912-&lt;4-&gt;+/&gt;855-52-&gt;+&gt;5&lt;52+/0*+73**-5&lt;1&lt;2482&lt;-476/3274&gt;213172765921&lt;38&lt;&gt;1-8+*/+/1+62+*&gt;4&gt;02&lt;*-*&lt;1&lt;248-&lt;//16");				//����
//            sbBase.append("</MW>");
//            sbBase.append("<XFSH>");
//            sbBase.append("15000010661565722931");
//            sbBase.append("</XFSH>");
//            sbBase.append("<XFMC>");
//            sbBase.append("��־��������������������������ceshipan01");				//�������� 
//            sbBase.append("</XFMC>");
//            sbBase.append("<XFDZDH>");
//            sbBase.append("���۷���ַ���绰");				//������ַ�绰 
//            sbBase.append("</XFDZDH>");
//            sbBase.append("<XFYHZH>");
//            sbBase.append("���۷������˺�");				//���������˺� 
//            sbBase.append("</XFYHZH>");
//            sbBase.append("<GFSH>");
//            sbBase.append("123456789");				//����˰�� 
//            sbBase.append("</GFSH>");
//            sbBase.append("<GFMC>");
//            sbBase.append("��������");				//�������� 
//            sbBase.append("</GFMC>");
//            sbBase.append("<GFDZDH>");
//            sbBase.append("���򷽵�ַ���绰");				//������ַ�绰 
//            sbBase.append("</GFDZDH>");
//            sbBase.append("<GFYHZH>");
//            sbBase.append("���������˺�");				//���������˺� 
//            sbBase.append("</GFYHZH>");
//            sbBase.append("<KPRQ>");
//            sbBase.append("20160322014125");				//��Ʊ����
//            sbBase.append("</KPRQ>");
//            sbBase.append("<ZFRQ>");
//            sbBase.append("");				//��������
//            sbBase.append("</ZFRQ>");
//            sbBase.append("<BSQS>");
//            sbBase.append("");				//��˰���� 
//            sbBase.append("</BSQS>");
//            sbBase.append("<SL>");
//            sbBase.append("");				//˰��
//            sbBase.append("</SL>");
//            sbBase.append("<JE>");
//            sbBase.append("");				//�ϼƽ�� 
//            sbBase.append("</JE>");
//            sbBase.append("<SE>");
//            sbBase.append("");				//�ϼ�˰�� 
//            sbBase.append("</SE>");
//            sbBase.append("<JSHJ>");
//            sbBase.append("");				//��˰�ϼ� 
//            sbBase.append("</JSHJ>");
//            sbBase.append("<BZ>");
//            sbBase.append("");				//��ע
//            sbBase.append("</BZ>");
//            sbBase.append("<KPR>");
//            sbBase.append("");				//��Ʊ�� 
//            sbBase.append("</KPR>");
//            sbBase.append("<SKR>");
//            sbBase.append("");				//�տ���
//            sbBase.append("</SKR>");
//            sbBase.append("<FHR>");
//            sbBase.append("");				//������ 
//            sbBase.append("</FHR>");
//            sbBase.append("<HPTZDBH>");
//            sbBase.append("");				//��Ʊ֪ͨ�����
//            sbBase.append("</HPTZDBH>");
//            sbBase.append("<FWM>");
//            sbBase.append("");				//��α�� 
//            sbBase.append("</FWM>");
//            sbBase.append("<SIGN>");
//            sbBase.append("");				//ǩ��
//            sbBase.append("</SIGN>");
//            sbBase.append("<YFPDM>");
//            sbBase.append("");				//��Ӧ��Ʊ��Ʊ����
//            sbBase.append("</YFPDM>");
//            sbBase.append("<YFPHM>");
//            sbBase.append("");				//��Ӧ��Ʊ��Ʊ����
//            sbBase.append("</YFPHM>");
//            sbBase.append("<DKNSRSBH>");
//            sbBase.append("");				//������ҵ˰��
//            sbBase.append("</DKNSRSBH>");
//            sbBase.append("<DKQYMC>");
//            sbBase.append("");				//������ҵ����
//            sbBase.append("</DKQYMC>");
//            sbBase.append("<QDBZ>");
//            sbBase.append("");				//�嵥��־
//            sbBase.append("</QDBZ>");
//            int mxcount = 10;
//            sbBase.append("<MX   COUNT=\"" + mxcount + "\">");
//            for (int j = 0; j < mxcount; j++){
////                FPSC_FP_MXXX data = fp.getMxList().get(j);
//                sbBase.append("<MXXX>");
//                sbBase.append("<MXXH>");
//                sbBase.append(j+1);				//��ϸ��� 
//                sbBase.append("</MXXH>");
//                sbBase.append("<MC>");
//                sbBase.append("��Ŀ���� ");				//��Ʒ���� 
//                sbBase.append("</MC>");
//                sbBase.append("<JE>");
//                sbBase.append("100.00");				//���
//                sbBase.append("</JE>");
//                sbBase.append("<SL>");
//                sbBase.append("0.17");				//˰��
//                sbBase.append("</SL>");
//                sbBase.append("<SE>");
//                sbBase.append("17.00");				//˰��
//                sbBase.append("</SE>");
//                sbBase.append("<SHUL>");
//                sbBase.append("1.00000000");				//����
//                sbBase.append("</SHUL>");
//                sbBase.append("<DJ>");
//                sbBase.append("100.00000000");				//����˰���� 
//                sbBase.append("</DJ>");
//                sbBase.append("<GGXH>");
//                sbBase.append("����ͺ�");				//����ͺ�
//                sbBase.append("</GGXH>");
//                sbBase.append("<JLDW>");
//                sbBase.append("��λ");				//������λ
//                sbBase.append("</JLDW>");
//                sbBase.append("<HSJE>");
//                sbBase.append("117.00");				//��˰��� 
//                sbBase.append("</HSJE>");
//                sbBase.append("<HSDJ>");
//                sbBase.append("117.00000000");				//��˰���� 
//                sbBase.append("</HSDJ>");
//                sbBase.append("</MXXX>");
//            }
//            sbBase.append("</MX>");
//            sbBase.append("</FP>");
//        }
//        sbBase.append("</FPXX>");
        /*
        sbBase.append("<NSRSBH>");
        sbBase.append("15000010661565722931");				//��˰��ʶ���
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");
        sbBase.append("0");				//�ֻ���
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
	 * 2.21  �������ά��
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
	 * 2.20 ��˰�����߷�Ʊ��ѯ
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String lxfpcx(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);				//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 *	2.19.��˰�̷�Ʊ��Ϣ����
	 * @return
	 */
	public static String fpxxjs(FPXXJS fpxxjs){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append("");				//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append("");				//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<CXRQ>");
		sbBase.append("");				//��ѯ����
		sbBase.append("</CXRQ>");
		sbBase.append("<FPDM>");
		sbBase.append("");				//��Ʊ����
		sbBase.append("</FPDM>");
		sbBase.append("<FPHM>");
		sbBase.append("");				//��Ʊ����
		sbBase.append("</FPHM>");
        sbBase.append("<SYH>");
        sbBase.append("");				//��Ʊ������
        sbBase.append("</SYH>");
		sbBase.append("<FPZS>");
		sbBase.append("");				//��Ʊ����
		sbBase.append("</FPZS>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.18.��˰�̵�һ�ŷ�Ʊ��ѯ
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
		sbBase.append(nsrsbh);				//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<CXRQ>");
		sbBase.append(cxrq);				//��ѯ����
		sbBase.append("</CXRQ>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.17.��˰�����һ�ŷ�Ʊ��ѯ
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String mwfpcx(String nsrsbh, String fjh) {

		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);				//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.16.Զ���忨
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
		sbBase.append(nsrsbh);				//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);				//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}
	
	/**
	 * 2.15.�ϱ�����
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
		sbBase.append(nsrsbh);				//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);				//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("<SBLX>");
		sbBase.append(sblx);				//�ϱ�����
		sbBase.append("</SBLX>");
		sbBase.append("</INPUT>");

		return sbBase.toString().trim();
	}

	
	/**
	 * 3.1 ���÷�Ʊ��
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
		sbBase.append("");				//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append("");				//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append("");				//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("<FPDM>");
		sbBase.append("");				//��Ʊ����
		sbBase.append("</FPDM>");
		sbBase.append("<QSHM>");
		sbBase.append("");				//��Ʊ����
		sbBase.append("</QSHM>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	
	/**
	 * 3.2.��ȡָ��Ʊ�ֵĵ�ǰ���롢���루�Ϸ�Ʊ��ʱ��ʹ����ȷ����Ʊ���Ƿ���ȷ��
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
		sbBase.append(nsrsbh);				//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);				//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
	 * 3.3.�հ׷�Ʊ���ϣ����ţ�
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
		sbBase.append("20000000000000000003");				//��Ʊ��ˮ��
		sbBase.append("</FPLSH>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);				//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);				//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);				//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
	 * 3.4.���ֻ�����ƱԴ�˻أ�2.7�����������δʵ�֣�
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
	 * 3.5.��Ʊ�ַ�����������̲�����
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
		sbBase.append(nsrsbh);					//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);					//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("<FPDM>");
		sbBase.append("150001201502");					//��Ʊ����
		sbBase.append("</FPDM>");
		sbBase.append("<FPHM>");
		sbBase.append("50014255");					//��Ʊ����
		sbBase.append("</FPHM>");
		sbBase.append("<FPFS>");
		sbBase.append("1996");					//��Ʊ����
		sbBase.append("</FPFS>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
	 * 3.6�ֻ��˻أ���������̲�������������������ҵ��
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
		sbBase.append(nsrsbh);					//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("<FPZL>");
		sbBase.append(fpzl);					//��Ʊ����
		sbBase.append("</FPZL>");
		sbBase.append("<FPDM>");
		sbBase.append("150001201502");					//��Ʊ����
		sbBase.append("</FPDM>");
		sbBase.append("<FPHM>");
		sbBase.append("50014255");					//��Ʊ����
		sbBase.append("</FPHM>");
		sbBase.append("<SYFS>");
		sbBase.append("1996");					//ʣ�����
		sbBase.append("</SYFS>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	
	/**
	 * 3.7.��Ʊ���գ���������̲�����
	 * @param nsrsbh
	 * @param fjh
	 * @return
	 */
	public static String fphs(String nsrsbh, String fjh){
		StringBuffer sbBase = new StringBuffer();
		sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sbBase.append("<INPUT>");
		sbBase.append("<NSRSBH>");
		sbBase.append(nsrsbh);					//��˰��ʶ���
		sbBase.append("</NSRSBH>");
		sbBase.append("<FJH>");
		sbBase.append(fjh);					//�ֻ���
		sbBase.append("</FJH>");
		sbBase.append("</INPUT>");
		return sbBase.toString().trim();
	}
	/**
	 * 3.8.���ַ�Ʊ������ϴ�����רר�ã�
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
	 * 2.14 ��Ʊ�������ͽ������
	 */
	public static String fppljgxz(FPPLJGXZ_INPUT input){
        StringBuffer sbBase = new StringBuffer();
        sbBase.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sbBase.append("<INPUT>");
        sbBase.append("<NSRSBH>");
        sbBase.append("15000107051302807");				//��˰��ʶ���
        sbBase.append("</NSRSBH>");
        sbBase.append("<FJH>");				//�ֻ���
        sbBase.append("0");
        sbBase.append("</FJH>");
        sbBase.append("<FPZL>");
        sbBase.append("2");				//��Ʊ����
        sbBase.append("</FPZL>");
        sbBase.append("<SLXLH>");
        sbBase.append("9c45fa93d47f491fb4c9e6e296640dd1");				//�������кţ����ܴ��ڶ��
        sbBase.append("</SLXLH>");
        sbBase.append("</INPUT>");
        return sbBase.toString().trim();
	}
	
	/**
	 * 3.9.���ַ�Ʊ�������˽�����أ���רר�ã�
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
	 * 3.10.�ѿ���Ʊ����
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
	 * 4.1.ִ������
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
	 * 3.12 ��Ʊ�����ϴ�
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
	 * 3.11.���ŷ�Ʊ�޸�
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
	 * 2.29.˰�շ����������
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
