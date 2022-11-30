-- 회원관리 프로그램에 필요한 테이블 정보

--컬럼:
DROP TABLE addr;
DROP TABLE members;
DROP SEQUENCE addr_seq;

CREATE TABLE members(
    usrid VARCHAR2(15) primary key,
    usrname VARCHAR2(20) not null,
    email VARCHAR2(30) unique not null
);

CREATE TABLE addr(
    addrno number primary key,
    city VARCHAR2(20) check(city in('서울시', '인천시', '부산시', '제주시')),
    address VARCHAR2(20),
    usrid VARCHAR2(15) references members(usrid)
);

INSERT INTO members VALUES('kim','김민재','kim@naver.com');
INSERT INTO members VALUES('son','손흥민','son@naver.com');
INSERT INTO members VALUES('lee','이강인','lee@naver.com');

commit;

CREATE sequence addr_seq;
DROP sequence addr_seq;

/*

	테이블 : members
	컬럼 : 아이디(usrid pk) 이름(usrname nn) 이메일 (email, unique, nn)
	
	
	테이블: addr (지역에 대한 정보에 관련된 표)
	[컬럼]
	일련번호(addrno) : pk
	지역(city) : check('서울시', '인천시', '부산시', '제주시') 사용자가 특정한 데이터 외에는 다른 데이터는 들어갈 수 없도록 강제 하는것
	구(address) :
	아이디 : FK
	시퀀스 : addr_seq 
	
*/