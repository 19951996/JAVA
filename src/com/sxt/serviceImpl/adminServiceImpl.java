package com.sxt.serviceImpl;

import java.util.List;

import com.sxt.dao.impl.adminDaoImpl;
import com.sxt.service.adminService;
import com.sxt.vo.Admin;

public class adminServiceImpl implements adminService{
	adminDaoImpl userDao = new adminDaoImpl();
	 //��¼
	public Admin loginAdmin(String name, String pwd) throws Exception {
				
		return userDao.findByAdmin(name, pwd);
		
	}

	//��ӹ���Ա����
	public boolean addAdmin(Admin admin) throws Exception {
		
		return userDao.addAdmin(admin);
	}

	//��������
	public List<Admin> findAll() throws Exception {
		
		return userDao.findAll();
	}

	//ͨ��nameɾ��
	public boolean deleteByname(String name) throws Exception {
		
		return userDao.deleteByname(name);
	}
	
}
