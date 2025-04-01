<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.mycom.myapp.dto.BookDto" %>
<% 
	BookDto bookDto = (BookDto) request.getAttribute("bookDto");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookManager</title>
</head>
<body>
	<h1>BookManager</h1>
	<h3>bookid : <%= bookDto.getBookid() %> </h3>
	<h3>bookname : <%= bookDto.getBookname() %> </h3>
	<h3>publisher : <%= bookDto.getPublisher() %> </h3>
	<h3>price : <%= bookDto.getPrice() %> </h3>
</body>
</html>