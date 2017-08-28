package com.sxt.service;

import java.util.List;

import com.sxt.vo.Admin;

public interface adminService {
	public Admin loginAdmin(String name,String pwd) throws  Exception;
	public boolean addAdmin(Admin admin) throws Exception ;
	public List<Admin> findAll() throws Exception;
	public boolean deleteByname(String name) throws Exception;
}
