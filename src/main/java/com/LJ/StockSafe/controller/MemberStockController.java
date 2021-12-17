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

import com.LJ.StockSafe.model.dto.MemberStockDto;
import com.LJ.StockSafe.model.service.MemberStockService;

@RestController
@RequestMapping("/memberstock")
public class MemberStockController {

	private static final String SUCCESS= "success";
	private static final String FAIL= "fail";
	
	@Autowired
	MemberStockService memberStockService;
	
	@PostMapping
	ResponseEntity<String> createMemberStock(@RequestBody MemberStockDto memberstockdto){
		if(memberStockService.createMemberStock(memberstockdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping
	ResponseEntity<List<MemberStockDto>> readMemberStock(String memberId){
		return new ResponseEntity<List<MemberStockDto>> (memberStockService.readMemberStock(memberId), HttpStatus.OK);
	}
	
	
	@DeleteMapping
	ResponseEntity<String> deleteMemberStock(MemberStockDto memberstockdto){
		if(memberStockService.deleteMemberStock(memberstockdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
}
