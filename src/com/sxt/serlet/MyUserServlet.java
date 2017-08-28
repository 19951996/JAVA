package com.sxt.serlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sxt.service.RefundService;
import com.sxt.service.UserService;

import com.sxt.serviceImpl.RefundServiceImpl;
import com.sxt.serviceImpl.userServiceImpl;
import com.sxt.vo.Rider;
import com.sxt.vo.Ticket;

import com.sxt.vo.userinfo;

public class MyUserServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		//System.out.println(action);
		if ("findAll".equals(action)) {
			findAll(request, response);
		}else if("delRider".equals(action)) {
			delRider(request, response);
		}else if ("insertRider".equals(action)){
			try {
				insertRider(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		   		   
 		  else if ("findByname".equals(action)) {
 			 findByname(request,response);
		}else if("delete".equals(action)) {
			 delete(request,response);
		}
	}
	private void findByname(HttpServletRequest request,
			HttpServletResponse response) {
		String username = request.getParameter("username");
	       //System.out.println(username);
	       //System.out.println(username);
        RefundServiceImpl se = new RefundServiceImpl();
        try {
			List<Ticket> list = se.findByname(username);
			//System.out.println(list);
			request.setAttribute("list", list);
			request.getRequestDispatcher("MyUser.jsp").forward(request, response);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
        UserService  rider = new userServiceImpl();
		UserService  uisi =  new userServiceImpl();
		List<Rider> list1= null;
		List<userinfo> list = null;
		try {
			list1 = rider.findRider();
			request.setAttribute("rider", list1);
			list = uisi.findUser();
			request.setAttribute("lists", list);
			request.getRequestDispatcher("MyUser.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
           
           request.setCharacterEncoding("utf-8");
   		
   		   String  date = request.getParameter("date");
//   		System.out.println(date);
           String  idcard= request.getParameter("idcard");
           String  start= request.getParameter("start");
           //String d = new String(date.getBytes("iso8859-1"),"utf-8");
          // String s = new String(start.getBytes("iso8859-1"),"utf-8");
            System.out.println(date);
           System.out.println(idcard);
           System.out.println(start);
            RefundService refundService = new RefundServiceImpl();
            try {
    			boolean b = refundService.delById(date,idcard,start);			
    			request.setAttribute("result", b);
    			System.out.println(b);
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		request.getRequestDispatcher("myUserServlet?action=findByname").forward(request, response);  		   		 
    	}
	public void findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService  rider = new userServiceImpl();
		UserService  uisi =  new userServiceImpl();
		List<Rider> list1= null;
		List<userinfo> list = null;
		try {
			list1 = rider.findRider();
			request.setAttribute("rider", list1);
			list = uisi.findUser();
			request.setAttribute("lists", list);
			request.getRequestDispatcher("MyUser.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delRider(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String id = request.getParameter("idcard");
			//System.out.println("123132"+id);
			UserService service = new userServiceImpl();
			try {
				boolean b = service.deleteRider(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("myUserServlet?action=findAll").forward(request, response);
	}
	public void insertRider(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
			String name = request.getParameter("name");
			String sex	= request.getParameter("sex");
			String idcard = request.getParameter("idcard");
			int age = Integer.parseInt(request.getParameter("age"));
//			System.out.println(name+sex+idcard+age);
			Rider rider = new Rider();
			rider.setName(name);
			rider.setSex(sex);
			rider.setIdcard(idcard);
			rider.setAge(age);
			UserService service = new userServiceImpl();
			//System.out.println(service.findRiderByIdcard(idcard));
			try {
				if (service.findRiderByIdcard(idcard)==null) {
					
						boolean b = service.insertRider(rider);
						//System.out.println("123");
					
					request.getRequestDispatcher("myUserServlet?action=findAll").forward(request, response);
				}else{
					request.setAttribute("error", "身份证相同不能添加");
					request.getRequestDispatcher("myUserServlet?action=findAll").forward(request, response);
				//System.out.println("1");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public void init() throws ServletException {
		
	}

}



