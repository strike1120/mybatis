package global.scit.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import global.scit.member.vo.MemberInfo;
import global.scit.member.vo.Members;


public class MemberDAO { //interface와는 관련이 없음
	//멤버단에 있다 = 특정 메소드에 속해있지 않다
	
	//1) 접속한다
	SqlSessionFactory factory = MybatisConfig.getSessionFactory();
	
	
	//모든회원의 정보 목록을 조회
	public List<MemberInfo> selectAll(){ //DB에 접속해서 회원정보(데이터)를 받아서 ui쪽으로 데이터를 넘기는 역할을 하는 함수
		SqlSession session = null; // sqlsession 객체 선언
		
		session = factory.openSession();
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		List<MemberInfo> list = mapper.selectAll(); //실질적으로 접속해서 데이터를 긁어오는 코드 (db목록을 긁어와서 list변수에 담는다) 
		
		return list;
	}
	
	
	// 한 사람의 회원정보를 조회
	public MemberInfo selectOne(String usrid) {
		SqlSession session = null;
		
		session = factory.openSession(); //session을 통해 DB에 접속시도
		MemberMapper mapper = session.getMapper(MemberMapper.class); //
	    MemberInfo member = mapper.selectOne(usrid); //
		
		return member;
	}

	
	//회원 가입
	public int insertMember(String usrid, String usrname, String email, int addrno) {
		SqlSession session = null;
		
		session = factory.openSession(); //session을 통해 DB에 접속시도
		MemberMapper mapper = session.getMapper(MemberMapper.class); //
		
		int signin = mapper.updateMember(usrid, usrname, email, addrno);
		
		return 0;
	}
}
