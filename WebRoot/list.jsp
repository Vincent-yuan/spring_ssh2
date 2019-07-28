<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>
用户管理</title>
</head>
<body>
	<table width="80%" align="center">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>角色</td>
		</tr>
		<c:forEach items="${list }" var="bean">
		<tr>
			<td>${bean.id }</td>
			<td>${bean.name }</td>
			<td>
			${bean.age }
			</td>
				<td>
			${bean.role.name }
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>