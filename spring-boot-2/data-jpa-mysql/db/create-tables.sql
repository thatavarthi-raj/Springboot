create table dept
(
 deptno int(32)
,dname varchar(50)
,loc varchar(50)
,constraint deptno_pk primary key(deptno)
);

create table emp
(
 empno int(32)
,ename varchar(50)
,deptno int(32)
,job varchar(50)
,sal int(32)
,comm int(32)
,mgr int(32)
,hiredate date
,active boolean
,constraint empno_pk primary key(empno),
constraint deptno_fk foreign key (deptno) references dept(deptno) on delete cascade,
constraint mgr_fk foreign key (mgr) references emp(empno)
);

create table salgrade
(
 hisal int(32)
,losal int(32)
,grade int(32)
);