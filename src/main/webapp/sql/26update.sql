-- UPDATE : 레코드 수정 

 UPDATE Customers              -- 테이블 명
 SET CustomerName = '서태웅'   -- 변경할 컬럼과 값
 WHERE CustomerID = 1;         -- 변경할 레코드의 조건

UPDATE Customers
SET CustomerName = '정대만',   -- 변경할 컬럼과 값 (,)
	City = 'Seoul',
    Country = 'Korea'
WHERE CustomerID = 1;

-- 1번 공급자의 이름, 도시, 나라 변경
UPDATE Suppliers 
SET CustomerName = '문동은',
	City = 'Busan',
    Country = 'Korea'
WHERE SupplierID = 1;

UPDATE Suppliers
SET SupplierName = '채치수',
	Country = 'France'
WHERE Country = 'USA';

UPDATE Suppliers
SET ContactName = '북산',
	City = 'Seoul';
    
UPDATE Suppliers
SET PostalCode = CONCAT('J', PostalCode) 
WHERE Country = 'Japan';

INSERT INTO Products
VALUES(1, 'cake', null, null, null, 300);
INSERT INTO Products
VALUES(2, 'pizza', null, null, null, 100);
UPDATE Products
SET Price = Price * 1300;