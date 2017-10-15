package com.arms.app.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthenticationController {
	
	@RequestMapping(value = "/fail")
	public String authenticationFail(Model model){
		System.out.println("fail");
		model.addAttribute("errMessage", "E-mail or Password is Invalid.");
		return "user/login";
	}
}
