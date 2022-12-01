package global.scit.member.service;

import java.util.List;

import global.scit.member.dao.MemberDAO;
import global.scit.member.vo.MemberInfo;


public class MemberService { //서비스는 ui에서 데이터를 받아서 dao로 넘기는 역할을한다
	MemberDAO dao = new MemberDAO(); //dao객체 생성 -> 그래야 데이터를 넘길수있으니까
	
	public MemberInfo findById(String usrid) {
		MemberInfo info = dao.selectOne(usrid); //DAO에 만들어진 selectOne이라는 함수를 호출함으로써 데이터를 넘겨준다
		return info;
		
	}
	
	public List<MemberInfo> findAll() {
		List<MemberInfo> info = dao.selectAll(); //DAO의 selectAll()함수를 호출해서 데이터를 넘겨주고 -> 다시 넘겨받은 데이터를 info변수에 담는다
		return info;
		
	}
	

	public int insertMember(String usrid, String usrname, String email, int addrno) {
		int info = dao.insertMember(usrid,usrname,email,addrno);
		return info;
	}

}
