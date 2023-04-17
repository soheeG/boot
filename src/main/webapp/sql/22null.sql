-- null : 값이 없음
-- null vs '' : 데이터베이스 마다 다름

-- IS NULL : 값이 null 인가?
SELECT * FROM Suppliers
WHERE ContactName = '';
SELECT * FROM Suppliers
WHERE ContactName IS NULL;

-- IS NOT NULL : 값이 NULL이 아닌 컬럼 조회
SELECT * FROM Suppliers
WHERE NOT ContactName IS NULL
ORDER BY 1 DESC;
SELECT * FROM Suppliers
WHERE NOT ContactName IS NOT NULL
ORDER BY 1 DESC;

-- Customers 테이블에서 Address 컬럼이 NULL인 레코드 조회
SELECT * FROM Customers
WHERE Address IS NULL;

-- Customers 테이블에서 Address 컬럼이 NULL이 아닌 레코드 조회
SELECT * FROM Customers
WHERE Address IS NOT NULL;
