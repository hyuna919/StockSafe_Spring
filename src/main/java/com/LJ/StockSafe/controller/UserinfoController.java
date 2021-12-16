package com.LJ.StockSafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping()
	public ResponseEntity<String> createUser(@RequestBody  @ApiParam(value="회원가입 정보 (아이디, 비밀번호)", required= true) UserinfoDto userinfoDto){
		
		boolean a = userinfoService.createUser(userinfoDto);
		System.out.println(a);
		return null;
	}
	
	@GetMapping
	public ResponseEntity<List<UserinfoDto>> readUserAll(@ApiParam(value="유저 검색 기준") String key, @ApiParam(value="유저 검색 단어")String word){
		userinfoService.readUserAll(key, word);
		return null;
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestParam  @ApiParam(value="로그인 아이디 ", required= true) String id,
			@RequestParam  @ApiParam(value="로그인 비밀번호", required= true) String userinfo_pw){
		
		return new ResponseEntity<String>(userinfoService.loginUser(id, userinfo_pw) , HttpStatus.OK);
	}


}
