package com.LJ.StockSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.LJ.StockSafe.model.dto.ReplyDto;

@Mapper
public interface ReplyMapper {

	int createReply(ReplyDto replydto);
	List<ReplyDto> readAllReply(String stockId);
	int updateReply(ReplyDto replydto);
	int deleteReply(ReplyDto replydto);
	
	
}
