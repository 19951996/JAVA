package com.sxt.dao;

import java.util.List;

import com.sxt.vo.Rider;

import com.sxt.vo.userinfo;

public interface userinfoDao {
	//登陆业务的查询方法
		public userinfo findByUser(String username,String password) throws  Exception;
		public boolean insertUser(userinfo user) throws  Exception;
		public List<Rider> findRider() throws Exception;
		public List<userinfo> findUser() throws Exception;
		public boolean deleteRider(String idcard) throws Exception;
		public boolean insertRider(Rider rider) throws Exception;
		public Rider findRiderByIdcard(String idcard) throws Exception;
		public userinfo findByNum(String cardnum) throws Exception;
		public userinfo findByName(String cardnum) throws Exception;
}
