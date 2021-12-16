package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.LJ.StockSafe.model.dto.MemberDto;
import com.LJ.StockSafe.model.dto.UserinfoDto;

@Mapper
public interface MemberMapper {
	int createUser(MemberDto userinfodto);
	List<MemberDto> readUserAll(String key, String word); 
	MemberDto readUser(String id);
	String loginUser(String id, String userinfo_pw);
	int updateUser(String id);
	int deleteUser(String id);
}
