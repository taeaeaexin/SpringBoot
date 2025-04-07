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

  <div class="icon">
    <img src="/assets/img/icons/people.png">
    <p>회원 관리</p>
  </div>

  <div class="icon">
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
    <p>17:50</p>
  </div>
</div>

<!-- 창 -->
<div class="window">
    <div class="title-bar">
        <span>네트워크 암호 입력</span>
        <button onclick="location.href='/'">✖</button>
    </div>
    
    <div class="login-content">
        <div>
        	<br>
            <p>Microsoft 네트워크에 로그인하려면 암호를 입력하십시오.</p>
            <br>
            <br>
            <form novalidate>
                <div class="form-row">
                    <label for="userEmail">사용자 이름(U):</label>
                    <input type="text" id="userEmail" name="userEmail" value="ts@ts.com">
                </div>
                <div class="form-row">
                    <label for="userPassword">암호(P):</label>
                    <input type="password" id="userPassword" name="userPassword" value="0107">
                </div>
                <br>
                <div class="form-buttons">
                    <button type="button" id="btnLogin">확인</button>
                    <button type="button" onclick="location.href='/'">취소</button>
                </div>
            </form>
        </div>
    </div>
</div>

	
<!-- 	<div class="content-container" style="margin-top:10px;"> -->
<!--     	<button onclick="location.href='/PhoneManager/insertForm.jsp'" style="width: 77px; height: 33px;">확인</button> -->
<!--     </div> -->

<!-- </div> -->

<!--     <form novalidate> -->
<!--         <div class="mb-3"> -->
<!--             <label for="userEmail" class="form-label">Email:</label> -->
<!--             <input type="text" class="form-control" id="userEmail" name="userEmail" placeholder="Enter User Name" value="ts@ts.com"> -->
<!--         </div> -->

<!--         <div class="mb-3"> -->
<!--             <label for="userPassword" class="form-label">Password:</label> -->
<!--             <input type="password" class="form-control" id="userPassword" name="userPassword" placeholder="Enter Password" value="0107"> -->
<!--         </div> -->
<!--     </form> -->
<!--     <div> -->
<!--         <button type="button" id="btnLogin" class="btn btn-success"> -->
<!--             로그인 -->
<!--         </button> -->
<!--     </div> -->

<script>
    window.onload = function () {
        document.querySelector("#btnLogin").onclick = function () {
            const userEmail = document.querySelector("#userEmail").value.trim();
            const userPassword = document.querySelector("#userPassword").value.trim();

            if (userEmail.length === 0 || userPassword.length === 0) {
                alert("입력이 올바르지 않습니다.");
                return;
            }
            login();
        }
    }

    // 로그인
    async function login() {
        const userEmail = document.querySelector("#userEmail").value;
        const userPassword = document.querySelector("#userPassword").value;

        const urlParams = new URLSearchParams({
            userEmail: userEmail,
            userPassword: userPassword
        });

        const fetchOptions = {
            method: "POST",
            body: urlParams
        }

        try {
            const response = await fetch("/auth/login", fetchOptions);
            const data = await response.json();

            console.log(data);

            if (data.result === "success") {
                window.location.href = "/pages/board";
            } else {
                alert("이메일 또는 비밀번호가 올바르지 않습니다.");
            }
        } catch (e) {
            alert("서버와의 통신 중 문제가 발생했습니다.");
            console.error(e);
        }
    }
</script>

</body>
</html>