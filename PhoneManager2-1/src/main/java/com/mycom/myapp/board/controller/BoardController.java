package com.mycom.myapp.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.myapp.board.dto.BoardDto;
import com.mycom.myapp.board.service.BoardService;

@RestController
@RequestMapping("/boards")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/list")
    public Map<String, Object> boardList(
            @RequestParam int limit,
            @RequestParam int offset,
            @RequestParam String searchWord) {

        List<BoardDto> list = boardService.boardList(limit, offset, searchWord);
        int count = boardService.boardListTotalCount(searchWord);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", "success");
        resultMap.put("list", list);
        resultMap.put("count", count);

        return resultMap;
    }
}
