package com.mm.fun.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mm.fun.bean.JsonResult;
import com.mm.fun.bean.User;
import com.mm.fun.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 根据ID查询用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> getUserById(@PathVariable(value = "id") String phoneNum) {
		JsonResult r = new JsonResult();
		try {
			User user = userService.getUserByPhoneNum(phoneNum);
			r.setResult(user);
			r.setStatus("ok");
		} catch (Exception e) {
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
			e.printStackTrace();
		}
		return ResponseEntity.ok(r);
	}

}
