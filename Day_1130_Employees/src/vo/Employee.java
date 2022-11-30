package vo;

public class Employee {
	private int empid;
	private String ename;
	private String hiredate; //DATE를 String으로 받아왔음
	private double salary;
	private String departmentname;
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, String hiredate, double salary, String departmentname) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.hiredate = hiredate;
		this.salary = salary;
		this.departmentname = departmentname;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEname() {
		return ename;
	}
	public String getHiredate() {
		return hiredate;
	}
	public double getSalary() {
		return salary;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", hiredate=" + hiredate + ", salary=" + salary
				+ ", departmentname=" + departmentname + "]";
	}
	
	
}



/*
SELECT 
e.employee_id as empid
, e.first_name || ' ' || e.last_name as ename
, e.hire_date as hiredate
, e.salary as salary
, d.department_name as departmentname
FROM
employees e, departments d
WHERE 
e.department_id = d.department_id;
ORDER BY 2;
*/