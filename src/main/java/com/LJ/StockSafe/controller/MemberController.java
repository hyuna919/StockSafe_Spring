package com.LJ.StockSafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LJ.StockSafe.model.dto.MemberDto;
import com.LJ.StockSafe.model.service.MemberService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/member")
@Api("Member Controller")
public class MemberController {
//	private final Logger
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private MemberService memberService;

//	List<UserinfoDto> readUserAll(String key, String word); 
	@GetMapping
	public ResponseEntity<List<MemberDto>> readUserAll(String key, String word){
		return new ResponseEntity<List<MemberDto>>(memberService.readUserAll(key, word), HttpStatus.OK);
	}

}