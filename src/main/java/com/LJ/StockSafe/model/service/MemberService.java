package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.MemberDto;
import com.LJ.StockSafe.model.dto.UserinfoDto;

public interface MemberService {
	boolean createUser(MemberDto userinfodto);
	List<MemberDto> readUserAll(String key, String word); 
	MemberDto readUser(String id); 
	String loginUser(String id, String userinfo_pw);
	boolean updateUser(String id);
	boolean deleteUser(String id);
}
