package com.example.demo;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub4")
public class Controller04 {
	// method argument(parameter)

	// 경로 : /sub4/link1?name=손&age=30
	@RequestMapping("link1")
	public void method01(HttpServletRequest request) {
		// 1. request parameter 수집/가공
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
		// 2. business logic
		
		// 3. add attribute
		
		// 4. forward/redirect
	}

	@RequestMapping("link2")
	public void method02(HttpServletRequest request) {
		// 1. request param
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		System.out.println("address: " + address);
		System.out.println("email: " + email);
	}
	
	@RequestMapping("link3")
	public void method03(@RequestParam("address") String address) {
		System.out.println("address:" + address);
	}
	
	@RequestMapping("link4")
	public void method04(@RequestParam("age") String age) {
		System.out.println("age: " + age);
		
		int myage = Integer.parseInt(age);
		System.out.println("int age :" + myage);
	}
}
