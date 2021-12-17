package com.LJ.StockSafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LJ.StockSafe.model.dto.ReplyDto;
import com.LJ.StockSafe.model.service.ReplyService;

@RestController
@RequestMapping("/reply")
public class ReplyController {
	
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	ReplyService replyService;
	
	@PostMapping
	ResponseEntity<String> createReply(ReplyDto replydto){
		if(replyService.createReply(replydto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		else return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@GetMapping
	ResponseEntity<List<ReplyDto>> readAllReply(int stockId){
		return new ResponseEntity<List<ReplyDto>>(replyService.readAllReply(stockId), HttpStatus.OK);
	}
	
	@PutMapping
	ResponseEntity<String> updateReply(ReplyDto replydto){
		if(replyService.updateReply(replydto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		else return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping
	ResponseEntity<String> deleteReply(ReplyDto replydto){
		if(replyService.deleteReply(replydto)) return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		else return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	

}
