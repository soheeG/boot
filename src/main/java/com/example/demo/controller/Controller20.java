package com.example.demo.controller;

import java.time.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub20")
public class Controller20 {
	
	@Autowired
	private Mapper01 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		String name = mapper.method1();
		System.out.println(name);
		
		System.out.println(mapper.method2());
	}
	
	@RequestMapping("link2")
	public void method2() {
		
		System.out.println(mapper.method3());
		
	}
	
	@RequestMapping("link3")
	public void method3() {
		String name = mapper.method4(5);
		System.out.println(name);
	}
	
	@RequestMapping("link4")
	public void method4(
			@RequestParam("id") Integer customerId
			) {
		String name = mapper.method4(customerId);
		System.out.println(name);
	}
	
	@RequestMapping("link5")
	public void method5(Integer id) {
		System.out.println(mapper.method5(id));
	}
	
	@RequestMapping("link6")
	public void method6() {
		Integer price = mapper.method6();
		System.out.println(price);
		
		Double weight = mapper.method7();
		System.out.println(weight);
		
		LocalDate published = mapper.method8();
		System.out.println(published);
		
		LocalDateTime updated = mapper.mehtod9();
		System.out.println(updated);
	}
	
	@RequestMapping("link7")
	public void method7() {
		Dto06 res = mapper.method10();
		System.out.println(res);
	}
	
	@RequestMapping("link8")
	public void method8() {
		Dto05 res = mapper.method11();
		System.out.println(res);
	}
}
