package com.sxt.serlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.service.TicketService;
import com.sxt.serviceImpl.TicketServiceImpl;
import com.sxt.util.GetDay;
import com.sxt.vo.Line;

public class TicketServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if("ticket_count".equals(action)){
			ticket_count(request,response);
		}
		if("buy_ticket".equals(action)){
			buy_ticket(request,response);
		}
		}
	public void ticket_count(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		List<Line> list= null;
		TicketService ticket = new TicketServiceImpl();
		try {
			list = ticket.findStation();//找到站点	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GetDay gt = new GetDay();
		request.setAttribute("GetDay", gt);//当前系统时间
		for (Line line : list) {
			try {
				line.setToday(ticket.RemainderTicket_count(line.getStart_station(), line.getEnd_station().trim(), gt.getToday()));
				line.setFirst(ticket.RemainderTicket_count(line.getStart_station(), line.getEnd_station(), gt.getFirst()));
				line.setSecond(ticket.RemainderTicket_count(line.getStart_station(), line.getEnd_station(), gt.getSecond()));
				line.setThird(ticket.RemainderTicket_count(line.getStart_station(), line.getEnd_station(), gt.getThird()));
				System.out.println(line.getFirst());
				System.out.println(gt.getFirst());
				System.out.println(line.getStart_station());
				System.out.println(line.getEnd_station());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	public void buy_ticket(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		System.out.println("123");
	}
}
