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
	public boolean createMember(MemberDto memberdto) {
		// TODO Auto-generated method stub
		if(memberMapper.createMember(memberdto)==1) return true;
		return false;
	}

	@Override
	public List<MemberDto> readMemberAll(String key, String word) {
		return memberMapper.readMemberAll(key, word);
	}

	@Override
	public MemberDto readMember(String id) {
		// TODO Auto-generated method stub
		return memberMapper.readMember(id);
	}

	@Override
	public String loginMember(MemberDto memberdto) {
		// TODO Auto-generated method stub
		return memberMapper.loginMember(memberdto);
	}

	@Override
	public boolean updateMember(MemberDto memberdto) {
		// TODO Auto-generated method stub
		if(memberMapper.updateMember(memberdto) != 0) return true;
		return false;
	}

	@Override
	public boolean deleteMember(String id) {
		// TODO Auto-generated method stub
		if(memberMapper.deleteMember(id) !=0 ) return true;
		return false;
	}
	
}
