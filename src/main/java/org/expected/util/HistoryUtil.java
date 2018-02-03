package org.expected.util ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.expected.entity.HistoryList;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class HistoryUtil {
	
	public static String getJson(String host, String path,String method, Map<String, String> headers, Map<String, String> querys){
		String stockJson = " ";
		try {
		    HttpResponse response = HistoryDeal.doGet(host, path, method, headers, querys);
		    //System.out.println(response.toString());
		    stockJson = EntityUtils.toString(response.getEntity());
		    	
		    }catch (Exception e) {
		    	e.printStackTrace();
		    }
		 return stockJson;
	}		
	
	
	public static List<HistoryList> getHistory(String beginDate,String stockCode,String endDate) {
		String host = "http://stock.market.alicloudapi.com";
		String path = "/sz-sh-stock-history";
		String method = "GET";
		String appcode = "8be5f909760147dbaf8d0bdc35fcf95d";
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", "APPCODE " + appcode);
	    Map<String, String> querys = new HashMap<String, String>();
		querys.put("begin", beginDate);
		querys.put("code", stockCode);
		querys.put("end", endDate);	
		String stockJson = getJson(host, path, method, headers, querys);
		List<HistoryList> historyList = new ArrayList<HistoryList>(); 
		
		JSONObject json1 = JSONObject.parseObject(stockJson);			
		JSONObject json2 = JSONObject.parseObject(json1.getString("showapi_res_body"));		
		JSONArray jsonArr = JSONArray.parseArray(json2.getString("list")) ;
		for(int i = 0 ; i < jsonArr.size() ; i++){
			HistoryList sr = new HistoryList() ;
			JSONObject obj = jsonArr.getJSONObject(i);
			int sum = i + 1 ;
			sr.setNumId(sum);
			sr.setMin_price(obj.getString("min_price"));
			sr.setMarket(obj.getString("market"));
			sr.setTrade_num(Double.valueOf(obj.getString("trade_num")));
			sr.setTrade_money(Double.valueOf(obj.getString("trade_money")));	
			sr.setClose_price(Double.valueOf(obj.getString("close_price")));
			sr.setOpen_price(Double.valueOf(obj.getString("open_price")));
			sr.setCode(obj.getString("code"));
			sr.setMax_price(Double.valueOf(obj.getString("max_price")));
			sr.setDate(obj.getString("date"));
			historyList.add(sr);
		}
		return historyList;
		
	}		
}
