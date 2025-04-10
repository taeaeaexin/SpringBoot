package com.mycom.myapp.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.myapp.board.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    SqlSession sqlSession;

    private static final String NAMESPACE = "com.mycom.myapp.board.dao.BoardDao";

    @Override
    public List<BoardDto> boardList(int limit, int offset, String searchWord) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("limit", limit);
        paramMap.put("offset", offset);
        paramMap.put("searchWord", searchWord);

        return sqlSession.selectList(NAMESPACE + ".selectBoardList", paramMap);
    }

    @Override
    public int boardListTotalCount(String searchWord) {
        return sqlSession.selectOne(NAMESPACE + ".selectBoardTotalCount", searchWord);
    }
}
