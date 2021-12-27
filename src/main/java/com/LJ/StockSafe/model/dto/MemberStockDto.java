package com.LJ.StockSafe.model.dto;


public class MemberStockDto {
	private int id;
	private String memberId;
	private String predictId;
	private int predictDay;
	private int predictMonth;
	private int predictYear;
	private byte[] predictGraph;	// 그래프 이미지, BLOB형은 byte
	
	public MemberStockDto() {
		super();
	}

	public MemberStockDto(int id, String memberId, String predictId, int predictDay, int predictMonth, int predictYear,
			byte[] predictGraph) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.predictId = predictId;
		this.predictDay = predictDay;
		this.predictMonth = predictMonth;
		this.predictYear = predictYear;
		this.predictGraph = predictGraph;
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
}
