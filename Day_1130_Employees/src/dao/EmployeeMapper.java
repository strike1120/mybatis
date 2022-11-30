package dao;

import java.util.List;

import vo.Employee;

public interface EmployeeMapper {
	public List<Employee> selectAll();
	public Employee selectOne(int empid);
	public List<Employee> selectByDepartment(int deptno);
}
