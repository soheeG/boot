package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub22")
public class Controller22 {
	
	@Autowired
	private Mapper03 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int cnt1 = mapper.sql1(77, "java");
		int cnt2 = mapper.sql1(88, "spring");
		int cnt3 = mapper.sql1(99, "css");
		
		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
		
	}
	
	@RequestMapping("link2")
	public void method2() {
		System.out.println(mapper.sql2(7.987, "hello mybatis"));
		System.out.println(mapper.sql2(5388.987, "hi weekend"));
	}
	
	// /sub22/link3?val1=234.223&val2=송태섭
	@RequestMapping("link3")
	public void method3(Double val1, String val2) {
		System.out.println(mapper.sql2(val1, val2));
	}
	
	@RequestMapping("link4")
	public void method4() {
		Dto09 dto = new Dto09();
		dto.setProp1(300);
		dto.setProp2("hello mybatis");
		dto.setProp3(33.33);
		
		int cnt = mapper.sql3(dto);
		System.out.println(cnt + "개 행 입력됨");
	}
	
	@RequestMapping("link5")
	public void method5() {
		Dto10 dto = new Dto10();
		dto.setAge(32);
		dto.setName("강백호");
		dto.setScore(99.99);
		
		int cnt = mapper.sql4(dto);
		System.out.println(cnt + "개 행 입력됨");
	}
	
	@RequestMapping("link6")
	public void method6(@ModelAttribute Dto10 dto) {
		int cnt = mapper.sql4(dto);
		System.out.println(cnt + "개 행 입력됨");
	}
	
	// 경로 /sub22/link7?prop1=33&prop2=world&prop3=33.44
	@RequestMapping("link7")
	public void method7(@ModelAttribute Dto09 dto) {
		
		int cnt = mapper.sql3(dto);
		System.out.println(cnt + "개 행 입력됨");
	}
	
	@RequestMapping("link8")
	public void method8() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		
		dto1.setProp1(345);
		dto2.setName("서태웅");
		dto1.setProp3(99.88);
		
		int cnt = mapper.sql5(dto1, dto2);
		System.out.println(cnt + "개 행 입력됨");
	}
	
	@RequestMapping("link9")
	public void method9() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		
		dto1.setProp1(17);
		dto2.setAge(45);
		dto1.setProp2("mysql");
		dto2.setName("서태웅");
		dto1.setProp3(41.222);
		dto2.setScore(86.12);
		
		int cnt = mapper.sql6(dto1, dto2);
		System.out.println(cnt  + "개 행 입력됨");
	}
	
	// /sub22/link10?prop1=7&prop2=lunch&prop3=3.14&age=8&name=song&score=3.14
	@RequestMapping("link10")
	public void method10(Dto09 p1, Dto10 p2) {
		int cnt = mapper.sql6(p1, p2);
		System.out.println(cnt + "행 입력");
	}
	
	// /sub22/link11?prop2=mybatis&prop3=321
	@RequestMapping("link11")
	public String method11(Dto11 dto) {
		System.out.println("pro1:" + dto.getProp1());
		int cnt = mapper.sql7(dto);
		System.out.println(cnt + "행 입력 완료");
		System.out.println("pro1:" + dto.getProp1());
		
		return dto.getProp1() + "번째 데이터 입력 완료";
	}
	
	// /sub22/link12?age=40&name=son&score=9.9
	@RequestMapping("sub12")
	public void method12(Dto12 dto) {
		int cnt = mapper.sql8(dto);
	}
}
