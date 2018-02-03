package org.expected.util;

import java.util.List;

import org.expected.entity.HistoryList;
import org.springframework.web.bind.annotation.RequestParam;

public class HistoryDataAPI {
	public static String[] stockSearch(String stockCode, String beginDate, String endDate){
		List<HistoryList> historyList = HistoryUtil.getHistory(beginDate, stockCode, endDate);
		//System.out.println(historyList);
		//System.out.println(historyList.size());
		int num = historyList.size();
		String [] stockPrices = new String[num];
		for(int i=0;i<num;i++){
			stockPrices[i]=historyList.get(i).getClose_price()+"";
		}
		return stockPrices;
	}
}
