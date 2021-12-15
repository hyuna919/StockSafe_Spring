package com.LJ.StockSafe.model.dto;

public class Stock {
	String id;
	String stock_name;
	String stock_market;
	String stock_sector;
	String stock_wics; 
	
	public Stock(String id, String stock_name, String stock_market, String stock_sector, String stock_wics) {
		super();
		this.id = id;
		this.stock_name = stock_name;
		this.stock_market = stock_market;
		this.stock_sector = stock_sector;
		this.stock_wics = stock_wics;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public String getStock_market() {
		return stock_market;
	}

	public void setStock_market(String stock_market) {
		this.stock_market = stock_market;
	}

	public String getStock_sector() {
		return stock_sector;
	}

	public void setStock_sector(String stock_sector) {
		this.stock_sector = stock_sector;
	}

	public String getStock_wics() {
		return stock_wics;
	}

	public void setStock_wics(String stock_wics) {
		this.stock_wics = stock_wics;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", stock_name=" + stock_name + ", stock_market=" + stock_market + ", stock_sector="
				+ stock_sector + ", stock_wics=" + stock_wics + "]";
	}
}
