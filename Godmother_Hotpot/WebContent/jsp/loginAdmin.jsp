<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=request.getContextPath() %>/">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="user/loginAdmin.do" method="post">
	用户名：<input type="text" name="aName"><br/>
	密码：<input type="password" name="aPassword"><br/>
	<input type="submit" value="登录">
</form>
</body>
</html>