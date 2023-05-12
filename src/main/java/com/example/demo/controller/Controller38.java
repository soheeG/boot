package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub38")
public class Controller38 {

	@Autowired
	Mapper02 mapper02;
	
	@GetMapping("link20")
	@ResponseBody
	public List<String> method20() {
		return mapper02.sql1();
	}
}
