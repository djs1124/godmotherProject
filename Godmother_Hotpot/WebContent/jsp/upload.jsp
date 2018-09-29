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
<form action="food/addFood.do" method="post" enctype="multipart/form-data">
<input type="file" name="mfile"><br/>
<input type="text" name="fName"><br/>
<input type="text" name="fType"><br/>
<input type="text" name="fUnitPrice"><br/>
<input type="text" name="fSellPrice"><br/>
<input type="text" name="fStock"><br/>
<input type="radio" name="fStatic" value="1">热门
<input type="radio" name="fStatic" value="0">普通<br/>
<input type="submit" value="提交">
</form>
</body>
</html>