package com.mycom.myapp.board.dto;

import java.time.LocalDateTime;

public class BoardDto {
	private int boardId;
	private int userSeq;
	private String userName;
	private String userProfileImage;
	private String title;
	private String content;
	private LocalDateTime regDt;
	private int readCount;
	private boolean sameUser;
	
	public BoardDto(){}
	public BoardDto(int userSeq, String title, String content){
		super();
        this.userSeq = userSeq;
        this.title = title;
        this.content = content;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserProfileImage() {
		return userProfileImage;
	}
	public void setUserProfileImage(String userProfileImage) {
		this.userProfileImage = userProfileImage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getRegDt() {
		return regDt;
	}
	public void setRegDt(LocalDateTime regDt) {
		this.regDt = regDt;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public boolean isSameUser() {
		return sameUser;
	}
	public void setSameUser(boolean sameUser) {
		this.sameUser = sameUser;
	}
	
	@Override
	public String toString() {
		return "BoardDto [boardId=" + boardId + ", userSeq=" + userSeq + ", userName=" + userName
				+ ", userProfileImage=" + userProfileImage + ", title=" + title + ", content=" + content + ", regDt="
				+ regDt + ", readCount=" + readCount + ", sameUser=" + sameUser + "]";
	}
}
