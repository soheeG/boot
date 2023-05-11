USE Board;
SELECT * FROM Board;
SELECT * FROM Member;

UPDATE Board
SET writer = 'user1';

ALTER TABLE Board
ADD FOREIGN KEY (writer) REFERENCES Member(id);

SET SQL_SAFE_UPDATES=0;

-- 권한 테이블
CREATE TABLE MemberAuthority (
	memberId VARCHAR(20) NOT NULL,
	authority VARCHAR(30) NOT NULL,
    FOREIGN KEY (memberId) REFERENCES Member(id),
    PRIMARY KEY (memberId, authority) 
);

DESC MemberAuthority;

INSERT INTO MemberAuthority
VALUES ('admin0', 'admin');

SELECT * FROM MemberAuthority;

DESC Member;

SELECT * 
FROM Member m LEFT JOIN MemberAuthority ma ON m.id = ma.memberId
WHERE m.id = 'admin0';