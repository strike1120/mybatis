package global.scit.member.dao;

import java.util.List;

import global.scit.member.vo.Addr;
import global.scit.member.vo.MemberInfo;
import global.scit.member.vo.Members;

public interface MemberMapper {
//	insert
	public int insertMember(Members member); //오라클에서 1행이 삽입되었습니다 라고 int값을 리턴하기때문에 리턴값을 int로 해줘야함!(boolean이 아님)
	public int insertAddr(Addr addr);
	
//	selectOne
	public MemberInfo selectOne(String usrid);  //파라미터타입은 String -> 키보드로 부터 usrid를 입력받는데 그 타입은 string이므로
	
//	selectAll
	public List<MemberInfo> selectAll(); //전체회원에 대한 정보니까 파라미터 필요없고, 반환타입은 List
	
//	update
	public int updateMember(Members member);  //update가 됐다 안됐다 니까 -> 원래는 boolean but오라클에서는 int
	public int updateMember(String usrid, String usrname, String email, int addrno);  //update가 됐다 안됐다 니까 -> 원래는 boolean but오라클에서는 int
	
//	delete
	public int deleteMember(String usrid);  //delete가 됐다 안됐다 니까 -> 원래는 boolean but오라클에서는 int
}


//dao.MemberMapper
//- 오라클로 접속해서 해야하는 작업들에 대한 정의 부분이 들어가있다
//- CRUD밖에없음