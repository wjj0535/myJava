package com.aisino.manager51.bussiness;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import com.aisino.manager51.bussiness.bean.FJTH_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPCX_DATA;
import com.aisino.manager51.bussiness.bean.FPCX_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPFF_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPHS_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPJCX_DATA;
import com.aisino.manager51.bussiness.bean.FPJCX_FPJ;
import com.aisino.manager51.bussiness.bean.FPJCX_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPKCCX_DATA;
import com.aisino.manager51.bussiness.bean.FPKCCX_FPJ;
import com.aisino.manager51.bussiness.bean.FPKCCX_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPKJ_IN_HEAD;
import com.aisino.manager51.bussiness.bean.FPKJ_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPPLBS_DATA;
import com.aisino.manager51.bussiness.bean.FPPLBS_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPPLBS_PZ;
import com.aisino.manager51.bussiness.bean.FPPLJGXZ_DATA;
import com.aisino.manager51.bussiness.bean.FPPLJGXZ_FP_FAIL;
import com.aisino.manager51.bussiness.bean.FPPLJGXZ_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPSC_DATA;
import com.aisino.manager51.bussiness.bean.FPSC_DATA_PZ;
import com.aisino.manager51.bussiness.bean.FPSC_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPXF_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPXT_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPXXJS_DATA;
import com.aisino.manager51.bussiness.bean.FPXXJS_FP;
import com.aisino.manager51.bussiness.bean.FPXXJS_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPZFQXX_DATA;
import com.aisino.manager51.bussiness.bean.FPZFQXX_OUTPUT;
import com.aisino.manager51.bussiness.bean.FPZF_DATA;
import com.aisino.manager51.bussiness.bean.FPZF_OUTPUT;
import com.aisino.manager51.bussiness.bean.HPXXBJG_DATA;
import com.aisino.manager51.bussiness.bean.HPXXBJG_GOODSMX;
import com.aisino.manager51.bussiness.bean.HPXXBJG_OUTPUT;
import com.aisino.manager51.bussiness.bean.HPXXBJG_REDINVREQBILLXX;
import com.aisino.manager51.bussiness.bean.HPXXBSC_DATA;
import com.aisino.manager51.bussiness.bean.HPXXBSC_GOODSMX;
import com.aisino.manager51.bussiness.bean.HPXXBSC_OUTPUT;
import com.aisino.manager51.bussiness.bean.HQDMHM_DATA;
import com.aisino.manager51.bussiness.bean.HQDMHM_OUTPUT;
import com.aisino.manager51.bussiness.bean.HZKJJY_DATA;
import com.aisino.manager51.bussiness.bean.HZKJJY_OUTPUT;
import com.aisino.manager51.bussiness.bean.JQXX_DATA;
import com.aisino.manager51.bussiness.bean.JQXX_OUTPUT;
import com.aisino.manager51.bussiness.bean.JSPZT_DATA;
import com.aisino.manager51.bussiness.bean.JSPZT_OUTPUT;
import com.aisino.manager51.bussiness.bean.JSPZT_PZZT;
import com.aisino.manager51.bussiness.bean.KBZF_DATA;
import com.aisino.manager51.bussiness.bean.KBZF_OUTPUT;
import com.aisino.manager51.bussiness.bean.KDZDFPFS_OUTPUT;
import com.aisino.manager51.bussiness.bean.KXZPYFS_DATA;
import com.aisino.manager51.bussiness.bean.KXZPYFS_FPMX;
import com.aisino.manager51.bussiness.bean.KXZPYFS_OUTPUT;
import com.aisino.manager51.bussiness.bean.LJCS_OUTPUT;
import com.aisino.manager51.bussiness.bean.LXFPCX_DATA;
import com.aisino.manager51.bussiness.bean.LXFPCX_OUTPUT;
import com.aisino.manager51.bussiness.bean.MWFPCX_FPCX;
import com.aisino.manager51.bussiness.bean.MWFPCX_OUTPUT;
import com.aisino.manager51.bussiness.bean.MWFPCX_SFXM;
import com.aisino.manager51.bussiness.bean.PYWLXZ_DATA;
import com.aisino.manager51.bussiness.bean.PYWLXZ_OUTPUT;
import com.aisino.manager51.bussiness.bean.QYCSTB_OUTPUT;
import com.aisino.manager51.bussiness.bean.RETURN;
import com.aisino.manager51.bussiness.bean.SBHZ_OUTPUT;
import com.aisino.manager51.bussiness.bean.SFXM_DATA;
import com.aisino.manager51.bussiness.bean.SKXXCX_DATA;
import com.aisino.manager51.bussiness.bean.SKXXCX_OUTPUT;
import com.aisino.manager51.bussiness.bean.SKXXCX_PZSQ;
import com.aisino.manager51.bussiness.bean.SSLLJCS_OUTPUT;
import com.aisino.manager51.bussiness.bean.SWFPCX_FPCX;
import com.aisino.manager51.bussiness.bean.SWFPCX_OUTPUT;
import com.aisino.manager51.bussiness.bean.SWFPCX_SFXM;
import com.aisino.manager51.bussiness.bean.SZFPJ_OUTPUT;
import com.aisino.manager51.bussiness.bean.WLCSSZ;
import com.aisino.manager51.bussiness.bean.WLCSWH_OUTPUT;
import com.aisino.manager51.bussiness.bean.WLFTPSZ_OUTPUT;
import com.aisino.manager51.bussiness.bean.WLSJ_DATA;
import com.aisino.manager51.bussiness.bean.WLSJ_OUTPUT;
import com.aisino.manager51.bussiness.bean.YCQK_OUTPUT;
import com.aisino.manager51.bussiness.bean.ZFJPYTH_OUTPUT;
import com.aisino.manager51.bussiness.bean.ZXML_OUTPUT;


public class XmlAcceptUtils {
	private static String enCode = "GBK";

	/*
	 * 解析外层xml
	 */
	public static FPXT_OUTPUT getData(String xml) throws Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		FPXT_OUTPUT out = new FPXT_OUTPUT();
		
		Element el = null;
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {

			el = iterator.next();
			if (el.getName().equals("ID")) {
				out.setID(el.getText());
			} else if (el.getName().equals("CODE")) {
				out.setCODE(el.getText());
			} else if (el.getName().equals("MESS")) {
				out.setMESS(el.getText());
			} else if (el.getName().equals("DATA")) {
				out.setDATA(el.getText());
			}
		}
		return out;
	}

	/**
	 * 2.1 税控信息查询
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static SKXXCX_OUTPUT getSkxxcx(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		SKXXCX_OUTPUT out = new SKXXCX_OUTPUT();
		RETURN rETURN = null;
		SKXXCX_DATA data = null;
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		Element e4 = null;
		Element e5 = null;
		ArrayList<SKXXCX_PZSQ> list = null;

		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				out.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				data = new SKXXCX_DATA();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("JSPBH")) {
						data.setJSPBH(e1.getText());
					} else if (e1.getName().equals("NSRSBH")) {
						data.setNSRSBH(e1.getText());
					} else if (e1.getName().equals("NSRMC")) {
						data.setNSRMC(e1.getText());
					} else if (e1.getName().equals("SWJGDM")) {
						data.setSWJGDM(e1.getText());
					} else if (e1.getName().equals("SWJGMC")) {
						data.setSWJGMC(e1.getText());
					} else if (e1.getName().equals("DQSZ")) {
						data.setDQSZ(e1.getText());
					} else if (e1.getName().equals("QYSJ")) {
						data.setQYSJ(e1.getText());
					} else if (e1.getName().equals("BBH")) {
						data.setBBH(e1.getText());
					} else if (e1.getName().equals("FJH")) {
						data.setFJH(e1.getText());
					} else if (e1.getName().equals("QYLX")) {
						data.setQYLX(e1.getText());
					} else if (e1.getName().equals("QTKZXX")) {
						data.setQTKZXX(e1.getText());
					} else if (e1.getName().equals("PZSQXX")) {
						list = new ArrayList<SKXXCX_PZSQ>();
						Iterator<Element> tt = e1.elementIterator();
						while (tt.hasNext()) {
							e2 = tt.next();
							if (e2.getName().equals("PZSQ")) {
								SKXXCX_PZSQ sp = new SKXXCX_PZSQ();
								Iterator<Element> ttyy = e2.elementIterator();
								while (ttyy.hasNext()) {
									e3 = ttyy.next();
									if (e3.getName().equals("FPZL")) {
										sp.setFPZL(e3.getText());
									} else if (e3.getName().equals("KPJZSJ")) {
										sp.setKPJZSJ(e3.getText());
									} else if (e3.getName().equals("DZKPXE")) {
										sp.setDZKPXE(e3.getText());
									} else if (e3.getName().equals("LXKPSC")) {
										sp.setLXKPSC(e3.getText());
									} else if (e3.getName().equals("LXZSLJJE")) {
										sp.setLXZSLJJE(e3.getText());
									} else if (e3.getName().equals("LXSSR")) {
										sp.setLXSSR(e3.getText());
									} else if (e3.getName().equals("LXKZXX")) {
										sp.setLXKZXX(e3.getText());
									} else if (e3.getName().equals("BSQSRQ")) {
										sp.setBSQSRQ(e3.getText());
									} else if (e3.getName().equals("SSRQ")) {
										sp.setSSRQ(e3.getText());
									} else if (e3.getName().equals("SQSLXX")) {
										int count1 = Integer.parseInt(e3.attributeValue("COUNT"));
										String[] arr = new String[count1];
										Iterator<Element> zzz = e3.elementIterator();
										while (zzz.hasNext()) {
											e4 = zzz.next();
											if (e4.getName().equals("SQSL")) {
												Iterator<Element> sss = e4.elementIterator();
												while (sss.hasNext()) {
													e5 = sss.next();
													if (e5.getName().equals("SL")) {
														arr[count1 - 1] = e5.getText();
														count1--;
													}
												}
											}

										}
										sp.setSQSLXX(arr);
									}
								}
								list.add(sp);
							}
						}
						data.setList(list);
					}
				}
				out.setdATA(data);
			}
		}
		return out;
	}

	/**
	 * 2.2 企业参数同步
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static QYCSTB_OUTPUT getQycstb(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		QYCSTB_OUTPUT output = new QYCSTB_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				output.setDATA(ee.getText());
			}
		}

		return output;
	}

	/**
	 * 2.3 金税盘状态查询
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static JSPZT_OUTPUT getJspzt(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		RETURN rETURN = null;
		JSPZT_DATA data = null;
		JSPZT_OUTPUT output = new JSPZT_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				data = new JSPZT_DATA();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("DQSJ")) {
						data.setDQSJ(e1.getText());
					} else if (e1.getName().equals("PZZTXX")) {
						ArrayList<JSPZT_PZZT> list = new ArrayList<JSPZT_PZZT>();
						Iterator<Element> zzz = e1.elementIterator();
						while (zzz.hasNext()) {
							e2 = zzz.next();
							if (e2.getName().equals("PZZT")) {
								JSPZT_PZZT pzzt = new JSPZT_PZZT();
								Iterator<Element> ss = e2.elementIterator();
								while (ss.hasNext()) {
									e3 = ss.next();
									if (e3.getName().equals("FPZL")) {
										pzzt.setFPZL(e3.getText());
									} else if (e3.getName().equals("SSRQ")) {
										pzzt.setSSRQ(e3.getText());
									} else if (e3.getName().equals("YDBSQ")) {
										pzzt.setYDBSQ(e3.getText());
									} else if (e3.getName().equals("YDSSQ")) {
										pzzt.setYDSSQ(e3.getText());
									} else if (e3.getName().equals("YBSZL")) {
										pzzt.setYBSZL(e3.getText());
									} else if (e3.getName().equals("YXGFP")) {
										pzzt.setYXGFP(e3.getText());
									} else if (e3.getName().equals("YTHFP")) {
										pzzt.setYTHFP(e3.getText());
									}
								}
								list.add(pzzt);
							}
						}
						data.setList(list);
					}
				}
				output.setdATA(data);
			}
		}

		return output;
	}

	/**
	 * 3.1 设置发票卷
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static SZFPJ_OUTPUT getSzfpj(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		SZFPJ_OUTPUT output = new SZFPJ_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				output.setDATA(ee.getText());
			}
		}

		return output;
	}

	/**
	 * 3.2 获取指定票种的当前代码、号码
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static HQDMHM_OUTPUT getHqdhm(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		HQDMHM_DATA dATA = null;
		HQDMHM_OUTPUT output = new HQDMHM_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				dATA = new HQDMHM_DATA();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("FPZL")) {
						dATA.setFPZL(e1.getText());
					} else if (e1.getName().equals("DQFPDM")) {
						dATA.setDQFPDM(e1.getText());
					} else if (e1.getName().equals("DQFPHM")) {
						dATA.setDQFPHM(e1.getText());
					} else if (e1.getName().equals("SYFS")) {
						dATA.setSYFS(e1.getText());
					}
				}
				output.setdATA(dATA);
			}
		}
		return output;
	}

	/**
	 * 3.3 空白发票作废（单张）
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static KBZF_OUTPUT getKbzf(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		RETURN rETURN = null;
		KBZF_DATA dATA = null;

		KBZF_OUTPUT output = new KBZF_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
            } else if (ee.getName().equals("DATA")) {
                dATA = new KBZF_DATA();
                Iterator<Element> it = ee.elementIterator();
                while (it.hasNext()) {
                    e1 = it.next();
                    if (e1.getName().equals("FPLSH")) {
                        dATA.setFPLSH(e1.getText());
                    } else if (e1.getName().equals("KBZF")) {
                        Iterator<Element> ttyy = e1.elementIterator();
                        while (ttyy.hasNext()) {
                            e2 = ttyy.next();
                            if (e2.getName().equals("FPDM")) {
                                dATA.setFPDM(e2.getText());
                            } else if (e2.getName().equals("FPHM")) {
                                dATA.setFPHM(e2.getText());
                            } else if (e2.getName().equals("QM")) {
                                dATA.setQM(e2.getText());
                            } else if (e2.getName().equals("FWM")) {
                                dATA.setFWM(e2.getText());
                            } else if (e2.getName().equals("FPMW")) {
                                dATA.setFPMW(e2.getText());
                            } else if (e2.getName().equals("ZFSJ")) {
                                dATA.setZFSJ(e2.getText());
                            } else if (e2.getName().equals("SYH")) {
                                dATA.setSYH(e2.getText());
                            } else if (e2.getName().equals("KPLX")) {
                                dATA.setKPLX(e2.getText());
                            } else if (e2.getName().equals("BSQ")) {
                                dATA.setBSQ(e2.getText());
                            } else if (e2.getName().equals("SL")) {
                                dATA.setSL(e2.getText());
                            }
                        }
                        
                    }
                }
            }
            output.setdATA(dATA);
        }
		return output;
	}

	/**
	 * 3.4 主分机网络票源退回（2.7的逆操作，暂未实现）
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static ZFJPYTH_OUTPUT getZfjpyth(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		ZFJPYTH_OUTPUT output = new ZFJPYTH_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				output.setDATA(ee.getText());
			}
		}

		return output;
	}

	/**
	 * 3.5 发票分发（仅仅针对盘操作）
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static FPFF_OUTPUT getFpff(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		FPFF_OUTPUT output = new FPFF_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				output.setDATA(ee.getText());
			}
		}

		return output;
	}

	/**
	 * 3.6 分机退回（仅仅针对盘操作，不可在主机做此业务）
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static FJTH_OUTPUT getFjth(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		FJTH_OUTPUT output = new FJTH_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				output.setDATA(ee.getText());
			}
		}

		return output;
	}

	/**
	 * 3.7.发票回收（仅仅针对盘操作）
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static FPHS_OUTPUT getFphs(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		FPHS_OUTPUT output = new FPHS_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				output.setDATA(ee.getText());
			}
		}

		return output;
	}

	/**
	 * 3.8 红字发票申请表上传（增专专用）
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static HPXXBSC_OUTPUT getHpxxbsc(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		RETURN rETURN = null;
		HPXXBSC_DATA data = null;
		HPXXBSC_OUTPUT output = new HPXXBSC_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				ArrayList<HPXXBSC_GOODSMX> list = new ArrayList<HPXXBSC_GOODSMX>();
				data = new HPXXBSC_DATA();
				Iterator<Element> it = ee.elementIterator();
				e1 = it.next();
				it = e1.elementIterator();
				while (it.hasNext()) {
					HPXXBSC_GOODSMX goodsxm = new HPXXBSC_GOODSMX();
					e2 = it.next();
					Iterator<Element> itt = e2.elementIterator();
					while (itt.hasNext()) {
						e3 = itt.next();
						if (e3.getName().equals("REQBILLNO")) {
							goodsxm.setREQBILLNO(e3.getText());
						} else if (e3.getName().equals("RESBILLNO")) {
							goodsxm.setRESBILLNO(e3.getText());
						} else if (e3.getName().equals("STATUSDM")) {
							goodsxm.setSTATUSDM(e3.getText());
						} else if (e3.getName().equals("STATUSMC")) {
							goodsxm.setSTATUSMC(e3.getText());
						}
					}
					list.add(goodsxm);
				}
				data.setList(list);
				output.setdATA(data);
			}
		}

		return output;
	}

	/**
	 * 3.9.红字发票申请表审核结果下载（增专专用）
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static HPXXBJG_OUTPUT getHpxxbjg(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		Element e4 = null;
		Element e5 = null;
		RETURN rETURN = null;
		HPXXBJG_DATA data = null;
		HPXXBJG_OUTPUT output = new HPXXBJG_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				data = new HPXXBJG_DATA();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("ALLCOUNT")) {
						data.setALLCOUNT(e1.getText());
					} else if (e1.getName().equals("REDINVREQBILL")) {
						Iterator<Element> itt = e1.elementIterator();
						while (itt.hasNext()) {
							e2 = itt.next();
							ArrayList<HPXXBJG_REDINVREQBILLXX> list = new ArrayList<HPXXBJG_REDINVREQBILLXX>();
							if (e2.getName().equals("REDINVREQBILLXX")) {
								Iterator<Element> ittt = e2.elementIterator();
								HPXXBJG_REDINVREQBILLXX billxx = new HPXXBJG_REDINVREQBILLXX();
								while (ittt.hasNext()) {
									e3 = ittt.next();
									if (e3.getName().equals("REQBILLNO")) {
										billxx.setREQBILLNO(e3.getText());
									} else if (e3.getName().equals("RESBILLNO")) {
										billxx.setRESBILLNO(e3.getText());
									} else if (e3.getName().equals("STATUSDM")) {
										billxx.setSTATUSDM(e3.getText());
									} else if (e3.getName().equals("STATUSMC")) {
										billxx.setSTATUSMC(e3.getText());
									} else if (e3.getName().equals("BILLTYPE")) {
										billxx.setBILLTYPE(e3.getText());
									} else if (e3.getName().equals("TYPECODE")) {
										billxx.setTYPECODE(e3.getText());
									} else if (e3.getName().equals("INVNO")) {
										billxx.setINVNO(e3.getText());
									}else if (e3.getName().equals("SZLB")) {
										billxx.setSZLB(e3.getText());
									}else if (e3.getName().equals("ISMUTIRATE")) {
										billxx.setISMUTIRATE(e3.getText());
									}else if (e3.getName().equals("DATE")) {
										billxx.setDATE(e3.getText());
									}else if (e3.getName().equals("BUYERNAME")) {
										billxx.setBUYERNAME(e3.getText());
									}else if (e3.getName().equals("BUYTAXCODE")) {
										billxx.setBUYTAXCODE(e3.getText());
									}else if (e3.getName().equals("SELLERNAME")) {
										billxx.setSELLERNAME(e3.getText());
									}else if (e3.getName().equals("SELLTAXCODE")) {
										billxx.setSELLTAXCODE(e3.getText());
									}else if (e3.getName().equals("AMOUNT")) {
										billxx.setAMOUNT(e3.getText());
									}else if (e3.getName().equals("TAXRATE")) {
										billxx.setTAXRATE(e3.getText());
									}else if (e3.getName().equals("TAX")) {
										billxx.setTAX(e3.getText());
									}else if (e3.getName().equals("REQMEMO")) {
										billxx.setREQMEMO(e3.getText());
									}else if (e3.getName().equals("REDINVREQBILLMX")) {
										Iterator<Element> itttt = e3.elementIterator();
										while(itttt.hasNext()){
											e4 = itttt.next();
											if(e4.getName().equals("GOODSMX")){
												HPXXBJG_GOODSMX goodsmx = new HPXXBJG_GOODSMX();
												Iterator<Element> ittttt = e4.elementIterator();
												while(ittttt.hasNext()){
													e5 = ittttt.next();
													if(e5.getName().equals("GOODSNAME")){
														goodsmx.setGOODSNAME(e5.getText());
													}else if(e5.getName().equals("GOODSUNIT")){
														goodsmx.setGOODSUNIT(e5.getText());
													}else if(e5.getName().equals("GOODSPRICE")){
														goodsmx.setGOODSPRICE(e5.getText());
													}else if(e5.getName().equals("GOODSTAXRATE")){
														goodsmx.setGOODSTAXRATE(e5.getText());
													}else if(e5.getName().equals("GOODSGGXH")){
														goodsmx.setGOODSGGXH(e5.getText());
													}else if(e5.getName().equals("GOODSNUM")){
														goodsmx.setGOODSNUM(e5.getText());
													}else if(e5.getName().equals("GOODSJE")){
														goodsmx.setGOODSJE(e5.getText());
													}else if(e5.getName().equals("GOODSSE")){
														goodsmx.setGOODSSE(e5.getText());
													}else if(e5.getName().equals("HS_BZ")){
														goodsmx.setHS_BZ(e5.getText());
													}
												}
												billxx.setgOODSMX(goodsmx);
											}
											
										}
									}
									
								}
								list.add(billxx);
								
							}
							data.setList(list);
						}
						

					}
				}

				output.setdATA(data);
			}
			
		}

		return output;
	}

	
	/**
	 * 3.10 已开发票作废
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static FPZF_OUTPUT getFpzf(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		FPZF_OUTPUT output = new FPZF_OUTPUT();
		FPZF_DATA data = null;
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				data = new FPZF_DATA();
				Iterator<Element> it = ee.elementIterator();
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("SIGN")){
						data.setSIGN(e1.getText());
					}else if(e1.getName().equals("KPLX")){
						data.setKPLX(e1.getText());
					}else if(e1.getName().equals("SYH")){
						data.setSYH(e1.getText());
					}else if(e1.getName().equals("ZFSJ")){
						data.setZFSJ(e1.getText());
					}
				}
				output.setdATA(data);
			}
		}

		return output;
	}
	
	/**
	 * 3.11 单张发票修复
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static FPXF_OUTPUT getFpxf(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		FPXF_OUTPUT output = new FPXF_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				output.setdATA(ee.getText());
			}
		}

		return output;
	}
	
	/**
	 * 3.12 发票批量上传
	 * 
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static FPPLBS_OUTPUT getFpplbs(String xml)
			throws UnsupportedEncodingException, Exception {
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(
				enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		RETURN rETURN = null;
		FPPLBS_OUTPUT output = new FPPLBS_OUTPUT();
		FPPLBS_DATA data = null;
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			ee = iterator.next();
			if (ee.getName().equals("RETURN")) {
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator();
				while (it.hasNext()) {
					e1 = it.next();
					if (e1.getName().equals("CODE")) {
						rETURN.setCODE(e1.getText());
					} else if (e1.getName().equals("MESS")) {
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			} else if (ee.getName().equals("DATA")) {
				data = new FPPLBS_DATA();
				Iterator<Element> it = ee.elementIterator();
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("FP_SUCC")){
						ArrayList<FPPLBS_PZ> list = new ArrayList<FPPLBS_PZ>();
						Iterator<Element> itt = e1.elementIterator();
						while(itt.hasNext()){
							e2 = itt.next();
							if(e2.getName().equals("PZ")){
								FPPLBS_PZ pz = new FPPLBS_PZ();
								Iterator<Element> ittt = e2.elementIterator();
								while(ittt.hasNext()){
									e3=ittt.next();
									if(e3.getName().equals("FPZL")){
										pz.setFPZL(e3.getText());
									}else if(e3.getName().equals("SLXLH")){
										pz.setSLXLH(e3.getText());
									}
								}
								list.add(pz);
							}
							data.setList(list);
						}
					}
				}
				output.setdATA(data);
			}
		}

		return output;
	}
	
	
	
	
	/**
	 * 2.4  金税盘发票库存查询
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static FPKCCX_OUTPUT getFpkccx(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		RETURN rETURN = null;
		FPKCCX_OUTPUT output = new FPKCCX_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				FPKCCX_DATA data = new FPKCCX_DATA();
				Iterator<Element> it = ee.elementIterator();
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("FPJXX")){
						ArrayList<FPKCCX_FPJ> list = new ArrayList<FPKCCX_FPJ>();
						Iterator<Element> tt = e1.elementIterator();
						while(tt.hasNext()){
							e2 = tt.next();
							if(e2.getName().equals("FPJ")){
								FPKCCX_FPJ fpj = new FPKCCX_FPJ();
								Iterator<Element> zzz = e2.elementIterator();
								while(zzz.hasNext()){
									e3 = zzz.next();
									if(e3.getName().equals("FPJSXH")){
										fpj.setFPJSXH(e3.getText());
									}else if(e3.getName().equals("FPZL")){
										fpj.setFPZL(e3.getText());
									}else if(e3.getName().equals("FPDM")){
										fpj.setFPDM(e3.getText());
									}else if(e3.getName().equals("QSHM")){
										fpj.setQSHM(e3.getText());
									}else if(e3.getName().equals("FPFS")){
										fpj.setFPFS(e3.getText());
									}else if(e3.getName().equals("SYFS")){
										fpj.setSYFS(e3.getText());
									}else if(e3.getName().equals("GMRQ")){
										fpj.setGMRQ(e3.getText());
									}
								}
								list.add(fpj);
							}
						}
						data.setList(list);
					}
				}
				output.setData(data);
			}
		}
		return output;
	}
	
	/**
	 * 2.5  金税盘发票卷查询
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static FPJCX_OUTPUT getFpjcx(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		RETURN rETURN = null;
		FPJCX_OUTPUT output = new FPJCX_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				FPJCX_DATA data = new FPJCX_DATA();
				Iterator<Element> it = ee.elementIterator();
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("FPJXX")){
						ArrayList<FPJCX_FPJ> list = new ArrayList<FPJCX_FPJ>();
						Iterator<Element> tt = e1.elementIterator();
						while(tt.hasNext()){
							e2 = tt.next();
							if(e2.getName().equals("FPJ")){
								FPJCX_FPJ fpj = new FPJCX_FPJ();
								Iterator<Element> zzz = e2.elementIterator();
								while(zzz.hasNext()){
									e3 = zzz.next();
									if(e3.getName().equals("FPJSXH")){
										fpj.setFPJSXH(e3.getText());
									}else if(e3.getName().equals("FPZL")){
										fpj.setFPZL(e3.getText());
									}else if(e3.getName().equals("FPDM")){
										fpj.setFPDM(e3.getText());
									}else if(e3.getName().equals("QSHM")){
										fpj.setQSHM(e3.getText());
									}else if(e3.getName().equals("FPFS")){
										fpj.setFPFS(e3.getText());
									}else if(e3.getName().equals("SYFS")){
										fpj.setSYFS(e3.getText());
									}else if(e3.getName().equals("GMRQ")){
										fpj.setGMRQ(e3.getText());
									}
								}
								list.add(fpj);
							}
						}
						data.setList(list);
					}
				}
				output.setData(data);
			}
		}
		return output;
	}
	
	/**
	 * 2.6  金税盘可读入的最大发票份数
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static KDZDFPFS_OUTPUT getKdzdfpfs(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		KDZDFPFS_OUTPUT output = new KDZDFPFS_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("MAX_FPS")){
						output.setMAX_FPS(ee.getText());
					}
				}
			}
		}
		
		return output;
	}
	
	/**
	 * 2.7 局端可下载票源获取
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static KXZPYFS_OUTPUT getKxzpyfs(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		RETURN rETURN = null;
		KXZPYFS_OUTPUT output = new KXZPYFS_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				KXZPYFS_DATA data = new KXZPYFS_DATA();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("FPMXXX")){
						ArrayList<KXZPYFS_FPMX> list = new ArrayList<KXZPYFS_FPMX>();
						Iterator<Element> tt = e1.elementIterator(); 
						while(tt.hasNext()){
							e2 = it.next();
							if(e2.getName().equals("FPMX")){
								KXZPYFS_FPMX fpmx = new KXZPYFS_FPMX();
								Iterator<Element> zzz = e2.elementIterator();
								while(zzz.hasNext()){
									e3 = zzz.next();
									if(e3.getName().equals("FPZL")){
										fpmx.setFPZL(e3.getText());
									}else if(e3.getName().equals("FPDM")){
										fpmx.setFPDM(e3.getText());
									}else if(e3.getName().equals("QSHM")){
										fpmx.setQSHM(e3.getText());
									}else if(e3.getName().equals("FPFS")){
										fpmx.setFPFS(e3.getText());
									}else if(e3.getName().equals("GMRQ")){
										fpmx.setGMRQ(e3.getText());
									}
								}
								list.add(fpmx);
							}
						}
						data.setList(list);
					}
				}
				output.setData(data);
			}
		}
		
		return output;
	}
	
	/**
	 * 2.8  主分机票源网络下载
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static PYWLXZ_OUTPUT getPywlxz(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		PYWLXZ_OUTPUT output = new PYWLXZ_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				PYWLXZ_DATA data = new PYWLXZ_DATA();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("NSRSBH")){
						data.setNSRSBH(e1.getText());
					}else if(e1.getName().equals("FJH")){
						data.setFJH(e1.getText());
					}else if(e1.getName().equals("FPZL")){
						data.setFPZL(e1.getText());
					}else if(e1.getName().equals("FPDM")){
						data.setFPDM(e1.getText());
					}else if(e1.getName().equals("FPQSHM")){
						data.setFPQSHM(e1.getText());
					}else if(e1.getName().equals("FPSL")){
						data.setFPSL(e1.getText());
					}
				}
				output.setData(data);
			}
		}
		
		return output;
	}
	
	/**
	 * 2.9  发票开具
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static FPKJ_OUTPUT getFpkj(String xml, FPKJ_IN_HEAD head) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		RETURN rETURN = null;
		FPKJ_OUTPUT output = new FPKJ_OUTPUT();
		SAXReader reader = new SAXReader();
		// 读取文件 转换成Document
		Document document = reader.read(is);
		// 获取根节点元素对象
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
//				FPKJ_DATA data = new FPKJ_DATA();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					Iterator<Element> tt = e1.elementIterator(); 
					while(tt.hasNext()){
						e2 = tt.next();
						if(e2.getName().equals("FPLSH")){
							head.setFPLSH(e2.getText());
						}else if(e2.getName().equals("XPLSH")){
							head.setXPLSH(e2.getText());
						}else if(e2.getName().equals("FPDM")){
							head.setFPDM(e2.getText());
						}else if(e2.getName().equals("FPHM")){
							head.setFPHM(e2.getText());
						}else if(e2.getName().equals("KPSJ")){
							head.setKPSJ(e2.getText());
						}else if(e2.getName().equals("FPMW")){
							head.setFPMW(e2.getText());
						}else if(e2.getName().equals("FWM")){
							head.setFWM(e2.getText());
						}else if(e2.getName().equals("EWM")){
							head.setEWM(e2.getText());
						}else if(e2.getName().equals("JSHJ")){
							head.setJSHJ(e2.getText());
						}else if(e2.getName().equals("HJJE")){
							head.setHJJE(e2.getText());
						}else if(e2.getName().equals("HJSE")){
							head.setHJSE(e2.getText());
						}else if(e2.getName().equals("SIGN")){
							head.setSIGN(e2.getText());
						}else if(e2.getName().equals("SYH")){
							head.setSYH(e2.getText());
						}else if(e2.getName().equals("QDBZ")){
							head.setQDBZ(e2.getText());
						}else if(e2.getName().equals("BSQS")){
							head.setBSQS(e2.getText());
						}else if(e2.getName().equals("SL")){
							head.setSL(e2.getText());
						}else if(e2.getName().equals("BZ")){
							head.setBZ(e2.getText());
						}
					}
				}
				output.setData(head);
			}
		}
		
		return output;
	}
	
	
	public static String xmlFilter(String xml) throws Exception {
		if ((xml == null) || ("".equals(xml))) {
			return xml;
		}
		return xml.replaceAll("[\\x00-\\x08\\x0b-\\x0c\\x0e-\\x1f]", "");
	}

	/**
	 * 2.11 金税盘发票查询
	 */
	public static FPCX_OUTPUT getFpcx(String xml)throws UnsupportedEncodingException, Exception{
	    InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
	    FPCX_OUTPUT out = new FPCX_OUTPUT();
        RETURN rETURN = null;
        FPCX_DATA data = null;
        Element ee = null;
        Element e1 = null;
        Element e2 = null;
        Element e3 = null;
        ArrayList<SFXM_DATA> list = null;
        
        SAXReader reader = new SAXReader();
        // 读取文件 转换成Document
        Document document = reader.read(is);
        // 获取根节点元素对象
        Element root = document.getRootElement();
        Iterator<Element> iterator = root.elementIterator(); 
        while(iterator.hasNext()){
            ee = iterator.next();
            if(ee.getName().equals("RETURN")){
                rETURN = new RETURN();
                Iterator<Element> it = ee.elementIterator(); 
                while(it.hasNext()){
                    e1 = it.next();
                    if(e1.getName().equals("CODE")){
                        rETURN.setCODE(e1.getText());
                    }else if(e1.getName().equals("MESS")){
                        rETURN.setMESS(e1.getText());
                    }
                }
                out.setrETURN(rETURN);
            }else if(ee.getName().equals("DATA")){
                data = new FPCX_DATA();
                Iterator<Element> it = ee.elementIterator(); 
                while(it.hasNext()){
                    e1 = it.next();
                    if(e1.getName().equals("FPLSH")){
                        data.setFPLSH(e1.getText());;
                    }else if(e1.getName().equals("FPDM")){
                        data.setFPDM(e1.getText());
                    }else if(e1.getName().equals("FPHM")){
                        data.setFPHM(e1.getText());
                    }else if(e1.getName().equals("KPLX")){
                        data.setKPLX(e1.getText());
                    }else if(e1.getName().equals("SCBZ")){
                        data.setSCBZ(e1.getText());
                    }else if(e1.getName().equals("KPSJ")){
                        data.setKPSJ(e1.getText());
                    }else if(e1.getName().equals("FWM")){
                        data.setFWM(e1.getText());
                    }else if(e1.getName().equals("EWM")){
                        data.setEWM(e1.getText());
                    }else if(e1.getName().equals("FPMW")){
                        data.setFPMW(e1.getText());
                    }else if(e1.getName().equals("XHDWDM")){
                        data.setXHDWDM(e1.getText());
                    }else if(e1.getName().equals("XHDWMC")){
                        data.setXHDWMC(e1.getText());
                    }else if(e1.getName().equals("GHDWDM")){
                        data.setGHDWDM(e1.getText());
                    }else if(e1.getName().equals("GHDWMC")){
                        data.setGHDWMC(e1.getText());
                    }else if(e1.getName().equals("HJJE")){
                        data.setHJJE(e1.getText());
                    }else if(e1.getName().equals("HJSE")){
                        data.setHJSE(e1.getText());
                    }else if(e1.getName().equals("JSHJ")){
                        data.setJSHJ(e1.getText());
                    }else if(e1.getName().equals("BZ")){
                        data.setBZ(e1.getText());
                    }else if(e1.getName().equals("SKR")){
                        data.setSKR(e1.getText());
                    }else if(e1.getName().equals("KPR")){
                        data.setKPR(e1.getText());
                    }else if(e1.getName().equals("FHR")){
                        data.setFHR(e1.getText());
                    }else if(e1.getName().equals("YFPDM")){
                        data.setYFPDM(e1.getText());
                    }else if(e1.getName().equals("YFPHM")){
                        data.setYFPHM(e1.getText());
                    }else if(e1.getName().equals("ZFSJ")){
                        data.setZFSJ(e1.getText());
                    }else if(e1.getName().equals("ZFR")){
                        data.setZFR(e1.getText());
                    }else if(e1.getName().equals("SIGN")){
                        data.setSIGN(e1.getText());
                    }else if(e1.getName().equals("SYH")){
                        data.setSYH(e1.getText());
                    }else if(e1.getName().equals("QDBZ")){
                        data.setQDBZ(e1.getText());
                    }else if(e1.getName().equals("BSQS")){
                        data.setBSQS(e1.getText());
                    }else if(e1.getName().equals("SL")){
                        data.setSL(e1.getText());
                    }else if(e1.getName().equals("SFXMXX ")){
                        list = new ArrayList<SFXM_DATA>();
                        data.clearListData();
                        Iterator<Element> tt = e1.elementIterator(); 
                        while(tt.hasNext()){
                            e2 = tt.next();
                            if(e2.getName().equals("SFXM")){
                                SFXM_DATA sp = new SFXM_DATA();
                                Iterator<Element> ttyy = e2.elementIterator(); 
                                while(ttyy.hasNext()){
                                    e3 = ttyy.next();
                                    if(e3.getName().equals("XM")){
                                        sp.setXM(e3.getText());
                                    }else if(e3.getName().equals("DJ")){
                                        sp.setDJ(e3.getText());
                                    }else if(e3.getName().equals("SL")){
                                        sp.setSL(e3.getText());
                                    }else if(e3.getName().equals("JE")){
                                        sp.setJE(e3.getText());
                                    }else if(e3.getName().equals("ZSL")){
                                        sp.setZSL(e3.getText());
                                    }else if(e3.getName().equals("SE")){
                                        sp.setSE(e3.getText());
                                    }else if(e3.getName().equals("HSDJ")){
                                        sp.setHSDJ(e3.getText());
                                    }else if(e3.getName().equals("HSJE")){
                                        sp.setHSJE(e3.getText());
                                    }
                                }
                                list.add(sp);
                            }
                        }
                        data.setList(list);
                    }
                }
                out.setdATA(data);
            }
        }
        return out;
	}
	
	/**
     * 2.12 已开发票作废（给定全票面信息）
     */
	public static FPZFQXX_OUTPUT getFpzfqxx(String xml) throws UnsupportedEncodingException, Exception{
        InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
        FPZFQXX_OUTPUT out = new FPZFQXX_OUTPUT();
        RETURN rETURN = null;
        FPZFQXX_DATA data = null;
        Element ee = null;
        Element e1 = null;
        
        SAXReader reader = new SAXReader();
        // 读取文件 转换成Document
        Document document = reader.read(is);
        // 获取根节点元素对象
        Element root = document.getRootElement();
        Iterator<Element> iterator = root.elementIterator();
        while (iterator.hasNext()) {
            ee = iterator.next();
            if (ee.getName().equals("RETURN")) {
                rETURN = new RETURN();
                Iterator<Element> it = ee.elementIterator();
                while (it.hasNext()) {
                    e1 = it.next();
                    if (e1.getName().equals("CODE")) {
                        rETURN.setCODE(e1.getText());
                    } else if (e1.getName().equals("MESS")) {
                        rETURN.setMESS(e1.getText());
                    }
                }
                out.setrETURN(rETURN);
            } else if (ee.getName().equals("DATA")) {
                data = new FPZFQXX_DATA();
                Iterator<Element> it = ee.elementIterator();
                while (it.hasNext()) {
                    e1 = it.next();
                    if (e1.getName().equals("SIGN")) {
                        data.setSIGN(e1.getText());
                    } else if (e1.getName().equals("KPLX")) {
                        data.setKPLX(e1.getText());
                    } else if (e1.getName().equals("SYH")) {
                        data.setSYH(e1.getText());
                    } else if (e1.getName().equals("ZFSJ")) {
                        data.setZFSJ(e1.getText());
                    } 
                }
                out.setData(data);
            }
        }
        return out;
	}

	/**
	 * 2.10  红字普通发票开具校验（电子发票）
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static HZKJJY_OUTPUT getHzkjjy(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		HZKJJY_OUTPUT output = new HZKJJY_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				HZKJJY_DATA data = new HZKJJY_DATA();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("YFPDM")){
						data.setYFPDM(e1.getText());
					}else if(e1.getName().equals("YHPHM")){
						data.setYHPHM(e1.getText());
					}else if(e1.getName().equals("HZJE")){
						data.setHZJE(e1.getText());
					}
				}
				output.setData(data);
			}
		}
		
		return output;
	}
	
	/**
	 * 2.27 ssl通道连接测试
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static SSLLJCS_OUTPUT getSslljcs(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		SSLLJCS_OUTPUT output = new SSLLJCS_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				output.setData(ee.getText()); 
			}
		}
		return output;
	}
	
	/**
	 * 2.26 服务器连接测试
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static LJCS_OUTPUT getLjcs(String xml) throws UnsupportedEncodingException, Exception{
		String ywdata = new String(Base64.decodeBase64(getData(xml).getDATA()));
		InputStream is = new ByteArrayInputStream(xmlFilter(ywdata).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		LJCS_OUTPUT output = new LJCS_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				output.setData(ee.getText()); 
			}
		}
		return output;
	}
	
	/**
	 * 2.25 机器信息
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static JQXX_OUTPUT getJqxx(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		RETURN rETURN = null;
		JQXX_OUTPUT output = new JQXX_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				JQXX_DATA data = new JQXX_DATA();
				Iterator<Element> it = ee.elementIterator();
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("JQBH")){
						data.setJQBH(e1.getText());
					}else if(e1.getName().equals("WZH")){
						data.setWZH(e1.getText());
					}else if(e1.getName().equals("RJBB")){
						data.setRJBB(e1.getText());
					}else if(e1.getName().equals("MAC")){
                        data.setMAC(e1.getText());
                    }else if(e1.getName().equals("NETPARA")){
                        Iterator<Element> it1 = e1.elementIterator();
                        while(it1.hasNext()){
                            e2 = it1.next();
                            if(e2.getName().equals("ISDHCP")){
                                data.setISDHCP(e2.getText());
                            }else if(e2.getName().equals("LOCAL_IP")){
                                data.setLOCAL_IP(e2.getText());
                            }else if(e2.getName().equals("LOCAL_PORT")){
                                data.setLOCAL_PORT(e2.getText());
                            }else if(e2.getName().equals("LOCAL_DEFAULTGATE")){
                                data.setLOCAL_DEFAULTGATE(e2.getText());
                            }else if(e2.getName().equals("LOCAL_NETMASK")){
                                data.setLOCAL_NETMASK(e2.getText());
                            }else if(e2.getName().equals("LOCAL_DNSNAMEIP")){
                                data.setLOCAL_DNSNAMEIP(e2.getText());
                            }else if(e2.getName().equals("SERVER_IPADDR")){
                                data.setSERVER_IPADDR(e2.getText());
                            }else if(e2.getName().equals("SERVER_PORT")){
                                data.setSERVER_PORT(e2.getText());
                            }else if(e2.getName().equals("FTP_SERVERIP")){
                                data.setFTP_SERVERIP(e2.getText());
                            }else if(e2.getName().equals("FTP_PORT")){
                                data.setFTP_PORT(e2.getText());
                            }else if(e2.getName().equals("FTP_USERNAME")){
                                data.setFTP_USERNAME(e2.getText());
                            }else if(e2.getName().equals("FTP_PASSWD")){
                                data.setFTP_PASSWD(e2.getText());
                            }
                        }
                    }
				}
				
				output.setData(data); 
			}
		}
		return output;
	}
	
	/**
	 * 2.24 网络升级
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static WLSJ_OUTPUT getWlsj(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		WLSJ_OUTPUT output = new WLSJ_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				WLSJ_DATA data = new WLSJ_DATA();
				Iterator<Element> it = ee.elementIterator();
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("EXEC_RESULT")){
						data.setEXEC_RESULT(e1.getText());
					}else if(e1.getName().equals("LIBSQL_RESULT")){
						data.setLIBSQL_RESULT(e1.getText());
					}else if(e1.getName().equals("LIBADDSO_ARM9_SO_RESULT")){
						data.setLIBADDSO_ARM9_SO_RESULT(e1.getText());
					}else if(e1.getName().equals("LIBREAD_ARM9_SO_RESULT")){
						data.setLIBREAD_ARM9_SO_RESULT(e1.getText());
					}
				}
				
				output.setData(data); 
			}
		}
		return output;
	}
	
	
	/**
	 * 2.23  网络ftp参数维护
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static WLFTPSZ_OUTPUT getWlftpsz(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		WLFTPSZ_OUTPUT output = new WLFTPSZ_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				output.setData(ee.getText()); 
			}
		}
		return output;
	}
	
	
	/**
	 * 2.22  局端参数设置
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static WLCSSZ getWlcssz(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		WLCSSZ output = new WLCSSZ();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				output.setData(ee.getText()); 
			}
		}
		return output;
	}
	
	/**
	 * 2.21   网络参数维护
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static WLCSWH_OUTPUT getWlcswh(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		WLCSWH_OUTPUT output = new WLCSWH_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				output.setData(ee.getText()); 
			}
		}
		return output;
	}
	
	/**
	 * 2.20 金税盘离线发票查询
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static LXFPCX_OUTPUT getLxfpcx(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		LXFPCX_OUTPUT output = new LXFPCX_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				LXFPCX_DATA data = new LXFPCX_DATA();
				Iterator<Element> it = ee.elementIterator();
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("LXBZ")){
						data.setLXBZ(e1.getText());
					}else if(e1.getName().equals("FPDM")){
						data.setFPDM(e1.getText());
					}else if(e1.getName().equals("FPHM")){
						data.setFPHM(e1.getText());
					}else if(e1.getName().equals("SYH")){
						data.setSYH(e1.getText());
					}
				}
				
				output.setData(data); 
			}
		}
		return output;
	}
	
	/**
     * 2.13 发票批量上传（给定全票面信息）
     * @return
     */
	public FPSC_OUTPUT fpsc(String xml) throws UnsupportedEncodingException, Exception{
        InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
        FPSC_OUTPUT out = new FPSC_OUTPUT();
        RETURN rETURN = null;
        FPSC_DATA data = null;
        Element ee = null;
        Element e1 = null;
        Element e2 = null;
        Element e3 = null;
        
        SAXReader reader = new SAXReader();
        // 读取文件 转换成Document
        Document document = reader.read(is);
        // 获取根节点元素对象
        Element root = document.getRootElement();
        Iterator<Element> iterator = root.elementIterator();
        while (iterator.hasNext()) {
            ee = iterator.next();
            if (ee.getName().equals("RETURN")) {
                rETURN = new RETURN();
                Iterator<Element> it = ee.elementIterator();
                while (it.hasNext()) {
                    e1 = it.next();
                    if (e1.getName().equals("CODE")) {
                        rETURN.setCODE(e1.getText());
                    } else if (e1.getName().equals("MESS")) {
                        rETURN.setMESS(e1.getText());
                    }
                }
                out.setrETURN(rETURN);
            } else if (ee.getName().equals("DATA")) {
                data = new FPSC_DATA();
                Iterator<Element> it = ee.elementIterator();
                while (it.hasNext()) {
                    e1 = it.next();
                    if (e1.getName().equals("FP_SUCC")) {
                        ArrayList<FPSC_DATA_PZ> list = new ArrayList<FPSC_DATA_PZ>();
                        Iterator<Element> tt = e1.elementIterator();
                        while (tt.hasNext()) {
                            e2 = tt.next();
                            if (e2.getName().equals("PZ")) {
                                FPSC_DATA_PZ pz = new FPSC_DATA_PZ();
                                Iterator<Element> zzz = e2.elementIterator();
                                while (zzz.hasNext()) {
                                    e3 = zzz.next();
                                    if (e3.getName().equals("FPZL")) {
                                        pz.setFPZL(e3.getText());
                                    } else if (e3.getName().equals("SLXLH")) {
                                        pz.setSLXLH(e3.getText());
                                    }
                                }
                            }
                        }
                    }
                }
                out.setdATA(data);
            }
        }
        return out;
    }

	/**
	 * 2.19 金税盘发票信息检索
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static FPXXJS_OUTPUT getFpxxjs(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		RETURN rETURN = null;
		FPXXJS_OUTPUT output = new FPXXJS_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				FPXXJS_DATA data = new FPXXJS_DATA();
				Iterator<Element> it = ee.elementIterator();
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("FPXX")){
						List<FPXXJS_FP> list = new ArrayList<FPXXJS_FP>();
						Iterator<Element> tt = ee.elementIterator();
						while(tt.hasNext()){
							e2 = tt.next();
							if(e2.getName().equals("FP")){
								FPXXJS_FP fp = new FPXXJS_FP();
								Iterator<Element> zzz = ee.elementIterator();
								while(zzz.hasNext()){
									e3 = zzz.next();
									if(e3.getName().equals("FPDM")){
										fp.setFPDM(e3.getText());
									}else if(e3.getName().equals("FPHM")){
										fp.setFPHM(e3.getText());
									}else if(e3.getName().equals("SYH")){
										fp.setSYH(e3.getText());
									}
								}
								list.add(fp);
							}
						}
						data.setList(list);
					}
				}
				output.setData(data); 
			}
		}
		return output;
	}
	   /**
     * 2.14 发票批量报送结果下载
     */
	public FPPLJGXZ_OUTPUT getFppljgxz(String xml) throws UnsupportedEncodingException, Exception{
        InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
        FPPLJGXZ_OUTPUT out = new FPPLJGXZ_OUTPUT();
        RETURN rETURN = null;
        FPPLJGXZ_DATA data = null;
        Element ee = null;
        Element e1 = null;
        Element e2 = null;
        Element e3 = null;
        Element e4 = null;
        
        SAXReader reader = new SAXReader();
        // 读取文件 转换成Document
        Document document = reader.read(is);
        // 获取根节点元素对象
        Element root = document.getRootElement();
        Iterator<Element> iterator = root.elementIterator();
        while (iterator.hasNext()) {
            ee = iterator.next();
            if (ee.getName().equals("RETURN")) {
                rETURN = new RETURN();
                Iterator<Element> it = ee.elementIterator();
                while (it.hasNext()) {
                    e1 = it.next();
                    if (e1.getName().equals("CODE")) {
                        rETURN.setCODE(e1.getText());
                    } else if (e1.getName().equals("MESS")) {
                        rETURN.setMESS(e1.getText());
                    }
                }
                out.setrETURN(rETURN);
            } else if (ee.getName().equals("DATA")) {
                data = new FPPLJGXZ_DATA();
                Iterator<Element> it = ee.elementIterator();
                while (it.hasNext()) {
                    e1 = it.next();
                    if (e1.getName().equals("GROUP")) {
                        Iterator<Element> tt = e1.elementIterator();
                        while (tt.hasNext()) {
                            e2 = tt.next();
                            if (e2.getName().equals("FP_SUCC")) {
                                Iterator<Element> zzz = e2.elementIterator();
                                while (zzz.hasNext()) {
                                    e3 = zzz.next();
                                    if (e3.getName().equals("FPXX")) {
                                        data.setFPXX(e3.getText().trim());
                                    }
                                }
                            }else if(e2.getName().equals("FP_ERR")){
                                ArrayList<FPPLJGXZ_FP_FAIL> list = new ArrayList<FPPLJGXZ_FP_FAIL>();
                                Iterator<Element> zzz = e2.elementIterator();
                                while (zzz.hasNext()) {
                                    e3 = zzz.next();
                                    if (e3.getName().equals("FP")) {
                                        Iterator<Element> xxx = e3.elementIterator();
                                        FPPLJGXZ_FP_FAIL fail = new FPPLJGXZ_FP_FAIL();
                                        while(xxx.hasNext()){
                                            e4 = xxx.next();
                                            if(e4.getName().equals("FPDM")){
                                                fail.setFPDM(e4.getText().trim());
                                            }else if(e4.getName().equals("FPHM")){
                                                fail.setFPHM(e4.getText().trim());
                                            }else if(e4.getName().equals("CODE")){
                                                fail.setCODE(e4.getText().trim());
                                            }else if(e4.getName().equals("MESS")){
                                                fail.setMESS(e4.getText().trim());
                                            }
                                        }
                                        list.add(fail);
                                    }
                                }
                                data.setFailItems(list);
                            }
                        }
                    }
                }
                out.setData(data);
            }
        }
        return out;
	}
	
	/**
	 * 2.18 .金税盘第一张发票查询
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static SWFPCX_OUTPUT getSwfpcx(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		Element e4 = null;
		RETURN rETURN = null;
		SWFPCX_OUTPUT output = new SWFPCX_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				Iterator<Element> it = ee.elementIterator();
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("FPCX")){
						SWFPCX_FPCX data = new SWFPCX_FPCX();
						Iterator<Element> tt = e1.elementIterator();
						while(tt.hasNext()){
							e2 = tt.next();
							if(e2.getName().equals("FPDM")){
								data.setFPDM(e2.getText());
							}else if(e2.getName().equals("FPHM")){
								data.setFPHM(e2.getText());
							}else if(e2.getName().equals("KPLX")){
								data.setKPLX(e2.getText());
							}else if(e2.getName().equals("SCBZ")){
								data.setSCBZ(e2.getText());
							}else if(e2.getName().equals("KPSJ")){
								data.setKPSJ(e2.getText());
							}else if(e2.getName().equals("FWM")){
								data.setFWM(e2.getText());
							}else if(e2.getName().equals("EWM")){
								data.setEWM(e2.getText());
							}else if(e2.getName().equals("FPMW")){
								data.setFPMW(e2.getText());
							}else if(e2.getName().equals("XHDWDM")){
								data.setXHDWDM(e2.getText());
							}else if(e2.getName().equals("XHDWMC")){
								data.setXHDWMC(e2.getText());
							}else if(e2.getName().equals("GHDWDM")){
								data.setGHDWDM(e2.getText());
							}else if(e2.getName().equals("GHDWMC")){
								data.setGHDWMC(e2.getText());
							}else if(e2.getName().equals("HJJE")){
								data.setHJJE(e2.getText());
							}else if(e2.getName().equals("HJSE")){
								data.setHJSE(e2.getText());
							}else if(e2.getName().equals("JSHJ")){
								data.setJSHJ(e2.getText());
							}else if(e2.getName().equals("BZ")){
								data.setBZ(e2.getText());
							}else if(e2.getName().equals("SKR")){
								data.setSKR(e2.getText());
							}else if(e2.getName().equals("KPR")){
								data.setKPR(e2.getText());
							}else if(e2.getName().equals("FHR")){
								data.setFHR(e2.getText());
							}else if(e2.getName().equals("YFPDM")){
								data.setYFPDM(e2.getText());
							}else if(e2.getName().equals("YFPHM")){
								data.setYFPHM(e2.getText());
							}else if(e2.getName().equals("ZFSJ")){
								data.setZFSJ(e2.getText());
							}else if(e2.getName().equals("ZFR")){
								data.setZFR(e2.getText());
							}else if(e2.getName().equals("SIGN")){
								data.setSIGN(e2.getText());
							}else if(e2.getName().equals("SYH")){
								data.setSYH(e2.getText());
							}else if(e2.getName().equals("QDBZ")){
								data.setQDBZ(e2.getText());
							}else if(e2.getName().equals("BSQS")){
								data.setBSQS(e2.getText());
							}else if(e2.getName().equals("SL")){
								data.setSL(e2.getText());
							}else if(e2.getName().equals("SFXMXX")){
								List<SWFPCX_SFXM> list = new ArrayList<SWFPCX_SFXM>();
								Iterator<Element> zzz = e2.elementIterator();
								while(zzz.hasNext()){
									e3 = zzz.next();
									if(e3.getName().equals("SFXM")){
										SWFPCX_SFXM sfxm = new SWFPCX_SFXM();
										Iterator<Element> ss = e3.elementIterator();
										while(ss.hasNext()){
											e4 = ss.next();
											if(e4.getName().equals("XM")){
												sfxm.setXM(e4.getText());
											}else if(e4.getName().equals("DJ")){
												sfxm.setDJ(e4.getText());
											}else if(e4.getName().equals("SL")){
												sfxm.setSL(e4.getText());
											}else if(e4.getName().equals("JE")){
												sfxm.setJE(e4.getText());
											}else if(e4.getName().equals("ZSL")){
												sfxm.setZSL(e4.getText());
											}else if(e4.getName().equals("SE")){
												sfxm.setSE(e4.getText());
											}else if(e4.getName().equals("HSDJ")){
												sfxm.setHSDJ(e4.getText());
											}else if(e4.getName().equals("HSJE")){
												sfxm.setHSJE(e4.getText());
											}
										}
										list.add(sfxm);
									}
								}
								data.setList(list);
							}
						}
						output.setData(data); 
					}
				}
			}
		}
		return output;
	}
	
	/**
	 * 2.17.金税盘最后一张发票查询
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static MWFPCX_OUTPUT getMwfpcx(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		Element e2 = null;
		Element e3 = null;
		Element e4 = null;
		RETURN rETURN = null;
		MWFPCX_OUTPUT output = new MWFPCX_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				Iterator<Element> it = ee.elementIterator();
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("FPCX")){
						MWFPCX_FPCX data = new MWFPCX_FPCX();
						Iterator<Element> tt = e1.elementIterator();
						while(tt.hasNext()){
							e2 = tt.next();
							if(e2.getName().equals("FPDM")){
								data.setFPDM(e2.getText());
							}else if(e2.getName().equals("FPHM")){
								data.setFPHM(e2.getText());
							}else if(e2.getName().equals("KPLX")){
								data.setKPLX(e2.getText());
							}else if(e2.getName().equals("SCBZ")){
								data.setSCBZ(e2.getText());
							}else if(e2.getName().equals("KPSJ")){
								data.setKPSJ(e2.getText());
							}else if(e2.getName().equals("FWM")){
								data.setFWM(e2.getText());
							}else if(e2.getName().equals("EWM")){
								data.setEWM(e2.getText());
							}else if(e2.getName().equals("FPMW")){
								data.setFPMW(e2.getText());
							}else if(e2.getName().equals("XHDWDM")){
								data.setXHDWDM(e2.getText());
							}else if(e2.getName().equals("XHDWMC")){
								data.setXHDWMC(e2.getText());
							}else if(e2.getName().equals("GHDWDM")){
								data.setGHDWDM(e2.getText());
							}else if(e2.getName().equals("GHDWMC")){
								data.setGHDWMC(e2.getText());
							}else if(e2.getName().equals("HJJE")){
								data.setHJJE(e2.getText());
							}else if(e2.getName().equals("HJSE")){
								data.setHJSE(e2.getText());
							}else if(e2.getName().equals("JSHJ")){
								data.setJSHJ(e2.getText());
							}else if(e2.getName().equals("BZ")){
								data.setBZ(e2.getText());
							}else if(e2.getName().equals("SKR")){
								data.setSKR(e2.getText());
							}else if(e2.getName().equals("KPR")){
								data.setKPR(e2.getText());
							}else if(e2.getName().equals("FHR")){
								data.setFHR(e2.getText());
							}else if(e2.getName().equals("YFPDM")){
								data.setYFPDM(e2.getText());
							}else if(e2.getName().equals("YFPHM")){
								data.setYFPHM(e2.getText());
							}else if(e2.getName().equals("ZFSJ")){
								data.setZFSJ(e2.getText());
							}else if(e2.getName().equals("ZFR")){
								data.setZFR(e2.getText());
							}else if(e2.getName().equals("SIGN")){
								data.setSIGN(e2.getText());
							}else if(e2.getName().equals("SYH")){
								data.setSYH(e2.getText());
							}else if(e2.getName().equals("QDBZ")){
								data.setQDBZ(e2.getText());
							}else if(e2.getName().equals("BSQS")){
								data.setBSQS(e2.getText());
							}else if(e2.getName().equals("SL")){
								data.setSL(e2.getText());
							}else if(e2.getName().equals("SFXMXX")){
								List<MWFPCX_SFXM> list = new ArrayList<MWFPCX_SFXM>();
								Iterator<Element> zzz = e2.elementIterator();
								while(zzz.hasNext()){
									e3 = zzz.next();
									if(e3.getName().equals("SFXM")){
										MWFPCX_SFXM sfxm = new MWFPCX_SFXM();
										Iterator<Element> ss = e3.elementIterator();
										while(ss.hasNext()){
											e4 = ss.next();
											if(e4.getName().equals("XM")){
												sfxm.setXM(e4.getText());
											}else if(e4.getName().equals("DJ")){
												sfxm.setDJ(e4.getText());
											}else if(e4.getName().equals("SL")){
												sfxm.setSL(e4.getText());
											}else if(e4.getName().equals("JE")){
												sfxm.setJE(e4.getText());
											}else if(e4.getName().equals("ZSL")){
												sfxm.setZSL(e4.getText());
											}else if(e4.getName().equals("SE")){
												sfxm.setSE(e4.getText());
											}else if(e4.getName().equals("HSDJ")){
												sfxm.setHSDJ(e4.getText());
											}else if(e4.getName().equals("HSJE")){
												sfxm.setHSJE(e4.getText());
											}
										}
										list.add(sfxm);
									}
								}
								data.setList(list);
							}
						}
						output.setData(data); 
					}
				}
			}
		}
		return output;
	}
	
	/**
	 * 2.16.远程清卡
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static YCQK_OUTPUT getYcqk(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		YCQK_OUTPUT output = new YCQK_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				output.setData(ee.getText()); 
			}
		}
		return output;
	}
	
	/**
	 * 2.15 上报汇总
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static SBHZ_OUTPUT getSbhz(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		SBHZ_OUTPUT output = new SBHZ_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("SQ")){
						output.setSq(e1.getText());
					}
				}
			}
		}
		return output;
	}
	
	/**
	 * 4.1 执行命令
	 * @param xml
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static ZXML_OUTPUT getZxml(String xml) throws UnsupportedEncodingException, Exception{
		InputStream is = new ByteArrayInputStream(xmlFilter(xml).getBytes(enCode));
		Element ee = null;
		Element e1 = null;
		RETURN rETURN = null;
		ZXML_OUTPUT output = new ZXML_OUTPUT();
		SAXReader reader = new SAXReader();
		Document document = reader.read(is);
		Element root = document.getRootElement();
		Iterator<Element> iterator = root.elementIterator(); 
		while(iterator.hasNext()){
			ee = iterator.next();
			if(ee.getName().equals("RETURN")){
				rETURN = new RETURN();
				Iterator<Element> it = ee.elementIterator(); 
				while(it.hasNext()){
					e1 = it.next();
					if(e1.getName().equals("CODE")){
						rETURN.setCODE(e1.getText());
					}else if(e1.getName().equals("MESS")){
						rETURN.setMESS(e1.getText());
					}
				}
				output.setrETURN(rETURN);
			}else if(ee.getName().equals("DATA")){
				output.setData(ee.getText());
			}
		}
		return output;
	}
}
