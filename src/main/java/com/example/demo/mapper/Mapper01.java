package com.example.demo.mapper;

import java.time.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper01 {
	
	@Select("""
			SELECT CustomerName 
			FROM Customers
			WHERE CustomerID = 1
			""")
	
	String method1();
	
	@Select("""
			SELECT FirstName
			FROM Employees
			WHERE EmployeeId = 1
			""")
	
	String method2();
	
	@Select("""
			SELECT SupplierName
			FROM Suppliers
			WHERE SupplierId = 1
			""")
	
	String method3();

	@Select("""
			SELECT CustomerName
			FROM Customers
			WHERE CustomerID = #{id}
			""")
	
	String method4(Integer id);
	
	@Select("""
			SELECT LastName
			FROM Employees
			WHERE EmployeeId = #{id}
			""")
	
	String method5(Integer id);

	@Select("""
			SELECT Price
			FROM MyTable33
			LIMIT 1
			""")
	
	Integer method6();
	
	@Select("""
			SELECT Weight
			FROM MyTable33
			LIMIT 1
			""")
	
	Double method7();
	
	@Select("""
			SELECT Published
			FROM MyTable33
			LIMIT 1
			""")
	
	LocalDate method8();
	
	@Select("""
			SELECT Updated
			FROM MyTable33
			LIMIT 1
			""")
	
	LocalDateTime mehtod9();
	
	@Select("""
			SELECT Title,
				   Published,
				   Price,
				   Updated,
				   Weight
			FROM MyTable33
			LIMIT 1
			""")
	
	// 컬럼명과 (대소문자 구분없이) 매치되는 자바빈에 프로퍼티명을 기재
	// 자바빈 이름을 Type으로 사용 
	Dto06 method10();
	
	@Select("""
			SELECT
				Name,
				Age,
				Price,
				Birth,
				Inserted
			FROM MyTable32
			LIMIT 1
			""")
	
	Dto05 method11();
	
	@Select("""
			SELECT 
				CustomerID AS id,
				CustomerName AS name,
				ContactName,
				Address,
				City,
				PostalCode,
				Country
			FROM Customers
			WHERE CustomerId = 7
			""")
	
	Customer method12();
	
	@Select("""
			SELECT 
				SupplierId id,
				SupplierName name,
				ContactName,
				Address,
				City,
				PostalCode,
				Country,
				Phone
			FROM Suppliers
			WHERE SupplierId = 2
			""")
	
	Supplier method13();
	
	@Select("""
			SELECT
				EmployeeId id,
				LastName,
				FirstName,
				BirthDate birth,
				Photo,
				Notes
			FROM Employees
			WHERE EmployeeId = 5
			""")
	
	Employee method14();
}
