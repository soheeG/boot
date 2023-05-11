-- Character(String) 문자형
-- VARCHAR(길이)
CREATE TABLE MyTable02 (
	Col1 VARCHAR(3),
    Col2 VARCHAR(5)
);
SELECT * FROM MyTable02;
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('abc', 'abcde'); -- ok
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('ab', 'abcd'); -- 데이터 길이보다 작게 넣는 것은 ok
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('abcd', 'abcdef'); -- 데이터가 길어서 실패

CREATE TABLE MyTable03(
	Col1 VARCHAR(10),
    Col2 VARCHAR(100),
    Col3 VARCHAR(1000)
);
DESC MyTable03;

-- Numeric(수)
-- int 정수형
-- decimal, dec 실수형
CREATE TABLE MyTable04 (
	Col1 INT
);
DESC MyTable04;
INSERT INTO MyTable04 (Col1) VALUES (33); -- ok
INSERT INTO MyTable04 (Col1) 
VALUES (1234567890); -- 10자리까지 ok
INSERT INTO MyTable04 (Col1)
VALUES (3.14); -- 소수점 이하 생략
SELECT * FROM MyTable04;

CREATE TABLE MyTable05 (
	Col1 INT,
    Col2 INT
);
DESC MyTable05;
-- 최대값 : 2147483647
-- 최소값 : -2147483648
INSERT INTO MyTable05 (Col1, Col2)
VALUES (2147483647, -2147483648);
SELECT * FROM MyTable05;

-- DEC : 실수형
-- DEC(총길이, 소수점이하길이)
CREATE TABLE MyTable06 (
	Col1 DEC(5, 2),
    Col2 DEC(3, 1)
);
INSERT INTO MyTable06 (Col1) VALUES (999.99);
INSERT INTO MyTable06 (Col1) VALUES (-999.99);
INSERT INTO MyTable06 (Col1) VALUES (1000.99); -- X
INSERT INTO MyTable06 (Col1) VALUES (999.999); -- X
SELECT * FROM MyTable06;

CREATE TABLE MyTable07 (
	Col1 DEC(6,1),
    Col2 DEC(2,1)
);
DESC MyTable07;
INSERT INTO MyTable07 (Col1) VALUES (12345.6);
INSERT INTO MyTable07 (Col1) VALUES (1.2);
SELECT * FROM MyTable07;


-- 날짜 시간
-- DATE 날짜 (YYYY-MM-DD)
-- DATETIME 날짜시간 (YYYY-MM-DD hh:mm:ss)
CREATE TABLE MyTable08 (
	Col1 DATE,
    Col2 DATETIME
);
DESC MyTable08;
INSERT INTO MyTable08 (Col1)
VALUES ('2023-04-19');
INSERT INTO MyTable08 (Col1)
VALUES ('9999-12-31');
INSERT INTO MyTable08 (Col1)
VALUES ('1000-01-01');

INSERT INTO MyTable08 (Col2)
VALUES ('2023-04-19 11:41:30');
INSERT INTO MyTable08 (Col2)
VALUES ('9999-12-31 23:59:59');
INSERT INTO MyTable08 (Col2)
VALUES ('1000-01-01 00:00:00');

SELECT NOW();

INSERT INTO MyTable08 (Col1, Col2)
VALUES (now(), now());
SELECT * FROM MyTable08;

-- 학생 이름, 성별, 생년월일, 기타정보
CREATE TABLE MyTable09 (
	Name VARCHAR(20),
    Gender VARCHAR(1),
    BirthDate DATE,
    Score DEC(5, 2),
    Extra VARCHAR(1000)
);
INSERT INTO MyTable09 (Name, Gender, BirthDate, Score, Extra)
VALUES ('손흥민', '여', '2000-02-02', 99.99, '축구선수');
SELECT * FROM MyTable09;

-- 책 정보 
CREATE TABLE MyTable10 (
	Title VARCHAR(20),
    Writer VARCHAR(20),
    Publisher VARCHAR(20),
    Published DATE,
    Price INT
);
INSERT INTO MyTable10 (Title, Writer, Publisher, Published, Price)
VALUES ('이것이 자바다', '최범균', '한빛미디어', '2022-01-01', 30000);
SELECT * FROM MyTable10;

