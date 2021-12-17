package com.LJ.StockSafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LJ.StockSafe.model.dto.StockDto;
import com.LJ.StockSafe.model.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	StockService stockService;
	
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@PostMapping
	public ResponseEntity<String> createStock(@RequestBody StockDto stockdto){
		if(stockService.createStock(stockdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping
	public ResponseEntity<StockDto> readStockDetail(String id){
		return new ResponseEntity<StockDto>(stockService.readStockDetail(id), HttpStatus.OK);  
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteStock(String id){
		if(stockService.deleteStock(id)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/searchAll")
	public ResponseEntity<List<StockDto>> readStockAll(String keyword){
		return new ResponseEntity<List<StockDto>>(stockService.readStockAll(keyword), HttpStatus.OK);  
	}

	
	
//
//	boolean updateStock(StockDto stockdto);
	
}
