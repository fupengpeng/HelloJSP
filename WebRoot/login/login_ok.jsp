<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=gbk"%>
<%@page import="com.jiudianlianxian.entity.User"%>

<html>
<body>
	<h1>
		��ӭ��½��<%=((User)session.getAttribute("user")).getUsername() %></h1>
	<a href="exit.jsp">�˳�</a>
</body>
</html>
