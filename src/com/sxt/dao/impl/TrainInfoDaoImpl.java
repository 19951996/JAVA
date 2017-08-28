package com.sxt.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.sxt.dao.TrainInfoDao;
import com.sxt.util.DBUtil;
import com.sxt.vo.Line;
import com.sxt.vo.TrainInfo;


public class TrainInfoDaoImpl implements TrainInfoDao{
	//增加车次的方法
      public boolean addTrain(TrainInfo traininfo) throws Exception {
    	  DataSource ds = DBUtil.getDataSource();
  		  QueryRunner qr = new QueryRunner(ds);
  		  String sql ="insert into traininfo(name,length,soft,hard,hard_seat,restrict_count,train_type) value(?,?,?,?,?,?,?)";
  		  int i = qr.update(sql, new Object[]{traininfo.getName(),traininfo.getLength(),traininfo.getSoft(),traininfo.getHard(),traininfo.getHard_seat(),traininfo.getRestrict_count(),traininfo.getTrain_type()});
  		  return i>0?true:false;
	}
	//测试方法
     public static void main(String[] args) throws Exception {
        /* System.out.println(new TrainInfoDaoImpl().addTrain(new TrainInfo("nijao",333,444,222,111,222,100, "meiyou")));*/
	    System.out.println(new TrainInfoDaoImpl().deleteByName("JCP"));
	    
	 }

	//查找所有的车次
	public List<TrainInfo> findAll() throws Exception {
		String sql = "select * from traininfo order by t_id desc";
		QueryRunner qr = new QueryRunner(DBUtil.getDataSource());
		return qr.query(sql,new BeanListHandler(TrainInfo.class));
		
	}
	//删除车次方法
	public boolean deleteByName(String name) throws Exception {
		
			String sql = "delete from traininfo where name=?";
			QueryRunner qr = new QueryRunner(DBUtil.getDataSource());
			int i = qr.update(sql, new Object[]{name});
			return i>0?true:false;
	}
	//通过name查找
	public TrainInfo findByName(String name) throws Exception {
		String sql = "select * from traininfo where name=?";
		QueryRunner qr = new QueryRunner(DBUtil.getDataSource());
		return qr.query(sql,new BeanHandler(TrainInfo.class),name);
		
	}
	//查找所有车次的t_id
	public TrainInfo findByt_id(int t_id) throws Exception {
		String sql = "select * from traininfo where t_Id=?";
		QueryRunner qr = new QueryRunner(DBUtil.getDataSource());
		return qr.query(sql,new BeanHandler(TrainInfo.class),t_id);
	}
}
