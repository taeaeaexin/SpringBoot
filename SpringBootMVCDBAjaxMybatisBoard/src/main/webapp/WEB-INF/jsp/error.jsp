<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--
	el 사용
	
	error 페이지에서 어떤 정보를 얼만큼 보여줘야하나?
	1. 상세한 정보 : 보안이슈
	2. 아무것도 안보여준다 : 왜 보여줌?
	
	업무용 시스템 vs 일반 고객 서비스 시스템
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error.jsp</title>
</head>
<body>
	<h1>Error Page</h1>
	<p>요청하신 서비스에 문제가 발생했습니다.</p>
	<p>요청하신 서비스 : ${requestURI}</p>
	<p>발생된 오류 : ${exception}</p>
</body>
</html>