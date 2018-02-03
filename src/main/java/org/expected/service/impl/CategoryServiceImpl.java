package org.expected.service.impl;

import java.util.List;

import org.expected.dao.CategoryMapper;
import org.expected.entity.Category;
import org.expected.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	
	public List<Category> list(){
		return categoryMapper.list();
	}
	
	public void loginTest() {
		System.out.println(categoryMapper.login(1).toString());
	}

}
