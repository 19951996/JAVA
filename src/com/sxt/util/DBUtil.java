package com.sxt.util;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtil {
	public static DataSource getDataSource() throws Exception{
		// 初始化查找命名空间
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/train");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	//释放资源
	public static Connection getConnection() throws Exception{
	DataSource ds = getDataSource();
	Connection	conn = ds.getConnection();		
		return conn;
	}
	public static void main(String[] args) throws Exception {
		System.out.println(getDataSource());
	}
	

}
