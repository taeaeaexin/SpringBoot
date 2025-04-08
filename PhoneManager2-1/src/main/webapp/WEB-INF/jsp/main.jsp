<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>PayPhone 메인</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<div class="phone-frame">
    <div class="phone-screen">
        <div class="app-grid">
            <div class="app-item">
                <a href="/home">
                    <div class="app-box">
                        <img src="/img/phone-icon.jpg" alt="PayPhone Icon">
                    </div>
                </a>
                <div class="app-label">PayPhone</div>
            </div>

            <div class="app-item">
                <a href="/login">
                    <div class="app-box">
                        <img src="/img/login-icon.png" alt="로그인">
                    </div>
                </a>
                <div class="app-label">로그인</div>
            </div>

            <div class="app-item">
                <a href="/register">
                    <div class="app-box">
                        <img src="/img/register-icon.png" alt="회원가입" style="width:60px;height:60px">
                    </div>
                </a>
                <div class="app-label">회원가입</div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
