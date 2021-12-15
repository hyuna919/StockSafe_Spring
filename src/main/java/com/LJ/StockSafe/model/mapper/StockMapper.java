package com.LJ.StockSafe.model.mapper;

import java.util.List;

import com.LJ.StockSafe.model.dto.StockDto;

public interface StockMapper {
	int createStock(String id, String stockName, String stockMarket, String stockSector, String stockWics);
	List<StockDto> readStockAll();
	StockDto readStockDetail(String id);
	int deleteStock(String id);
}
