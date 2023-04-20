package com.example.demo.controller;

import java.sql.*;
import java.time.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub19")
public class Controller19 {
	
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() throws Exception {
		String sql = """
				INSERT INTO MyTable30 (Col1, Col2)
				VALUES (?, ?)
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
		
		pstmt.setInt(1, 99);
		pstmt.setString(2, "hello");
		int cnt = pstmt.executeUpdate();
		
		System.out.println(cnt + "개 행 입력됨");
		}
	}
	
	@RequestMapping("link2")
	public void method2() throws Exception {
		String sql = """
				INSERT INTO MyTable30 (Col1, Col2)
				VALUES (?, ?)
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
		
//		pstmt.setInt(1, 99);
//		pstmt.setString(2, "hello");
		// Type에 맞지 않게 작성해도 가능은 함
		pstmt.setNString(1, "888");
		pstmt.setInt(2, 12345);
		int cnt = pstmt.executeUpdate();
		
		System.out.println(cnt + "개 행 입력됨");
		}
	}

	@RequestMapping("link3")
	public void method3() throws Exception {
		String sql = """
				INSERT INTO MyTable31 (Col1, Col2)
				VALUES (?, ?)
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
		
		pstmt.setString(1, "1923-03-01");
		pstmt.setString(2, "1811-11-12 23:00:49");
		
		int cnt = pstmt.executeUpdate();
		
		System.out.println(cnt + "개 행 입력됨");
		}
	}
	
	@RequestMapping("link4")
	public void method4() throws Exception {
		String sql = """
				INSERT INTO MyTable31 (Col1, Col2)
				VALUES (?, ?)
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
		
//		pstmt.setString(1, "1923-03-01");
//		pstmt.setString(2, "1811-11-12 23:00:49");
		pstmt.setDate(1,Date.valueOf("2023-03-01"));
		pstmt.setTimestamp(2, Timestamp.valueOf("2000-01-01 22:22:11"));
		
		int cnt = pstmt.executeUpdate();
		
		System.out.println(cnt + "개 행 입력됨");
		}
	}

	@RequestMapping("link5")
	public void method5() throws Exception {
		String sql = """
				INSERT INTO MyTable32 
					(Name, Age, Price, Birth, Inserted)
				VALUES (?, ?, ?, ?, ?)
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setString(1, "강백호");
			pstmt.setInt(2, 28);
			pstmt.setDouble(3, 99.99);
			pstmt.setDate(4, Date.valueOf("2000-04-04"));
			pstmt.setTimestamp(5, Timestamp.valueOf("2023-04-20 09:44:17"));
			
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + "개 행 입력됨");
			
		}
	}
	
	@RequestMapping("link6")
	public void method6() {
		// forward to form

	}
	
	@RequestMapping("link7")
	public void method7(
			@RequestParam("name")
			String name,
			@RequestParam("age")
			String age,
			@RequestParam("price")
			String price,
			@RequestParam("birth")
			String birth,
			@RequestParam("inserted")
			String inserted
			) throws Exception {
		
		String sql = """
				INSERT INTO MyTable32 
					(Name, Age, Price, Birth, Inserted)
				VALUES (?, ?, ?, ?, ?)
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
		pstmt.setString(1, name);
		pstmt.setString(2, age);
		pstmt.setString(3, price);
		pstmt.setString(4, birth);
		pstmt.setString(5, inserted);
		
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt + "개 행 입력됨");
		}
	}
	
	@RequestMapping("link8")
	public void method8(
			@RequestParam("name") String name,
			@RequestParam("age") Integer age,
			@RequestParam("price") Double price,
			@RequestParam("birth") LocalDate birth,
			@RequestParam("inserted") LocalDateTime inserted
			) throws Exception {
		
		String sql = """
				INSERT INTO MyTable32
					(Name, Age, Price, Birth, Inserted)
					VALUES (?, ?, ?, ?, ?)
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			
		pstmt.setString(1, name);
		pstmt.setInt(2, age);
		pstmt.setDouble(3, price);
		pstmt.setDate(4, Date.valueOf(birth));
		pstmt.setTimestamp(5, Timestamp.valueOf(inserted));
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt + "개 행 입력됨");
		}
	}
	
	
	@RequestMapping("link9")
	public void method9() {
		
	}
	
	@RequestMapping("link10")
	public void method10(
			@RequestParam("title") String title,
			@RequestParam("published") LocalDate published,
			@RequestParam("price") Integer price,
			@RequestParam("updated") LocalDateTime updated,
			@RequestParam("weight") Double weight
			
			) throws Exception {
		
		String sql = """
				INSERT INTO MyTable33 
					(Title, Published, Price, Updated, Weight)
				VALUES (?, ?, ?, ?, ?)
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			
			pstmt.setString(1, title);
			pstmt.setDate(2, Date.valueOf(published));
			pstmt.setInt(3, price);
			pstmt.setTimestamp(4, Timestamp.valueOf(updated));
			pstmt.setDouble(5, weight);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 데이터 추가 완료");
		}
		
	}
}
