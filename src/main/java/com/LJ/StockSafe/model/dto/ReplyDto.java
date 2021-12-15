package com.LJ.StockSafe.model.dto;

import lombok.Data;

@Data
public class ReplyDto {
	private int id;
	private String stockId;
	private String replyContent;
	private String userinfoId;
	private String replyRegdate;
	private int replyLevel;
	private int replyParent;
}
