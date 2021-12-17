package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.MemberStockDto;

public interface LikeStockService {
	
	boolean createLikeStock(MemberStockDto memberstockdto);
	List<MemberStockDto> readLikeStock(String memberId);
	boolean deleteLikeStock(String memberId, String StockId);
	
	
}
