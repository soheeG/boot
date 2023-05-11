-- alias : 별칭

SELECT * FROM Customers;
SELECT CustomerID, CustomerName FROM Customers;
SELECT CustomerID AS id, CustomerName AS name
FROM Customers;
-- AS 생략 가능
SELECT CustomerID id,
	   CustomerName name
FROM Customers;

SELECT CustomerID id,
		CustomerName name
FROM Customers
ORDER BY CustomerID;
SELECT CustomerID id,
		CustomerName name
FROM Customers
ORDER BY id;
SELECT CustomerID id,
		CustomerName name
FROM Customers
ORDER BY 1;

SELECT Country, COUNT(CustomerID)
FROM Customers
GROUP BY Country;

SELECT Country, COUNT(CustomerID) AS NumOfCustomer
FROM Customers
GROUP BY Country;
SELECT Country, COUNT(CustomerID) NumOfCustomer
FROM Customers
GROUP BY Country;
SELECT Country c, COUNT(CustomerID) NumOfCustomer
FROM Customers
GROUP BY Country;
SELECT Country c, COUNT(CustomerID) NumOfCustomer
FROM Customers
GROUP BY c;

SELECT Country c, COUNT(CustomerID) NumOfCustomer
FROM Customers
GROUP BY Country
ORDER BY NumOfCustomer;
SELECT Country c, COUNT(CustomerID) NumOfCustomer
FROM Customers
GROUP BY Country
ORDER BY 2;
SELECT Country c, COUNT(CustomerID) NumOfCustomer
FROM Customers
GROUP BY Country
ORDER BY COUNT(CustomerID);

-- keyword 사용 시 backtick (권장하지 않음, 어쩔 수 없이 사용해야 할 때만)
SELECT Country AS `FROM`, CustomerName FROM Customers;
SELECT `Country` AS `FROM`, `CustomerName` FROM `Customers`;