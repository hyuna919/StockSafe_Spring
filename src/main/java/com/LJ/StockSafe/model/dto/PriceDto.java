package com.LJ.StockSafe.model.dto;

import java.math.BigDecimal;

public class PriceDto {
	BigDecimal now;
	BigDecimal low;
	BigDecimal high;
	BigDecimal prevClose;
	BigDecimal open;
	
	BigDecimal marketCap; 
	Long sharesOutstanding; //상장주식수
	BigDecimal eps; //eps
	BigDecimal pe; // PE
	BigDecimal bps; //bps
	BigDecimal annualYield;
	
	
	public PriceDto() {}

	public PriceDto(BigDecimal now, BigDecimal low, BigDecimal high, BigDecimal prevClose, BigDecimal open,
			BigDecimal marketCap, Long sharesOutstanding, BigDecimal eps, BigDecimal pe, BigDecimal bps,
			BigDecimal annualYield) {
		super();
		this.now = now;
		this.low = low;
		this.high = high;
		this.prevClose = prevClose;
		this.open = open;
		this.marketCap = marketCap;
		this.sharesOutstanding = sharesOutstanding;
		this.eps = eps;
		this.pe = pe;
		this.bps = bps;
		this.annualYield = annualYield;
	}
	
	
	public BigDecimal getNow() {
		return now;
	}
	public void setNow(BigDecimal now) {
		this.now = now;
	}
	public BigDecimal getLow() {
		return low;
	}
	public void setLow(BigDecimal low) {
		this.low = low;
	}
	public BigDecimal getHigh() {
		return high;
	}
	public void setHigh(BigDecimal high) {
		this.high = high;
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
	public BigDecimal getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(BigDecimal marketCap) {
		this.marketCap = marketCap;
	}
	public Long getSharesOutstanding() {
		return sharesOutstanding;
	}
	public void setSharesOutstanding(Long sharesOutstanding) {
		this.sharesOutstanding = sharesOutstanding;
	}
	public BigDecimal getEps() {
		return eps;
	}
	public void setEps(BigDecimal eps) {
		this.eps = eps;
	}
	public BigDecimal getPe() {
		return pe;
	}
	public void setPe(BigDecimal pe) {
		this.pe = pe;
	}
	public BigDecimal getBps() {
		return bps;
	}
	public void setBps(BigDecimal bps) {
		this.bps = bps;
	}
	public BigDecimal getAnnualYield() {
		return annualYield;
	}
	public void setAnnualYield(BigDecimal annualYield) {
		this.annualYield = annualYield;
	}
	
	

}
