package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.LJ.StockSafe.model.dto.NewsDto;
import com.LJ.StockSafe.model.dto.StockDto;

@Mapper
public interface NewsMapper {
	int createNews(NewsDto newsdto);
	List<NewsDto> readStockNews(String stockId);// 종목코드통해 종목해 해당하는 뉴스 가져오기
	int deleteNews(String date);	// 지난 날짜 뉴스 일괄 지우기
}
