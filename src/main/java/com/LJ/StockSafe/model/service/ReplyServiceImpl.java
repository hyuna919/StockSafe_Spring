package com.LJ.StockSafe.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LJ.StockSafe.model.dto.ReplyDto;
import com.LJ.StockSafe.model.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	ReplyMapper replyMapper;
	
	@Override
	public boolean createReply(ReplyDto replydto) {
		// TODO Auto-generated method stub
		if(replyMapper.createReply(replydto) == 1) return true;
		return false;
	}

	@Override
	public List<ReplyDto> readAllReply(int stockId) {
		// TODO Auto-generated method stub
		return replyMapper.readAllReply(stockId);
	}

	@Override
	public boolean updateReply(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		if(replyMapper.updateReply(replyDto) !=0 ) return true; 
		return false;
	}

	@Override
	public boolean deleteReply(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		if(replyMapper.deleteReply(replyDto) !=0 ) return true; 
		return false;
	}

}
