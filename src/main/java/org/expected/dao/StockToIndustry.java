package org.expected.dao;

import java.util.List;

public interface StockToIndustry {
	public String[] getIndexClosedPoints(String industry, String beginDate, String endDate);
	public String getIndustry(String stockCode);
}
