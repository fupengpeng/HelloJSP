<%@ page import="com.jiudianlianxian.entity.User"%>
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=gbk"%>


<%
	String username = request.getParameter("username").trim();
	String password = request.getParameter("password").trim();

	if ("xiaohu".equals(username) && "123".equals(password)) {

		//登录成功
		User user = new User();
		session.setAttribute("user", user);
		//pageContext.forward("login_ok.jsp");
		//return;
		
%>
<jsp:forward page="login_ok.jsp"></jsp:forward>
<%

	} else {

		//登录失败
	    request.setAttribute("loginError", "用户名或者密码错误！");
%>
<jsp:forward page="login.jsp"></jsp:forward>
<%
		//pageContext.forward("login.jsp");

	}
%>
