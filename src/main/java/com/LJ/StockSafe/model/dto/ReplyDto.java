package com.LJ.StockSafe.model.dto;

public class ReplyDto {
	private int id;
	private String stockId;
	private String replyContent;
	private String memberId;
	private String replyRegdate;
	private int replyLevel;
	private int replyParent;
	
	public ReplyDto() {
		super();
	}
	public ReplyDto(int id, String stockId, String replyContent, String memberId, String replyRegdate, int replyLevel,
			int replyParent) {
		super();
		this.id = id;
		this.stockId = stockId;
		this.replyContent = replyContent;
		this.memberId = memberId;
		this.replyRegdate = replyRegdate;
		this.replyLevel = replyLevel;
		this.replyParent = replyParent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getReplyRegdate() {
		return replyRegdate;
	}
	public void setReplyRegdate(String replyRegdate) {
		this.replyRegdate = replyRegdate;
	}
	public int getReplyLevel() {
		return replyLevel;
	}
	public void setReplyLevel(int replyLevel) {
		this.replyLevel = replyLevel;
	}
	public int getReplyParent() {
		return replyParent;
	}
	public void setReplyParent(int replyParent) {
		this.replyParent = replyParent;
	}
	
	
}
