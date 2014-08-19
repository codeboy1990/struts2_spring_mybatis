<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"
    import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
StringBuilder sb = new StringBuilder(request.getScheme());
sb.append("://").append(request.getServerName()).append(":");
sb.append(request.getLocalPort()).append(path).append("/");
String basePath=sb.toString();
%>

<html>
<head>
<base href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="registation" method="post">
	<table >
		<tr>
			<td>用户名：</td>
			<td><input type="text" name="userRegistation.username"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" name="userRegistation.password"/></td>
		</tr>
		<tr>
			<td>密码确认：</td>
			<td><input type="password" name="userRegistation.passwordConfirm"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="注册"></td>
		</tr>
	</table>
</form>

</body>
</html>