package com.mycom.myapp.board.dto;

public class BoardParamDto {
    private int limit;
    private int offset;
    private String searchWord;

    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getSearchWord() {
        return searchWord;
    }
    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }
}
