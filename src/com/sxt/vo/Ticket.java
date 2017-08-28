package com.sxt.vo;

import java.util.Date;

public class Ticket {
	private String name;//姓名
	private String idcard;//身份证
	private int t_id;//火车序号
	private String  start_station;//起始站
	private String  end_station;//终点站
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
	public String getStart_station() {
		return start_station;
	}
	public void setStart_station(String start_station) {
		this.start_station = start_station;
	}
	public String getEnd_station() {
		return end_station;
	}
	public void setEnd_station(String end_station) {
		this.end_station = end_station;
	}
	@Override
	public String toString() {
		return "Ticket [name=" + name + ", idcard=" + idcard + ", t_id=" + t_id
				+ ", start_station=" + start_station + ", end_station="
				+ end_station + ", start_time=" + start_time + ", end_time="
				+ end_time + ", fares=" + fares + ", carriage_id="
				+ carriage_id + ", seat_id=" + seat_id + ", ptype=" + ptype
				+ "]";
	}
	public Ticket(String name, String idcard, int t_id, String start_station,
			String end_station, Date start_time, Date end_time, float fares,
			int carriage_id, int seat_id, String ptype) {
		super();
		this.name = name;
		this.idcard = idcard;
		this.t_id = t_id;
		this.start_station = start_station;
		this.end_station = end_station;
		this.start_time = start_time;
		this.end_time = end_time;
		this.fares = fares;
		this.carriage_id = carriage_id;
		this.seat_id = seat_id;
		this.ptype = ptype;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
