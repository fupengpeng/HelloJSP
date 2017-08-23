<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>javabean属性值的设置和获取</title>
</head>
<body>

	<jsp:useBean id="user" class="com.jiudianlianxian.entity.User">
		<jsp:setProperty name="user" property="username" value="小强" />
		<jsp:setProperty name="user" property="password" value="王" />
	</jsp:useBean>

	<p>
		账号:
		<jsp:getProperty name="user" property="username" />
	</p>
	<p>
		密码:
		<jsp:getProperty name="user" property="password" />
	</p>

</body>
</html>