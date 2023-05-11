package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub35")
public class Controller35 {

	@GetMapping("ajax1")
	public void view() {
		
	}
	
	@PostMapping("link1")
	public void method1() {
		System.out.println("포스트 요청 잘 받음");
	}
	
	@PostMapping("link2")
	public void method2() {
		System.out.println("메소드2 일함");
	}
	
	// /sub35/link3
	@PostMapping("link3")
	public void method3(String name) {
		System.out.println("name:" + name);
	}
	
	@PostMapping("link4")
	public void method4(String address) {
		System.out.println("address:" + address);
	}
}
