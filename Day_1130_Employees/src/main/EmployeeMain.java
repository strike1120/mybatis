package main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dao.EmployeeMapper;
import dao.MybatisConfig;
import vo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		//1.접속한다.
		SqlSessionFactory factory = MybatisConfig.getSessionFactory();
		
		//2.세션을 오픈한다.
		SqlSession session =  factory.openSession();
		
		//3.mapper 인터페이스를 통해 데이터를 주고 받을수 있도록 준비
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		
		//4-1.쿼리문을 동작시킨다
		int empid = 233;
		Employee emp = mapper.selectOne(empid);
		
		if(emp != null)
			System.out.println(emp);
		else
			System.out.println("그런 직원 없어요!");
		
		//4-2 전체직원 명단을 질의하는 쿼리를 동작시킨다(selectAll)
//		List<Employee> list = mapper.selectAll();
//		
//		for(Employee usr : list) {
//			System.out.println(usr);
//		}
//		
		//4-3 특정 부서에 대한 정보를 질의한다
		int deptno = 2800;
		List<Employee> list = mapper.selectByDepartment(deptno);
		
		if(list.size() != 0) {
			for(Employee department : list) {
				System.out.println(department);
			} 
		}else {
			System.out.println(deptno + "부서는 없습니다.");
		}
		

}
}