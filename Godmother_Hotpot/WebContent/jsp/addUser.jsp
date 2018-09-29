<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=request.getContextPath()%>/">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="user/addUser.do" method="post">
	用户名：<input type="text" name="uUsername"><br/>
	密码：<input type="password" name="uPassword"><br/>
	是否存在：<input type="text" name="uStatic" value="1"> 
	<br/>
	姓名：<input type="text" name="uName"><br/> 
	年龄：<input type="text" name="uSex" > <br/>
	职位：<input type="text" list="polist" name="uPosition">
		<datalist id="polist">
			<option selected="selected">null</option>
			<option>厨师</option>
			<option>服务员</option>
			<option>收银员</option>
			<option>清洁工</option>
			<option>迎宾员</option>
			<option>经理</option>
		</datalist>
		<br/>
	<!--  薪资：<input type="text" list="salist" name="uSalary">
		<datalist id="salist">
			<option selected="selected">null</option>
			<option>1000</option>
			<option>3000</option>
			<option>5000</option>
			<option>7000</option>
			<option>9000</option>
			<option>11000</option>
		</datalist> 
		<br/> -->
		<input type="submit" value="确定">
</form>
</body>
</html>