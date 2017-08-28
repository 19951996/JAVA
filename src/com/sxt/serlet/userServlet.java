package com.sxt.serlet;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.serviceImpl.userServiceImpl;
import com.sxt.vo.userinfo;



public class userServlet extends HttpServlet {

userServiceImpl userService = new userServiceImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{		
		request.setCharacterEncoding("utf-8");
		String action =request.getParameter("action");
		System.out.println(action);
			if("login".equals(action)){
				login(request,response);
			}else if("register".equals(action)){
				try {
					register(request,response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if("findNum".equals(action)){
				try {
					findNum(request,response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	public void findNum(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String cardnum=request.getParameter("cardnum");
		userServiceImpl s=new userServiceImpl();
		if(s.registerFindNum(cardnum)==null||"".equals(s.registerFindNum(cardnum))){
			request.getSession().setAttribute("cardnum", "可以");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}else{
			request.getSession().setAttribute("bukeyi", "身份证重复");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}
	
	public void register(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String loginname = request.getParameter("loginname");
		String cardnum = request.getParameter("cardnum");
		String message = request.getParameter("message");
		String phone = request.getParameter("phone");
		String passengerType = request.getParameter("passengerType");
		String province_code = request.getParameter("province_code");
		
		userinfo user=new userinfo();
		user.setUsername(username);
		user.setPassword(password);
		user.setLoginname(loginname);
		user.setCardnum(cardnum);
		user.setMessage(message);
		user.setPhone(phone);
		user.setPassengerType(passengerType);
		user.setProvince_code(province_code);
		userService.register(user);
		
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//1.获得用户的数据
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				//2.略
				//3.调用业务层
				try {
					userinfo user =userService.login(username, password);
					System.out.println(user);
					if(user!=null){
						request.getSession().setAttribute("user", user);
						request.getRequestDispatcher("index1.jsp").forward(request, response);
						
					}else{
						request.getSession().setAttribute("error", "用户名密码不正确");
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}


}

