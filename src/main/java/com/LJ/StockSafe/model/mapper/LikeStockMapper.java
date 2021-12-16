package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.LJ.StockSafe.model.dto.UserStockDto;

@Mapper
public interface LikeStockMapper {

	int createLikeStock(UserStockDto userstock);
	List<UserStockDto> readLikeStock(String userinfoId);
	int deleteLikeStock(int id);
	
}
