package com.LJ.StockSafe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LJ.StockSafe.model.dto.MemberDto;
import com.LJ.StockSafe.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper memberMapper;

	@Override
	public boolean createUser(MemberDto memberdto) {
		// TODO Auto-generated method stub
		if(memberMapper.createUser(memberdto)==1) return true;
		return false;
	}

	@Override
	public List<MemberDto> readUserAll(String key, String word) {
		return memberMapper.readUserAll(key, word);
	}

	@Override
	public MemberDto readUser(String id) {
		// TODO Auto-generated method stub
		return memberMapper.readUser(id);
	}

	@Override
	public String loginUser(String id, String userinfo_pw) {
		// TODO Auto-generated method stub
		return memberMapper.loginUser(id, userinfo_pw);
	}

	@Override
	public boolean updateUser(MemberDto memberdto) {
		// TODO Auto-generated method stub
		if(memberMapper.updateUser(memberdto) != 0) return true;
		return false;
	}

	@Override
	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		if(memberMapper.deleteUser(id) !=0 ) return true;
		return false;
	}
	
}
