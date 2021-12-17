package com.LJ.StockSafe.model.dto;

public class StockDto {
	private String id;
	private String stockName;
	private String stockMarket;
	private String stockSector;
	private String stockWics;
	
	private long stockMarketcap;
	private long stockCount;
	private float stockForeigner;
	private float stockPer;
	private float stockPbr;
	private float stockBps;
	private float stockDivyield;
	
	public StockDto() {
		super();
	}
	public StockDto(String id, String stockName, String stockMarket, String stockSector, String stockWics,
			long stockMarketcap, long stockCount, float stockForeigner, float stockPer, float stockPbr, float stockBps,
			float stockDivyield) {
		super();
		this.id = id;
		this.stockName = stockName;
		this.stockMarket = stockMarket;
		this.stockSector = stockSector;
		this.stockWics = stockWics;
		this.stockMarketcap = stockMarketcap;
		this.stockCount = stockCount;
		this.stockForeigner = stockForeigner;
		this.stockPer = stockPer;
		this.stockPbr = stockPbr;
		this.stockBps = stockBps;
		this.stockDivyield = stockDivyield;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockMarket() {
		return stockMarket;
	}
	public void setStockMarket(String stockMarket) {
		this.stockMarket = stockMarket;
	}
	public String getStockSector() {
		return stockSector;
	}
	public void setStockSector(String stockSector) {
		this.stockSector = stockSector;
	}
	public String getStockWics() {
		return stockWics;
	}
	public void setStockWics(String stockWics) {
		this.stockWics = stockWics;
	}
	public long getStockMarketcap() {
		return stockMarketcap;
	}
	public void setStockMarketcap(long stockMarketcap) {
		this.stockMarketcap = stockMarketcap;
	}
	public long getStockCount() {
		return stockCount;
	}
	public void setStockCount(long stockCount) {
		this.stockCount = stockCount;
	}
	public float getStockForeigner() {
		return stockForeigner;
	}
	public void setStockForeigner(float stockForeigner) {
		this.stockForeigner = stockForeigner;
	}
	public float getStockPer() {
		return stockPer;
	}
	public void setStockPer(float stockPer) {
		this.stockPer = stockPer;
	}
	public float getStockPbr() {
		return stockPbr;
	}
	public void setStockPbr(float stockPbr) {
		this.stockPbr = stockPbr;
	}
	public float getStockBps() {
		return stockBps;
	}
	public void setStockBps(float stockBps) {
		this.stockBps = stockBps;
	}
	public float getStockDivyield() {
		return stockDivyield;
	}
	public void setStockDivyield(float stockDivyield) {
		this.stockDivyield = stockDivyield;
	}
	
	
}
