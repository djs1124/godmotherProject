<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/loginAdmin.css" type="text/css" rel="stylesheet">
</head>
<body>
	
	<div class="lg">
		<form action="#" method="post">
			<div class="lg_top">
			<div class="lg_admin">
			<img src="../images/logo.png"></div>
				<div class="lg_ti">员工登陆</div>
			</div>
			<div class="lg_main">
			<input class="ur" type="text" name="username" placeholder="用户名" value="">
			<input class="pw" type="password" name="password" placeholder="密码" value="">
			</div>
			<div class="lg_foot">
			<input class="bn" type="submit" value="登陆"></div>
		</form>
		<div class="foot_ex">
		<a href="adminlogin.jsp"><button class="bt" type="button" value=""><img alt="text" src="../images/bt.png">管理员登陆</button></a></div>
	</div>
	

</body>
</html>