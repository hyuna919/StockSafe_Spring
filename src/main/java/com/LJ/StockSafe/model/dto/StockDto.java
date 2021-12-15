package com.LJ.StockSafe.model.dto;

import lombok.Data;

@Data
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
}
