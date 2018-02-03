package org.expected.entity;

import java.util.Date;

public class StockData {
	private int id ;
	private String securityCode ; 
	private String name ; 
	private double now ; 
	private double close ; 
	private double open ; 
	private double high ; 
	private double low ; 
	private double volume ; 
	
	private double bid1 ; 
	private double bid2 ; 
	private double bid3 ; 
	private double bid4 ; 
	private double bid5 ; 
	private double bid1Volume ; 
	private double bid2Volume ; 
	private double bid3Volume ; 
	private double bid4Volume ; 
	private double bid5Volume ; 
	
	private double ask1 ;
	private double ask2 ;
	private double ask3 ;
	private double ask4 ;
	private double ask5 ;
	private double ask1Volume ;
	private double ask2Volume ;
	private double ask3Volume ; 
	private double ask4Volume ;
	private double ask5Volume ;
	
	private String datetime ; 

	public StockData() {
		super();
	}

	public StockData(String securityCode, String name, double now, double close, double open, double high, double low,
			double volume, double bid1, double bid2, double bid3, double bid4, double bid5, double bid1Volume,
			double bid2Volume, double bid3Volume, double bid4Volume, double bid5Volume, double ask1, double ask2,
			double ask3, double ask4, double ask5, double ask1Volume, double ask2Volume, double ask3Volume,
			double ask4Volume, double ask5Volume, String datetime) {
		super();
		this.securityCode = securityCode;
		this.name = name;
		this.now = now;
		this.close = close;
		this.open = open;
		this.high = high;
		this.low = low;
		this.volume = volume;
		this.bid1 = bid1;
		this.bid2 = bid2;
		this.bid3 = bid3;
		this.bid4 = bid4;
		this.bid5 = bid5;
		this.bid1Volume = bid1Volume;
		this.bid2Volume = bid2Volume;
		this.bid3Volume = bid3Volume;
		this.bid4Volume = bid4Volume;
		this.bid5Volume = bid5Volume;
		this.ask1 = ask1;
		this.ask2 = ask2;
		this.ask3 = ask3;
		this.ask4 = ask4;
		this.ask5 = ask5;
		this.ask1Volume = ask1Volume;
		this.ask2Volume = ask2Volume;
		this.ask3Volume = ask3Volume;
		this.ask4Volume = ask4Volume;
		this.ask5Volume = ask5Volume;
		this.datetime = datetime;
	}

	public StockData(int id, String securityCode, String name, double now, double close, double open, double high,
			double low, double volume, double bid1, double bid2, double bid3, double bid4, double bid5,
			double bid1Volume, double bid2Volume, double bid3Volume, double bid4Volume, double bid5Volume, double ask1,
			double ask2, double ask3, double ask4, double ask5, double ask1Volume, double ask2Volume, double ask3Volume,
			double ask4Volume, double ask5Volume, String datetime) {
		super();
		this.id = id;
		this.securityCode = securityCode;
		this.name = name;
		this.now = now;
		this.close = close;
		this.open = open;
		this.high = high;
		this.low = low;
		this.volume = volume;
		this.bid1 = bid1;
		this.bid2 = bid2;
		this.bid3 = bid3;
		this.bid4 = bid4;
		this.bid5 = bid5;
		this.bid1Volume = bid1Volume;
		this.bid2Volume = bid2Volume;
		this.bid3Volume = bid3Volume;
		this.bid4Volume = bid4Volume;
		this.bid5Volume = bid5Volume;
		this.ask1 = ask1;
		this.ask2 = ask2;
		this.ask3 = ask3;
		this.ask4 = ask4;
		this.ask5 = ask5;
		this.ask1Volume = ask1Volume;
		this.ask2Volume = ask2Volume;
		this.ask3Volume = ask3Volume;
		this.ask4Volume = ask4Volume;
		this.ask5Volume = ask5Volume;
		this.datetime = datetime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNow() {
		return now;
	}

	public void setNow(double now) {
		this.now = now;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getBid1() {
		return bid1;
	}

	public void setBid1(double bid1) {
		this.bid1 = bid1;
	}

	public double getBid2() {
		return bid2;
	}

	public void setBid2(double bid2) {
		this.bid2 = bid2;
	}

	public double getBid3() {
		return bid3;
	}

	public void setBid3(double bid3) {
		this.bid3 = bid3;
	}

	public double getBid4() {
		return bid4;
	}

	public void setBid4(double bid4) {
		this.bid4 = bid4;
	}

	public double getBid5() {
		return bid5;
	}

	public void setBid5(double bid5) {
		this.bid5 = bid5;
	}

	public double getBid1Volume() {
		return bid1Volume;
	}

	public void setBid1Volume(double bid1Volume) {
		this.bid1Volume = bid1Volume;
	}

	public double getBid2Volume() {
		return bid2Volume;
	}

	public void setBid2Volume(double bid2Volume) {
		this.bid2Volume = bid2Volume;
	}

	public double getBid3Volume() {
		return bid3Volume;
	}

	public void setBid3Volume(double bid3Volume) {
		this.bid3Volume = bid3Volume;
	}

	public double getBid4Volume() {
		return bid4Volume;
	}

	public void setBid4Volume(double bid4Volume) {
		this.bid4Volume = bid4Volume;
	}

	public double getBid5Volume() {
		return bid5Volume;
	}

	public void setBid5Volume(double bid5Volume) {
		this.bid5Volume = bid5Volume;
	}

	public double getAsk1() {
		return ask1;
	}

	public void setAsk1(double ask1) {
		this.ask1 = ask1;
	}

	public double getAsk2() {
		return ask2;
	}

	public void setAsk2(double ask2) {
		this.ask2 = ask2;
	}

	public double getAsk3() {
		return ask3;
	}

	public void setAsk3(double ask3) {
		this.ask3 = ask3;
	}

	public double getAsk4() {
		return ask4;
	}

	public void setAsk4(double ask4) {
		this.ask4 = ask4;
	}

	public double getAsk5() {
		return ask5;
	}

	public void setAsk5(double ask5) {
		this.ask5 = ask5;
	}

	public double getAsk1Volume() {
		return ask1Volume;
	}

	public void setAsk1Volume(double ask1Volume) {
		this.ask1Volume = ask1Volume;
	}

	public double getAsk2Volume() {
		return ask2Volume;
	}

	public void setAsk2Volume(double ask2Volume) {
		this.ask2Volume = ask2Volume;
	}

	public double getAsk3Volume() {
		return ask3Volume;
	}

	public void setAsk3Volume(double ask3Volume) {
		this.ask3Volume = ask3Volume;
	}

	public double getAsk4Volume() {
		return ask4Volume;
	}

	public void setAsk4Volume(double ask4Volume) {
		this.ask4Volume = ask4Volume;
	}

	public double getAsk5Volume() {
		return ask5Volume;
	}

	public void setAsk5Volume(double ask5Volume) {
		this.ask5Volume = ask5Volume;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
	
	
}
