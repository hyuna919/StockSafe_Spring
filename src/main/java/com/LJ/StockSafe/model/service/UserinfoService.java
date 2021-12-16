package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.UserinfoDto;

public interface UserinfoService {
	boolean createUser(UserinfoDto userinfodto);
	List<UserinfoDto> readUserAll(String key, String word); 
	UserinfoDto readUser(String id); 
	String loginUser(String id, String userinfo_pw);
	boolean updateUser(String id);
	boolean deleteUser(String id);
}
