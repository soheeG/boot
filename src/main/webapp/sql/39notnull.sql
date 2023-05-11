-- NOT NULL : NULL 허용 안함
CREATE TABLE MyTable17 (
	Col1 INT,
    Col2 INT NOT NULL
);
INSERT INTO MyTable17 (Col1, Col2) 
VALUES (100, 200); -- ok
INSERT INTO MyTable17 (Col2)
VALUES (200); -- ok
INSERT INTO MyTable17 (Col1)
VALUES (100); -- fail
SELECT * FROM MyTable17;

-- 연습 ) MyTable18, 두개 컬럼, VARCHAR(20)
-- 두번째 컬럼만 NOT NULL 제약사항 적용
CREATE TABLE MyTable18 (
	Col1 VARCHAR(20),
    Col2 VARCHAR(20) NOT NULL
);
INSERT INTO MyTable18 (Col1, Col2)
VALUES ('abc', 'def'); -- ok
INSERT INTO MyTable18 (Col1)
VALUES ('ghi'); -- fail
INSERT INTO MyTable18 (Col2)
VALUES ('jkl'); -- ok
SELECT * FROM MyTable18;
DESC MyTable18;
DESC MyTable17;

--
CREATE TABLE MyTable19 (
	Col1 INT DEFAULT 0,
    Col2 INT NOT NULL
);
DESC MyTable19;
INSERT INTO MyTable19 (Col1, Col2)
VALUES (100, 200); -- ok
INSERT INTO MyTable19 (Col2)
VALUES (200); -- ok Col1에는 0
SELECT * FROM MyTable19;
INSERT INTO MyTable19 (Col1) VALUES (100); -- fail
INSERT INTO MyTable19 (Col1, Col2) 
VALUES (NULL, 200); -- ok




