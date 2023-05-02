SELECT Country FROM Suppliers;
SELECT DISTINCT Country FROM Suppliers; -- 여러 행
SELECT * FROM Customers
WHERE Country IN (SELECT DISTINCT Country FROM Suppliers);

-- 
SELECT * FROM Orders;
SELECT * FROM OrderDetails;
SELECT * FROM Products;