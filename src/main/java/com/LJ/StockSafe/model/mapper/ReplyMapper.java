package com.LJ.StockSafe.model.mapper;

import java.util.List;

import com.LJ.StockSafe.model.dto.ReplyDto;

public interface ReplyMapper {

	int createReply(String stockId, String replyContent, String userinfoId, String replyRegdate, int replyLevel, int replyParent);
	List<ReplyDto> readAllReply();
	int updateReply(int id, String userinfoId);
	int deleteReply(int id, String userinfoId);
	
	
}
