package org.expected.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.expected.entity.StockData;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.util.EntityUtils;



public class StockRealTimeAPI {
		public static double ParseSimple(String str){
			double num = Double.valueOf(str) ;
			return num ;
		}
		
		public static double ParseThree(String str){
			double num = Double.valueOf(str) / 1000;
			return num ;
		}
		
		public static double ParseSix(String str){
			double num = Double.valueOf(str) / 100000 ;
			return num ;
		}
		
		public static StockData realtimeApi(String stockCode){
		    String host = "http://xhuabu.market.alicloudapi.com";
		    String path = "/quote/real";
		    String method = "GET";
		    String appcode = "32c9363028a4408885d6b434fbf8adde";
		    Map<String, String> headers = new HashMap<String, String>();
		    headers.put("Authorization", "APPCODE " + appcode);
		    Map<String, String> querys = new HashMap<String, String>();
		    querys.put("security_code", "SH."+stockCode);

		    StockData sdata = new StockData();
		    try {
		    	
		    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
		    	String jsonString = EntityUtils.toString(response.getEntity());
		    	System.out.println(jsonString);
		    	JSONObject jsonObject= JSONObject.parseObject(jsonString);
		    	JSONObject data = JSONObject.parseObject(jsonObject.getString("data")) ;
		    	//System.out.println(jsonObject.getString("data"));
		    	
		    	sdata.setSecurityCode(data.getString("securityCode"));
		    	sdata.setName(data.getString("name"));
		    	sdata.setNow(ParseThree(data.getString("now")));
		    	sdata.setClose(ParseThree(data.getString("close")));
		    	sdata.setOpen(ParseThree(data.getString("open")));
		    	sdata.setHigh(ParseThree(data.getString("high")));
		    	sdata.setLow(ParseThree(data.getString("low")));
		    	sdata.setVolume(ParseSimple(data.getString("volume")));
		    	
		    	sdata.setBid1(ParseThree(data.getString("bid1")));
		    	sdata.setBid2(ParseThree(data.getString("bid2")));
		    	sdata.setBid3(ParseThree(data.getString("bid3")));
		    	sdata.setBid4(ParseThree(data.getString("bid4")));
		    	sdata.setBid5(ParseThree(data.getString("bid5")));
		    	sdata.setBid1Volume(ParseSimple(data.getString("bid1Volume")));
		    	sdata.setBid2Volume(ParseSimple(data.getString("bid2Volume")));
		    	sdata.setBid3Volume(ParseSimple(data.getString("bid3Volume")));
		    	sdata.setBid4Volume(ParseSimple(data.getString("bid4Volume")));
		    	sdata.setBid5Volume(ParseSimple(data.getString("bid5Volume")));
		    	
		    	sdata.setAsk1(ParseThree(data.getString("ask1")));
		    	sdata.setAsk2(ParseThree(data.getString("ask2")));
		    	sdata.setAsk3(ParseThree(data.getString("ask3")));
		    	sdata.setAsk4(ParseThree(data.getString("ask4")));
		    	sdata.setAsk5(ParseThree(data.getString("ask5")));
		    	sdata.setAsk1Volume(ParseSimple(data.getString("ask1Volume")));
		    	sdata.setAsk2Volume(ParseSimple(data.getString("ask2Volume")));
		    	sdata.setAsk3Volume(ParseSimple(data.getString("ask3Volume")));
		    	sdata.setAsk4Volume(ParseSimple(data.getString("ask4Volume")));
		    	sdata.setAsk5Volume(ParseSimple(data.getString("ask5Volume")));
		    	
		    	sdata.setDatetime(data.getString("datetime"));
		    } catch (Exception e){ 
		    	e.printStackTrace();
		    }
		    return sdata;
		}
	
}
