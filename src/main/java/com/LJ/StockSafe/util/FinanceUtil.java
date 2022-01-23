package com.LJ.StockSafe.util;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.LJ.StockSafe.model.dto.PriceDto;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;


@Component
public class FinanceUtil {

    public PriceDto readPrice(String stockId) throws IOException {
    	Stock stock = YahooFinance.get(stockId + ".KS");
    	PriceDto priceDto = new PriceDto();

////    	Stock stock = YahooFinance.get("000660.KS");
////    	Calendar from = Calendar.getInstance();
////    	Calendar to = Calendar.getInstance();
////    	from.add(Calendar.YEAR, -1); // from 5 years ago
////    	Stock stock = YahooFinance.get("GOOG", from, to, Interval.DAILY);
//    	
//    	BigDecimal price = stock.getQuote().getPrice();
//    	BigDecimal change = stock.getQuote().getChangeInPercent();
//    	BigDecimal peg = stock.getStats().getPeg();
//    	BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
//    	BigDecimal x1 = stock.getQuote().getDayLow();
//    	BigDecimal x2 = stock.getQuote().getDayHigh();
////    	BigDecimal x3 = stock.getStats().getEps();
////    	BigDecimal x4 = stock.getDividend().getAnnualYield();
    	
    	// 모든 정보 출력
    	//stock.print();
    	
    	BigDecimal now = stock.getQuote().getPrice();
    	BigDecimal low = stock.getQuote().getDayLow();
    	BigDecimal high = stock.getQuote().getDayHigh();
    	BigDecimal prevClose = stock.getQuote().getPreviousClose();
    	BigDecimal open = stock.getQuote().getOpen();
    	
    	priceDto.setNow(now);
    	priceDto.setLow(low);
    	priceDto.setHigh(high);
    	priceDto.setPrevClose(prevClose);
    	priceDto.setOpen(open);
    	
        return priceDto;
    }
}
