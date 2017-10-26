package com.arms.app.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arms.domain.entity.User;
import com.arms.domain.service.MyUserDetailsImpl;
import com.arms.domain.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User findUserById(@PathVariable(value = "id") int id, Authentication authentication){
		System.out.println(((MyUserDetailsImpl)authentication.getPrincipal()).getUser().toString());
		System.out.println(userService.findById(id).toString());
		return userService.findById(id);
	}
}
