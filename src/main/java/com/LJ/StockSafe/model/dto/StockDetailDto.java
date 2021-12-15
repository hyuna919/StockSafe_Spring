package com.LJ.StockSafe.model.dto;

import lombok.Data;

@Data
public class StockDetailDto {
	private String stockId;
	private long stockdetailMarketcap;
	private long stockdetailCount;
	private float stockdetailForeigner;
	private float stockdetailPer;
	private float stockdetailPbr;
	private float stockdetailBps;
	private float stockdetailDivyield;
}
