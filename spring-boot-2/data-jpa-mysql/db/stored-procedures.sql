delimiter //
create procedure find_all_employees()
begin
	select e.empno, e.ename, e.job, e.sal, e.comm, e.mgr,e.hiredate, d.deptno, d.dname, d.loc from emp e join dept d on e.deptno = d.deptno;
end //
delimiter ;

call find_all_employees;

drop procedure find_all_employees;