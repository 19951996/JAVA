package com.sxt.serviceImpl;

import java.util.List;
import com.sxt.dao.impl.userinfoDaoImpl;
import com.sxt.vo.Rider;

import com.sxt.vo.userinfo;

import com.sxt.service.UserService;

	public class userServiceImpl implements UserService{

		userinfoDaoImpl userDao = new userinfoDaoImpl();
		@Override
		public userinfo login(String username, String password) throws Exception {
			return userDao.findByUser(username, password);
			 
		}
		@Override
		
		public List<userinfo> findUser() throws Exception {
			// TODO Auto-generated method stub
			userinfoDaoImpl uidao = new userinfoDaoImpl();
			return uidao.findUser();
		}

		@Override
		public List<Rider> findRider() throws Exception {
			// TODO Auto-generated method stub
			userinfoDaoImpl uidao = new userinfoDaoImpl();
			return uidao.findRider();
		}

		@Override
		public boolean deleteRider(String idcard) throws Exception {
			
			userinfoDaoImpl uidao = new userinfoDaoImpl();
			return uidao.deleteRider(idcard);
		}

		@Override
		public boolean insertRider(Rider rider) throws Exception {
			userinfoDaoImpl uidao = new userinfoDaoImpl();
			return uidao.insertRider(rider);
		}

		@Override
		public Rider findRiderByIdcard(String idcard) throws Exception {
			userinfoDaoImpl uidao = new userinfoDaoImpl();
			return uidao.findRiderByIdcard(idcard);
			
		}
		@Override
		public boolean register(userinfo user)
				throws Exception {
			// TODO Auto-generated method stub
			return userDao.insertUser(user);
			 
			
		}
		public userinfo registerFindName(String username) throws Exception{
			return userDao.findByName(username);
			
			
		}
		@Override
		public userinfo registerFindNum(String cardnum) throws Exception {
			// TODO Auto-generated method stub
			return userDao.findByNum(cardnum);
		}
		
}
