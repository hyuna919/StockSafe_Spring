package com.LJ.StockSafe.model.dto;

import java.util.Arrays;

public class MemberStockDto {
	private int id;
	private String memberId;
	private String predictId;
	private int predictDay;
	private int predictMonth;
	private int predictYear;
	private byte[] predictGraph;	// 그래프 이미지, BLOB형은 byte
	private String stockName;
	private int stockYesterday;
	
	public MemberStockDto(int id, String memberId, String predictId, int predictDay, int predictMonth, int predictYear,
			byte[] predictGraph, String stockName, int stockYesterday) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.predictId = predictId;
		this.predictDay = predictDay;
		this.predictMonth = predictMonth;
		this.predictYear = predictYear;
		this.predictGraph = predictGraph;
		this.stockName = stockName;
		this.stockYesterday = stockYesterday;
	}
	public MemberStockDto() {
		super();
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
	public String getPredictId() {
		return predictId;
	}
	public void setPredictId(String predictId) {
		this.predictId = predictId;
	}
	public int getPredictDay() {
		return predictDay;
	}
	public void setPredictDay(int predictDay) {
		this.predictDay = predictDay;
	}
	public int getPredictMonth() {
		return predictMonth;
	}
	public void setPredictMonth(int predictMonth) {
		this.predictMonth = predictMonth;
	}
	public int getPredictYear() {
		return predictYear;
	}
	public void setPredictYear(int predictYear) {
		this.predictYear = predictYear;
	}
	public byte[] getPredictGraph() {
		return predictGraph;
	}
	public void setPredictGraph(byte[] predictGraph) {
		this.predictGraph = predictGraph;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getStockYesterday() {
		return stockYesterday;
	}
	public void setStockYesterday(int stockYesterday) {
		this.stockYesterday = stockYesterday;
	}
	@Override
	public String toString() {
		return "MemberStockDto [id=" + id + ", memberId=" + memberId + ", predictId=" + predictId + ", predictDay="
				+ predictDay + ", predictMonth=" + predictMonth + ", predictYear=" + predictYear + ", predictGraph="
				+ Arrays.toString(predictGraph) + ", stockName=" + stockName + ", stockYesterday=" + stockYesterday
				+ "]";
	}
}
