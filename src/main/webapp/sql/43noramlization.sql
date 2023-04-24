-- noramlization (정규화)
-- 1NF (first normal form) 첫번째 정규화
-- 예제) 학생명, 전화번호
CREATE TABLE Students (
	Id INT PRIMARY KEY AUTO_INCREMENT, -- 인위적 키 컬럼
    Name VARCHAR(50)
    
);
CREATE TABLE StudentPhone (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	StudentId INT,
    Phone VARCHAR(50),
    PRIMARY KEY (StudentId, Phone)
);

-- 예제) 교재 정보를 저장할 테이블 작성
CREATE TABLE Books (
	Id INT PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR (50),
    Writer VARCHAR(50),
    Publisher VARCHAR(200),
    Price INT
);
-- 2NF (second normal form) 두번째 정규화
-- 규칙1) 1NF여야 함
-- 규칙2) 부분적 함수 의존이 없어야 함
-- 3NF (third normal form) 세번째 정규화
