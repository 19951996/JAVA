package com.sxt.dao.impl;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.sxt.dao.impl.userinfoDaoImpl;
import com.sxt.util.DBUtil;
import com.sxt.vo.Rider;

import com.sxt.vo.userinfo;

import com.sxt.dao.userinfoDao;

public class userinfoDaoImpl implements userinfoDao{
	public userinfo findByUser(String username, String password)
			throws Exception {
		// TODO Auto-generated method stub
		
		
		DataSource ds=DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select username from userinfo where username=? and password=?";
		//PreparedStatment pst = conn.prepareStatement(sql);
	
		userinfo  user =qr.query(sql,new BeanHandler(userinfo.class), new Object[]{username,password});
		return user;
	}
	@Override
	public boolean insertUser(userinfo user)
			throws Exception {
		// TODO Auto-generated method stub
		DataSource ds=DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "insert into userinfo(username,password,loginname,cardnum,message,phone,passengerType,province_code) values(?,?,?,?,?,?,?,?) ";
		//PreparedStatment pst = conn.prepareStatement(sql);
	
		int  user1 =qr.update(sql, new Object[]{user.getUsername(),user.getPassword(),user.getLoginname(),user.getCardnum(),user.getMessage(),user.getPhone(),user.getPassengerType(),user.getProvince_code()});
	
		return user1>0?true:false;
		
		
	}
	public static void main(String[] args) throws Exception {
		userinfoDaoImpl dao = new userinfoDaoImpl();
		//dao.insertUser(new userinfo("ggg","123","wadmk","erday",1255,"sdc",123,"sdc","sdc"));
		System.out.println(dao.findUser());
	}
	public boolean deleteRider (String idcard) throws Exception{
		DataSource ds =	 DBUtil.getDataSource();
		String sql = "delete from rider where idcard=?";
		QueryRunner qr = new QueryRunner(ds);
		int result = qr.update(sql, new Object[]{idcard});
		return result>0?true:false;
		
	}
	public boolean insertRider(Rider rider) throws Exception{
		DataSource ds = DBUtil.getDataSource();
		String sql = "insert into rider(name,sex,idcard,age)values(?,?,?,?)";
		QueryRunner qr = new QueryRunner(ds);
		int result= qr.execute(sql, new Object[]{rider.getName(),rider.getSex(),rider.getIdcard(),rider.getAge()});
		return result>0?true:false;
	}
	public List <userinfo> findUser() throws Exception{
		Connection conn = DBUtil.getConnection();		
		String sql = "select * from userinfo";
		QueryRunner qr = new QueryRunner();
		return qr.query(conn, sql, new BeanListHandler(userinfo.class));
}
	@Override
	public List<Rider> findRider() throws Exception {
		Connection conn = DBUtil.getConnection();		
		String sql = "select * from rider";
		QueryRunner qr = new QueryRunner();
		return qr.query(conn, sql, new BeanListHandler(Rider.class));
	}
	@Override
	public Rider findRiderByIdcard(String idcard) throws Exception {
		DataSource ds = DBUtil.getDataSource();
		String sql = "select * from rider where idCard=?";
		QueryRunner qr = new QueryRunner(ds);
		return qr.query(sql, new BeanHandler(Rider.class),idcard);
	}
	public userinfo findByName(String username) throws Exception {
		// TODO Auto-generated method stub
		DataSource ds=DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select * from userinfo where username=?";
		//PreparedStatment pst = conn.prepareStatement(sql);
		userinfo username1 =qr.query(sql,new BeanHandler(userinfo.class), username);
		return username1;
		
		
	
	}
	@Override
	public userinfo findByNum(String cardnum) throws Exception {
		DataSource ds=DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select * from userinfo where cardnum=?";
		//PreparedStatment pst = conn.prepareStatement(sql);
		userinfo cardnum1 =qr.query(sql,new BeanHandler(userinfo.class), cardnum);
		// TODO Auto-generated method stub
		return cardnum1;
	}
}
