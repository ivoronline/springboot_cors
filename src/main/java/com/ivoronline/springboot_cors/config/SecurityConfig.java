package com.ivoronline.springboot_cors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    //SPECIFY ACCESS TO ENDPOINTS
    httpSecurity.authorizeRequests()
      .antMatchers("/Helloo").hasAnyRole("USER");  //ADMIN/USER ROLE can access AFTER log in

    //REDIRECT TO LOGIN FORM
    httpSecurity.formLogin();

  }

}
