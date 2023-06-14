create database Employee;
use Employee;

create table employee(
empId int primary key,
empName varchar(35),
designation varchar(25),
department varchar(25),
empAge int check(empAge>18 AND empAge <60),
dateOfJoining date check(dateOfJoining < SYSDATE())); -- SYSDATE()

drop table employee;

insert into employee
values(100,"Sarah","Senior","Software",49,"2009-12-03"),
(101,"Joy","Junior","HR",26,"2018-08-30"),
(102,"Dylan","Mid","Sales",33,"2022-07-15"),
(103,"Grace","Executive","R&D",21,"2004-01-23"),
(104,"May","Lead","Recruitment",57,"2000-10-03");

select * from employee; 

create table department(
name varchar(40),
location varchar(25),
NoOfEmp int not null,
headDeptName varchar(40),
primary key(name, location, headDeptName));

insert into department
values("Sales","London",49,"Moria Rose"),
("Software","Bristol",207,"Susan May"),
("HR","Liverpool",89,"David Moss"),
("Recruitment","Manchester",29,"Rosie Joyson"),
("R&D","Bournmouth",71,"Claire Smith");

select * from department;