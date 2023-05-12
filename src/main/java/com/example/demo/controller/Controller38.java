package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@RequestMapping("sub38")
//@Controller
//@ResponseBody 
//위 두개를 묶은 것
@RestController
public class Controller38 {

	@Autowired
	Mapper02 mapper02;
	
	@GetMapping("link20")
	//@ResponseBody
	public List<String> method20() {
		return mapper02.sql1();
	}
	
	@GetMapping("link21")
	//@ResponseBody
	public List<Dto07> method21() {
		return mapper02.sql3();
	}
	
	@GetMapping("link22")
	//@ResponseBody
	public List<Dto08> method22(Integer cid) {
		return mapper02.sql7(cid);
	}
}
