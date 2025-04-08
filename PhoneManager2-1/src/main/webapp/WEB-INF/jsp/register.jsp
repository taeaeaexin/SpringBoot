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
            <h2>회원가입</h2>

            <form action="/register" method="post" class="login-form">
                <input type="text" id="userName" name="userName" placeholder="이름 입력" required>
                <input type="text" id="userEmail" name="userEmail" placeholder="이메일 입력" required>
                <input type="password" id="userPassword" name="userPassword" placeholder="비밀번호 입력" required>
                <input type="password" id="userPassword2" name="userPassword2" placeholder="비밀번호 확인" required>
                <button type="submit">가입하기</button>
            </form>

            <div class="go-register">
                <a href="/">메인으로</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>
