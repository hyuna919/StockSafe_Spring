package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.LJ.StockSafe.model.dto.UserStockDto;

@Mapper
public interface UserStockMapper {
	int createUserStock(UserStockDto userstockdto);
	List<UserStockDto> readUserStock(String memberId);
	int deleteUserStock(UserStockDto userstockdto);
}
