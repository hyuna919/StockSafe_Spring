package com.LJ.StockSafe.model.dto;

import java.math.BigDecimal;

public class PriceDto {
	BigDecimal now;
	BigDecimal Low;
	BigDecimal High;
	BigDecimal prevClose;
	BigDecimal open;
	
	public PriceDto(BigDecimal now, BigDecimal low, BigDecimal high, BigDecimal prevClose, BigDecimal open) {
		super();
		this.now = now;
		Low = low;
		High = high;
		this.prevClose = prevClose;
		this.open = open;
	}
	
	public PriceDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getNow() {
		return now;
	}
	public void setNow(BigDecimal now) {
		this.now = now;
	}
	public BigDecimal getLow() {
		return Low;
	}
	public void setLow(BigDecimal low) {
		Low = low;
	}
	public BigDecimal getHigh() {
		return High;
	}
	public void setHigh(BigDecimal high) {
		High = high;
	}
	public BigDecimal getPrevClose() {
		return prevClose;
	}
	public void setPrevClose(BigDecimal prevClose) {
		this.prevClose = prevClose;
	}
	public BigDecimal getOpen() {
		return open;
	}
	public void setOpen(BigDecimal open) {
		this.open = open;
	}
	
}
