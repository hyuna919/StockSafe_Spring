package com.LJ.StockSafe.model.dto;


public class UserStockDto {
	private int id;
	private String memberId;
	private String stockId;
	
	public UserStockDto(int id, String memberId, String stockId) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.stockId = stockId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	
	
}
