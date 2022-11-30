--11월 29일
--Java와 연동하기 위한 샘플 테이블 작성

-- 회원정보 테이블을 생성하고 데이터 입력후 자바에서 읽어와지는지 확인
CREATE TABLE usrinfo(
  usrid VARCHAR2(20) PRIMARY KEY,
  usrname VARCHAR2(20) NOT NULL,
  age NUMBER(3) DEFAULT 0
);

--샘플 데이터 넣어보기
INSERT INTO usrinfo VALUES('aaa', '손흥민', 29);
INSERT INTO usrinfo VALUES('bbb', '김진수', 30);
INSERT INTO usrinfo VALUES('ccc', '황희찬', 31);
INSERT INTO usrinfo VALUES('ddd', '조규성', 32);
INSERT INTO usrinfo VALUES('eee', '김민재', 33);

--데이터가 잘 들어갔는지 확인
SELECT * FROM usrinfo;

-- 트랜잭션 마무리 (저장) --> 이 과정을 안거치면 자바에서 데이터를 읽어들일 수 없음
COMMIT;