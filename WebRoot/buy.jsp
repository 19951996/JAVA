<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
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
            <li style="font-size: 13px;list-style: none; margin-right: 20px;margin-top: 5px;">意见反馈:<a style="text-decoration: none;color: red;">12306yjfk@rails.com.cn</a> 您好， <a href="MyUser.html" style="text-decoration: none;color: red;">李婷</a></li>
            <div class="head12">
              <div class="head13">
                <ul>
                  <li><a href="index.html">首&nbsp&nbsp页</a></li>
                  <li><span>车票预订</span></li>
                  <li><a href="gai.html">车票改签</a></li>
                  <li><a href="MyUser.html">投诉建议</a></li>
                </ul>
              </div>
            </div>
        </div>
      </div>
    </div>
  </head>
  <div class="system">
    <ul>
      <li>
        出发地：<input type="text" placeholder="北京" id="citySelect" name="">
      </li>
      <li>
        目的地：<input type="text" placeholder="上海" id="citySelect1" name="">
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
          <td style="width: 75px;"><span onclick="check()" id="spa">预订</span></td>
        </tr>
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
          <td style="width: 75px;"><span onclick="check()" id="spa">预订</span></td>
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
 <div  id ="tr1" class="jue">
    <table border="0" cellspacing="0" cellpadding="1" bordercolor="#B0CEDD" style="position: absolute; top: 20%; left: 15%; border-bottom: 0" >
        <tr style="">
          <td  style="width: 955px; background: #fff;border-bottom: 1px solid red;">
            <p style="float: left;">姓名：李婷&nbsp&nbsp性别：女&nbsp&nbsp证件类型：二代身份证&nbsp&nbsp证件号码：444444444444444444&nbsp&nbsp旅客类型：成人</p><span style="float: right;margin-top: 10px;">购买</span>
            
          </td>          
        </tr>
        <tr style="border-bottom: 1px;">
          <td  style="width: 955px; background: #fff;">
            <p style="float: left;">姓名：李婷&nbsp&nbsp性别：女&nbsp&nbsp证件类型：二代身份证&nbsp&nbsp证件号码：444444444444444444&nbsp&nbsp旅客类型：成人</p><span style="float: right;margin-top: 10px;">购买</span>
            
          </td>          
        </tr>
        <tr style="border: 0">
          <td style="border: 0;padding-top: 10px;">
            <span style="margin: 0px auto;" onclick="hh()">收起</span>
          </td>
          
        </tr>
        
      </table>
      
  </div>
</body>
<script type="text/javascript">
var test=new Vcity.CitySelector({input:'citySelect'});
var test1=new Vcity.CitySelector({input:'citySelect1'});
function check(){
  
  if (tr1.style.display=="block") {
    tr1.style.display="none";
    
  }else{
    tr1.style.display="block";
    
  }
  
}
function hh(){
  if (tr1.style.display=="block") {
    tr1.style.display="none";
    
  }else{
    tr1.style.display="block";
    
  }
}
</script>
</html>