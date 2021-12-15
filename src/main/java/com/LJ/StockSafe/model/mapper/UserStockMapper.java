package com.LJ.StockSafe.model.mapper;

import java.util.List;

import com.LJ.StockSafe.model.dto.UserStockDto;

public interface UserStockMapper {
	int createMyStock(String userinfoId, String stockId);
	List<UserStockDto> readMyStock(String userinfoId);
	int deleteMyStock(String userinfoId, String stockId);
}
