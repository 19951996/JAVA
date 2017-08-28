package com.sxt.vo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Line {
		private int t_id;//车次编号
		private float soft_price;//软卧票价
		private float hard_price;//硬卧票价
		private float hard_seatprice;//硬座票价
		private String start_station;//起始站
		private String end_station;//终点站
		private Date start_time;//出发时间
		private Date end_time;//到站时间
		private int today=0;
		private int first=0;
		private int second=0;
		private int third=0;
		public int getT_id() {
			return t_id;
		}
		public void setT_id(int t_id) {
			this.t_id = t_id;
		}
		public float getSoft_price() {
			return soft_price;
		}
		public void setSoft_price(float soft_price) {
			this.soft_price = soft_price;
		}
		public float getHard_price() {
			return hard_price;
		}
		public void setHard_price(float hard_price) {
			this.hard_price = hard_price;
		}
		public float getHard_seatprice() {
			return hard_seatprice;
		}
		public void setHard_seatprice(float hard_seatprice) {
			this.hard_seatprice = hard_seatprice;
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
		public int getToday() {
			return today;
		}
		public void setToday(int today) {
			this.today = today;
		}
		public int getFirst() {
			return first;
		}
		public void setFirst(int first) {
			this.first = first;
		}
		public int getSecond() {
			return second;
		}
		public void setSecond(int second) {
			this.second = second;
		}
		public int getThird() {
			return third;
		}
		public void setThird(int third) {
			this.third = third;
		}
		public Line(int t_id, float soft_price, float hard_price,
				float hard_seatprice, String start_station, String end_station,
				Date start_time, Date end_time) {
			super();
			this.t_id = t_id;
			this.soft_price = soft_price;
			this.hard_price = hard_price;
			this.hard_seatprice = hard_seatprice;
			this.start_station = start_station;
			this.end_station = end_station;
			this.start_time = start_time;
			this.end_time = end_time;
		}
		public Line() {
			super();
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) {
			String date = "2017-08-31 08:08:00";
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			try {
				Date date1 = sdf.parse(date.trim());
				System.out.println(date1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}
