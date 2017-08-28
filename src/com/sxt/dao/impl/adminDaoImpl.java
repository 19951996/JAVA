package com.sxt.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import com.sxt.dao.adminDao;
import com.sxt.util.DBUtil;
import com.sxt.vo.Admin;


public class adminDaoImpl implements adminDao{

	@Override
	public  Admin findByAdmin(String name, String pwd) throws Exception {
		DataSource ds = DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select * from admin where name =? and pwd =?";
	
		Admin admin= qr.query(sql,new BeanHandler(Admin.class), new Object[]{name,pwd});
		return admin;
	}
	//²âÊÔ·½·¨
     public static void main(String[] args) throws Exception {
          /*System.out.println(new adminDaoImpl().findByAdmin("admin", "admin"));*/
          /*System.out.println(new adminDaoImpl().addAdmin(new Admin("lklklk", "fdfdf")));*/
          /*System.out.println(new adminDaoImpl().findAll());*/
    	 System.out.println(new adminDaoImpl().deleteByname("coco"));
          
}

public boolean addAdmin(Admin admin) throws Exception {
	DataSource ds = DBUtil.getDataSource();
	QueryRunner qr = new QueryRunner(ds);
	String sql ="insert into admin(name,pwd) value(?,?)";
	int i = qr.update(sql, new Object[]{admin.getName(),admin.getPwd()});
	return i>0?true:false;
}
public List<Admin> findAll() throws Exception {
	
	String sql = "select * from admin";
	QueryRunner qr = new QueryRunner(DBUtil.getDataSource());
	return qr.query(sql,new BeanListHandler(Admin.class));
	
	
}
@Override
public boolean deleteByname(String name) throws Exception {
	String sql = "delete from admin where name=?";
	QueryRunner qr = new QueryRunner(DBUtil.getDataSource());
	int i = qr.update(sql, new Object[]{name});
	return i>0?true:false;
}

}
