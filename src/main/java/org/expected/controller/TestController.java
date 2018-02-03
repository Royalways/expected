package org.expected.controller;

import java.util.List;

import org.expected.entity.Category;
import org.expected.entity.User;
import org.expected.service.CategoryService;
import org.expected.service.StockToIndustryService;
import org.expected.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@Autowired
	StockToIndustryService stockToIndustryService;
	
	/*
	@Autowired
	UserService userService;
	
	@Autowired
	CategoryService categoryService;

	@RequestMapping("ListCategory")
	public ModelAndView listCategory(){
		ModelAndView mav = new ModelAndView();
		List<Category> cs= categoryService.list();
		mav.addObject("cs", cs);
		mav.setViewName("listCategory");
		return mav;
	}
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String printHello(){
		System.out.println("Hello maven");
		return "index";
	}
	*/
	
	@RequestMapping(value="home", method=RequestMethod.GET)
	public String getHomePage(){
		stockToIndustryService.getIndustryHistoryDataByStockCode("600004", "2017-08-01", "2017-09-01");
		return "home";
	}
	
}
