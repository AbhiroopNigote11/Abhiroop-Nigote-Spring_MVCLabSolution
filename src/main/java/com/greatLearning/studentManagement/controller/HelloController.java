
package com.greatLearning.studentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class HelloController {

	@RequestMapping("/student")
	public String showMainPage() {
		return "demo";
	}
}


