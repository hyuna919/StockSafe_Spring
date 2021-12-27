package com.LJ.StockSafe.model.dto;

public class NewsDto {
	private String newsTitle;
	private String newsDate;
	private String newsUri;
	private String stockId;
	
	public NewsDto() {
		super();
	}

	public NewsDto(String newsTitle, String newsDate, String newsUri, String stockId) {
		super();
		this.newsTitle = newsTitle;
		this.newsDate = newsDate;
		this.newsUri = newsUri;
		this.stockId = stockId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}

	public String getNewsUri() {
		return newsUri;
	}

	public void setNewsUri(String newsUri) {
		this.newsUri = newsUri;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	
	

}
