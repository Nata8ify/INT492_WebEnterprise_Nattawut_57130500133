package com.arms.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.arms.domain.service.AuthenticationService;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	private AuthenticationService authService;
	
	@Autowired
	private void configureUserAuth(AuthenticationManagerBuilder builder) throws Exception{
		System.out.println("configureUserAuth");
		builder.userDetailsService(authService).passwordEncoder(new Md5PasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("configure");
		http.authorizeRequests()
		.antMatchers("/static/**", "/user/**").permitAll().anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/login").usernameParameter("email").passwordParameter("password")
		.failureUrl("/auth/fail")
		.permitAll().defaultSuccessUrl("/user/list", true)
		.and()
		.logout().permitAll()
		.and().exceptionHandling().accessDeniedPage("/403");
	}

	
}
