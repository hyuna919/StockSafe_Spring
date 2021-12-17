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

import com.LJ.StockSafe.model.dto.UserStockDto;
import com.LJ.StockSafe.model.service.LikeStockService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/likestock")
//@Api("Like Stock Controller")
public class LikeStockController {

	@Autowired
	LikeStockService likeStockService;
	
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@PostMapping
	public ResponseEntity<String> createLikeStock(@RequestBody UserStockDto userstockdto){
		if(likeStockService.createLikeStock(userstockdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping
	public ResponseEntity<List<UserStockDto>> readLikeStock(String memberId){
		return new ResponseEntity<List<UserStockDto>>(likeStockService.readLikeStock(memberId), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteLikeStock(String memberId, String stockId){
		if(likeStockService.deleteLikeStock(memberId, stockId)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
}
