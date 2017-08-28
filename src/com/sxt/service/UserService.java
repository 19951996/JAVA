package com.sxt.service;

import java.util.List;

import com.sxt.vo.Rider;

import com.sxt.vo.userinfo;

public interface UserService {
	public userinfo login(String username,String password) throws Exception;

	public boolean register(userinfo user) throws Exception;
	public List<userinfo> findUser() throws Exception;
	public List<Rider> findRider() throws Exception;
	public boolean deleteRider (String idcard) throws Exception;
	public boolean insertRider (Rider rider) throws Exception;
	public Rider findRiderByIdcard(String idcard) throws Exception;
	public userinfo registerFindName(String username) throws Exception;
	public userinfo registerFindNum(String cardnum) throws Exception;
}
