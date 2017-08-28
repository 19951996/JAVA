<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

  <meta charset="UTF-8">
    <title>注册</title>
</head> 
 <script src="js/jquery-1.8.2.js">
 
 </script>
<style type="text/css">
    body{
        background: #E5E5E5;
    }
    .message{
        margin: 0 auto;
       
        /*background-image: url(images/88.jpeg); */
        background: #eef1f8;
        margin-top: 30px;
        background-size: 100% 100%;
        width: 700px;
        height: 550px;

    }
    ul li{
        list-style-type: none;
    }
    .lay-hd{
        font-size: 30px;
        background: #337AB7;
        background-size: 100%;
        color:#fff;
    }


</style>
  <body>

  <div class="message">
 <form id="registForm" method="post"  action="userServlet?action=register" onsubmit="return hhh()">
 <div class="lay-hd" >账户信息</div>

    <ul>
        <li>
            <div class="label"><span class="required">*</span>
            用户名：</div>
            <input placeholder="请输入用户名" type="text" name="username" id="username"   maxlength="25" onblur="goAjax()">
            <span id="span1" style="color: red;">请输入3-16位用户名，可包含数字、字母、下划线   </span>
        </li>
        <li>
            <div class="label"><span class="required">*</span>
            登录密码：</div>
            <input placeholder="请输入密码" type="password" name="password" id="password"  onblur="bb()" maxlength="25">
            <span id="span2" style="color: red">请输入4-17位密码 </span>
        </li>
            <div class="label"><span class="required">*</span>
            确认密码：</div>
            <input placeholder="再次输入您的登录密码"  name="confirmPassWord" id="confirmPassWord" type="password" maxlength="25" onblur="bbb()"/>
            <span id="span3" style="color: red">请再确认一次密码</span>
         </li>
        <li>
            <div class="label"><span class="required">*</span>
            请输入姓名：</div>
            <input placeholder="请输入姓名" type="text"  name="loginname" id="loginname" onblur="cc()" maxlength="25" />
            <span id="span4" style="color: red">~</span>
            <div class="tips" id="name_rule"><a style="color: #FF7F00;text-decoration: underline;" shape="rect">姓名填写规则</a>
            
         </li>
        
 
         <li>
            <div class="label"><span class="required">*</span>
            证件号码：</div>
            <input placeholder="请输入您的证件号码"  name="cardnum" id="cardnum" type="text" maxlength="25"  onblur="dd()"/>
            <span id="span5" style="color: red">~</span>
         </li>
         <li>
            <div class="label"><span class="required"></span>
            邮箱：</div>
            <input placeholder="请输入您的邮箱"  name="message" id="message" type="text" maxlength="25" onblur="ee()" />
            <span id="span6" style="color: red">~</span>
         </li>
         <li>
            <div class="label"><span class="required">*</span>
            手机号码：</div>
            <input placeholder="请输入您的手机号码"  name="phone" id="phone" type="text" maxlength="25" onblur="ff()"/>
            <span id="span7" style="color: red">~</span>
         </li>
         <li>
            <div class="label"><span class="required">*</span>
            旅客类型：</div>
            <div class="r-txt">
            <select class="w200sel" id="passengerType" name="passengerType" >
            <option value="1">成人</option>
            <option value="2">儿童</option>
            <option value="3">学生</option>
            <option value="4">残疾军人、伤残人民警察</option>
            </select>
            <span id="span8" style="color: red">~</span>
            </div>
            
         </li>
         <li>
            <div class="label"><span class="required">*</span>
            所在地：</div>
            <div class="r-txt">
            <select class="w200sel" id="province_code" name="province_code">
            <option value="11"><span>北京</span>
        </option>
            <option value="12"><span>天津</span>
            </option>
            <option value="13"><span>河北</span>
            </option>
            <option value="14"><span>山西</span>
            </option>
            <option value="15"><span>内蒙古</span>
            </option>
            <option value="21"><span>辽宁</span>
            </option>
            <option value="22"><span>吉林</span>
            </option>
            <option value="23"><span>黑龙江</span>
            </option>
            <option value="31"><span>上海</span>
            </option>
            <option value="32"><span>江苏</span>
            </option>
            <option value="33"><span>浙江</span>
            </option>
            <option value="34"><span>安徽</span>
            </option>
            <option value="35"><span>福建</span>
            </option>
            <option value="36"><span>江西</span>
            </option>
            <option value="37"><span>山东</span>
            </option>
            <option value="41"><span>河南</span>
            </option>
            <option value="42"><span>湖北</span>
            </option>
            <option value="43"><span>湖南</span>
            </option>
            <option value="44"><span>广东</span>
            </option>
            <option value="45"><span>广西</span>
            </option>
            <option value="46"><span>海南</span>
            </option>
            <option value="50"><span>重庆</span>
            </option>
            <option value="51"><span>四川</span>
            </option>
            <option value="52"><span>贵州</span>
            </option>
            <option value="53"><span>云南</span>
            </option>
            <option value="54"><span>西藏</span>
            </option>
            <option value="61"><span>陕西</span>
            </option>
            <option value="62"><span>甘肃</span>
            </option>
            <option value="63"><span>青海</span>
            </option>
            <option value="64"><span>宁夏</span>
            </option>
            <option value="65"><span>新疆</span>
            </option>
            </select>
            <span id="span9" style="color: red">~</span>
            </div>
            </li>

            
         </li>



    </ul>

    <div class="tips">
<li style="list-style: none;">
<div class="label" style="width:373px;">&nbsp;</div>

<div class="r-txt"><input type="checkbox" class="check" id="checkAgrees" name="checkone"/>
<span style="font-size: 14px;">
<label for="checkAgree">我已阅读并同意遵守</label>
</span>
<a href="http://www.baidu.com" class="ft14" target="_blank" shape="rect" >《中国铁路客户服务中心网站服务条款》</a>
</div>
</li>
</ul>
<input class="btn " type="submit" id="sum" ></input>
<button class="btn " type="button" onclick="window.location.replace('login.jsp')">返回登录</button>
</div>
</div>
</div>
</form>
<!--账户信息 结束-->


<script type="text/javascript">
  //function aa(){
   // var username = document.getElementById("username");
   // var span=document.getElementById("span1");
  //  var reg=/^[a-zA-Z0-9_]{3,16}$/;
  //      if (username.value==""||username.value==null){
  //          span.innerText = "用户名不能为空" ;
  //       }
  //      else if(reg.test(username.value)){
  //          span.innerText = "√ 正确";
  //          span.style.color="green";
  //          return true;
  //         
  //      } else {
  //         span.innerText = "用户名格式不正确" ;
  //      }  
      
  //  }
    function bb(){
    var password = document.getElementById("password");
    var span=document.getElementById("span2");
        if(password.value==""||password.value.length<4||password.value.length>20){
        span.innerText = "请输入4到20位密码" ;
         }else {
           span.innerText = "√ 正确";
            span.style.color="green";
            return true;
         }
          
    }

    function bbb(){
        var confirmPassWord = document.getElementById("confirmPassWord");
        var span=document.getElementById("span3");  
        if(confirmPassWord.value!=document.getElementById("password").value){
            span.innerText = "密码不一致" ;
        }else if(confirmPassWord.value==""){
            span.innerText = "密码不能为空" ;
        }



        else{
            span.innerText = "√ 正确";
            span.style.color="green";
            return true;
        }


    }
    function cc(){
        var loginname= document.getElementById("loginname");
        var reg=/^[\\u4e00-\u9fa5_a-zA-Z]+$/;
        var span=document.getElementById("span4");
        if (loginname.value==null){
            span.innerText = "姓名格式不正确" ;
         }
        else if(reg.test(loginname.value)){
            span.innerText = "√ 正确";
            span.style.color="green";
           return true;
        } 
    }
    function dd(){
        var cardnum= document.getElementById("cardnum");
        var span=document.getElementById("span5");
       	var reg=/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    	if(reg.test(cardnum.value)){
    		span.innerText = "√ 正确";
            span.style.color="green";    
            return true;
    	}
    
    }
    function ee(){
        var reg=/^\w+(\.\w+)*@\w+(\.\w+)+$/
        var message= document.getElementById("message");
        var span=document.getElementById("span6");
        if(reg.test(message.value)){
            span.innerText = "√ 正确";
            span.style.color="green";    
            return true;
         }
           else{
            span.innerText = "邮箱格式不正确" ;
        } 
    }
    function ff(){
        var phone = document.getElementById("phone");
        var span=document.getElementById("span7");
        var reg=/^1[3|4|5|8][0-9]\d{4,8}$/;
        if(reg.test(phone.value)){
            span.innerText = "√ 正确";
            span.style.color="green";
            return true;
         }else{
           span.innerText = "手机号码格式不正确";
            
         }
          
    }
    function checkb(){
        var checkAgree=document.getElementById("checkAgrees");
        if(!(checkAgree.checked ==true)){
              alert("你还没有接受用户协议"); 
              //return;           
        }
        else{
            return true;
            
       }
    }
    function hhh(){
        //alert(12);
        // return aa()&&bb()&&bbb()&&cc()&&dd()&&ee()&&ff()&&checkb();

        if (bb()&&bbb()&&cc()&&ee()&&ff()&&checkb()&&dd()) {
            alert("提交成功");
           // window.location.href='userServlet?action=register';
           return true;
        }else{
            alert("有*号的为必填项！");
            return false;
        }
        
        
    }
    	
     	//var s=myselect.options[index].text;
     	//var card=s.value;
   // }

	
		function goAjax(){
		var username=document.getElementById("username").value;
		var span=document.getElementById("span1");
		var reg=/^[a-zA-Z0-9_]{3,16}$/;
       // if (username.value==""||username.value==null){
        //    span.innerText = "用户名不能为空" ;
        //    return;
       //  }
		//var carnum=$("#cardnum").val();
		//alert(321);
		$.ajax({
			url:"AjaxServlet",
			type:"POST",	
			data:"username="+username+"&action=checkName",
			dataType:"json",
			//响应成功时
			success:function(data){
			  if(data==true&reg.test(username.value)){ 
			  span.innerText = "√ 正确";
           	  span.style.color="green";       
                 }else{     
                alert("抱歉！用户名已存在或者格式不正确！");
                span.style.color="red";                      }   
			
			}
		
		//+"&cardnum="+cardnum+"&action=checkNum",
		})}
		
		
</script>



  </body>
  