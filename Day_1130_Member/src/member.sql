-- 회원관리 프로그램에 필요한 테이블 정보
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
DROP TABLE members;
DROP TABLE addr;
DROP SEQUENCE addr_seq;

CREATE TABLE addr(
    addrno number primary key,
    city VARCHAR2(20) check(city in('서울시', '인천시', '부산시', '제주시')),
    address VARCHAR2(20)
);

CREATE sequence addr_seq;
DROP sequence addr_seq;

CREATE TABLE members(
    usrid VARCHAR2(15) primary key,
    usrname VARCHAR2(20) not null,
    email VARCHAR2(30) unique not null,
    addrno number references addr(addrno)
);

INSERT INTO addr VALUES(addr_seq.NEXTVAL,'서울시','종로구');
INSERT INTO addr VALUES(addr_seq.NEXTVAL,'인천시','연수구');
INSERT INTO addr VALUES(addr_seq.NEXTVAL,'서울시','강남구');
INSERT INTO addr VALUES(addr_seq.NEXTVAL,'부산시','사상구');
INSERT INTO addr VALUES(addr_seq.NEXTVAL,'제주시','북제주군');

SELECT * FROM addr;

INSERT INTO members VALUES('hong','홍길동','hong@naver.com',2);
INSERT INTO members VALUES('son','손오공','son@naver.com',3);
INSERT INTO members VALUES('ssao','사오정','ssao@naver.com',4);

SELECT * FROM members;

commit;

--아이디, 이름, 이메일, 시, 주소
select 
    m.usrid, m.usrname, m.email, a.city, a.address
from
    members m, addr a
where
    m.addrno = a.addrno;


