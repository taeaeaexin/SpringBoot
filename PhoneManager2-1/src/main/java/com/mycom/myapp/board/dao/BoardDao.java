package com.mycom.myapp.board.dao;

import java.util.List;
import com.mycom.myapp.board.dto.BoardDto;
import com.mycom.myapp.board.dto.BoardParamDto;

public interface BoardDao {
    List<BoardDto> selectBoardList(BoardParamDto paramDto);
    int selectBoardTotalCount(BoardParamDto paramDto);
}