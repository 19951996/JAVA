package com.sxt.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.sxt.dao.RefundDao;
import com.sxt.util.DBUtil;
import com.sxt.vo.Ticket;

public   class RefundDaoImpl implements RefundDao{
	public boolean delById(String  date,String idcard,String  start) throws Exception{
	DataSource ds =	DBUtil.getDataSource();
	String sql = "delete  from ticket where start_time=? and idcard=? and start_station=?";
	QueryRunner qr = new QueryRunner(ds);
	int r = qr.update(sql,new Object[]{date,idcard,start});
	return r>0?true:false;		
	}
	
	
	
	public List<Ticket> findByname(String username) throws Exception{
		//获取到数据库的Connection Statement ResultSet
		DataSource ds =	DBUtil.getDataSource();	
		String sql = "select * from ticket where username=?";
		QueryRunner qr = new QueryRunner(ds);
		return qr.query(sql, new BeanListHandler(Ticket.class),new Object[]{username});	
	}
	// public static void main(String[] args) throws Exception {
	 //RefundDaoImpl dao = new RefundDaoImpl();	 
	 	//System.out.println(dao.delById("2017-08-26 22:30:00", "2","北京"));
	 //List<Ticket> list = dao.findByname("大娃");
	// System.out.println(list);
	//}




	
}
