package com.LJ.StockSafe.model.dto;

import lombok.Data;

@Data
public class StockDetailDto {
	String stock_id;
	long stockdetail_marketcap;
	long stockdetail_count;
	float stockdetail_foreigner;
	float stockdetail_per;
	float stockdetail_pbr;
	float stockdetail_bps;
	float stockdetail_divyield;
}
