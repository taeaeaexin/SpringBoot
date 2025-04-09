package com.mycom.myapp.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycom.myapp.board.dao.BoardDao;
import com.mycom.myapp.board.dto.BoardDto;
import com.mycom.myapp.board.dto.BoardParamDto;
import com.mycom.myapp.board.dto.BoardResultDto;

@Service
public class BoardServiceImpl implements BoardService{
	private final BoardDao boardDao;
	
	public BoardServiceImpl(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	@Override
	public BoardResultDto listBoard(BoardParamDto boardParamDto) { // limit, offset 넘어옴
		BoardResultDto boardResultDto = new BoardResultDto();
		
		// 예외 처리
		// 처리과정 중 오류 발생
		//	1. 직접 제어 (사용)
		// 	2. Spring FrameWork 처리 의뢰 /error mapping
		try {
			// BoardController는 BoardService의 listBoard() 1회 호출
			// BoardService 는 BoardDao의 listBoard()와 listBoardTotalCOunt() 2개 호출
			List<BoardDto> list = boardDao.listBoard(boardParamDto);
			int count = boardDao.listBoardTotalCount();
			boardResultDto.setList(list);
			boardResultDto.setCount(count);
			boardResultDto.setResult("success");
		}catch(Exception e) {
			e.printStackTrace();
			boardResultDto.setResult("fail");
		}
		return boardResultDto;
	}
	
	@Override
	public BoardResultDto listBoardSearchWord(BoardParamDto boardParamDto) { // limit, offset 넘어옴
		BoardResultDto boardResultDto = new BoardResultDto();
		try {
			// BoardController는 BoardService의 listBoard() 1회 호출
			// BoardService 는 BoardDao의 listBoard()와 listBoardTotalCOunt() 2개 호출
			List<BoardDto> list = boardDao.listBoardSearchWord(boardParamDto);
			int count = boardDao.listBoardTotalCountSearchWord(boardParamDto);
			boardResultDto.setList(list);
			boardResultDto.setCount(count);
			boardResultDto.setResult("success");
		}catch(Exception e) {
			e.printStackTrace();
			boardResultDto.setResult("fail");
		}
		return boardResultDto;
	}
	
	// 게시글 상세 정보 + 조회수 처리
	@Override
	public BoardResultDto detailBoard(BoardParamDto boardParamDto) {
		BoardResultDto boardResultDto = new BoardResultDto();
		
		try {
			// 조회수 처리
			// 게시글 상세 정보
			BoardDto boardDto = boardDao.detailBoard(boardParamDto);
			if(boardDto.getUserSeq() == boardParamDto.getUserSeq()) {
				boardDto.setSameUser(true);
			}else {
				boardDto.setSameUser(false);				
			}
			
			boardResultDto.setDto(boardDto);
			boardResultDto.setResult("success");
		}catch(Exception e) {
			e.printStackTrace();
			boardResultDto.setResult("fail");
		}
		return boardResultDto;
	}

	@Override
	public BoardResultDto insertBoard(BoardDto boardDto) {
		BoardResultDto boardResultDto = new BoardResultDto();
		
		try {
			int ret = boardDao.insertBoard(boardDto);
			
			if(ret == 1) boardResultDto.setResult("success");
			else boardResultDto.setResult("fail");
			
		}catch(Exception e) {
			e.printStackTrace();
			boardResultDto.setResult("fail");
		}
		return boardResultDto;
	}
	
	@Override
	public BoardResultDto updateBoard(BoardDto boardDto) {
		BoardResultDto boardResultDto = new BoardResultDto();
		
		try {
			int ret = boardDao.updateBoard(boardDto);
			
			if(ret == 1) boardResultDto.setResult("success");
			else boardResultDto.setResult("fail");
			
		}catch(Exception e) {
			e.printStackTrace();
			boardResultDto.setResult("fail");
		}
		return boardResultDto;
	}

	@Override
	public BoardResultDto deleteBoard(int boardId) {
		BoardResultDto boardResultDto = new BoardResultDto();
		
		try {
			int ret = boardDao.deleteBoard(boardId);
			
			if(ret == 1) boardResultDto.setResult("success");
			else boardResultDto.setResult("fail");
			
		}catch(Exception e) {
			e.printStackTrace();
			boardResultDto.setResult("fail");
		}
		return boardResultDto;
	}
}
