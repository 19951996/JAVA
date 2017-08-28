package com.sxt.serviceImpl;

import java.util.Date;
import java.util.List;

import com.sxt.dao.LineDao;
import com.sxt.dao.TicketDao;
import com.sxt.dao.impl.LineDaoImpl;
import com.sxt.dao.impl.TicketDaoImpl;
import com.sxt.service.TicketService;
import com.sxt.util.GetDay;
import com.sxt.vo.Dto;
import com.sxt.vo.Line;

public class TicketServiceImpl implements TicketService{
	TicketDao ticketdao = new TicketDaoImpl();
	LineDao ld = new LineDaoImpl();
	//GetDay gt = new GetDay();
	public int RemainderTicket_count(String start_station,String end_station,String date) throws Exception {
		return ticketdao.ticket_sum(start_station, end_station, date);
	}
	@Override
	public List<Line> findStation() throws Exception {
		return ld.findStation();
	}
/*
	public static void main(String[] args) {
		TicketService service = new TicketServiceImpl();
		try {
			System.out.println(service.RemainderTicket_count("北京","上海","08-21"));
			System.out.println(service.findStation());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
*/
	@Override
	public List<Dto> buyTicket(String start, String end, String date)
			throws Exception {
		
		
		return  ticketdao.buyTicket(start, end, date);
	}
	@Override
	public int soft_count(Date start_time, String start_station, int t_id)
			throws Exception {
		
		return ticketdao.soft_count(start_time, start_station, t_id);
	}
	@Override
	public int hard_count(Date start_time, String start_station, int t_id)
			throws Exception {
		return ticketdao.hard_count(start_time, start_station, t_id);
	}
	@Override
	public int headSeat_count(Date start_time, String start_station, int t_id)
			throws Exception {
		
		return ticketdao.headSeat_count(start_time, start_station, t_id);
	}
}
