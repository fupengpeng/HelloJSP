<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=gbk"%>


<html>
<body>
	<h3><%=request.getAttribute("loginError") == null ? "" : request
					.getAttribute("loginError")%></h3>
	<form name=regForm action="handleLogin.jsp" method="post">
		ำรปงร๛ฃบ<input type="text" name=username /><br> รÜย๋ฃบ<input
			type="password" name=password /><br> <input type="submit"
			value=ตวยผ />
	</form>
</body>
</html>
