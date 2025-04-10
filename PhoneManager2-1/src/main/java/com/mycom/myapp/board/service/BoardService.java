package com.mycom.myapp.board.service;

import java.util.List;

import com.mycom.myapp.board.dto.BoardDto;

public interface BoardService {
	List<BoardDto> boardList(int limit, int offset, String searchWord);
	int boardListTotalCount(String searchWord);
}