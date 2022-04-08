package com.LJ.StockSafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LJ.StockSafe.model.dto.MemberStockDto;
import com.LJ.StockSafe.model.service.LikeStockService;


@RestController
@RequestMapping("/likestock")
@CrossOrigin(origins = "*")
//@Api("Like Stock Controller")
public class LikeStockController {

	@Autowired
	LikeStockService likeStockService;
	
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@PostMapping
	public ResponseEntity<String> createLikeStock(@RequestBody MemberStockDto memberstockdto) throws Exception{
		if(likeStockService.createLikeStock(memberstockdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping
	public ResponseEntity<List<MemberStockDto>> readLikeStock(String memberId) throws Exception{
		
		
		
		return new ResponseEntity<List<MemberStockDto>>(likeStockService.readLikeStock(memberId), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteLikeStock(MemberStockDto memberstockdto){
		if(likeStockService.deleteLikeStock(memberstockdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
}
