package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub31")
public class Controller31 {

	@Autowired
	private Mapper11 mapper;
	
	// 경로: localhost:8082/sub31/link1?id=3
	@GetMapping("link1")
	public void method1(int id) {
		// 1번 카테고리 정보
		Category category = mapper.sql1(id);
		
		System.out.println(category);
		category.getProducts().forEach(System.out::println);
	}
	
	// 경로: localhost:8082/sub31/link2?id=3
		@GetMapping("link2")
		public void method2(int id) {
			// 1번 카테고리 정보
			Category category = mapper.sql2(id);
			
			System.out.println(category);
			category.getProducts().forEach(System.out::println);
		}
}
