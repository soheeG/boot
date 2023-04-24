-- 학생명, 전화번호(여러개 가능)
CREATE TABLE Student (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Name VARCHAR(50)
);
CREATE TABLE StudentPhone (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	StudentId INT,
	Phone VARCHAR(50),
    -- forien key (외래키 참조키)
    FOREIGN KEY (StudentId) REFERENCES Student(Id)
);
DESC Student;
DESC StudentPhone;

CREATE TABLE StudentPhone(
	StudentId INT,
    Phone VARCHAR(50),
    PRIMARY KEY (StudentId, Phone)
);

-- 데이터 입력
INSERT INTO Student (Name) VALUES ('손흥민');
INSERT INTO Student (Name) VALUES ('박지성');
SELECT * FROM Student;

INSERT INTO StudentPhone (StudentId, Phone)
VALUES (1, '010-9999-8888');
INSERT INTO StudentPhone (StudentId, Phone)
VALUES (2, '010-8888-8888');
SELECT * FROM StudentPhone;

INSERT INTO StudentPhone (StudentId, Phone)
VALUES (3, '010-8888-7777'); -- fail(Student테이블에 값이 없기 때문)

INSERT INTO StudentPhone (StudentId, Phone)
VALUES (NULL, '010-5555-5555'); -- ok
SELECT * FROM StudentPhone;

INSERT INTO StudentPhone (StudentId, Phone)
VALUES (NULL, '010-5555-3333'); -- ok (NULL은 중복 허용)

DELETE FROM StudentPhone
WHERE StudentId IS NULL;

ALTER TABLE StudentPhone
MODIFY COLUMN StudentId INT NOT NULL;
SELECT * FROM StudentPhone;

INSERT INTO StudentPhone (StudentId, Phone)
VALUES (1, '010-7777-7777');
SELECT * FROM Student;
SELECT * FROM StudentPhone;

DELETE FROM Student
WHERE ID =2; -- fail(외래키 제약사항이 있는 테이블의 데이터를 먼저 지워야 함)
DELETE FROM StudentPhone
WHERE StudentId = 2;
DELETE FROM Student
WHERE Id = 2;
SELECT * FROM Student;

-- ON : 조인 조건
SELECT * FROM Products JOIN Categories ON Products.CategoryId = Categories.CategoryId;

-- 조인 후 컬럼 수 : 왼쪽테이블 컬럼 수  + 오른쪽테이블 컬럼 수
DESC Products; -- 6개 컬럼
DESC Categories; -- 3개 컬럼
SELECT * FROM Products JOIN Categories
ON Products.CategoryID = Categories.CategoryId; -- 9개 컬럼

SELECT ProductName, CategoryName
FROM Products JOIN Categories
ON Products.CategoryID = Categories.CategoryId;

SELECT * FROM Products;
SELECT * FROM Suppliers;

-- 상품명, 그 상품을 공급하는 공급자명
SELECT ProductName, SupplierName 
FROM Products JOIN Suppliers
ON Products .SupplierID = Suppliers.SupplierID
ORDER BY 2;

-- ALIAS 사용으로 코드 줄이기
SELECT CustomerName AS Name FROM Customers;

SELECT ProductName, SupplierName
FROM Products AS p JOIN Suppliers AS s
ON p.SupplierID = s.SupplierID;

SELECT ProductName, SupplierName
FROM Products p JOIN Suppliers s
ON p.SupplierID = s.SupplierID;