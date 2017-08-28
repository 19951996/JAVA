package com.sxt.vo;

import java.util.Date;

	public class Dto {
		private String start_station;//起始站
		private String end_station;//终点站
		private Date start_time;//出发时间
		private Date end_time;//到站时间
		private int t_id;
		private int restrict_count;
		private String name;//火车车次
		private int soft;
		private int hard;
		private int hard_seat;
		private int no_seat;
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
		public int getT_id() {
			return t_id;
		}
		public void setT_id(int t_id) {
			this.t_id = t_id;
		}
		public int getRestrict_count() {
			return restrict_count;
		}
		public void setRestrict_count(int restrict_count) {
			this.restrict_count = restrict_count;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSoft() {
			return soft;
		}
		public void setSoft(int soft) {
			this.soft = soft;
		}
		public int getHard() {
			return hard;
		}
		public void setHard(int hard) {
			this.hard = hard;
		}
		public int getHard_seat() {
			return hard_seat;
		}
		public void setHard_seat(int hard_seat) {
			this.hard_seat = hard_seat;
		}
		public int getNo_seat() {
			return no_seat;
		}
		public void setNo_seat(int no_seat) {
			this.no_seat = no_seat;
		}
		@Override
		public String toString() {
			return "Dto [start_station=" + start_station + ", end_station="
					+ end_station + ", start_time=" + start_time
					+ ", end_time=" + end_time + ", t_id=" + t_id
					+ ", restrict_count=" + restrict_count + ", name=" + name
					+ ", soft=" + soft + ", hard=" + hard + ", hard_seat="
					+ hard_seat + ", no_seat=" + no_seat + "]";
		}
		
	}