<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>铁路客户服务中心--我的用户</title>
	<link rel="stylesheet" type="text/css" href="css/buystyle.css">
</head>
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
  <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
	*{
		margin: 0;
		padding: 0;
	}
	
	.weizhi{
		width: 960px;
		height: 20px;
		margin: 0 auto;
		margin-top: 15px;
	}
	.main{
		width: 960px;
		height: 560px;
		margin: 0 auto;
		margin-top: 10px;
	}
	.left{
		width: 200px;
		height: 560px;
		border: 1px solid #1678BE;	
		margin: 0 auto;
		float: left;
		background: #EEF1F8;
	}
	.right{
		width: 738px;
		height: 560px;
		border: 1px solid #1678BE;
		margin: 0 auto;
		float: right;

	}
	.left1{
		width: 200px;
		height: 32px;
		border: 1px solid #1678BE;
		background: #478DCD;
		line-height: 32px;;
	}
	.left2{
		width: 200px;
		height: 528px;
		border: 1px solid #1678BE;
	}
	.right1{
		width: 738px;
		height: 32px;
		border: 1px solid #1678BE;
		background: #478DCD;
		line-height: 32px;
	}
	.right2{
		width: 738px;
		height: 528px;
		border: 1px solid #1678BE;
	}
	.left2 div{
		height: 70px;
		width: 200px;
		text-align: center;
		margin-top: 30px;
	}
	.left2 div:hover{
		color: #478DCD;
		cursor:pointer;

	}
	.right25 img{
		width: 735px;
	}
	.right26 img{
		width: 735px;
	}
	.anniu{
		width: 65px;
		margin: 0 auto;
	}
	
</style>
<script type="text/javascript">
		function over(id){
			
			for (var i=0;i<=5;i++){
				if(i==id){
					var li = document.getElementById("div"+id);
					var rt = document.getElementById("rt"+id);
					rt.style.display="block"
					li.style.display="block";
				}else{
					var li = document.getElementById("div"+i);
					li.style.display="none";
					var rt = document.getElementById("rt"+i);
					rt.style.display="none"
				}
			}
		}
		function losemouse(){
			var sfz = document.getElementById("sfz").value;
			var reg = /(^\d{15}$)|(^\d{17}(\d|X)$)/;  
    		if(reg.test(sfz) === false){
    			alert('您的身份证校验位不正确,请重新输入');  
    		}
		}
		function losemouse1(){
			var xm = document.getElementById("xm").value;
			if(xm==""||xm==null){
    			alert('姓名不能为空');
    		}
		}
		function losemouse2(){
			var nl = document.getElementById("nl").value;
			if(nl==""||nl==null){
    			alert('年龄不能为空');
    		}
		}
		
	</script>
<body>
	<head>
  <meta charset="UTF-8">
  <title>火车购票</title>
 
  <link rel="stylesheet" type="text/css" href="css/buystyle.css">
  <script type="text/javascript" src="laydate/laydate.js"></script>
  <link rel="stylesheet" href="css/cityselect.css">
  <script type="text/javascript" src="js/cityselect.js"></script>
</head>
<style type="text/css">

</style>

<body>
  <head>
    <div class="head" name="top">
      <div class="head1">
        <div style="margin-top: 8px; float: left;">
          <img src="images/buy.png">
        </div>
        <div class="head11">
            <li style="font-size: 13px;list-style: none; margin-right: 20px;margin-top: 5px;">意见反馈:<a style="text-decoration: none;color: red;">12306yjfk@rails.com.cn</a> 您好， <a style="text-decoration: none;color: red;">${sessionScope.user.username}</a></li>
            <div class="head12">
              <div class="head13">
                <ul style="margin-left: 40px;">
                  <li><a href="index.jsp">首&nbsp&nbsp页</a></li>
                  
                  <li><a href="buy.jsp">车票预订</a></li>
                  <li><a href="gai.jsp">车票改签</a></li>
                  <li><a href="#">投诉建议</a></li>
                </ul>
              </div>
            </div>
        </div>
      </div>
    </div>
  </head>
	<div class="weizhi">您现在的位置：> <a href="#">首页</a>我的用户</div>
	<div class="main">
		<div class="left">
				<div class="left1">
					<div class="left11" style="margin-left: 10px; color: white" >我的用户</div>
				</div>
				<div class="left2">
					<div class="left21" id="l1" onclick="over(1)">我的火车票</div>
					<div class="left21" id="l2" onclick="over(2)">个人信息</div>
					<div class="left21" id="l3" onclick="over(3)">常用信息管理</div>
					<div class="left21" id="l4" onclick="over(4)">温馨服务</div>
					<div class="left21" id="l5" onclick="over(5)">投诉和建议</div>

				</div>
		</div>
		<div class="right">
				<div class="right1">
					<div class="right11" id	="div0" style="margin-left: 10px; color: white; display: block;">系统信息</div>
					<div class="right12" id	="div1" style="margin-left: 10px; color: white; display: none;">我的火车票</div>
					<div class="right13" id	="div2" style="margin-left: 10px; color: white; display: none;">个人信息</div>
					<div class="right14" id	="div3" style="margin-left: 10px; color: white; display: none;">常用信息管理</div>
					<div class="right15" id	="div4" style="margin-left: 10px; color: white; display: none;">温馨服务</div>
					<div class="right16" id	="div5" style="margin-left: 10px; color: white; display: none;">投诉和建议</div>	
				</div>
			<div class="right2">
				<div class="right21" id	="rt0" style="display: block;">
					<div class="right211" style="float: left;">
						<img src="images/hi.png" alt="" style="margin-top: 0; margin-left: 0">
					</div>
					<div class="right212" style="margin-top: 70px; float: left;">
						<h3>
							尊敬的用户，您好！
						</h3>
						<p>欢迎您登录中国铁路客户服务中心网站。</p>
						<p style="color: red">如果您的密码在其他网站也使用，建议您修改本网站密码。</p>
						<p>如果您要接受12306的服务邮件，请验证邮箱。</p>
						<p style="color: red">完成手机双向核验，即可使用手机号码直接登录的新服务，解除您</p>
						<p style="color: red">遗忘用户名的烦恼。</p>
					</div>
					<div style="margin-right: 10px;">
						<img src="images/train.png" alt="">
					</div>
				</div>

				
					
				
				<div class="right22" id	="rt1" style="display: none;">
				<c:forEach var="list" items="${requestScope.list}">
				
					<table border="1" cellspacing="0" cellpadding="0" borderColor="#3498D5" style="width: 700px; margin: 20px auto; text-align: center;">
						
						<tr>
							<td>姓名</td>
							<td>身份证</td>
							<td>车id</td>
							<td>始发站点</td>
							<td>终点站点</td>
							<td>票价</td>
							<td>操作</td>
						</tr>
							
						<tr>
							<td>${list.name}</td>
							<td>${list.idcard}</td>
							<td>${list.t_id}</td>
							<td>${list.start_station}</td>
							<td>${list.end_station}</td>
							<td>${list.fares}</td>
							<td rowspan="3"><a style="display: block; height: 25px;width: 70px;background:  #208FFF;margin-left: 20px;color: #fff;padding-top: 8px;" onclick="hh()" href="myUserServlet?action=delete&date=${list.start_time}&idcard=${list.idcard}&start=${list.start_station}">退票</a></td>
						</tr>
						
						<tr>
							<td>发车时间</td>
							<td>到站时间</td>
							<td>车厢号</td>
							<td>座位号</td>
							<td>车票类型</td>
							<td></td>
						</tr>
							
						<tr>
							<td>${list.start_time}</td>
							<td>${list.end_time}</td>
							<td>${list.carriage_id}</td>
							<td>${list.seat_id}</td>
							<td>${list.ptype}</td>
							<td></td>
						</tr>
						
					</table>
					</c:forEach>
				</div>
				<div class="right23" id	="rt2" style="display: none;">
					<div>
						<div>
							<img src="images/jbxx.png" alt="">
						</div>
						<div class="table1">
							<c:forEach var="lists" items="${requestScope.lists}">
							<table class="table table-striped">
							<tr>
								<td align="right">用户名：</td>
								<td>${lists.username}</td>
							</tr>
							<tr>
								<td align="right">姓名：</td>
								<td>${lists.loginname}</td>
							</tr>
							
							<tr>
								<td align="right">证件号码：</td>
								<td>${lists.cardnum}</td>
							</tr>
							<tr>
								<td align="right">旅客类型：</td>
								<td>${lists.passengerType}</td>
							</tr>
							
							<tr>
								<td align="right">手机号码：</td>
								<td>${lists.phone}</td>
							</tr>
							<tr>
								<td align="right">电子邮箱：</td>
								<td>${lists.message}</td>
							</tr>
							<tr>
								<td align="right">所在地：</td>
								<td>${lists.province_code}</td>
								</tr>
							</table>
							</c:forEach> 
						</div>
					</div>
				</div>
				

				<div class="right24" id	="rt3" style="display: none;">
					<c:forEach var="rider" items="${requestScope.rider}">
					<table border="1" cellspacing="0" cellpadding="0" borderColor="#3498D5" style="width: 700px; margin: 20px auto; text-align: center;">
						<tr>
							<td>姓名</td>
							<td>性别</td>
							<td>身份证号码</td>
							<td>年龄</td>
							<td>操作</td>
						</tr>
						<tr>
							<td>${rider.name }</td>
							<td>${rider.sex}</td>
							<td>${rider.idcard}</td>
							<td>${rider.age}</td>
							<td><button onclick='del("${rider.idcard}")'>删除</button></td>
						</tr>
					</table>
					</c:forEach>
					<form action="myUserServlet?action=insertRider" method="post">
					<table class="table table-bordered" >
						<tr>
							<td>姓名</td>
							<td>
								<input type="text" name="name" id = "xm" onblur="losemouse1()">
							</td>
							<td>性别</td>
							<td>								
									<input type="radio" name="sex" checked="checked" value="男">男
									<input type="radio" name="sex" value="女">女
							</td>
						</tr>
						<tr>
							<td>身份证号码</td>
							<td>
								<input type="text" name="idcard" id="sfz" onblur="losemouse()">
							</td>
							<td>年龄</td>
							<td>
								<input type="text" name="age" id = "nl" onblur="losemouse2()">
							</td>
						</tr>
						<tr><td colspan="4"><span style="color:red;">${requestScope.error }</span></td></tr>
					</table>
					<div class="anniu">
						<input type="submit"   value="添加乘客" style="background:#3498D5; width:80px; height: 25px;">
					</div>
					</form>
					
				</div>
				



				<div class="right25" id	="rt4" style="display: none;">
					<img src="images/wxfw.png" alt="">
				</div>
				<div class="right26" id	="rt5" style="display: none;">
					<img src="images/tsjy.png" alt="">
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	function hh(){
		if (confirm("确认删除订单")) {
			
		}else{
			
		}
	}
	
	function del(id){
		location.href="myUserServlet?action=delRider&idcard="+id;
	}
</script>
</body>

</html>