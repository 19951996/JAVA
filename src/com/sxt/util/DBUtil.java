package com.sxt.util;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtil {
	public static DataSource getDataSource() throws Exception{
		// ��ʼ�����������ռ�
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/train");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	//�ͷ���Դ
	public static Connection getConnection() throws Exception{
	DataSource ds = getDataSource();
	Connection	conn = ds.getConnection();		
		return conn;
	}
	public static void main(String[] args) throws Exception {
		System.out.println(getDataSource());
	}
	

}
