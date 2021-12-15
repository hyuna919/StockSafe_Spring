package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.LJ.StockSafe.model.dto.StockDto;

@Mapper
public interface StockMapper {
	int createStock(StockDto stock);
	List<StockDto> readStockAll(String keyword);
	StockDto readStockDetail(String id);
	int updateStock(String id, StockDto stock);
	int deleteStock(String id);
}
