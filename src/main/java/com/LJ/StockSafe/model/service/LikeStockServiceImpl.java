package com.LJ.StockSafe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LJ.StockSafe.model.dto.MemberStockDto;
import com.LJ.StockSafe.model.mapper.LikeStockMapper;

@Service
public class LikeStockServiceImpl implements LikeStockService{

	@Autowired
	LikeStockMapper likeStockmapper;
	
	@Override
	public boolean createLikeStock(MemberStockDto memberstockdto) {
		// TODO Auto-generated method stub
		if(likeStockmapper.createLikeStock(memberstockdto)==1) return true;
		return false;
	}

	@Override
	public List<MemberStockDto> readLikeStock(String memberId) {
		// TODO Auto-generated method stub
		return likeStockmapper.readLikeStock(memberId);
	}

	@Override
	public boolean deleteLikeStock(String memberId, String stockId) {
		// TODO Auto-generated method stub
		if(likeStockmapper.deleteLikeStock(memberId, stockId)!=0) return true;
		return false;
	}

	
}
