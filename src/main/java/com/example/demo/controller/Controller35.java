package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

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
	public void method4(String address, Double price) {
		System.out.println("address:" + address);
		System.out.println("price:" + price);
	}
	
	@Data
	static class Dto1 {
		private String name;
		private Double score;
		private String email;
	}
	
	@PostMapping("link5")
	public void method5(Dto1 dto) {
		System.out.println(dto);
	}
	
	@Data
	static class Dto2 {
		private String address;
		private String product;
		private Double price;
	}
	
	@PostMapping("link6")
	public void method6(Dto2 dto) {
		System.out.println(dto);
	}
	
	// json 요청 데이터는 
	// @RequestBody Map이나 
	// @RequestBody JavaBean으로 받음
	@PostMapping("link7")
	public void method7(@RequestBody Map map) {
		System.out.println("메소드7 실행됨");
		System.out.println(map);
	}
}
