package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper02 {
	@Select("""
			SELECT CustomerName FROM Customers
			""")
	List<String> sql1();

	@Select("""
			SELECT LastName FROM Employees
			""")
	List<String> sql2();
	
	@Select("""
			SELECT LastName, FirstName
			FROM Employees
			""")
	List<Dto07> sql3();
	
	@Select("""
			SELECT ProductName name,
				   Price
			FROM Products
			""")
	List<Dto08> sql4();
}
