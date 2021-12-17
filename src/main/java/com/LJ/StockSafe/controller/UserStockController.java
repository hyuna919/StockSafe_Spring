package com.LJ.StockSafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LJ.StockSafe.model.dto.UserStockDto;
import com.LJ.StockSafe.model.service.UserStockService;

@RestController
@RequestMapping("/userstock")
public class UserStockController {

	private static final String SUCCESS= "success";
	private static final String FAIL= "fail";
	
	@Autowired
	UserStockService userStockService;
	
	@PostMapping
	ResponseEntity<String> createUserStock(UserStockDto userstockdto){
		if(userStockService.createUserStock(userstockdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping
	ResponseEntity<List<UserStockDto>> readUserStock(String memberId){
		return new ResponseEntity<List<UserStockDto>> (userStockService.readUserStock(memberId), HttpStatus.OK);
	}
	
	
	@DeleteMapping
	ResponseEntity<String> deleteUserStock(UserStockDto userstockdto){
		if(userStockService.deleteUserStock(userstockdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
}
