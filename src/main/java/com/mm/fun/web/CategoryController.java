package com.mm.fun.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.mm.fun.bean.Category;
import com.mm.fun.bean.JsonResult;
import com.mm.fun.service.CategoryService;
@RestController
public class CategoryController {
	

	@Autowired
	private CategoryService service;

	/**
	 * 根据ID查询用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/category/all", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> list() {
		JsonResult r = new JsonResult();
		try {
			List<Category> list=	service.listAll();
			r.setResult(JSONObject.toJSONString(list));
			r.setStatus("success");
		} catch (Exception e) {
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
			e.printStackTrace();
		}
		return ResponseEntity.ok(r);
	}

}
