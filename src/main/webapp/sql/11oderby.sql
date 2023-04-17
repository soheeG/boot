-- oder by : 결과의 순서를 정할 때 사용

SELECT CustomerID, CustomerName, ContackName -- column 명들
FROM Customers                               -- table
WHERE CustomerID < 10                        -- 선택할 records의 조건
ORDER BY ContactName ASC;                    -- 오름차순으로 정렬

SELECT CustomerID, CustomerName, ContackName -- column 명들
FROM Customers                               -- table
WHERE CustomerID < 10                        -- 선택할 records의 조건
ORDER BY ContactName DESC;                    -- 내림차순으로 정렬

SELECT * FROM Customers
ORDER BY CustomerName DESC;

SELECT * FROM Customers
ORDER BY Country ASC;
SELECT * FROM Customers
ORDER BY Country; -- ASC 생략 가능

-- 모든 상품을 가격 순으로 조회 (낮은 가격이 먼저 조회)
SELECT * FROM Products
ORDER BY Price ASC;
-- 모든 직원을 생년월일 순 조회 (어린 직원이 먼저 조회)
SELECT * FROM Employees
ORDER BY BirthDate DESC;

-- 컬럼 index 사용 가능
SELECT * FROM Products ORDER BY Price;
SELECT * FROM Products ORDER BY 6;

SELECT * FROM Products ORDER BY 6 DESC;

-- 컬럼 index 사용해서 모든 고객을 도시의 이름 순 정렬
SELECT * FROM Customers ORDER BY 5;
SELECT CustomerID, CustomerName, City
FROM Customers ORDER BY City;
SELECT CustomerID, CustomerName, City
FROM Customers ORDER BY 3; -- 컬럼 index 사용 시 select절의 순서에 맞게 사용

-- 여러 컬럼 기준 정렬 가능
SELECT * FROM Customers ORDER BY Country, City;
SELECT * FROM Customers ORDER BY 7, 5;
SELECT CustomerID, CustomerName, Country, City
FROM Customers
Order BY Country, City;
SELECT CustomerID, CustomerName, Country, City
FROM Customers
Order BY 4, 3;

-- 여러 컬럼 기준으로 정렬 시 컬럼 당 오름차순, 내림차순 지정 가능
SELECT * FROM Customers ORDER BY Country ASC, City DESC;
SELECT * FROM Customers ORDER BY Country DESC, City ASC;
SELECT * FROM Customers ORDER BY Country DESC, City DESC;