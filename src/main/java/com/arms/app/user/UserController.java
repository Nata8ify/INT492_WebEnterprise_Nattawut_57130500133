package com.arms.app.user;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arms.domain.component.PageProperty;
import com.arms.domain.entity.User;
import com.arms.domain.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Secured({ "ROLE_ADMIN" })
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, @PageableDefault(value = 7) Pageable pageable, Principal principal){
		Page<User> pageUser = userService.findAll(pageable);
		model.addAttribute("page", pageUser);
		model.addAttribute("pageprop", new PageProperty(pageable.getPageNumber(), pageUser.getTotalPages()));
		model.addAttribute("pageable", pageable);
		model.addAttribute("url", "/user/list");
		model.addAttribute("users", pageUser.getContent());
		System.out.println(principal);
		return "user/list";
	}
	
}
