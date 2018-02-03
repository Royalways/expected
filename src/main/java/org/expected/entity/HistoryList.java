package org.expected.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

public class HistoryList {
	
	private int id ;	
	private int numId ;	
	private String min_price ; 	
	private String market ;	
	private double trade_num ;	
	private double trade_money ;	
	private double close_price ;	
	private double open_price ;	
	private String code ;		
	private double max_price ;	
	private String date ;
	
	public HistoryList() {
		super();
	}

	public HistoryList(int numId, String min_price, String market, double trade_num, double trade_money,
			double close_price, double open_price, String code, double max_price, String date) {
		super();
		this.numId = numId;
		this.min_price = min_price;
		this.market = market;
		this.trade_num = trade_num;
		this.trade_money = trade_money;
		this.close_price = close_price;
		this.open_price = open_price;
		this.code = code;
		this.max_price = max_price;
		this.date = date;
	}

	public HistoryList(int id, int numId, String min_price, String market, double trade_num, double trade_money,
			double close_price, double open_price, String code, double max_price, String date) {
		super();
		this.id = id;
		this.numId = numId;
		this.min_price = min_price;
		this.market = market;
		this.trade_num = trade_num;
		this.trade_money = trade_money;
		this.close_price = close_price;
		this.open_price = open_price;
		this.code = code;
		this.max_price = max_price;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public String getMin_price() {
		return min_price;
	}

	public void setMin_price(String min_price) {
		this.min_price = min_price;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public double getTrade_num() {
		return trade_num;
	}

	public void setTrade_num(double trade_num) {
		this.trade_num = trade_num;
	}

	public double getTrade_money() {
		return trade_money;
	}

	public void setTrade_money(double trade_money) {
		this.trade_money = trade_money;
	}

	public double getClose_price() {
		return close_price;
	}

	public void setClose_price(double close_price) {
		this.close_price = close_price;
	}

	public double getOpen_price() {
		return open_price;
	}

	public void setOpen_price(double open_price) {
		this.open_price = open_price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getMax_price() {
		return max_price;
	}

	public void setMax_price(double max_price) {
		this.max_price = max_price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}
