package pe.etg.bbva.spring.entity;

import java.util.Date;

public class CECanal {
	private String cod_canal;
	private String cod_empresa;
	private String cod_iso_idio_orgn;	
	private String txt_abrv;
	private String txt_desc;
	private String sn_ver;
	private String sn_upd;
	private String sn_anu;
	private String sn_del;
	private String sn_dflt;			
	private String sn_act;		
	private String txt_usr;			
	private Date fec_sis;

	public CECanal() {}
	
	public CECanal(String pcod_canal, String pcod_empresa, String pcod_iso_idio_orgn, String ptxt_abrv, String ptxt_desc,
			String psn_ver, String psn_upd, String psn_anu, String psn_del, String psn_dflt, String psn_act,
			String ptxt_usr, Date pfec_sis) {
		this.cod_canal				= pcod_canal;
		this.cod_empresa			= pcod_empresa;
		this.cod_iso_idio_orgn	= pcod_iso_idio_orgn;
		this.txt_abrv					= ptxt_abrv;
		this.txt_desc					= ptxt_desc;
		this.sn_ver					= psn_ver;
		this.sn_upd					= psn_upd;
		this.sn_anu					= psn_anu;
		this.sn_del					= psn_del;
		this.sn_dflt					= psn_dflt;			
		this.sn_act					= psn_act;		
		this.txt_usr					= ptxt_usr;			
		this.fec_sis					= pfec_sis;
	}
	
	public String getCod_canal() {
		return cod_canal;
	}
	public void setCod_canal(String cod_canal) {
		this.cod_canal = cod_canal;
	}
	public String getCod_empresa() {
		return cod_empresa;
	}
	public void setCod_empresa(String cod_empresa) {
		this.cod_empresa = cod_empresa;
	}
	public String getCod_iso_idio_orgn() {
		return cod_iso_idio_orgn;
	}
	public void setCod_iso_idio_orgn(String cod_iso_idio_orgn) {
		this.cod_iso_idio_orgn = cod_iso_idio_orgn;
	}
	public String getTxt_abrv() {
		return txt_abrv;
	}
	public void setTxt_abrv(String txt_abrv) {
		this.txt_abrv = txt_abrv;
	}
	public String getTxt_desc() {
		return txt_desc;
	}
	public void setTxt_desc(String txt_desc) {
		this.txt_desc = txt_desc;
	}
	public String getSn_ver() {
		return sn_ver;
	}
	public void setSn_ver(String sn_ver) {
		this.sn_ver = sn_ver;
	}
	public String getSn_upd() {
		return sn_upd;
	}
	public void setSn_upd(String sn_upd) {
		this.sn_upd = sn_upd;
	}
	public String getSn_anu() {
		return sn_anu;
	}
	public void setSn_anu(String sn_anu) {
		this.sn_anu = sn_anu;
	}
	public String getSn_del() {
		return sn_del;
	}
	public void setSn_del(String sn_del) {
		this.sn_del = sn_del;
	}
	public String getSn_dflt() {
		return sn_dflt;
	}
	public void setSn_dflt(String sn_dflt) {
		this.sn_dflt = sn_dflt;
	}
	public String getSn_act() {
		return sn_act;
	}
	public void setSn_act(String sn_act) {
		this.sn_act = sn_act;
	}
	public String getTxt_usr() {
		return txt_usr;
	}
	public void setTxt_usr(String txt_usr) {
		this.txt_usr = txt_usr;
	}
	public Date getFec_sis() {
		return fec_sis;
	}
	public void setFec_sis(Date fec_sis) {
		this.fec_sis = fec_sis;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECanal [cod_canal=");
		builder.append(cod_canal);
		builder.append(", cod_empresa=");
		builder.append(cod_empresa);
		builder.append(", cod_iso_idio_orgn=");
		builder.append(cod_iso_idio_orgn);
		builder.append(", txt_abrv=");
		builder.append(txt_abrv);
		builder.append(", txt_desc=");
		builder.append(txt_desc);
		builder.append(", sn_ver=");
		builder.append(sn_ver);
		builder.append(", sn_upd=");
		builder.append(sn_upd);
		builder.append(", sn_anu=");
		builder.append(sn_anu);
		builder.append(", sn_del=");
		builder.append(sn_del);
		builder.append(", sn_dflt=");
		builder.append(sn_dflt);
		builder.append(", sn_act=");
		builder.append(sn_act);
		builder.append(", txt_usr=");
		builder.append(txt_usr);
		builder.append(", fec_sis=");
		builder.append(fec_sis);
		builder.append("]");
		return builder.toString();
	}

	public CECanal createCanal(String pcod_canal, String pcod_empresa, String pcod_iso_idio_orgn, String ptxt_abrv, String ptxt_desc,
			String psn_ver, String psn_upd, String psn_anu, String psn_del, String psn_dflt, String psn_act, String ptxt_usr, Date pfec_sis) {

		CECanal oCECanal = new CECanal();
		
		oCECanal.setCod_canal(pcod_canal);
		oCECanal.setCod_empresa(pcod_empresa);
		oCECanal.setCod_iso_idio_orgn(pcod_iso_idio_orgn);
		oCECanal.setTxt_abrv(ptxt_abrv);
		oCECanal.setTxt_desc(ptxt_desc);
		oCECanal.setSn_ver(psn_ver);
		oCECanal.setSn_upd(psn_upd);
		oCECanal.setSn_anu(psn_anu);
		oCECanal.setSn_del(psn_del);
		oCECanal.setSn_dflt(psn_dflt);
		oCECanal.setSn_act(psn_act);
		oCECanal.setTxt_usr(ptxt_usr);
		oCECanal.setFec_sis(pfec_sis);
		
		return oCECanal;
	}
	
}
