package com.sxt.serlet;


import java.io 

.IOException;
import java.io 

.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.serviceImpl.userServiceImpl;


public class AjaxServlet extends HttpServlet {

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action=request.getParameter("action");
		System.out.println(action);
		if("checkName".equals(action)){
			checkNameAjax(request,response);
		}
		
		
	}
	
		
	


	public void checkNameAjax(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String username=request.getParameter("username");
			//调用Service,dao层 查询是否存在
//			boolean b=true;
//			//服务器响应AJAX的数据回去
			
			userServiceImpl s=new userServiceImpl();
			try {
				if(s.registerFindName(username)==null||"".equals(s.registerFindName(username))){
					System.out.println("ppp");
					PrintWriter out=response.getWriter();
					out.write("true");
					}else{
						System.out.println("s");
						PrintWriter out=response.getWriter();
						out.write("false");
					}
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}	//userinfo user=new userinfo("ddd","1111","1111","1111","1111","1111","1111","1111");
			//PrintWriter out=response.getWriter();
			//fastjson.jar 将java对象转为JSON字符串
			
			//out.write(JSON.toJSON(user).toString());
	
	public void init() throws ServletException {
		// Put your code here
	}

}