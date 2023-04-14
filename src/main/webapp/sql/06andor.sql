-- AND
SELECT * 
FROM Customers
WHERE CustomerID > 4 AND Country = 'Germany';

SELECT *
FROM Employees
WHERE LastName >= 'M' AND BirthDate > '1960-01-01';

-- 카테고리id 가 2이고, 가격이 20.00 이상인 상품들 조회
SELECT * 
FROM Products
WHERE CategoryID = 2  AND Price >= 20.00;