package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.NewsDto;

public interface NewsService {

	boolean createNews(NewsDto newsdto);
	List<NewsDto> readStockNews(String stockId);
	boolean deleteNews(String date);
}
