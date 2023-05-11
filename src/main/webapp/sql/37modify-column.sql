-- MODIFY COLUMN : 컬럼 타입 변경
ALTER TABLE MyTable13 
MODIFY COLUMN Col20 VARCHAR(40);

SELECT * FROM MyTable13;
ALTER TABLE MyTable13
MODIFY COLUMN Col13 VARCHAR(40);

ALTER TABLE MyTable13
MODIFY COLUMN Col13 VARCHAR(3); -- 가능할 수도 있어서 주의하여야 함

-- 아무 컬럼이나 타입 변경
ALTER TABLE MyTable13 
MODIFY COLUMN Col9 VARCHAR(30);

-- 컬럼 위치 변경
ALTER TABLE MyTable13
MODIFY COLUMN Col8 VARCHAR(9) FIRST;
DESC MyTable13;
ALTER TABLE MyTable13
MODIFY COLUMN Col8 VARCHAR(9) AFTER Col6;

ALTER TABLE MyTable13 
MODIFY COLUMN Col3 DATE AFTER Col5;
DESC MyTable13;

