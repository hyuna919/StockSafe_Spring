package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.LJ.StockSafe.model.dto.MemberDto;

@Mapper
public interface MemberMapper {
	int createMember(MemberDto memberdto);
	List<MemberDto> readMemberAll(@Param("key") String key, @Param("word") String word); 
	MemberDto readMember(String id);
	String loginMember(@Param("id") String id, @Param("memberPw") String memberPw);
	int updateMember(MemberDto memberdto);
	int deleteMember(String id);
}
