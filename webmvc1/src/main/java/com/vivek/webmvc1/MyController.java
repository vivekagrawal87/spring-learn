package com.vivek.webmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * This tutorial shows bare minimum Spring MVC
 * 
 * @author Vivek Agrawal
 *
 */
@Controller
public class MyController {

	@GetMapping("/home")
	public String myHome(){
		return "home";
	}
}
