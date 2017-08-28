package com.sxt.serviceImpl;

import java.util.List;

import com.sxt.dao.impl.RefundDaoImpl;
import com.sxt.service.RefundService;
import com.sxt.serviceImpl.RefundServiceImpl;
import com.sxt.vo.Ticket;

public class RefundServiceImpl implements RefundService{
	public boolean delById(String name,String idcard,String  start) throws Exception{
		RefundDaoImpl dao = new RefundDaoImpl();
		return dao.delById(name,idcard,start);	
	}

	@Override
	public List<Ticket> findByname(String username) throws Exception {
		RefundDaoImpl dao = new RefundDaoImpl();
		return dao.findByname(username);
	}
	
	
}

