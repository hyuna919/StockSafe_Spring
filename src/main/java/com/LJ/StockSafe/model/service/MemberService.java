package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.MemberDto;

public interface MemberService {
	
	boolean createMember(MemberDto memberdto);
	List<MemberDto> readMemberAll(String key, String word); 
	MemberDto readMember(String id); 
	String loginMember(MemberDto memberdto);
	boolean updateMember(MemberDto memberdto);
	boolean deleteMember(String id);
}
