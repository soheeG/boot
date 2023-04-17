SELECT * FROM Products ORDER BY 1 DESC;
-- IFNULL : 값이 null이면 다른 값으로 변경
SELECT IFNULL(0, 100); -- 0
SELECT IFNULL('kim', 'lee'); -- kim
SELECT IFNULL(NULL, 100); -- 100
SELECT IFNULL(NULL, 'park'); -- park

SELECT ProductID, ProductName, SupplierID, CategoryID
,Unit, Price FROM Products ORDER BY 1 DESC;
SELECT ProductID, ProductName, SupplierID, CategoryID
,Unit, IFNULL(Price, 0) FROM Products ORDER BY 1 DESC;
SELECT ProductID, 
		ProductName, 
        SupplierID, 
        CategoryID,
        Unit, 
        IFNULL(Price, 0) Price
FROM Products ORDER BY 1 DESC;

SELECT AVG(IFNULL(Price, 0)) AS Average 
FROM Products
WHERE CategoryID = 2;
SELECT AVG(Price) AS Average FROM Products
WHERE CategoryID = 2;