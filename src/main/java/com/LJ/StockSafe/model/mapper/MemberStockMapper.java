package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.LJ.StockSafe.model.dto.MemberStockDto;

@Mapper
public interface MemberStockMapper {
	int createMemberStock(MemberStockDto memberstockdto);
	List<MemberStockDto> readMemberStock(String memberId);
	int deleteMemberStock(MemberStockDto memberstockdto);
}
