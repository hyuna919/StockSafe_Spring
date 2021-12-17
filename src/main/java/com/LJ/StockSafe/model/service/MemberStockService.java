package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.MemberStockDto;

public interface MemberStockService {
	boolean createMemberStock(MemberStockDto membertockdto);
	List<MemberStockDto> readMemberStock(String memberId);
	boolean deleteMemberStock(MemberStockDto memberstockdto);

}
