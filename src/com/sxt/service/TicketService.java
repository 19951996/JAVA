package com.sxt.service;

import java.util.Date;
import java.util.List;

import com.sxt.vo.Dto;
import com.sxt.vo.Line;

public interface TicketService {
	public int RemainderTicket_count(String start_station,String end_station,String date) throws Exception;//×ÜÓàÆ±ÊýÁ¿
	public List<Line> findStation() throws Exception;
	public List<Dto> buyTicket(String start,String end,String date) throws Exception;
	public int soft_count(Date start_time,String start_station,int t_id) throws Exception;
	public int hard_count(Date start_time,String start_station,int t_id) throws Exception;
	public int headSeat_count(Date start_time,String start_station,int t_id) throws Exception;
}
