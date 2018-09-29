<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=request.getContextPath() %>/">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
登陆成功
<br/>
欢迎管理员${admin.aName }
<a href="jsp/upload.jsp">添加用户</a><br/>
<a href="user/getSalary.do">查看用户</a><br/>
<table>
	<tr>
	
		<td>手机号</td>
		<td>姓名</td>
		<td>性别</td>
		<td>职位</td>
		<td>操作</td>
	</tr>
<c:forEach items="${salaryList }" var="salary">
	<tr>
		
		<td>${salary.user.uUsername }</td>
		<td>${salary.user.uName }</td>
		<td>
		<c:if test="${salary.user.uSex eq 0}">男</c:if>
		<c:if test="${salary.user.uSex eq 1}">女</c:if>
		</td>
		<td>${salary.user.uPosition }</td>
		<td>${salary.sSalary }</td>
		
		<td><a href="">删除</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>