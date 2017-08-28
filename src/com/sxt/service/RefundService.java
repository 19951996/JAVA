package com.sxt.service;

import java.util.List;

import com.sxt.vo.Ticket;

public interface RefundService {
	public boolean delById(String name,String idcard,String  start) throws Exception;
	public List<Ticket> findByname (String username) throws Exception;
}
