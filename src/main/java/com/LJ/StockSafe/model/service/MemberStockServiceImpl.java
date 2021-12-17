package com.LJ.StockSafe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LJ.StockSafe.model.dto.MemberStockDto;
import com.LJ.StockSafe.model.mapper.MemberStockMapper;

@Service
public class MemberStockServiceImpl implements MemberStockService{

	@Autowired
	MemberStockMapper memberstockmapper;
	
	@Override
	public boolean createMemberStock(MemberStockDto memberstockdto) {
		// TODO Auto-generated method stub
		if(memberstockmapper.createMemberStock(memberstockdto) == 1) return true;
		return false;
	}

	@Override
	public List<MemberStockDto> readMemberStock(String memberId) {
		// TODO Auto-generated method stub
		return memberstockmapper.readMemberStock(memberId);
	}

	@Override
	public boolean deleteMemberStock(MemberStockDto memberstockdto) {
		// TODO Auto-generated method stub
		if(memberstockmapper.deleteMemberStock(memberstockdto) !=0 ) return true;
		return false;
	}

}
