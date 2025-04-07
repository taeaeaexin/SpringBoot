<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mindows 99</title>
    <link rel="stylesheet" href="/assets/css/style.css">
</head>

<body>

<!-- 아이콘 -->
<div class="desktop">
<!--  <div class="icon" onclick="location.href='about.html'">-->
  <div class="icon" onclick="location.href='/PhoneManager/Phones/list'">
    <img src="/assets/img/icons/phone.png">
    <p>재고 관리</p>
  </div>

  <div class="icon" onclick="#'">
    <img src="/assets/img/icons/people.png">
    <p>회원 관리</p>
  </div>

  <div class="icon" onclick="#">
    <img src="/assets/img/icons/computer.png">
    <p>거래처 관리</p>
  </div>
</div>

<!-- 작업 표시줄 -->
<div class="taskbar">
  <div class="start-button">
    <img src="/assets/img/icons/windows95.png" style = "width: 20px;">
    <p>시작</p>
  </div>

  <div class="time">
    <p>
    	<a class="nav-link" href="/auth/logout ">Logout</a>
    </p>
  </div>
</div>

</body>
</html>