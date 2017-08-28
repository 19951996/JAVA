<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
  <meta charset="UTF-8">
  <title>火车票改签</title>
 <base href="<%=basePath%>">
  <link rel="stylesheet" type="text/css" href="css/buystyle.css">
  <script type="text/javascript" src="laydate/laydate.js"></script>
  
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
            <li style="font-size: 13px;list-style: none; margin-right: 20px;margin-top: 5px;">意见反馈:<a style="text-decoration: none;color: red;">12306yjfk@rails.com.cn</a> 您好， <a style="text-decoration: none;color: red;">李婷</a></li>
            <div class="head12">
              <div class="head13">
                <ul>
                  <li><a href="index1.jsp">首&nbsp&nbsp页</a></li>
                  <li><a href="buy.jsp">车票预订</a></li>
                  <li><span>车票改签</span></li>
                  
                  <li><a href="MyUser.jsp">投诉建议</a></li>
                </ul>
              </div>
            </div>
        </div>
      </div>
    </div>
  </head>
  <div class="system">
    <ul>
      <li style="margin-top: 16px;padding-right: 15px;">
        出发地：北京
      </li>
      <li style="margin-top: 16px;padding-right: 15px;">
        目的地：上海
      </li>
      <li style="margin-top: 16px;padding-right: 15px;">
        乘客：李婷 
      </li>
      <li>
        出发日：<input onClick="laydate()">
      </li>
      <!-- 城市 -->
      <div id="in_city" style="display: none"></div>
    </ul>
    <div style="float: left;margin-top: 25px;margin-left: 20px;">
      <span >查询</span>
    </div>
  </div>
  <div class="bott">
    <div style="width: 960px;margin: 10px auto;font-weight: bold;font-size: 13px;">
      北京 --> 哈尔滨（9月17日  周日）共计15个车次
    </div>
    <div class="bott1">
      <ul>
        <li>车次</li>
        <li>出发站</li>
        <li>到达站</li>
        <li>出发时间</li>
        <li>到达时间</li>
        <li>历时</li>
        <li>软卧</li>
        <li>硬卧</li>
        <li>硬座</li>
        <li>无座</li>
        <li style="border-right: #3498D5">备注</li>
      </ul>
    </div>
    <div class="bott2">
      <table border="1" cellspacing="0" cellpadding="1" bordercolor="#B0CEDD" >
        <tr>
          <td style="width: 74px;">1111</td>
          <td style="width: 90px;">1111</td>
          <td style="width: 90px;">1111</td>
          <td style="width: 105px;">1111</td>
          <td style="width: 105px;">1111</td>
          <td style="width: 75px;">11111</td>
          <td style="width: 75px;">1111</td>
          <td style="width: 75px;">1111</td>
          <td style="width: 75px;">1111</td>
          <td style="width: 75px;">1111</td>
          <td style="width: 75px;"><span>改签</span></td>
        </tr>
      </table>
    </div>
  </div>
  
    <div class="foot" >
      
        <ul>
          <li><a href="">关于我们</a></li>
          <li>|</li>
          <li><a href="">网站声明</a></li>
        </ul>
      <div align="center" style="margin-top: 0;">
      版权所有
      </div>
    </div>
    <div class="pos">
      <a href="#top"><img src="images/66.png" ></a>
    </div>
 
</body>
<script type="text/javascript">
var test=new Vcity.CitySelector({input:'citySelect'});
var test1=new Vcity.CitySelector({input:'citySelect1'});

</script>
</html>