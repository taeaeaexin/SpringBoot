<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>PayPhone</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<div class="phone-frame">
    <div class="phone-screen">
        <div class="login-app">
            <h2>로그인</h2>

            <form action="/login" method="post" class="login-form">
                <label for="userEmail">이메일</label>
                <input type="text" name="userEmail" id="userEmail" required value="a">

                <label for="userPassword">비밀번호</label>
                <input type="password" name="userPassword" id="userPassword" required value="a">

                <button type="submit">로그인</button>
            </form>

            <div class="go-register">
                <a href="/register">회원가입</a>
            </div>
        </div>
    </div>
</div>

</body>

</html>
