<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=gbk"%>


<html>
<body>
	<h3><%=request.getAttribute("loginError") == null ? "" : request
					.getAttribute("loginError")%></h3>
	<form name=regForm action="handleLogin.jsp" method="post">
		�û�����<input type="text" name=username /><br> ���룺<input
			type="password" name=password /><br> <input type="submit"
			value=��¼ />
	</form>
</body>
</html>
