<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Simple Responsive Admin</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
   <script type="text/javascript">
   setInterval("jnkc.innerHTML=new Date().toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());",1000);
   </script>
</head>
<style>
.right ul li{
     margin-top: 20px;
	text-align: center;
	list-style: none;

}
.iii{
  width:400px;
  text-align:center;
  height:50px;

}
/* .sidebar-collapse ul li{
margin-top:20px;
} */

</style>
<body>
     
           
          
    <div id="wrapper" >
         <div class="navbar navbar-inverse navbar-fixed-top"  >
            <div class="adjust-nav">
                <div class="navbar-header" >
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">
                        <img src="assets/img/130_1.jpg" />
                    </a>
                </div>
              
                 <span class="logout-spn" >
                  <a href="#" style="color:#fff;">欢迎进入管理员界面</a>  

                </span>
            </div>
        </div>
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse" >
                <ul class="nav" id="main-menu">          
                    <li >
                    <a href="adminServlet?action=findall3" ><i class=""></i>添加车次<span class="badge">traininfo</span></a>
                    </li>          
                    <li>
                    <a href="adminServlet?action=findall2"><i class=""></i>添加线路<span class="badge">addline</span></a>
                    </li>
                    <li class="active-link">
                    <a href="adminServlet?action=findall"><i class=""></i>管理信息<span class="badge">admin</span></a>
                    </li>
                </ul>
                </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" style="height:500px;">
            <div id="page-inner" style="height:500px;">
                <div class="row" >
               
                    <div class="col-md-12" >
                     <h2>管理员主界面</h2>  
                    </div>
                </div>              
              
                  <hr />
             <div style="border: 1px solid black; " >
                  <div style="/* border: 1px solid black; height:100px; */">
                 <h3 class="rr" style="text-align:center;">当前时间<div id="jnkc"><div/></h3>
                  </div>
        <form action="adminServlet?action=findall"method="post">
        <table class="table table-bordered,table table-hover" >
			<tr class="rr">
				<td class="iii">管理员登录名</td>
				<td class="iii">管理员密码</td>
				<td class="iii">操作</td>
			</tr >
			 <c:forEach items="${requestScope.list}" var="s"> 
			<tr class="rr">
				<td class="iii">${s.name}</td>
				<td class="iii">${s.pwd}</td>
				<td class="iii"><a href="adminServlet?action=deleteByname&name=${s.name}"><button type="button" class="btn btn-danger">删除</button></a></td>
			</tr>
			</c:forEach>
			
			</table>
		</form>
                  </div>
            <form method="post" action="adminServlet?action=addAdmin" >
	        <div class="right" id="div3" style="border: 1px solid black;margin-top:10px;background:#EEF1F8;">
  
		    <ul style="margin-top:10px;text-align: center;">
			<li><input style="width:200px; float:left;margin-left: 50px;"  type="text" name="name" class="form-control" placeholder="管理登录名"></li>
			<li><input style="width:200px; float:left;margin-left: 170px;" type="text" name="pwd" class="form-control" placeholder="管理员密码"></li>
			<li><input style="margin-left:10px;" type="submit" name="" value="添加" class="btn btn-primary"></li>
			<!-- <input style="margin-left:80px;" type="submit" name="" value="添加"> -->
		</ul>
	</div>
	</form>  
                       
    </div>            
            </div>
        </div>
    <div class="footer">
      
    
             <div class="row">
                <div class="col-lg-12" >
                    &copy;  2014 yourdomain.com | Design More Templates <a href="http://www.cssmoban.com/" target="_blank" title="中国铁路">中国铁路</a> - Collect from <a href="http://www.cssmoban.com/" title="我最帅" target="_blank">金楚鹏</a>
                </div>
        </div>
        </div>
          

     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
   
</body>
</html>
