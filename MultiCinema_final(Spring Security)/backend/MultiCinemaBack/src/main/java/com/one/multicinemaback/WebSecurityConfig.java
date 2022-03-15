package com.one.multicinemaback;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
// Config객체는 WebSecurityConfigurerAdapter를 상속받아서 configure()를 구현한다.
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
		// 패스워드 암호화 방식으로 BCryptPasswordEncoder를 적용. BcryptPasswordEncoder는 BCrypt라는 해시 함수를 이용하여 패스워드를 암호화하는 구현체이다.
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().disable()
		   .csrf().disable()
		   .formLogin().disable()
		   .headers().frameOptions().disable();
	}

}
