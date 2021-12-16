package com.LJ.StockSafe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LJ.StockSafe.model.dto.UserinfoDto;
import com.LJ.StockSafe.model.mapper.UserinfoMapper;

@Service
public class UserinfoServiceImpl implements UserinfoService{
	
	@Autowired
	UserinfoMapper userinfoMapper;

	@Override
	public boolean createUser(UserinfoDto createUser) {
		return userinfoMapper.createUser(createUser) == 1;
	}

	@Override
	public List<UserinfoDto> readUserAll(String key, String word) {
		return userinfoMapper.readUserAll(key, word);
	}

	@Override
	public UserinfoDto readUser(String id) {
		return userinfoMapper.readUser(id);
	}
	
	@Override
	public String loginUser(String id, String userinfo_pw){
		return userinfoMapper.loginUser(id, userinfo_pw);
	}

	@Override
	public boolean updateUser(String id) {
		return userinfoMapper.updateUser(id) == 1;
	}

	@Override
	public boolean deleteUser(String id) {
		return userinfoMapper.deleteUser(id) == 1;
	}
}
