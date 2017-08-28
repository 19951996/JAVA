package com.sxt.vo;

import java.util.Date;

public class Refund {//退票人信息
	private String name;//姓名
	private String idcard;//身份证
	private int t_id;//火车序号
	private String  start;//起始站
	private String  end;//终点站
	private Date start_time;//起始时间
	private Date end_time;//到达时间
	private float fares;//票价
	private int carriage_id;//车厢号
	private int seat_id;//座位号
	private String ptype;//座位类型
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
