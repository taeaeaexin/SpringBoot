<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String username = (String) session.getAttribute("uwername");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>sessionTest2.jsp</h1>
<%
	if(username==null){
%>
	<h4>로그인이 되어있지 않습니다.</h4>
<%
	}else{
%>
	<h4><%= username %>이 로그인 되어있습니다.</h4>
<%
	}
%>
</body>
</html>