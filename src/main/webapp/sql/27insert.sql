SELECT * FROM Employees ORDER BY 1 DESC;
INSERT INTO Employees (EmployeeID, LastName, FirstName)
VALUES (11, '박지성', '두개의심장');
INSERT INTO Employees (LastName, FirstName)
VALUES ('차범근', '차붐');

-- 테이블 정보 보는 명령문
DESC Employees;

-- Customers 테이블의 자동 증가 컬럼을 찾기
DESC Customers; -- auto increment 라고 기재된 컬럼 확인

INSERT INTO Customers (CustomerName, ContactName)
VALUES ('정대만', 'daeman');

SELECT * FROM Customers ORDER BY 1 DESC;

-- 새 공급자 데이터 추가 (SuplierName, City)
-- 자동 증가 컬럼은 직접 값을 넣지 않고
DESC Suppliers;
INSERT INTO Suppliers (SupplierName, City)
VALUES ('강백호', 'seoul');
SELECT * FROM Suppliers ORDER BY 1 DESC;