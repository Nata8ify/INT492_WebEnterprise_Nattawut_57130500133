package com.arms.app.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arms.domain.entity.User;
import com.arms.domain.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, @PageableDefault(value = 5) Pageable pageable){
		Page<User> pageUser = userService.findAll(pageable);
		model.addAttribute("page", pageUser);
		model.addAttribute("url", "/user/list");
		model.addAttribute("users", pageUser.getContent());
		return "user/list";
	}
	
}
