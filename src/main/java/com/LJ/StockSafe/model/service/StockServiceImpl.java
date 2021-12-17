package com.LJ.StockSafe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LJ.StockSafe.model.dto.StockDto;
import com.LJ.StockSafe.model.mapper.StockMapper;

@Service
public class StockServiceImpl implements StockService{

	@Autowired
	StockMapper stockmapper;
	
	@Override
	public boolean createStock(StockDto stockdto) {
		// TODO Auto-generated method stub
		if(stockmapper.createStock(stockdto) == 1) return true;
		return false;
	}

	@Override
	public List<StockDto> readStockAll(String keyword) {
		// TODO Auto-generated method stub
		return stockmapper.readStockAll(keyword);
	}

	@Override
	public StockDto readStockDetail(String id) {
		// TODO Auto-generated method stub
		return stockmapper.readStockDetail(id);
	}

	@Override
	public boolean updateStock(StockDto stockdto) {
		// TODO Auto-generated method stub
		if(stockmapper.updateStock(stockdto)==1) return true;
		return false;
	}

	@Override
	public boolean deleteStock(String id) {
		// TODO Auto-generated method stub
		if(stockmapper.deleteStock(id)==1) return true;
		return false;
	}

}
