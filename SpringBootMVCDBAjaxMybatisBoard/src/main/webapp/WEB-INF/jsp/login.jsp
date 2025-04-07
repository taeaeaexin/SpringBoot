<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <title>로그인</title>
</head>
<body>
<div class="container">
    <div class="mb-3 mt-5 d-flex justify-content-center">
        <h1 class="display-4">문태신을 유플러스로</h1>
    </div>

    <div class="mb-3">
        <h2>로그인</h2>
    </div>

    <form novalidate>
        <div class="mb-3">
            <label for="userEmail" class="form-label">Email:</label>
            <input type="text" class="form-control" id="userEmail" name="userEmail" placeholder="Enter User Name" value="ts@ts.com">
        </div>

        <div class="mb-3">
            <label for="userPassword" class="form-label">Password:</label>
            <input type="password" class="form-control" id="userPassword" name="userPassword" placeholder="Enter Password" value="0107">
        </div>
    </form>
    <div>
        <button type="button" id="btnLogin" class="btn btn-success">
            로그인
        </button>
    </div>
</div>

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