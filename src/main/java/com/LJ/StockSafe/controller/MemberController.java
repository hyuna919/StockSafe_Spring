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

import com.LJ.StockSafe.model.dto.MemberDto;
import com.LJ.StockSafe.model.service.MemberService;

import io.swagger.annotations.Api;

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
	public ResponseEntity<String> createMember(@RequestBody MemberDto memberdto){
		if(memberService.createMember(memberdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/allmember")
	public ResponseEntity<List<MemberDto>> readMemberAll(String key, String word){
		return new ResponseEntity<List<MemberDto>>(memberService.readMemberAll(key, word), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<MemberDto> readMember(String id)
	{
		//null 이셉션 처리.
		return new ResponseEntity<MemberDto>(memberService.readMember(id), HttpStatus.OK);
	}

	@PutMapping("/edit")
	public ResponseEntity<String> updateMember(@RequestBody MemberDto memberdto){
		if(memberService.updateMember(memberdto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginMember(@RequestBody MemberDto memberdto)
	{
		String membername1 = memberService.loginMember(memberdto);
		if( membername1 != null) return new ResponseEntity<String>(membername1 + "님 환영합니다.", HttpStatus.OK); 
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteMember(String id)
	{
		if(memberService.deleteMember(id)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

}
