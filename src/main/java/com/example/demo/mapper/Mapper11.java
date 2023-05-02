package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.controller.*;
import com.example.demo.domain.*;

public interface Mapper11 {

	@Select("""
			SELECT
				c.CategoryId,
				c.CategoryName,
				c.Description,
				p.ProductName
			FROM Categories c JOIN Products p
			ON c.CategoryId = p.CategoryId
			WHERE c.CategoryId = #{id}
			""")
	@ResultMap("categoryResult")
	Category sql1(int id);
	
	@Select("""
			SELECT 
				c.CategoryId,
				c.CategoryName,
				c.Dscription,
				p.ProductName,
				p.Price
			FROM Categories c JOIN Products p
			ON c.CategoryId = p.CategoryId
			WHERE c.CategoryId = #{id}
			""")
	@ResultMap("categoryResultMap")
	Category sql2(int id);

}
