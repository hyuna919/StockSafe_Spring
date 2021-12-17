package com.LJ.StockSafe.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	
	@PostMapping("/signup")
	public ResponseEntity<String> createUser(MemberDto memberdto){
		if(memberService.createUser(memberdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/alluser")
	public ResponseEntity<List<MemberDto>> readUserAll(String key, String word){
		return new ResponseEntity<List<MemberDto>>(memberService.readUserAll(key, word), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<MemberDto> readUser(String id)
	{
		//null 이셉션 처리.
		return new ResponseEntity<MemberDto>(memberService.readUser(id), HttpStatus.OK);
	}

	@PutMapping("/edit")
	public ResponseEntity<String> updateUser(MemberDto memberdto){
		if(memberService.updateUser(memberdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(String id, String memberPw)
	{
		String membername1 = memberService.loginUser(id, memberPw);
		if( membername1 != null) return new ResponseEntity<String>(membername1 + "님 환영합니다.", HttpStatus.OK); 
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteUser(String id)
	{
		if(memberService.deleteUser(id)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

}
