<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=gbk"%>
<%@page import="com.jiudianlianxian.entity.User"%>

<html>
<body>
	<h1>
		»¶Ó­µÇÂ½£¬<%=((User)session.getAttribute("user")).getUsername() %></h1>
	<a href="exit.jsp">ÍË³ö</a>
</body>
</html>
