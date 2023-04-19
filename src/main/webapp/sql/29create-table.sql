-- CREATE TABLE : 새 테이블 만들기
-- TABLE 이름 : 작성 규칙 (회사마다 다름)
-- UpperCamelCase, lower_snack_case 둘 중 하나의 방법으로 작성

CREATE TABLE MyTable01(
	-- 컬럼 정의
    -- 컬럼명 값의 TYPE 명시, ...
    -- 컬럼명 작성 규칙은 소속팀의 규칙 따르기
    Col1 INT,
    Col2 VARCHAR(255)
);

SELECT * FROM MyTable01;
-- DESC : 테이블 구조 보기
DESC MyTable01;
INSERT INTO MyTable01 (Col1, Col2)
VALUES (30, '가나다');
SELECT * FROM MyTable01;
INSERT INTO MyTable01 (Col1, Col2)
VALUES ('삼십', '가나다'); -- TYPE에 맞지 않는 값 작성으로 에러 발생
SELECT * FROM MyTable01;
