package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub15")
public class Controller15 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() throws Exception {
		// 새 고객데이터 추가
		String sql = """
				INSERT INTO Customers (CustomerID, CustomerName, City)
				VALUES(93, '서태웅', '부산')
				""";
		
		//INSERT, UPDATE, DELETE 는 Statement의 executeUpdate 메소드 사용
		//리턴값은 영향을 미친 레코드의 수
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate(sql);
		
		try (con; stmt;) {
			
		}
		
		System.out.println(count + "개 행 추가됨");
		
	}
	
	@RequestMapping("link2") 
	public void method2() throws Exception {
		String sql = """
				INSERT INTO Employees (EmployeeID, LastName, FirstName)
				VALUES (10, '정대만', '대구')
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate(sql);
		
		System.out.println(count + "개 행 추가됨");
	}
	
	// /sub15/link3?customerName=송태섭&city=부산&country=한국
		@RequestMapping("link3")
		public void method3(
				@RequestParam("customerName") String customerName,
				@RequestParam("city") String city,
				@RequestParam("country") String country) throws Exception {
			String sql = """
					INSERT INTO Customers
					(CustomerName, City, Country)
					VALUES
					(?, ?, ?)
					""";

			try (Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pstmt = con.prepareStatement(sql);) {
				pstmt.setString(1, customerName);
				pstmt.setString(2, city);
				pstmt.setString(3, country);

				int count = pstmt.executeUpdate();
				System.out.println(count + "개 행 추가됨");
			}
		}
		
		// /sub15/link4?firstName=박지성&lastName=두개의심장
		// 직원정보 추가
		@RequestMapping("link4")
		public void method4(
				@RequestParam("firstName") String firstName,
				@RequestParam("lastName") String lastName) throws Exception {
			String sql = """
					INSERT INTO Customers 
					(FirstName, LastName)
					VALUES (?, ?)
					VALUE (
					""";
			try (Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pstmt = con.prepareStatement(sql);) {
				pstmt.setString(1, firstName);
				pstmt.setString(2, lastName);
				
				int count = pstmt.executeUpdate();
				System.out.println(count + "개 행 추가됨");
			}
		}
		
		@RequestMapping("link5")
		public void method5() {
			// form 이 있는 view로 포워드
			// view : /WEB-INF/views/sub15/link5
		}
		
		@RequestMapping("link6")
		public void method6(
				@RequestParam("firstName") String firstName,
				@RequestParam("lastName") String lastName) throws SQLException {
			
			System.out.println(firstName);
			System.out.println(lastName);
			
			String sql = """
					INSERT INTO Employees (FirstName, LastName)
					VALUES (?, ?)
					""";
			
			try (Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pstmt = con.prepareStatement(sql);) {
				pstmt.setString(1, firstName);
				pstmt.setString(2, lastName);
				
				int count = pstmt.executeUpdate();
				System.out.println(count + "개 행 추가됨");
			}
		}
	}
