package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("sub36")
public class Controller36 {

	@GetMapping("view")
	public void method() {
		
	}
	
	@Data
	static class Dto1 {
		private String name;
		private Integer age;
	}
	
	// {"name" : "정대만", "age" : 40}
	@PostMapping("link1")
	public void method1(@RequestBody Dto1 dto) {
		System.out.println(dto);
	}
	
	@Data
	static class Dto2 {
		private String name;
		private String email;
		private Double score;
		private Boolean married;
	}
	
	@PostMapping("link2")
	public void method2(@RequestBody Dto2 dto) {
		System.out.println(dto);
	}
	
	@Data
	static class Dto3 {
		private String name;
		private List<String> hobby;
	}
	
	@PostMapping("link3")
	public void method3(@RequestBody Dto3 dto) {
		System.out.println(dto);
	}
	
	@Data
	static class Dto4 {
		private List<String> phone;
	}
	
	@RequestMapping("link4")
	public void method4(@RequestBody Dto4 dto) {
		System.out.println(dto.getPhone().get(2));
	}
	
	@Data
	static class Dto5 {
		private String title;
		private String publisher;
		// 객체는 Map 혹은 JavaBean으로 생성
//		private Map<String, Object> writer;
		private Dto1 Writer;
	}
	
	@RequestMapping("link5")
	public void method5(@RequestBody Dto5 dto) {
		System.out.println(dto);
	}
	
	@Data
	static class Dto6 {
		private String city;
		private String price;
		private Dto2 etc;
	}
	
	@PostMapping("link6")
	public void method6(@RequestBody Dto6 dto) {
		System.out.println(dto);
	}
	
	@PostMapping("link7")
	public void method6(@RequestBody List<Dto1> dto) {
		dto.forEach(System.out::println);
	}
}
