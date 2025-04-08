package com.mycom.myapp.board.service;

import com.mycom.myapp.board.dto.BoardParamDto;
import com.mycom.myapp.board.dto.BoardResultDto;

public interface BoardService {
	BoardResultDto listBoard(BoardParamDto boardParamDto); // limit, offset setting
	BoardResultDto listBoardSearchWord(BoardParamDto boardParamDto); // limit, offset, searchWord
}
