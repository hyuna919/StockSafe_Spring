package com.LJ.StockSafe.model.mapper;

import java.util.List;

import com.LJ.StockSafe.model.dto.UserinfoDto;

public interface UserinfoMapper {
	int createUser(UserinfoDto userinfodto);
	List<UserinfoDto> readUserAll(String keyword); 
	UserinfoDto readUser(String id); 
	int updateUser(String id);
	int deleteUser(String id);

}
