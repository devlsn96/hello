package com.test.test.test01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringWebMain01 {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
