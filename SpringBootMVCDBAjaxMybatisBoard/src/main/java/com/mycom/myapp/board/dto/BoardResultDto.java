package com.mycom.myapp.board.dto;

import java.util.List;

public class BoardResultDto {
	private String result; // 등록, 수정, 삭제 작업 성공, 실패
	private List<BoardDto> list; // 목록
	private BoardDto dot; // 상세
	private int count;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<BoardDto> getList() {
		return list;
	}

	public void setList(List<BoardDto> list) {
		this.list = list;
	}

	public BoardDto getDot() {
		return dot;
	}

	public void setDot(BoardDto dot) {
		this.dot = dot;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "BoardResultDto [result=" + result + ", list=" + list + ", dot=" + dot + ", count=" + count + "]";
	}
}