package com.sxt.serlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.dao.impl.adminDaoImpl;
import com.sxt.serviceImpl.LineServiceImpl;
import com.sxt.serviceImpl.TrainInfoServiceImpl;
import com.sxt.serviceImpl.adminServiceImpl;
import com.sxt.vo.Admin;
import com.sxt.vo.Line;
import com.sxt.vo.TrainInfo;

public class adminServlet extends HttpServlet {
	LineServiceImpl lineservice = new LineServiceImpl();
	adminServiceImpl adminService =new adminServiceImpl();
	TrainInfoServiceImpl traininfo1 = new TrainInfoServiceImpl();
	adminDaoImpl adminDao = new adminDaoImpl();
	public adminServlet() {
		super();
	}

	
	public void destroy() {
		super.destroy(); 
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
          doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action =request.getParameter("action");
		System.out.println(action);
		if("addtrain".equals(action)){
			try {
				addtrain(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	}	
		if ("addLine".equals(action)) {
			try {
				addLine(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}}
		if("login2".equals(action)){
			login2(request,response);
		}if("addAdmin".equals(action)){
			addAdmin(request,response);			
		}if("findall".equals(action)){
			findall(request,response);
		}if("deleteByname".equals(action)){
			deleteByname(request,response);
			}if("findall2".equals(action)){
				findall2(request,response);	}
			if("deleteByt_Id".equals(action)){
				deleteByt_Id(request,response);
			}if("findall3".equals(action)){
				findall3(request,response);}
			if("deteleByName".equals(action)){
				deteleByName(request,response);	
			}
		
		}
	//traininfo 通过车名删除对应的车次  findall3
	private void deteleByName(HttpServletRequest request,
			HttpServletResponse response) {
		String trainName = request.getParameter("name");
		System.out.println(trainName);
		/*TrainInfoServiceImpl  detele = new TrainInfoServiceImpl();*/
		String name = null;
		try {
			boolean b = traininfo1.deleteByName(trainName);
			request.setAttribute("name", b);
			request.getRequestDispatcher("adminServlet?action=findall3").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//traininfo 超找所有的车次
	private void findall3(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			List<TrainInfo> list = traininfo1.findAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("index2.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
    //traininfo 增加车次的方法
	private void addtrain(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		  String trainname = request.getParameter("name");
		  String trainlength = request.getParameter("length");
		  String trainsoft = request.getParameter("soft");
		  String trainhard = request.getParameter("hard");
		  String trainhard_seat = request.getParameter("hard_seat");
		  String trainrestrict_count = request.getParameter("restrict_count");
		  String traintype = request.getParameter("aaa");
		  int le = Integer.parseInt(trainlength);
		  int so = Integer.parseInt(trainsoft);
		  int ha = Integer.parseInt(trainhard);
		  int seat = Integer.parseInt(trainhard_seat);
		  int restrict = Integer.parseInt(trainrestrict_count);
		  System.out.println(traintype);
		  /*int type = Integer.parseInt(trainlength);*/
		  TrainInfo traininfo = new TrainInfo();
		  traininfo.setName(trainname);
		  traininfo.setLength(le);
		  traininfo.setSoft(so);
		  traininfo.setHard(ha);
		  traininfo.setHard_seat(seat);
		  traininfo.setRestrict_count(restrict);
		  traininfo.setTrain_type(traintype);
		  if(traininfo1.findByName(trainname)==null){
			  boolean b = traininfo1.addTrain(traininfo);
		  if(b==true){
			  request.getRequestDispatcher("adminServlet?action=findall3").forward(request, response);
		     }
		  }else{
			  request.setAttribute("error", "车名不能重复");
				request.getRequestDispatcher("adminServlet?action=findall3").forward(request, response);
		  }
		 
		  		 		  
	}


    //line通过火车的t_Id删除
	private void deleteByt_Id(HttpServletRequest request,
			HttpServletResponse response) {
		String t_Id = request.getParameter("t_Id");
		System.out.println(t_Id);
		LineServiceImpl delete = new LineServiceImpl();
		String t_id = null;
		try {
			boolean b = delete.deleteByt_Id(t_Id);
			request.setAttribute("t_id", b);
			request.getRequestDispatcher("adminServlet?action=findall2").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
     //查找所有的线路line
	private void findall2(HttpServletRequest request, HttpServletResponse response) {
		try {
			List<Line> list = lineservice.findAll();
			System.out.println(list);
			request.setAttribute("list", list);
			request.getRequestDispatcher("index3.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
            //增加线路addline
			private void addLine(HttpServletRequest request,
					HttpServletResponse response) throws Exception {
				String t_id2 = request.getParameter("t_id");
				String soft_price = request.getParameter("soft_price");
				String hard_price = request.getParameter("hard_price");
				String hard_seatprice = request.getParameter("hard_seatprice");
				String start = request.getParameter("start");
				String end = request.getParameter("end");
				String start_time = request.getParameter("start_time");
				String end_time = request.getParameter("end_time");
				int t_id3 = Integer.parseInt(t_id2);
				System.out.println(t_id3+"==========");
				Float f1 = Float.parseFloat(soft_price);
				Float f2 = Float.parseFloat(hard_price);
				Float f3 = Float.parseFloat(hard_seatprice);
				
				SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			
				Date date1 =sdf1.parse(start_time);
				Date date = sdf1.parse(end_time);
				System.out.println(t_id3+f1+start+end+date1+date);

				Line line = new Line();
				line.setT_id(t_id3);
				line.setSoft_price(f1);
				line.setHard_price(f2);
				line.setHard_seatprice(f3);
				
				line.setStart_station(start);
				line.setEnd_station(end);
				line.setStart_time(date1);
				line.setEnd_time(date);
					if (lineservice.findt_Id(t_id2)==null) {
						boolean b = lineservice.addLine(line);
						if (b == true) {
								request.getRequestDispatcher("adminServlet?action=findall2").forward(request, response);
							}		
			              }else{
			  				request.setAttribute("error", "id名不能重复");
							request.getRequestDispatcher("adminServlet?action=findall2").forward(request, response);
						   }
		           }
	//admin通过用户名来删除
	private void deleteByname(HttpServletRequest request,
			HttpServletResponse response) {
		String username = request.getParameter("name");
		adminServiceImpl delete = new adminServiceImpl();
		String name = null;
		try {
			boolean b = delete.deleteByname(username);
			request.setAttribute("name", b);
			request.getRequestDispatcher("adminServlet?action=findall").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

   //查找所有的管理员 admin
	private void findall(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			List<Admin> list = adminDao.findAll();
			System.out.println(list);
			request.setAttribute("list", list);
			request.getRequestDispatcher("index4.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

    //管理员的登录方法
	private void login2(HttpServletRequest request, HttpServletResponse response){
		String username = request.getParameter("name");
		String userpwd  = request.getParameter("pwd");
		
		/*System.out.println(request.getAttribute("error"));*/
		System.out.println(username+userpwd);
		try {
			Admin admin = adminService.loginAdmin(username, userpwd);
			/*System.out.println(admin);*/
			if(admin!=null){
				request.getSession().setAttribute("admin", admin);
				request.getRequestDispatcher("adminServlet?action=findall3").forward(request, response);
				
			}else{
				request.setAttribute("error", "用户名密码不正确");
				request.getRequestDispatcher("login2.jsp").forward(request,response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//增加管理员admin
	public void addAdmin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userName= request.getParameter("name");
		String userPwd = request.getParameter("pwd");
		
		/*String aa = new String(userName.getBytes("iso8859-1"),"utf-8");*/
		System.out.println(userName+userPwd);
		Admin admin = new Admin();
		admin.setName(userName);
		admin.setPwd(userPwd);
		try {
			boolean b = adminService.addAdmin(admin);
			if(b=true){
				request.getRequestDispatcher("adminServlet?action=findall").forward(request, response);
				return;
			}
			
		} catch (Exception e) {
			e.printStackTrace();}
		 
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
