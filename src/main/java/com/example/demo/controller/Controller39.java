package com.example.demo.controller;

import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub39")
public class Controller39 {

	@GetMapping("view")
	public void method() {
		
	}
	
	@GetMapping("link1")
	@ResponseBody
	public String method1() {
		return "hello ajax";
	}
	
	@GetMapping("link2")
	@ResponseBody
	public ResponseEntity method2() {
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("link3")
	@ResponseBody
	public ResponseEntity method3() {
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("link4")
	@ResponseBody
	public ResponseEntity method4() {
		return ResponseEntity.internalServerError().build();
	}
	
	/*
	@GetMapping("link5")
	public ResponseEntity method5() {
		boolean ok = service.method();
		if (ok) {
			return ResponseEntity.ok();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	*/
	
}
