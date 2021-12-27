package com.LJ.StockSafe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LJ.StockSafe.model.dto.NewsDto;
import com.LJ.StockSafe.model.mapper.NewsMapper;

@Service
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	NewsMapper newsMapper;

	@Override
	public boolean createNews(NewsDto newsdto) {
		if(newsMapper.createNews(newsdto)==1) return true;
		return false;
	}

	@Override
	public List<NewsDto> readStockNews(String stockId) {
		return newsMapper.readStockNews(stockId);
	}

	@Override
	public boolean deleteNews(String date) {
		try {
			// 날짜단위로 삭제하는 거라 삭제 성공의 결과가 0일 수도 있음
			newsMapper.deleteNews(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
