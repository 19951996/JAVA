package com.sxt.dao.impl;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.sxt.dao.TicketDao;
import com.sxt.util.*;
import com.sxt.vo.Dto;
import com.sxt.vo.Ticket;
import java.math.BigDecimal;

public class TicketDaoImpl implements TicketDao{
	Ticket ticket = new Ticket();
	public int ticket_sum(String start, String end, String date){
		int ticket_sum=0;
			try {
				int count = ticket_count(start,end,date);//得到已经订票的人数
				DataSource ds = DBUtil.getDataSource();
				QueryRunner qr = new QueryRunner(ds);
				Date start_time = GetTime.start_time(date);
				Date end_time = GetTime.end_time(date);
				String sql = "select sum(restrict_count) from line,traininfo where start_station=?  and end_station=?and start_time >? and start_time<?  and line.t_id=traininfo.t_Id";
				Object obj=qr.query(sql,new ScalarHandler(),new Object[]{start,end,start_time,end_time});
				int num=((BigDecimal)obj).intValue();
				ticket_sum=num-count;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return ticket_sum;
	}

	public int ticket_count(String start, String end, String date) throws Exception {
		DataSource ds = DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select count(*) from ticket where start_station=?  and end_station = ? and start_time >? and start_time <?";
		Date start_time = GetTime.start_time(date);
		Date end_time = GetTime.end_time(date);
		Object obj=qr.query(sql,new ScalarHandler(),new Object[]{start,end,start_time,end_time});
		int num=((Long)obj).intValue();
		return num;	
	}

	public static void main(String[] args) {
		TicketDao dao = new TicketDaoImpl();
		try {
			System.out.println(dao.ticket_count("北京","天津","08-24"));
			System.out.println(dao.ticket_sum("北京", "天津", "08-24"));
			System.out.println(dao.buyTicket("北京", "天津", "2017-08-25"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Dto> buyTicket(String start, String end, String date)//查询所有车次信息
			throws Exception {
		Date gt = new GetTime().year_date(date);
		Date et = new GetTime().yearend_time(date);
		DataSource ds =DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select traininfo.name,traininfo.restrict_count,traininfo.soft,traininfo.hard,traininfo.t_id,traininfo.hard_seat,line.start_time, line.end_time,line.start_station,line.end_station from traininfo,line  where traininfo.t_Id=line.t_Id and start_station=? and end_station=? and ?>=start_time and start_time>=?;";
		List<Dto> list =  qr.query(sql, new BeanListHandler(Dto.class),start,end,et,gt);
		return list;
	}

	//获取当前已经订购软卧数
	public int soft_count(Date start_time, String start_station, int t_id)
			throws Exception {
		DataSource ds =DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select count(*) from ticket where start_time=? and start_station=? and t_id=? and ptype='软卧'";
		Object obj=qr.query(sql,new ScalarHandler(),new Object[]{start_time,start_station,t_id});
		int num=((Long)obj).intValue();
		return num;
	}

	//获取当前车次已经订购的硬卧数
	public int hard_count(Date start_time, String start_station, int t_id)
			throws Exception {
		DataSource ds =DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select count(*) from ticket where start_time=? and start_station=? and t_id=? and ptype='硬卧'";
		Object obj=qr.query(sql,new ScalarHandler(),new Object[]{start_time,start_station,t_id});
		int num=((Long)obj).intValue();
		return num;
	}

	//获取当前车次已经订购的硬座数
	public int headSeat_count(Date start_time, String start_station, int t_id)
			throws Exception {
		DataSource ds =DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select count(*) from ticket where start_time=? and start_station=? and t_id=? and ptype='硬座'";
		Object obj=qr.query(sql,new ScalarHandler(),new Object[]{start_time,start_station,t_id});
		int num=((Long)obj).intValue();
		return num;
	}



}
