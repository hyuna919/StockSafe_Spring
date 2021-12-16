package com.LJ.StockSafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LJ.StockSafe.model.dto.UserinfoDto;
import com.LJ.StockSafe.model.service.UserinfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/userinfo")
@Api("Userinfo Controller")
public class UserinfoController {
//	private final Logger
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private UserinfoService userinfoService;

//	List<UserinfoDto> readUserAll(String key, String word); 
	@GetMapping
	public ResponseEntity<List<UserinfoDto>> readUserAll(String key, String word){
		return new ResponseEntity<List<UserinfoDto>>(userinfoService.readUserAll(key, word), HttpStatus.OK);
	}

}
