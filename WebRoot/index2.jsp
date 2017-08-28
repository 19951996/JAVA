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
   
</head>


<body>
     
           
          
    <div id="wrapper">
         <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="adjust-nav">
                <div class="navbar-header">
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
        <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                 


                    <li class="active-link">
                        <a href="adminServlet?action=findall3" ><i class=""></i>添加车次<span class="badge">traininfo</span></a>
                    </li>                  
                    <li>
                        <a href="adminServlet?action=findall2"><i class=""></i>添加线路<span class="badge">addline</span></a>
                    </li>
                    <li>
                        <a href="adminServlet?action=findall"><i class=""></i>管理信息<span class="badge">admin</span></a>
                    </li> 
                </ul>
                            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-lg-12">
                     <h2>管理员主界面</h2>   
                    </div>
                </div>              
                  <hr/>
                
               <div class="right" id="div1" style="">
               <form action="adminServlet?action=addtrain" method="post">
		<table class="table table-bordered,table table-hover" ; >
			<tr>
			    <td>车次ID</td>
				<td style="text-align: center;">车名</td>
				<td style="text-align: center;">车长</td>
				<td style="text-align: center;">软卧个数</td>
				<td style="text-align: center;">硬卧个数</td>
				<td style="text-align: center;">硬座个数</td>
				<td style="text-align: center;">总票数</td>
				<td style="text-align: center;">车次类型</td>
				<td style="text-align: center;">操作</td>
			</tr>
			<tr class="add">
			    <td><span style="color:red;">${requestScope.error}</span></td> 
				<td><input class="form-control" style="width:100px;" type="text" name="name"></td>
				<td><input class="form-control" style="width:100px;" type="text" name="length"></td>
				<td><input class="form-control" style="width:100px;" type="text" name="soft"></td>
				<td><input class="form-control" style="width:100px;" type="text" name="hard"></td>
				<td><input class="form-control" style="width:100px;" type="text" name="hard_seat"></td>
				<td><input class="form-control" style="width:100px;" type="text" name="restrict_count"></td>
				<td>
				 <select class="form-control" style="width:100px;" name="aaa">
            <option value="动车" >动车</option>
            <option value="特快" >特快</option>
            <option value="快车" >快车</option>
            <option value="普快" >普快</option>
               </select></td>
				<td><input style="width:100px;"type="submit" name="" value="添加" class="btn btn-info"></td>
			</tr>
			 
		</table>
		 </form>
	</div>
        
          <form action="adminServlet?action=findall3">        
          <table style="margin-top: -20px;" class="table table-bordered,table table-hover";>
           <c:forEach items="${requestScope.list}" var="s">
           <tr>
           <td >${s.t_id}</td>
           <td style="text-align: center;"><p style="margin-left:-13px;">${s.name}</p></td>
           <td style="text-align: center;">${s.length}</td>
           <td style="text-align: center;">${s.soft}</td>
           <td style="text-align: center;">${s.hard}</td>
           <td style="text-align: center;">${s.hard_seat}</td>
           <td style="text-align: center;">${s.restrict_count}</td>
           <td style="text-align: center;">${s.train_type}</td>
           <td style="text-align:center; width:130px"><a href="adminServlet?action=deteleByName&name=${s.name}" class="btn btn-danger">删除</button>
           </tr>
           </c:forEach>
          </table>
                </form>     
    </div>
             
            </div>
        </div>
    <div class="footer">
      
    
            <div class="row">
                <div class="col-lg-12" >
                    &copy;  2014 yourdomain.com | More Templates <a href="http://www.cssmoban.com/" target="_blank" title="中国铁路">中国铁路</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">金楚鹏</a>
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
