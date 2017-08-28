package com.sxt.serviceImpl;

import java.util.List;

import com.sxt.dao.impl.adminDaoImpl;
import com.sxt.service.adminService;
import com.sxt.vo.Admin;

public class adminServiceImpl implements adminService{
	adminDaoImpl userDao = new adminDaoImpl();
	 //登录
	public Admin loginAdmin(String name, String pwd) throws Exception {
				
		return userDao.findByAdmin(name, pwd);
		
	}

	//添加管理员方法
	public boolean addAdmin(Admin admin) throws Exception {
		
		return userDao.addAdmin(admin);
	}

	//查找所有
	public List<Admin> findAll() throws Exception {
		
		return userDao.findAll();
	}

	//通过name删除
	public boolean deleteByname(String name) throws Exception {
		
		return userDao.deleteByname(name);
	}
	
}
