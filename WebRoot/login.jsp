<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

  <meta charset="UTF-8">
  <title>登录</title>
   
  
      <link rel="stylesheet" href="css/style1.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
  

</head>
<style type="text/css">
  body{
     background: black;
  }
    .wrapper{
      background: #E5E5E5;
     height: 632px;
      margin:0;
      padding-top: 100px;
    }
     .baby{
       margin-top:0px;
     }
    .form-signin-heading{
      margin-left: 100px;
      font-size: 30px;

    }
    


</style>

<body>
    <div class="wrapper" >
    <form class="form-signin" action="userServlet?action=login" method="post">       
      <h2 class="form-signin-heading">请登录</h2>
      <input type="text" class="form-control" name="username" placeholder="账号 " required="" autofocus="" />
      <input type="password" class="form-control" name="password" placeholder="密码" required=""/>    
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> 记住账号密码
        <a href="index.jsp" style="color: #000;text-decoration: none;margin-left: 170px;">回首页</a>
      </label>
      <button class="btn btn-lg btn-primary btn-block" type="submit" >登录</button>   
      <button class="btn btn-primary btn-block btn-lg" type="submit" onclick="window.location.replace('register.jsp')">注册</a></button> 
         
    </form>
     
  </div>
  
  
</body>
</html>
