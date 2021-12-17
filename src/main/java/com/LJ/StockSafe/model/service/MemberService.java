package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.MemberDto;

public interface MemberService {
	
	boolean createUser(MemberDto memberdto);
	List<MemberDto> readUserAll(String key, String word); 
	MemberDto readUser(String id); 
	String loginUser(String id, String memberPw);
	boolean updateUser(MemberDto memberdto);
	boolean deleteUser(String id);
}
