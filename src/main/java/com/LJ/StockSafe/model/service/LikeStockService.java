package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.UserStockDto;

public interface LikeStockService {
	
	boolean createLikeStock(UserStockDto userstockdto);
	List<UserStockDto> readLikeStock(String memberId);
	boolean deleteLikeStock(String memberId, String StockId);
	
	
}
