package com.raj.RestTemplateDemoSignUpGenius.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(HttpSecurity httpSecurity) {
		try {
			httpSecurity.authorizeRequests().anyRequest().authenticated().and().httpBasic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
