-- DATABASE(Schema) : 테이블이 있는 곳

-- CREATE DATABASE : database 만들기
CREATE DATABASE mydb;
USE mydb;
CREATE TABLE MyTable11 (
	Title VARCHAR(10),
    Price INT
);

-- 데이터베이스 지우기
-- 주의하여 사용해야 함
DROP DATABASE mydb;

USE w3schools;

CREATE DATABASE mydb1;
USE mydb1;
CREATE TABLE MyTable11 (
	Name VARCHAR(20),
    Age INt
);
DROP DATABASE mydb1;
USE w3schools;

SELECT * FROM MyTable10;

USE test;
SELECT * FROM MyTable10; -- 현재 DATABASE 
SELECT * FROM w3schools.MyTable10; -- 다른 DB