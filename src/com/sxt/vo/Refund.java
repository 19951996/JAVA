package com.sxt.vo;

import java.util.Date;

public class Refund {//��Ʊ����Ϣ
	private String name;//����
	private String idcard;//���֤
	private int t_id;//�����
	private String  start;//��ʼվ
	private String  end;//�յ�վ
	private Date start_time;//��ʼʱ��
	private Date end_time;//����ʱ��
	private float fares;//Ʊ��
	private int carriage_id;//�����
	private int seat_id;//��λ��
	private String ptype;//��λ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public float getFares() {
		return fares;
	}
	public void setFares(float fares) {
		this.fares = fares;
	}
	public int getCarriage_id() {
		return carriage_id;
	}
	public void setCarriage_id(int carriage_id) {
		this.carriage_id = carriage_id;
	}
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	

}
