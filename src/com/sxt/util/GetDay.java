package com.sxt.util;

import java.util.Calendar;
import java.util.Date;

public class GetDay {
	//��ȡ��ǰϵͳ��ʱ�䣬������ת��ΪMM-dd��String
	private String today;
	private String first;
	private String second;
	private String third;
	public String getToday() {
		Calendar calendar = Calendar.getInstance();//��ȡ��ǰϵͳʱ��
		String now_month =String.valueOf(calendar.get(Calendar.MONTH)+1);
		String now_day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
		if(calendar.get(Calendar.MONTH)<10){
			 now_month ="0"+String.valueOf(calendar.get(Calendar.MONTH)+1);
		}
		if(calendar.get(Calendar.DAY_OF_MONTH)+1<10){
			 now_day = "0"+String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)+1);
		}
		String dt = now_month+"-"+now_day;
		return dt;
	}


	public static void main(String[] args) {
		GetDay day = new GetDay();
		System.out.println(day.getToday());
		System.out.println(day.getFirst());
		System.out.println(day.getSecond());
		System.out.println(day.getThird());
	}

	//��ȡ��ǰϵͳʱ��ĵ�һ�������
	public String getFirst(){
		Calendar calendar = Calendar.getInstance();//��ȡ��ǰϵͳʱ��
		calendar.add(Calendar.DAY_OF_MONTH,+1);
		String now_month =String.valueOf(calendar.get(Calendar.MONTH)+1);
		String now_day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
		if(calendar.get(Calendar.MONTH)<10){
			 now_month ="0"+String.valueOf(calendar.get(Calendar.MONTH)+1);
		}
		if(calendar.get(Calendar.DAY_OF_MONTH)+1<10){
			 now_day = "0"+String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)+1);
		}
		String dt = now_month+"-"+now_day;
		return dt;
	}
	//��ȡ��ǰϵͳʱ���֮��ĵڶ��������
	 public  String getSecond(){
		 Calendar calendar = Calendar.getInstance();//��ȡ��ǰϵͳʱ��
			calendar.add(Calendar.DAY_OF_MONTH,+2);
			String now_month =String.valueOf(calendar.get(Calendar.MONTH)+1);
			String now_day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
			if(calendar.get(Calendar.MONTH)<10){
				 now_month ="0"+String.valueOf(calendar.get(Calendar.MONTH)+1);
			}
			if(calendar.get(Calendar.DAY_OF_MONTH)+1<10){
				 now_day = "0"+String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)+1);
			}
			String dt = now_month+"-"+now_day;
			return dt;
	 }
	 //��ȡ��ǰϵͳʱ��֮��ĵ���������
	 public  String getThird(){
		 Calendar calendar = Calendar.getInstance();//��ȡ��ǰϵͳʱ��
			calendar.add(Calendar.DAY_OF_MONTH,+3);
			String now_month =String.valueOf(calendar.get(Calendar.MONTH)+1);
			String now_day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
			if(calendar.get(Calendar.MONTH)<10){
				 now_month ="0"+String.valueOf(calendar.get(Calendar.MONTH)+1);
			}
			if(calendar.get(Calendar.DAY_OF_MONTH)+1<10){
				 now_day = "0"+String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)+1);
			}
			String dt = now_month+"-"+now_day;
			return dt;
	 }
}
