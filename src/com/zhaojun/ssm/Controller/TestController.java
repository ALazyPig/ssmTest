package com.zhaojun.ssm.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller  //类似Struts的Action
public class TestController {

	@RequestMapping(value="/hello")
	public String sayHello(ModelMap modelMap){
		
		modelMap.put("sayHello", "hello world");
		return "/hello";
	}

}