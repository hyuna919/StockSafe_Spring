package com.LJ.StockSafe.model.service;

import java.util.List;

import com.LJ.StockSafe.model.dto.ReplyDto;

public interface ReplyService {
	boolean createReply(ReplyDto replydto);
	List<ReplyDto> readAllReply(int stockId);
	boolean updateReply(ReplyDto replydto);
	boolean deleteReply(ReplyDto replydto);
	

}
