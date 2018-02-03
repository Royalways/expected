package org.expected.controller;

import org.expected.entity.StockData;
import org.expected.util.StockRealTimeAPI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StockRealTimeQuotation {
	@RequestMapping(value = "stocksearch", method = RequestMethod.POST)
	public ModelAndView stockSearch(@RequestParam("stockCode") String stockCode){
        StockData stockData = new StockRealTimeAPI().realtimeApi(stockCode);
        System.out.println(stockData.getName());
        ModelAndView mav = new ModelAndView("show-one-stock");
        mav.addObject("stock", stockData);
        return mav;
	}
}
