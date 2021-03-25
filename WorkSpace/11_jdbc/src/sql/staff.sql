-- 주석처리, staff 테이블 삭제
DROP TABLE staff;

-- staff 테이블 추가
CREATE TABLE staff
(
	no NUMBER,
	name VARCHAR2(100),
	department VARCHAR2(100),
	hireDate DATE,
	PRIMARY KEY(no)
);


SELECT * FROM staff;

SELECT MAX(no) FROM staff;