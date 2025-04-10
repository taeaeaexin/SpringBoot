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
            width: 40px;
            height: 40px;
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
            <img src="/img/user/<%= userDto.getUserProfileImage() %>" class="profile-img" alt="프로필 이미지">
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

<div class="container mt-3">
    <h4 class="text-center">게시판</h4>
    
    <div class="input-group mb-3">
        <input id="inputSearchWord" type="text" class="form-control" placeholder="검색어를 입력하세요.">
        <button id="btnSearchWord" class="btn btn-success" type="button">검색</button>
    </div>

    <table class="table table-hover">
        <thead>
            <tr>
                <th>#</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일시</th>
                <th>조회수</th>
            </tr>
        </thead>
        <tbody id="boardTbody"></tbody>
    </table>

    <div id="paginationWrapper"></div>
</div>

<script>
    let LIST_ROW_COUNT = 10;
    let OFFSET = 0;
    let SEARCH_WORD = '';
    let TOTAL_LIST_COUNT = 0;
    let PAGE_LINK_COUNT = 10;
    let CURRENT_PAGE_INDEX = 1;

    window.onload = function () {
        listBoard();

        document.querySelector("#btnSearchWord").onclick = function () {
            SEARCH_WORD = document.querySelector("#inputSearchWord").value;
            listBoard();
        };
    };

    async function listBoard() {
        let url = "/boards/list";
        let urlParams = "?limit=" + LIST_ROW_COUNT + "&offset=" + OFFSET + "&searchWord=" + SEARCH_WORD;
        let response = await fetch(url + urlParams, { headers: { ajax: "true" } });
        let data = await response.json();

        if (data.result == "success") {
            makeListHtml(data.list);
            TOTAL_LIST_COUNT = data.count;
            addPagination();
        } else if (data.result == "login") {
            window.location.href = "/pages/login";
        } else {
            alert("글 조회 실패");
        }
    }

    function makeListHtml(list) {
        let html = "";
        list.forEach(el => {
            let regDtStr = `${el.regDt.date.year}.${el.regDt.date.month}.${el.regDt.date.day}`;
            html += `
                <tr>
                    <td>${el.boardId}</td>
                    <td>${el.title}</td>
                    <td>${el.userName}</td>
                    <td>${regDtStr}</td>
                    <td>${el.readCount}</td>
                </tr>`;
        });
        document.querySelector("#boardTbody").innerHTML = html;
    }

    function addPagination() {
        // 일단 패스해도 됨. 이후 페이징 추가
    }
</script>

</body>
</html>
