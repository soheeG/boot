package com.example.demo.controller;

import java.sql.*;

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
}
