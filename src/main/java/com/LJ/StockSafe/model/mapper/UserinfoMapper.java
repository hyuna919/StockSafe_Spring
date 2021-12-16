package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.LJ.StockSafe.model.dto.UserinfoDto;

@Mapper
public interface UserinfoMapper {
	int createUser(UserinfoDto userinfodto);
	List<UserinfoDto> readUserAll(String key, String word); 
	UserinfoDto readUser(String id);
	String loginUser(String id, String userinfo_pw);
	int updateUser(String id);
	int deleteUser(String id);
}
