package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.LJ.StockSafe.model.dto.UserStockDto;

@Mapper
public interface LikeStockMapper {

	int createLikeStock(UserStockDto userstockdto);
	List<UserStockDto> readLikeStock(String memberId);
	int deleteLikeStock(@Param("memberId") String memberId, @Param("stockId") String stockId);
	
}
