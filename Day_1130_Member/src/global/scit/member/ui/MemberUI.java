package global.scit.member.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import global.scit.member.service.MemberService;
import global.scit.member.vo.MemberInfo;

public class MemberUI { //사용자로부터 뭔가를 입력받는 클래스  //실질적인 기능은 없음. //입력받아서 service로 전달하고 싶으면 service클래스가 있어야함
	
	Scanner keyin = new Scanner(System.in);
	
	MemberService service = new MemberService(); //사용자로부터 데이터를 입력받아서 service로 전달하기 위해 service객체 생성(=호출)
	
	public MemberUI() {
		String choice;
		
		while(true) {			
			mainMenu(); //시용자 조회, 한사람 조회, 삭제, 종료
			
			choice = keyin.next();
			
			switch(choice) {
			case "1" : findById(); break;
			case "2" : findAll(); break;
			case "3" : insertMember(); break;
			case "0" : 
				System.out.println("good bye~");
				return;
			default : 
				keyin.nextLine(); //혹시 buffer에 남아있는게 있다면 buffer를 비운다
			}
		}
			
	}

	private void insertMember() {
		
		System.out.println("가입할 id: ");
		String usrid = keyin.next();
		MemberInfo info = service.findById(usrid);
		if(info != null) {
			System.out.println("가입불가");
			return;
		}
		System.out.println("가입할 name: ");
		String usrname = keyin.next();
		System.out.println("가입할 email: ");
		String email = keyin.next();
		
		System.out.println("가입할 주소 : ");
		menu();
		int addrno = keyin.nextInt();
		switch(addrno) {
		case 1 : addrno = 1; break;
		case 2 : addrno = 2; break;
		case 3 : addrno = 3; break;
		case 4 : addrno = 4; break;
		case 5 : addrno = 5; break;
		default : 
			keyin.nextLine();
		}
		
		int signin = service.insertMember(usrid, usrname, email, addrno);
		if(signin == 1) {
			System.out.println("가입완료");
		}
	}

	private void menu() {
		System.out.println("1.서울시 종로구");
		System.out.println("2.인천시 연수구");
		System.out.println("3.서울시 강남구");
		System.out.println("4.부산시 사상구");
		System.out.println("5.제주시 북제주군");
		
	}

	private void findAll() {
		System.out.println("\n 전체 회원 조회");
		MemberService mem = new MemberService();
		List<MemberInfo> list  = mem.findAll();
		
		if(list.size()==0) { // 먼저 회원이 있는지 없는지 검증
			System.out.println("회원정보가 없습니다");
			return;
		}
				
		for( MemberInfo usr : list) {
			System.out.println(usr);
		}
		//iterator
//		Iterator<MemberInfo> iter = list.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
	}

	private void findById() {
		String usrid = null; //사용자id 초기화
		
		System.out.println("회원정보조회");
		System.out.print("id를 입력해주세요: ");
		usrid = keyin.next();
		
		MemberInfo info = service.findById(usrid); //service로 usrid를 넘긴다, 넘긴 데이터는 한사람에 대한정보여야한다(데이터타입:MemberInfo)
		//service에서 findById를 아직 안만들었기때문에 오류가 난다.
		if(info == null) {
			System.out.println("회원정보가 없습니다");
			return;
		}
		
		System.out.println(info);
	}

	private void mainMenu() {
		System.out.println("[회원정보관리]");
		System.out.println("1. 회원 정보 조회"); //selectOne()
		System.out.println("2. 전체 회원 조회"); //selectAll()
		System.out.println("3. 회원가입"); //insertMember() -> 어떤 데이터를 입력받아야하나?->memers table 컬럼확인
		System.out.println("0. 종료");
		System.out.println();
		System.out.print("> 선택:");
	}
}
