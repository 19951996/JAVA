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
    <script type="text/javascript" src="jeDate/jedate.js"></script>    
    <link href="cityselect.css" rel="stylesheet" />
    <script type="text/javascript" src="cityselect.js"></script>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

</head>
<!-- <style>
.add2 td {
  text-align:center;
}
</style> -->
<body>  
 <!--  <script type="text/javascript">
var test=new Vcity.CitySelector({input:'citySelect'});
</script> --> 
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
   <!-- fa fa-desktop   -->               
                    <li> 
                    <a href="adminServlet?action=findall3" ><i class=""></i>添加车次<span class="badge">traininfo</span></a>
                    </li>                  
                    <li class="active-link">
                    <a href="adminServlet?action=findall2"><i class=""></i>添加线路<span class="badge">addline</span></a>
                    </li>
                    <li>
                    <a href="adminServlet?action=findall"><i class=""></i>管理信息<span class="badge">admin</span></a>
                    </li>
                    </ul>
                    </div>
                    </nav>
             <div id="page-wrapper" >
             <div id="page-inner">
             <div class="row">
             <div class="col-md-12">
                <h2>管理员主界面</h2>
                </div>
                 </div> 
                <hr/>
                   <!-- <div style="border: 1px solid black;></div> -->         
            
	        <div class="right" id="div2">
	        <!-- <form method="post" action="LineServlet"> -->
	        <form action="adminServlet?action=addLine" method="post">
	        <input  type="hidden" name="action" value="addLine">
	        <table class="table table-bordered";   border="1px;" cellpadding="0" cellspacing="0" ;>
		    <tr>			
		    <td style="text-align: center;">车次ID</td>
			<td style="text-align: center;">软卧价格</td>
			<td style="text-align: center;">硬卧价格</td>
			<td style="text-align: center;">硬座价格</td>
			<td style="text-align: center;">出发地</td>
			<td style="text-align: center;">目的地</td>
			<td style="text-align: center;">出发时间</td>
			<td style="text-align: center;">到达时间</td>
			<td style="text-align: center;">操作</td>
		    </tr>
		    		 		
		   <tr class="add2">
			<td><input class="form-control" style="width:80px;"  type="text" name="t_id"></td>
		    <td><input class="form-control" style="width:80px;"  type="text" name="soft_price"></td>
		    <td><input class="form-control" style="width:80px;"  type="text" name="hard_price"></td>
		    <td><input class="form-control" style="width:80px;"  type="text" name="hard_seatprice"></td>
			<td><input type="text" style="width:80px;" class="cityinput form-control" id="citySelect"  name="start"></td>
			<td><input type="text" style="width:80px;" class="cityinput form-control" id="citySelect2"  name="end"></td>
		    <td><input class="form-control"style="width:120px;"  type="text" name="start_time"></td>
			<td><input class="form-control"style="width:120px;"  type="text" name="end_time"></td>
			<td><input style="width:100px;"  type="submit" value="添加" class="btn btn-info"></td>
		   </tr>
		    <tr><td><span style="color:red;">${requestScope.error}</span></td> </tr>
	        </table>
	       </form>
	      
	        <div style="/* border: 1px solid black */;  /* height:200px;  */margin-top:10px;width:999px;">
	        <form action="adminServlet?action=findall2" method="post">
	        <table class="table table-bordered,table table-hover"  ;>
		    <c:forEach items="${requestScope.list}" var="s">
		    <tr >
			<td   style="text-align: center; width:100px;height:50px;">${s.t_id}</td>
			<td style="text-align: center; width:100px">${s.soft_price}</td>
			<td style="text-align: center; width:100px">${s.hard_price}</td>
			<td style="text-align: center; width:100px">${s.hard_seatprice}</td>
			<td style="text-align: center; width:100px">${s.start_station}</td>
			<td style="text-align: center; width:100px">${s.end_station}</td>
			<td style="text-align: center; width:145px">${s.start_time}</td>
			<td style="text-align: center; width:144px">${s.end_time}</td>
			<td style="text-align:center; width:100px"><a href="adminServlet?action=deleteByt_Id&t_Id=${s.t_id}" ><button type="button" class="btn btn-danger">删除</button>
			</a></td>
		   </tr>
		   </c:forEach> 
	        </table>
	        </form> 
	         </div> 


	        
	        </div>
            </div>                                   
            </div>
    <div class="footer">          
             <div class="row">
               <div class="col-lg-12" >
               &copy;  2014 yourdomain.com | Design More Templates <a href="http://www.baidu.com/" target="_blank" title="模板之家">中国铁路</a> - Collect from <a href="http://www.baidu.com/" title="网页模板" target="_blank">金楚鹏</a>
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
    <script type="text/javascript">
     var test=new Vcity.CitySelector({input:'citySelect'});
     var test2=new Vcity.CitySelector({input:'citySelect2'});
     
</script>
        
</body>
</html>
