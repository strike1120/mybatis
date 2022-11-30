-- hr계정의 데이터 중 employees, departments 두 개의 테이블에서 join하여 데이터를 질의
-- employee_id(사원번호), first_name,last_name, hire_date, salary, department_name

SELECT 
	e.employee_id as empid
	, e.first_name || ' ' || e.last_name as ename
	, e.hire_date as hiredate
	, e.salary as salary
	, d.department_name as departmentname
FROM
	employees e, departments d
WHERE 
	e.department_id = d.department_id
    AND
    e.employee_id=100;