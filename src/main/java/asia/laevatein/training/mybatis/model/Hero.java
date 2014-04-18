/**
 * Copyright(C) com.allinpay - 通联支付 上海研发中心
 * 
 * @author 蒋钧
 *
 * @since 2014年4月15日
 * @description: <描述>
 *
 */
package asia.laevatein.training.mybatis.model;

public class Hero {

	private int id;
	private int tiZhi;
	private int liDao;
	private int shenFa;
	private int genGu;
	private int yuanQi;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTiZhi() {
		return tiZhi;
	}
	public void setTiZhi(int tiZhi) {
		this.tiZhi = tiZhi;
	}
	public int getLiDao() {
		return liDao;
	}
	public void setLiDao(int liDao) {
		this.liDao = liDao;
	}
	public int getShenFa() {
		return shenFa;
	}
	public void setShenFa(int shenFa) {
		this.shenFa = shenFa;
	}
	public int getGenGu() {
		return genGu;
	}
	public void setGenGu(int genGu) {
		this.genGu = genGu;
	}
	public int getYuanQi() {
		return yuanQi;
	}
	public void setYuanQi(int yuanQi) {
		this.yuanQi = yuanQi;
	}
	
	@Override
	public String toString() {
		return "\nid：" + id + "\n体质：" + tiZhi + "\n力道：" + liDao + "\n身法：" + shenFa + "\n根骨：" + genGu + "\n元气：" + yuanQi + "\n";
	}
}
