package org.expected.util;

public class YieldRate {
	public static void main(String[] args){
		String[] prices={"1","1.5","2.5","4","8","5","4"};
		String[] yields = new String[prices.length-1];
		yields = YieldRate.yieldRateCalculator(prices);
		for(String s:yields){
			System.out.println(s);
		}
	}
	
	public static String[] yieldRateCalculator(String[] prices){
		int num = prices.length;
		String[] yieldRates = new String[num-1];
		for(int i=0;i<num-1;i++){
			yieldRates[i]= (Double.parseDouble(prices[i+1])-Double.parseDouble(prices[i]))/Double.parseDouble(prices[i])+"";
		}
		return yieldRates;
	}
}
