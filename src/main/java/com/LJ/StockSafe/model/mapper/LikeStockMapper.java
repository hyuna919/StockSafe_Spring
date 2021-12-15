package com.LJ.StockSafe.model.mapper;

import java.util.List;
import com.LJ.StockSafe.model.dto.UserStockDto;

public interface LikeStockMapper {

	int createLikeStock( String userinfoId, String stockId);
	List<UserStockDto> readLikeStock(String userinfoId);
	int deleteLikeStock( String userinfoId, String stockId );
	
}
