package com.sxt.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetTime {
	//输入月——日 能转化成和数据库相对应的时间格式类型
	public static Date start_time(String month){
		Date date = null;
		Calendar now = Calendar.getInstance();
		String now_year = String.valueOf(now.get(Calendar.YEAR));
		String now_month =String.valueOf(now.get(Calendar.MONTH)+1);
		String now_day = String.valueOf(now.get(Calendar.DAY_OF_MONTH));
		String now_hour = String.valueOf(now.get(Calendar.HOUR_OF_DAY));
		String now_min  = String.valueOf(now.get(Calendar.MINUTE));
		String now_sec =String.valueOf(now.get(Calendar.SECOND));
		if(now.get(Calendar.MONTH)<10){
			 now_month ="0"+String.valueOf(now.get(Calendar.MONTH)+1);
		}
		if(now.get(Calendar.DAY_OF_MONTH)+1<10){
			 now_day = "0"+String.valueOf(now.get(Calendar.DAY_OF_MONTH)+1);
		}
		if(now.get(Calendar.HOUR_OF_DAY)<10){
			now_hour = "0"+String.valueOf(now.get(Calendar.HOUR_OF_DAY));
		}
		if(now.get(Calendar.MINUTE)<10){
			now_min  = "0"+String.valueOf(now.get(Calendar.MINUTE));
		}
		if(now.get(Calendar.SECOND)<10){
			 now_sec ="0"+String.valueOf(now.get(Calendar.SECOND));
		}
		String s =now_month+"-"+now_day;
		if(month.equals(s)){
			//System.out.println(s);
			String time = now_year+"-"+now_month+"-"+now_day+" "+now_hour+":"+now_min+":"+now_sec;
			//System.out.println(time);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			try {
				 date = sdf.parse(time.trim());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			String time = now_year+"-"+month+" "+"00"+":"+"00"+":"+"00";
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			try {
				 date = sdf.parse(time.trim());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return date;
	}

	public static void main(String[] args) {
		GetTime su = new GetTime();
		System.out.println(su.start_time("08-23"));
		System.out.println(su.end_time("08-23"));
		System.out.println(su.year_date("2017-08-23"));
		System.out.println(su.year_date("2017-08-24"));
	}
	public static Date end_time(String month){
		Date date = null;
		Calendar now = Calendar.getInstance();
		String now_year = String.valueOf(now.get(Calendar.YEAR));
		String now_month =String.valueOf(now.get(Calendar.MONTH)+1);
		String now_day = String.valueOf(now.get(Calendar.DAY_OF_MONTH));
		if(now.get(Calendar.MONTH)<10){
			 now_month ="0"+String.valueOf(now.get(Calendar.MONTH)+1);
		}
		if(now.get(Calendar.DAY_OF_MONTH)+1<10){
			 now_day = "0"+String.valueOf(now.get(Calendar.DAY_OF_MONTH)+1);
		}
			String time = now_year+"-"+month+" "+"23"+":"+"59"+":"+"59";
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			try {
				 date = sdf.parse(time.trim());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return date;
	}
		public static Date year_date(String time){
			Date date = null;
			long dt = 0;
			Date date1= null;
			Calendar now = Calendar.getInstance();
			String now_year = String.valueOf(now.get(Calendar.YEAR));
			String now_month =String.valueOf(now.get(Calendar.MONTH)+1);
			String now_day = String.valueOf(now.get(Calendar.DAY_OF_MONTH));
			String now_hour = String.valueOf(now.get(Calendar.HOUR_OF_DAY));
			String now_min  = String.valueOf(now.get(Calendar.MINUTE));
			String now_sec =String.valueOf(now.get(Calendar.SECOND));
			if(now.get(Calendar.MONTH)<10){
				 now_month ="0"+String.valueOf(now.get(Calendar.MONTH)+1);
			}
			if(now.get(Calendar.DAY_OF_MONTH)+1<10){
				 now_day = "0"+String.valueOf(now.get(Calendar.DAY_OF_MONTH)+1);
			}
			if(now.get(Calendar.HOUR_OF_DAY)<10){
				now_hour = "0"+String.valueOf(now.get(Calendar.HOUR_OF_DAY));
			}
			if(now.get(Calendar.MINUTE)<10){
				now_min  = "0"+String.valueOf(now.get(Calendar.MINUTE));
			}
			if(now.get(Calendar.SECOND)<10){
				 now_sec ="0"+String.valueOf(now.get(Calendar.SECOND));
			}
			String s =now_year+"-"+now_month+"-"+now_day;
			if(time.equals(s)){
				//System.out.println(s);
				String t1 = now_year+"-"+now_month+"-"+now_day+" "+now_hour+":"+now_min+":"+now_sec;
				//System.out.println(time);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				try {
					 date1 = sdf.parse(t1.trim());
					 dt = date1.getTime()+30*60*1000;
					 date = new Date(dt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				String t1 = time+" "+"00"+":"+"00"+":"+"00";
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				try {
					 date = sdf.parse(t1.trim());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return date;
		}
		public static Date yearend_time(String month){
			Date date = null;
			Calendar now = Calendar.getInstance();
			String now_year = String.valueOf(now.get(Calendar.YEAR));
			String now_month =String.valueOf(now.get(Calendar.MONTH)+1);
			String now_day = String.valueOf(now.get(Calendar.DAY_OF_MONTH));
			if(now.get(Calendar.MONTH)<10){
				 now_month ="0"+String.valueOf(now.get(Calendar.MONTH)+1);
			}
			if(now.get(Calendar.DAY_OF_MONTH)+1<10){
				 now_day = "0"+String.valueOf(now.get(Calendar.DAY_OF_MONTH)+1);
			}
				String time = month+" "+"23"+":"+"59"+":"+"59";
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				try {
					 date = sdf.parse(time.trim());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return date;
		}
}
