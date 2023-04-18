package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub17")
public class Controller17 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	// /sub17/link7?id=65&name=서태웅
	@RequestMapping("link1")
	public void method1(int id, String name) throws Exception {
		String sql = """
				UPDATE Suppliers 
				SET SupplierName = ?
				WHERE SupplierId = ?
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
		pstmt.setString(1, name);
		pstmt.setInt(2, id);
		
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt + "개 행 수정됨");
		}
	}
	
	// ?id=62&address=seoul
	// supplierid 가 62번인 공급자 주소(address)를 seoul로 바꾸는 메소드
	@RequestMapping("link2")
	public void method2(String address) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET Address = ?
				WHERE SupplierId = 62
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
		pstmt.setString(1, address);
		
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt + "개 행 수정됨");
		}
	}
}
