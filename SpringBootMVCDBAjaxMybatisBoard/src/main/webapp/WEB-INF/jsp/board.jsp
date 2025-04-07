<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.mycom.myapp.user.dto.UserDto"%>
<%
	UserDto userDto = (UserDto) session.getAttribute("userDto");
%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>게시판</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
  </head>
  <body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container">
    <a class="navbar-brand" href="#">
		<img src = "/assets/img/user/<%= userDto.getUserProfileImage() %>" style="width:30px; heigth:30px; border-radius:50%"></img>
	</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
      </ul>
      
      <ul class="navbar-nav">
        <li class="nav-item">
<!--           <a class="nav-link" href="/pages/logout ">Logout</a> -->
			<a class="nav-link" href="/auth/logout ">Logout</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

    <script>
		// logout 처리 방식 구분
		// #1. Javascript를 이용한 비동기 처리
		//	Logout이 클릭되면 이벤트핸들러에서 비동기로 logout 요청 (서버에서 로그아웃 처리 후 result:success 전달)
		//	페이지를 window.location.href로 login 페이지로 이동
		// #2. a의 href에 page 요청 (서버에서 로그아웃 처리 후 바로 페이지 이동) <= 2번으로 진행
    </script>
</body>
</html>