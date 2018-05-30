package com.mm.fun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.fun.bean.Category;
import com.mm.fun.bean.CategoryMapper;
import com.mm.fun.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryMapper mapper;

	public List<Category> listAll() {
		
		return mapper.select();
	}

}
