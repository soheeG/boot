package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub13")
public class Controller13 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;
	
	@RequestMapping("link1")
	public void method1(Model model) throws Exception {
		String sql = """
				SELECT CustomerID, CustomerName
				FROM Customers
				WHERE CustomerID < 4
				""";
		List<Customer> obj = new ArrayList<>();
		// 1.
		// 2.
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		try (con; stmt; rs;) {
			while (rs.next()) {
				int id = rs.getInt("customerId");
				String name = rs.getString("customerName");
				System.out.println(id + ":" + name); // 콘솔 출력
				
				Customer customer = new Customer();
				customer.setId(id);
				customer.setName(name);
				obj.add(customer);
			}
		}
		// 3. add attribute
		model.addAttribute("customerList", obj);
		// 4.
	}
	
	@RequestMapping("link2")
	public void method2(Model model) throws Exception {
		String sql = """
				SELECT EmployeeId,
					   LastName,
					   FirstName
				FROM Employees
				""";
		
		// Employee 자바빈 생성
		
		List<Employee> obj = new ArrayList<>();
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		try (con; stmt; rs;) {
			while (rs.next()) {
				int id = rs.getInt("EmployeeId");
				String lastName = rs.getString("LastName");
				String firstName = rs.getString("FirstName");
				
				Employee employee = new Employee();
				employee.setId(id);
				employee.setLastName(lastName);
				employee.setFirstName(firstName);
				obj.add(employee);
			}
		}
		
		model.addAttribute("employeeList", obj);
		
	}
}
