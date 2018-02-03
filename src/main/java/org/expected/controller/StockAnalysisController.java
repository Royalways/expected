package org.expected.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.expected.service.StockToIndustryService;
import org.expected.util.HistoryDataAPI;
import org.expected.util.MathUtil;
import org.expected.util.TrainingLinearRegressionModel;
import org.expected.util.YieldRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.functions.SimpleLinearRegression;


@Controller
public class StockAnalysisController {
	@Autowired
	StockToIndustryService stockToIndustryService;
	
	@RequestMapping(value="stockanalysis", method=RequestMethod.GET)
	public String BetaCalculator(@RequestParam String stockCode){
		String beginDate;
		String endDate;
		LinkedList<Double> Betas = new LinkedList<Double>();
		//Parameter value
		HashMap<String,String> dates = new HashMap<String,String>();
		dates.put("beginDate5","2017-05-01");
		dates.put("beginDate4","2017-04-01");
		dates.put("beginDate3","2017-03-01");
		dates.put("beginDate2","2017-02-01");
		dates.put("beginDate1","2017-01-01");
		dates.put("endDate5","2017-06-01");
		dates.put("endDate4","2017-05-01");
		dates.put("endDate3","2017-04-01");
		dates.put("endDate2","2017-03-01");
		dates.put("endDate1","2017-02-01");

		for(int i=1;i<=dates.size()/2;i++){
			beginDate=dates.get("beginDate"+i);
			endDate=dates.get("endDate"+i);
		//stock
			String[] stockPrices = HistoryDataAPI.stockSearch(stockCode, beginDate, endDate);
			String[] stockYields = YieldRate.yieldRateCalculator(stockPrices);
		
		//industry
			String[] industryPrices = stockToIndustryService.getIndustryHistoryDataByStockCode(stockCode, beginDate, endDate);
			String[] industryYields = YieldRate.yieldRateCalculator(industryPrices);
		
			System.out.println(stockPrices.length+"-----"+industryPrices.length+"###"+stockYields.length+"--------"+industryYields.length);
			try {
				SimpleLinearRegression linearModel =(SimpleLinearRegression)TrainingLinearRegressionModel.simpleLinearModel(industryYields, stockYields);			
				System.out.println("Y = "+linearModel.getSlope()+"X + "+linearModel.getIntercept());
				Betas.addLast(linearModel.getSlope());
			} catch (Exception e) {
			// TODO: handle exception
			}
		}
		System.out.println(MathUtil.ExponentialSmoothing(0.5, Betas)+"!!!!!!!!!!!!!!!!!!!");
			return "stockAnalysisResult";
	}
}
