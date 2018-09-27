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
<a href="jsp/addUser.jsp">添加用户</a><br/>
<a href="user/getUsers.do">查看用户</a><br/>
<table>
	<tr>
		<td>编号</td>
		<td>用户名</td>
		<td>密码</td>
		<td>状态</td>
		<td>职位</td>
		<td>薪资</td>
		<td>操作</td>
	</tr>
<c:forEach items="${userList }" var="user">
	<tr>
		<td>${user.uId} </td>
		<td>${user.uName }</td>
		<td>${user.uPassword }</td>
		<td>
		<c:if test="${user.uStatic eq 0}">离开</c:if>
		<c:if test="${user.uStatic eq 1}">在职</c:if>
		</td>
		<td>${user.uPosition }</td>
		<td>${user.uSalary }</td>
		<td><a href="">离开</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>