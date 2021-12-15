package com.LJ.StockSafe.model.mapper;

import java.util.List;

import com.LJ.StockSafe.model.dto.ReplyDto;

public interface ReplyMapper {

	int createReply(ReplyDto reply);
	List<ReplyDto> readAllReply(int stockId);
	int updateReply(int id, String userinfoId, String replyContent);
	int deleteReply(int id, String userinfoId);
	
	
}
