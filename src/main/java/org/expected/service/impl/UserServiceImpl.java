package org.expected.service.impl;

import org.expected.dao.UserDao;
import org.expected.entity.User;
import org.expected.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao user;
	@Override
	public User getUser(String userName) {
		// TODO Auto-generated method stub
		return user.getRecordByName(userName);
	}
	
	@Override
	public void testUser(){
		User myuser = this.user.test();
		System.out.println(myuser.getPassword()+myuser.getUserName());
	}

}
