package com.example.demo.config;

import java.util.*;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.userdetails.User.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.*;
import org.springframework.security.provisioning.*;
import org.springframework.security.web.*;

@Configuration
public class MyConfig2 {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.formLogin()
			.defaultSuccessUrl("/sub33/mylogin")
			.defaultSuccessUrl("/list", true)
			.usernameParameter("id") // 기본값 username
			.passwordParameter("pw"); // 기본값 password
	
		http.csrf().disable();
		
		http.authorizeHttpRequests().requestMatchers("/abc").authenticated();
		http.authorizeHttpRequests().anyRequest().permitAll();
		
		return http.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserBuilder users = User.withDefaultPasswordEncoder();
		UserDetails user1 = users.username("user1")
				.password("pw1")
				.authorities(List.of())
				.build();
		UserDetails user2 = users.username("user2")
				.password("pw2")
				.authorities(List.of())
				.build();
		
		return new InMemoryUserDetailsManager(user1, user2);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
