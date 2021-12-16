package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.LJ.StockSafe.model.dto.MemberDto;

@Mapper
public interface MemberMapper {
	int createUser(MemberDto userinfodto);
	List<MemberDto> readUserAll(@Param("key") String key, @Param("word") String word); 
	MemberDto readUser(String id);
	String loginUser(@Param("id") String id, @Param("userinfo_pw") String userinfo_pw);
	int updateUser(String id);
	int deleteUser(String id);
}
