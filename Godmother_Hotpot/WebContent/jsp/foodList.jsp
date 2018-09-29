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
<a href="food/getFood.do">查看用户</a><br/>
<table>
	<tr>
		<td>图片</td>
		<td>菜名</td>
		<td>类型</td>
		<td>单价</td>
		<td>售价</td>
		<td>库存</td>
		<td>状态</td>
		<td>操作</td>
		<td>操作</td>
	</tr>
<c:forEach items="${foodList }" var="food">
	<tr>
		<td><img src="${food.fPic}" alt="error" width="30px" height="30px"> </td>
		<td>${food.fName }</td>
		<td>${food.fType }</td>
		<td>${food.fUnitPrice }</td>
		<td>${food.fSellPrice }</td>
		<td>${food.fStock }</td>
		<td>
		<c:if test="${food.fStatic eq 0}">普通</c:if>
		<c:if test="${food.fStatic eq 1}">热门</c:if>
		</td>
		<td><a href="">删除</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>