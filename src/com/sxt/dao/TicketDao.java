package com.sxt.dao;

import java.util.Date;
import java.util.List;

import com.sxt.vo.Dto;

public interface TicketDao {
	public int ticket_sum(String start,String end,String date) throws Exception;
	public int ticket_count(String start,String end,String date) throws Exception;
	public List<Dto> buyTicket(String start,String end,String date) throws Exception;
	public int soft_count(Date start_time,String start_station,int t_id) throws Exception;
	public int hard_count(Date start_time,String start_station,int t_id) throws Exception;
	public int headSeat_count(Date start_time,String start_station,int t_id) throws Exception;
}
