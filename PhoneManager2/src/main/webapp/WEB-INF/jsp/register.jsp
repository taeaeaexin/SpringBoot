<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mindows 99</title>
    <link rel="stylesheet" href="/assets/css/style.css">
</head>
<body>

<div class="desktop">
  <div class="icon" onclick="location.href='/PhoneManager/Phones/list'">
    <img src="/assets/img/icons/phone.png">
    <p>재고 관리</p>
  </div>
  <div class="icon">
    <img src="/assets/img/icons/people.png">
    <p>회원 관리</p>
  </div>
  <div class="icon">
    <img src="/assets/img/icons/computer.png">
    <p>거래처 관리</p>
  </div>
</div>

<div class="taskbar">
  <div class="start-button">
    <img src="/assets/img/icons/windows95.png" style="width: 20px;">
    <p>시작</p>
  </div>
  <div class="time">
    <p>Login</p>
  </div>
</div>

<!-- 창 -->
<div class="window">
    <div class="title-bar">
        <span>회원 가입</span>
        <button onclick="location.href='/'">✖</button>
    </div>
    
    <div class="login-content">
        <div>
        	<br>
            <p>Microsoft 네트워크에 새로 가입하려면 정보를 입력하십시오.</p>
            <br>
            <form novalidate>
                <div class="form-row">
                    <label for="userName">사용자 이름(U):</label>
                    <input type="text" id="userName" name="userName" placeholder="이름 입력">
                </div>
                <div class="form-row">
                    <label for="userEmail">이메일(E):</label>
                    <input type="email" id="userEmail" name="userEmail" placeholder="이메일 입력">
                </div>
                <div class="form-row">
                    <label for="userPassword">암호(P):</label>
                    <input type="password" id="userPassword" name="userPassword" placeholder="암호 입력">
                </div>
                <div class="form-row">
                    <label for="userPassword2">암호 확인(C):</label>
                    <input type="password" id="userPassword2" name="userPassword2" placeholder="암호 재입력">
                </div>
                <br>
                <div class="form-buttons">
                    <button type="button" id="btnRegister">확인</button>
                    <button type="button" onclick="location.href='/'">취소</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script>
    window.onload = function () {
        document.querySelector("#btnRegister").onclick = function () {
            if (!validateUserName(document.querySelector("#userName").value) ||
                !validateUserEmail(document.querySelector("#userEmail").value) ||
                !validateUserPassword(document.querySelector("#userPassword").value) ||
                !validateUserPassword2(document.querySelector("#userPassword2").value)) {
                alert("입력값이 유효하지 않습니다.");
                return;
            }
            register();
        }
    }

    function validateUserName(userName) {
        return userName.length >= 2;
    }

    function validateUserPassword(userPassword) {
        let patternEng = /[a-zA-Z]/;
        let patternSpe = /[~!@#$%^&*()_+|<>?:{}]/;
        let patternNum = /[0-9]/;
        return patternEng.test(userPassword) && patternSpe.test(userPassword) && patternNum.test(userPassword);
    }

    function validateUserPassword2(userPassword2) {
        return userPassword2 === document.querySelector("#userPassword").value;
    }

    function validateUserEmail(userEmail) {
        let regexp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
        return regexp.test(userEmail);
    }

    async function register() {
        let userName = document.querySelector("#userName").value;
        let userPassword = document.querySelector("#userPassword").value;
        let userEmail = document.querySelector("#userEmail").value;

        let urlParams = new URLSearchParams({
            userName: userName,
            userPassword: userPassword,
            userEmail: userEmail
        });

        let fetchOptions = {
            method: "POST",
            body: urlParams
        }

        try {
            let response = await fetch("/user/register", fetchOptions);
console.log(response);
            let data = await response.json();
console.log(data);
            if (data.result === "success") {
                alert("회원가입이 완료되었습니다!");
                window.location.href = "/";
            } else {
                alert("회원가입에 실패했습니다.");
            }
        } catch (e) {
            alert("서버 오류가 발생했습니다.");
            console.error(e);
        }
    }
</script>
</body>
</html>
