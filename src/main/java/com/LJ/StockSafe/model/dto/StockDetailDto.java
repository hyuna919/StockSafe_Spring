package com.LJ.StockSafe.model.dto;

import lombok.Data;

@Data
public class StockDetailDto {
	private String stock_id;
	private long stockdetail_marketcap;
	private long stockdetail_count;
	private float stockdetail_foreigner;
	private float stockdetail_per;
	private float stockdetail_pbr;
	private float stockdetail_bps;
	private float stockdetail_divyield;
}
