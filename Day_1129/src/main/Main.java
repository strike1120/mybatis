package main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dao.MybatisConfig;
import dao.UsrDAO;
import vo.UsrInfo;

public class Main {

	public static void main(String[] args) {
		SqlSessionFactory factory = MybatisConfig.getSessionFactory();
		SqlSession session = factory.openSession();
		UsrDAO dao = session.getMapper(UsrDAO.class);
		
		List<UsrInfo> list = dao.selectAll();
		
		for(UsrInfo usr : list) {
			System.out.println(usr);
		}
	}

}
