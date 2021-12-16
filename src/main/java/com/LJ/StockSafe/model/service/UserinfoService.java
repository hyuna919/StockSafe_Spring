package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.UserinfoDto;

public interface UserinfoService {
	boolean createUser(UserinfoDto userinfodto);
	List<UserinfoDto> readUserAll(String key, String word); 
	UserinfoDto readUser(String id); 
	boolean updateUser(String id);
	boolean deleteUser(String id);
}
