-- null : 값이 없음
-- null vs '' : 데이터베이스 마다 다름

-- IS NULL : 값이 null 인가?
SELECT * FROM Suppliers
WHERE ContactName = '';
SELECT * FROM Suppliers
WHERE ContactName IS NULL;

-- IS NOT NULL : 값이 NULL 아닌 컬럼 조회
SELECT * FROM Suppliers
WHERE NOT ContactName IS NULL
ORDER BY 1 DESC;
SELECT * FROM Suppliers
WHERE ContactName IS NOT NULL
ORDER BY 1 DESC;


-- Customers 테이블에서
-- Address 컬럼이 NULL인 레코드 조회
SELECT * FROM Customers
WHERE Address IS NULL;
-- Customers 테이블에서
-- Address 컬럼이 NULL이 아닌 레코드 조회
SELECT * FROM Customers
WHERE Address IS NOT NULL
ORDER BY 1 DESC;

-- 집계함수에서 NULL 제외
SELECT COUNT(CustomerID) FROM Customers;
SELECT COUNT(Address) FROM Customers;
SELECT COUNT(*) FROM Customers;

-- 공급자 테이블에서 SupplierID컬럼의 값 수 구하기
SELECT COUNT(SupplierID) FROM Suppliers;
-- 공급자 테이블에서 ContactName컬럼의 값 수 구하기
SELECT COUNT(ContactName) FROM Suppliers;

SELECT COUNT(*) FROM Suppliers;

SELECT * FROM Products ORDER BY 1 DESC;
INSERT INTO Products
VALUES (78, 'Cake', 12, 2, '조각', NULL);
INSERT INTO Products 
(ProductID, ProductName, SupplierID, CategoryID, Unit)
VALUES (79, 'Pizza', 12, 2, '조각');

SELECT * FROM Products WHERE CategoryID = 2 ORDER BY 1 DESC;
-- 14

SELECT SUM(Price) FROM Products WHERE CategoryID = 2;
-- 276.75
SELECT 276.75 / 14; -- 19.767857
SELECT 276.75 / 12; -- 23.062500

SELECT AVG(Price) FROM Products WHERE CategoryID = 2;