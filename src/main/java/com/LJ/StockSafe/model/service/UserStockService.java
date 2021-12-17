package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.UserStockDto;

public interface UserStockService {
	boolean createUserStock(UserStockDto userstockdto);
	List<UserStockDto> readUserStock(String memberId);
	boolean deleteUserStock(UserStockDto userstockdto);

}
