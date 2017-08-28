<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html >
<head>
  <meta charset="UTF-8">
  <title>管理员登录</title>
   
  
      <link rel="stylesheet" href="css/style1.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
  
<script type="text/javascript">
var error="${requestScope.error}";
/* function check(){
     if(error!=''||error!=null){
        alert(error);
     }

} */
</script>
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
    
span{
 color:red;
 margin-left: 100px;
}

</style>

<body >
      
    <div class="wrapper">
    <form method="post" action="adminServlet?action=login2"  name="loginform" class="form-signin">     
      <h2 class="form-signin-heading">管理员登录</h2>
      <input type="text" class="form-control" name="name" placeholder="账号 " required="" autofocus="" />
      <input type="password" class="form-control" name="pwd" placeholder="密码" required=""/>    
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> 记住账号密码
      </label><span>${requestScope.error}</span> 
      <button class="btn btn-lg btn-primary btn-block" type="submit" onclick="return check()">登录</button>  
      
         
    </form>
     
  </div>
  
  
</body>
</html>
