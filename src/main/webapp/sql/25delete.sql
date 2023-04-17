-- DELETE : 테이블의 record 지우기
-- 매우 주의하여 사용해야 함

DELETE FROM Customers -- 지울 테이블 명
WHERE CustomerID = 94; -- 지울 레코드의 조건

-- DELETE 하기 전에 같은 테이블 같은 조건으로 SELECT 해보기
SELECT * FROM Customers
WHERE CustomerID = 94;

-- 93번 고객 지우기
SELECT * FROM Customers
WHERE CustomerID = 93;
DELETE FROM Customers
WHERE CustomerID = 93;

-- 78번 상품 지우기
SELECT * FROM Products WHERE ProductID = 78;
DELETE FROM Products w3schools WHERE ProductID = 78;

-- 79번 상품 지우기
SELECT * FROM Products WHERE ProductID = 79;
DELETE FROM Products w3schools WHERE ProductID = 79;