package com.sxt.vo;

public class TrainInfo {
	private String name;//»ğ³µ³µ´Î
	private int length;//
	private int soft;
	private int hard;
	private int hard_seat;
	private int no_seat;
	private int restrict_count;
	private String train_type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
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
		return restrict_count-soft-hard-hard_seat;
	}
	
	public int getRestrict_count() {
		return restrict_count;
	}
	public void setRestrict_count(int restrict_count) {
		this.restrict_count = restrict_count;
	}
	public String getTrain_type() {
		return train_type;
	}
	public void setTrain_type(String train_type) {
		this.train_type = train_type;
	}
	
	
}
