<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jstl/core_rt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE>
<html lang="en">
<head>
	<base href="<%=basePath%>">
	<meta charset="UTF-8">
	<title>网上订票</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
<div style="height: 950px; background: #fff; width: 970px; margin: 0 auto;">
	<header>
		<div class="head1">
			<img src="images/44.gif">
		</div>
		<div class="head2">
			<div class="div3" style="margin-top: -15px; margin-left: -15px;">
			<ul>
				<li id="timeShow" style="color: #FFFF99;"></li>
			</ul>	
			</div>
			<div  class="div2">	
				<ul>
					<li class="hover"><a href="#">首页</a></li>
					<li class="line">&nbsp;</li>
					<li class="link"><a href="myUserServlet?action=findByname&username=${sessionScope.user.username}">我的订单</a></li>
					<li class="line">&nbsp;</li>
					<li class="link"><a href="TrainCommon.jsp">铁路常识</a></li>
					<li class="line">&nbsp;</li>
					<li class="link"><a href="#">车站引导</a></li>
					<li class="line">&nbsp;</li>
					<li class="link"><a href="#">站车风采</a></li>
				</ul>
			</div>
		
			<div class="div4" style="margin-top: -15px;">
				<ul>
					<li><a href="register.jsp">注册</a></li>
					<li><a href="login.jsp">登录</a></li>
					<li><a href="login2.jsp">管理员登录</a></li>
					
				</ul>
			</div>
		</div>
	</header>
	<div class="content">
		
		<div class="left">
			<div class="left3" id="left3">
				<img src="images/318.gif">
			</div>
			<div>
				<div class="left1">
					<ul>
						<li><img src="images/zhuce.png"></li>
						<li><img src="images/yupiao.png"></li>
						<li><img src="images/goupiao.png"></li>
						<li><img src="images/tuipiao.png"></li>
						<li><img src="images/zhengwandian.png"></li>
						<li><img src="images/shikebiao.png"></li>
					</ul>
				</div>
				<div class="left2">
					<ul>
						<li><a href="register.jsp">网上购票用户注册</a></li>
						<li><a href="">余票查询</a></li>
						<li><a href="buy.jsp">购票</a></li>
						<li><a href="">退票</a></li>
						<li><a href="gai.jsp">改签</a></li>
						<li><a href="">常见问题</a></li>
					</ul>
				</div>
				<div>
					<img style="margin-top: -15px;" src="images/kefudianhua.png"/>
				</div>
			</div>
		</div>
		<div class="center">
			<div class="center1">
				<img src="images/123.jpg">
			</div>
			<div class="center2">
				<div>
					<ul>
						<li class="center23" id = "li1" onclick="li11(li1,div1)">余票动态信息</li>
						<li class="center24" id = "li2" onclick="li11(li2,div2)">网上购票常见问题</li>
					</ul>
				</div>
				<div class="clear"></div>
				<div  id = "div1" class="center21">
					<table border = "1" bordercolor="red" cellpadding="0" cellspacing="0" class="table">
						<tr class="table1">
							<td>出发地</td>
							<td>目的地</td>
							<td >${GetDay.today}</td>
							<td >${GetDay.first}</td>
							<td >${GetDay.second}</td>
							<td >${GetDay.third}</td>
						</tr>
						<c:forEach items = "${requestScope.list}"  var = "station">
						<tr>
							<td>${station.start_station}</td>
							<td>${station.end_station}</td>
							<td>${station.today}</td>
							<td>${station.first}</td>
							<td>${station.second}</td>
							<td>${station.third}</td>
						</tr>
						</c:forEach>
						<tr >
							<td colspan="5" style="color: red;">余票张数为全部席别的总数</td>
							<td style="font-size: 12px;"><a href="">查看更多>></a></td>
						</tr>
						
					</table>
				</div>
				<div id = "div2"  class="center22">
					2
				</div>
			</div>
		</div>
		
		<div class="right">
			<div class="right1">
				<img src="images/220.jpg">
			</div>
			<div class="right3">
				<img src="images/130_1.jpg">
			</div>
			<div class="right2">
				<div class="right21">
	                <ul>
	                    <li><a href="http://www.gov.cn" target="_blank">中央政府门户网站</a>
	                    </li>
	                    <li><a href="http://www.fmprc.gov.cn" target="_blank">外交部</a>
	                    </li>
	                    <li><a href="http://www.sdpc.gov.cn" target="_blank">发展改革委</a>
	                    </li>
	                    <li><a href="http://www.moe.edu.cn" target="_blank">教育部</a>
	                    </li>
	                    <li><a href="http://www.most.gov.cn" target="_blank">科技部</a>
	                    </li>
	                    <li><a href="http://www.seac.gov.cn" target="_blank">国家民委</a>
	                    </li>
	                    <li><a href="http://www.mps.gov.cn" target="_blank">公安部</a>
	                    </li>
	                    <li><a href="http://www.mos.gov.cn" target="_blank">监察部</a>
	                    </li>
	                    <li><a href="http://www.mca.gov.cn" target="_blank">民政部</a>
	                    </li>
	                    <li><a href="http://www.legalinfo.gov.cn" target="_blank">司法部</a>
	                    </li>
	                    <li><a href="http://www.mof.gov.cn" target="_blank">财政部</a>
	                    </li>
	                    <li><a href="http://www.mohrss.gov.cn" target="_blank">人力资源和社会保障部</a>
	                    </li>
	                    <li><a href="http://www.mlr.gov.cn" target="_blank">国土资源部</a>
	                    </li>
	                    <li><a href="http://www.mep.gov.cn" target="_blank">环境保护部</a>
	                    </li>
	                    <li><a href="http://www.cin.gov.cn" target="_blank">住房和城乡建设部</a>
	                    </li>
	                    <li><a href="http://www.moc.gov.cn" target="_blank">交通运输部</a>
	                    </li>
	                    <li><a href="http://www.mwr.gov.cn" target="_blank">水利部</a>
	                    </li>
	                    <li><a href="http://www.agri.gov.cn" target="_blank">农业部</a>
	                    </li>
	                    <li><a href="http://www.mofcom.gov.cn" target="_blank">商务部</a>
	                    </li>
	                    <li><a href="http://www.ccnt.gov.cn" target="_blank">文化部</a>
	                    </li>
	                    <li><a href="http://www.moh.gov.cn" target="_blank">卫生部</a>
	                    </li>
	                    <li><a href="http://www.chinapop.gov.cn" target="_blank">人口计生委</a>
	                    </li>
	                    <li><a href="http://www.pbc.gov.cn" target="_blank">人民银行</a>
	                    </li>
	                    <li><a href="http://www.audit.gov.cn" target="_blank">审计署</a>
	                    </li>
	                    <li><a href="http://www.cdpf.org.cn" target="_blank">中国残联网站</a>
	                    </li>
	                    <li><a href="http://www.tytlj.com" target="_blank"> 太原铁路局 </a>
	                    </li>
	                    <li><a href="http://www.whrailway.cn" target="_blank">武汉铁路局 </a>
	                    </li>
	                    <li><a href="http://www.shrail.com" target="_blank"> 上海铁路局 </a>
	                    </li>
	                    <li><a href="http://www.gzrailway.com.cn" target="_blank"> 广铁(集团)公司</a>
	                    </li>
	                    <li><a href="http://www.crscsc.com.cn" target="_blank"> 中铁特货运输有限责任公司</a>
	                    </li>
	                    <li><a href="http://www.95572.com" target="_blank"> 中铁快运股份有限责任公司 </a>
	                    </li>
	                    <li><a href="http://www.crct.com" target="_blank"> 中铁集装箱运输有限责任公司 </a>
	                    </li>
	                    <li><a href="http://www.crs.org.cn" target="_blank"> 中国铁道学会 </a>
	                    </li>
	                    <li><a href="http://home.rails.com.cn" target="_blank"> 中国铁道科学研究院 </a>
	                    </li>
	                    <li><a href="http://www.rmtd.com.cn" target="_blank"> 人民铁道报社 </a>
	                    </li>
	                    <li><a href="http://www.tdpress.com/" target="_blank">中国铁道出版社</a>
	                    </li>
	                    <li><a href="http://www.rebcenter.com/" target="_blank">铁道部工程交易中心</a>
	                    </li>
	                    <li><a href="http://www.bj-railwayhotel.com.cn/" target="_blank">北京铁道大厦</a>
	                    </li>
	                    <li><a href="http://www.china-railway.com.cn/gfwb/" target="_blank">中国铁路官方微博</a>
	                    </li>
						<li><a href="http://www.china-ric.com" target="_blank">中国铁路保险</a>
	                    </li>			
	                </ul>
				</div>
			</div>
			
		</div>
	</div>
	<div class="foot">
		<div class="foot1" >
			<div style="margin-left: -40px;">
				<ul>
					<li><a href="">关于我们</a></li>
					<li>|</li>
					<li><a href="">网站声明</a></li>
				</ul>
			</div>
		
		</div>
		<div align="center">
			版权所有
		</div>
	</div>
</div>
</body>
 <script type="text/javascript">
 	function li11(id,div){
 		div1.className="center22";
 		div2.className="center22";
 		div.className="center21"
 		li1.className="center24";
 		li2.className="center24";
 		id.className="center23";
 	}
 	var t = null;
function time(){
 var dt = new Date();
 var y=dt.getFullYear();
 var m= dt.getMonth()+1;
 var d= dt.getDate();
 var day=dt.getDay();
  var week="";                               
  if (day==0) week='星期日';
  if (day==1) week='星期一';
  if (day==2) week='星期二';
  if (day==3) week='星期三';
  if (day==4) week='星期四';
  if (day==5) week='星期五';
  if (day==6) week='星期六';
 document.getElementById("timeShow").innerHTML= y+"年"+m+"月"+d+"日"+week+"";
 
 t = setTimeout(time,1000);    
} 
window.onload=function(){time()}
  
    </script>
</html>