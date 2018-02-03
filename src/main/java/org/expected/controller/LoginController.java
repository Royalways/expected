package org.expected.controller;

import java.util.HashMap;
import java.util.Map;

import org.expected.entity.User;
import org.expected.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="Login")
	public String loginPage(){
		return "login";
	}
	
	@RequestMapping(value="UserLogin", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> checkLogin(@RequestBody org.expected.clientmodel.User requestUser){
		System.out.println(requestUser.getPassword());
		System.out.println(requestUser.getUserName());
		org.expected.entity.User user = userService.getUser(requestUser.getUserName());
		System.out.println(user.getPassword()+"11");
		System.out.println(user.getUserName()+"22");
		Map<String, String> result = new HashMap<String,String>(); 
		if (requestUser.getPassword().equals(user.getPassword()) && requestUser.getUserName().equals(user.getUserName())) {
			result.put("result", "1");
		}else {
			result.put("result", "0");
		}
		return result;
	}
	
}
