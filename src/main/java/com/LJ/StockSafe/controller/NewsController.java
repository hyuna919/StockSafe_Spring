package com.LJ.StockSafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LJ.StockSafe.model.dto.NewsDto;
import com.LJ.StockSafe.model.dto.StockDto;
import com.LJ.StockSafe.model.service.NewsService;
import com.LJ.StockSafe.model.service.StockService;

@RestController
@RequestMapping("/news")
public class NewsController {

	@Autowired
	NewsService newsService;
	
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@PostMapping
	public ResponseEntity<String> createNews(@RequestBody NewsDto newsdto){
		if(newsService.createNews(newsdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping
	public ResponseEntity<List<NewsDto>> readStockNews(String stockId){
		return new ResponseEntity<List<NewsDto>>(newsService.readStockNews(stockId), HttpStatus.OK);  
	}
	
	
	@DeleteMapping
	public ResponseEntity<String> deleteNews(String date){
		if(newsService.deleteNews(date)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	
	
}
