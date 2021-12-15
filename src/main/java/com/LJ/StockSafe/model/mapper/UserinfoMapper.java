package com.LJ.StockSafe.model.mapper;

import java.util.List;

import com.LJ.StockSafe.model.dto.UserinfoDto;

public interface UserinfoMapper {
	int createUser(String id, String userinfoPw, String userinfoName, String userinfoRegdate);
	List<UserinfoDto> readUserAll();
	UserinfoDto readUser(String id);
	int updateUser(String id);
	int deleteUser(String id);

}
