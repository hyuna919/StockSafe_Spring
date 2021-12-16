package com.LJ.StockSafe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LJ.StockSafe.model.dto.MemberDto;
import com.LJ.StockSafe.model.dto.UserinfoDto;
import com.LJ.StockSafe.model.mapper.MemberMapper;
import com.LJ.StockSafe.model.mapper.UserinfoMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper memberMapper;

	@Override
	public boolean createUser(MemberDto userinfodto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MemberDto> readUserAll(String key, String word) {
		return memberMapper.readUserAll(key, word);
	}

	@Override
	public MemberDto readUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginUser(String id, String userinfo_pw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
