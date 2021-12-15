package com.LJ.StockSafe.model.mapper;

import java.util.List;

import com.LJ.StockSafe.model.dto.UserStockDto;

public interface UserStockMapper {
	int createUserStock(String userinfoId, String stockId);
	List<UserStockDto> readUserStock(String userinfoId);
	int deleteUserStock(String userinfoId, String stockId);
}
