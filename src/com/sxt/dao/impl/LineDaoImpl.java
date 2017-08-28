package com.sxt.dao.impl;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.sxt.dao.LineDao;
import com.sxt.util.DBUtil;
import com.sxt.vo.Line;
//查询所有线路信息
public class LineDaoImpl implements LineDao {
	public List<Line> findStation() throws Exception {
			DataSource ds =DBUtil.getDataSource();
			QueryRunner qr = new QueryRunner(ds);
			String sql = "select distinct start_station,end_station from line;";
			List<Line> list =  qr.query(sql, new BeanListHandler(Line.class));
		return list;
	
	}
/*
	public static void main(String[] args) {
		LineDaoImpl dao = new LineDaoImpl();
			try {
				List<Line> list = dao.findStation();
				System.out.println(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	*/
	//测试的main方法
	public static void main(String[] args) throws Exception{
		//String str="2016-01-01 07:30:00";
		//DateFormat df = DateFormat.getDateInstance();
		//Date date = df.parse(str); 
		//System.out.println(new LineDaoImpl().addLine(new Line(44,150,100,50,"长沙","武汉",date,date)));
		//System.out.println(new LineDaoImpl().findAll());*/		
		//System.out.println(new LineDaoImpl().deleteByt_Id("1222"));*/
		//System.out.println(new LineDaoImpl().findt_Id("333"));
	  }
    //增加的线路的方法
	public boolean addLine(Line line) throws Exception {
		DataSource ds = DBUtil.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		
		String sql="insert into line(t_id,soft_price,hard_price,hard_seatprice,start_station,end_station,start_time,end_time) value(?,?,?,?,?,?,?,?)";
		int i = qr.update(sql, new Object[]{line.getT_id(),line.getSoft_price(),line.getHard_price(),line.getHard_seatprice(),line.getStart_station(),line.getEnd_station(),line.getStart_time(),line.getEnd_time()});
		return i>0?true:false;
	}

	//查找数据库所有的线路的方法
	public List<Line> findAll() throws Exception {
		String sql = "select * from line order by id desc";
		QueryRunner qr = new QueryRunner(DBUtil.getDataSource());
		return qr.query(sql,new BeanListHandler(Line.class));
		
	}
	//删除数据库内的一条线路的方法
	public boolean deleteByt_Id(String t_Id) throws Exception {
		String sql = "delete from line where t_Id=?";
		QueryRunner qr = new QueryRunner(DBUtil.getDataSource());
		int i = qr.update(sql, new Object[]{t_Id});
		return i>0?true:false;
		
	}
	//查找所有的t_Id
	public Line findt_Id(String t_id) throws Exception {
		String sql = "select * from line where t_id=?";
		QueryRunner qr = new QueryRunner(DBUtil.getDataSource());
		return qr.query(sql,new BeanHandler(Line.class),t_id);
		
	}
	
}
