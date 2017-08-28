package com.sxt.dao;

import java.util.List;

import com.sxt.vo.Admin;

public interface adminDao {
	public Admin findByAdmin(String name,String pwd) throws  Exception;
	public boolean addAdmin(Admin admin) throws Exception;
	public List<Admin> findAll() throws Exception;
	public boolean deleteByname(String name) throws Exception;
}
