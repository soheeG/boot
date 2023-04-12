package com.example.demo.controller;

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
	
	@RequestMapping("link5")
	public void method05(@RequestParam("score") int score) {
		System.out.println("score:" + score);
	}
	
	// parameter의 변수명과 query string name 값이 같으면 
	// @RequestParam의 parameter 변수명 생략 가능
	@RequestMapping("link6")
	public void method6(@RequestParam String email) {
		System.out.println(email);
	}
	
	@RequestMapping("link7")
	public void method7(@RequestParam int age ) {
		System.out.println(age);
	}
	
	// any other argument는 @RequestParam으로 간주하기 때문에
	// @RequestParam 생략 가능
	@RequestMapping("link8")
	public void method8(String address) {
		System.out.println(address);
	}
	
	@RequestMapping("link9")
	public void method9(double score) {
		System.out.println(score);
	}
}
