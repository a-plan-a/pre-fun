package com.mm.fun.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.mm.fun.bean.JsonResult;
import com.mm.fun.bean.Recommendation;
import com.mm.fun.service.RecommendationService;

@RestController
public class RecommendController {

	@Autowired
	private RecommendationService recommendationService;

	/**
	 * 根据ID查询用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/recommend/insert", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> getUserById(
			@RequestParam(name = "d", required = false, defaultValue = "0") String d) {
		JsonResult r = new JsonResult();
		try {
			Recommendation recommend = new Recommendation();
			JSONObject json;
			json = JSONObject.parseObject(d);
			String name = (String) json.get("name");
			String title = (String) json.get("title");
			String profilePhone = (String) json.get("photo");
			String detail = (String) json.get("detail");
			String phone = (String) json.get("phone");
			String categoryId = (String) json.get("categoryID");
			
			recommend.setDetail(detail);
			recommend.setPhone(phone);
			recommend.setName(name);
			recommend.setProfilePhone(profilePhone);
			recommend.setTitle(title);
			recommend.setCategoryNO(categoryId);
			recommendationService.insert(recommend);
			r.setStatus("success");
		} catch (Exception e) {
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
			e.printStackTrace();
		}
		return ResponseEntity.ok(r);
	}

	@RequestMapping(value = "/recommend/{categoryno}", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> select(@PathVariable(value = "categoryno") String categoryno) {
		JsonResult r = new JsonResult();
		List<Recommendation> list = recommendationService.select(categoryno);
		JSONObject.toJSONString(list);
		System.out.println(JSONObject.toJSONString(list));
		r.setResult(JSONObject.toJSONString(list));
		return ResponseEntity.ok(r);
	}

}
