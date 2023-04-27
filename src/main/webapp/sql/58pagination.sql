USE w3schools;
INSERT INTO Customers 
(CustomerName, ContactName, Address, City, Country)
SELECT CustomerName, ContactName, Address, City, Country
FROM Customers;

SELECT COUNT(*) FROM Customers;

-- 1페이지
-- 페이지당 20개의 레코드
SELECT * FROM Customers
ORDER BY CustomerID DESC
LIMIT 0, 20; -- 1페이지

SELECT * FROM Customers
ORDER BY CustomerID DESC
LIMIT 20, 20; -- 2페이지

SELECT * FROM Customers
ORDER BY CustomerID DESC
LIMIT 40, 20; -- 3페이지

