package org.expected.service.impl;

import org.expected.dao.StockToIndustry;
import org.expected.service.StockToIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StockToIndustryServiceImpl implements StockToIndustryService {
	@Autowired
	StockToIndustry stockToIndustry;
	
	@Override
	public String[] getIndustryHistoryDataByStockCode(String stockCode, String beginDate, String endDate) {
		String Industry;
		// TODO Auto-generated method stub
		Industry=stockToIndustry.getIndustry(stockCode);
		
		String[] industry_prices =  stockToIndustry.getIndexClosedPoints(Industry, beginDate, endDate);
		return industry_prices;
	}

}
