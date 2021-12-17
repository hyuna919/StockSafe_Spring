package com.LJ.StockSafe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LJ.StockSafe.model.dto.UserStockDto;
import com.LJ.StockSafe.model.mapper.UserStockMapper;

@Service
public class UserStockServiceImpl implements UserStockService{

	@Autowired
	UserStockMapper userstockmapper;
	
	@Override
	public boolean createUserStock(UserStockDto userstockdto) {
		// TODO Auto-generated method stub
		if(userstockmapper.createUserStock(userstockdto) == 1) return true;
		return false;
	}

	@Override
	public List<UserStockDto> readUserStock(String memberId) {
		// TODO Auto-generated method stub
		return userstockmapper.readUserStock(memberId);
	}

	@Override
	public boolean deleteUserStock(UserStockDto userstockdto) {
		// TODO Auto-generated method stub
		if(userstockmapper.deleteUserStock(userstockdto) !=0 ) return true;
		return false;
	}

}
