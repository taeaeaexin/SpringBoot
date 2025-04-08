<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.mycom.myapp.user.dto.UserDto"%>
<%
    UserDto userDto = (UserDto) session.getAttribute("user");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>PayPhone</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .welcome-box {
            margin-top: 50px;
            padding: 30px;
            background-color: #f8f9fa;
            border-radius: 15px;
            text-align: center;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }

        .profile-img {
            width: 80px;
            height: 80px;
            object-fit: cover;
            border-radius: 50%;
            border: 2px solid #ccc;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light shadow-sm">
    <div class="container">
        <a class="navbar-brand" href="/home">
            <img src="/assets/img/user/<%= userDto.getUserProfileImage() %>" class="profile-img" alt="프로필 이미지">
            <span class="ms-2 fw-bold"><%= userDto.getUserName() %>님</span>
        </a>
        <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link btn btn-outline-danger" href="/logout">로그아웃</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <div class="welcome-box">
        <h2>PayPhone에 오신 걸 환영합니다 📞</h2>
        <p class="lead">이곳은 로그인 후 볼 수 있는 홈 화면입니다.</p>
        <hr>
        <p>프로필 이미지와 이름이 상단에 표시되고,<br>여기서 다양한 기능을 확장할 수 있습니다.</p>
    </div>
</div>

</body>
</html>
