package com.mycom.myapp.board.dto;

import java.util.List;

public class BoardResultDto {
    private int result; // 0: 성공, 1: 실패, 2: 로그인 필요 등
    private List<BoardDto> list; // 게시글 목록
    private int count; // 총 게시글 수 (검색 결과 포함)

    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }

    public List<BoardDto> getList() {
        return list;
    }
    public void setList(List<BoardDto> list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
