package org.expected.service;

public interface StockToIndustryService {
	public String[] getIndustryHistoryDataByStockCode(String stockCode, String beginDate, String endDate);
}
