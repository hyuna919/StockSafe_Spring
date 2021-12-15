package com.LJ.StockSafe.model.dto;

import lombok.Data;

@Data
public class ReplyDto {
	int id;
	String stockId;
	String replyContent;
	String userinfoId;
	String replyRegdate;
	int replyLevel;
	int replyParent;
}
