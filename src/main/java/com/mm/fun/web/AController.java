package com.mm.fun.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AController {
	
	
	 @RequestMapping("/a")  
	    public String hello(Map<String,Object> map){  
	       map.put("name", "[Angel -- 守护天使]");  
	       return "a";  
	    }  

}
