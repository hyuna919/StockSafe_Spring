package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.LJ.StockSafe.model.dto.MemberStockDto;

@Mapper
public interface LikeStockMapper {

	int createLikeStock(MemberStockDto memberstockdto);
	List<MemberStockDto> readLikeStock(String memberId);
	int deleteLikeStock(MemberStockDto memberstockdto);
	
}
