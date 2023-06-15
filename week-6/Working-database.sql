create database classPractice;

use classPractice;

create table countries(
country_Id char(2) primary key,
country_name varchar(40),
region_id int);

insert into countries
values(01,"England",01),
(02, "Scotland", 02),
(03, "Wales", 03),
(04, "Ireland",04),
(05,"France",05);

create table jobs(
job_ID varchar(10) primary key,
job_title varchar(35) NOT NULL,
min_salary int,
max_salary int);

insert into jobs
values("S01","Software Engineering",35000,85000),
("HR02","HR",25000,45000),
("RD03","R&D",45000,105000),
("A04","Audit",65000,95000),
("R05","Recruitment",25000,65000);

create table locations(
location_Id int primary key,
street_address varchar(40),
postal_code varchar(12),
city varchar(30) NOT NULL,
state_province varchar(25),
country_Id char(2),
constraint foreign key(country_Id) REFERENCES countries(country_Id));

insert into locations
values(1, "Oxford Street", "C2 3AA", "London", "Londondary", 01),
(2, "Glasgow Streer", "GW01 1BB", "Glasgow", "Glaswegian", 02),
(3, "Cardiff Street", "CC9 4CC", "Cardif", "Walesary", 03),
(4, "Dublin Street", "D12 8DD", "Dublin", "Irelandary", 04),
(5, "Paris Rue", "20076", "Paris", "Frances", 05);

create table department(
department_Id int primary key,
department_name varchar(30) NOT NULL,
manager_Id int, -- Can make this a FK of PK from employee if you want
location_Id int,
constraint foreign key(location_Id) references locations(location_Id));

insert into department
values(100, "Software Engineering", 101, 01),
(200, "HR", 102,02),
(300, "R&D", 103, 03),
(400, "Audit", 104, 04),
(500, "Recruitment", 105, 05);

create table employee(
employee_Id int primary key,
first_name varchar(20),
last_name varchar(25) NOT NULL,
email varchar(20) NOT NULL ,
phone_number varchar(20),
hire_date date NOT NULL,
job_Id varchar(10) NOT NULL,
salary double,
commission_PCT double, 
manager_id int,
department_Id int,
constraint foreign key(job_Id) references jobs(job_ID),
constraint foreign key(department_Id) references department(department_Id));

insert into employee
values(110, "Byron","Bing","1111111@123.com","07888898888","2000-06-06","RD03",35000.60,null,801,300),
(120, "Barry","Geller","22222@678.com","07555555555","2020-09-06","HR02",35000.60,null,802,200),
(130, "Bill","Greene","33333@357.com","07222222222","2002-07-06","RD03",35000.60,null,803,300),
(154, "Bob","Buffay","44444@273.com","07666666666","2008-02-06","A04",35000.60,null,804,400),
(115, "Jack","Tribiani","5895452@941.com","07889966443","2001-12-06","R05",35000.60,null,805,500);

create table job_history(
employee_Id int NOT NULL,
start_date date NOT NULL,
end_date date NOT NULL,
job_Id varchar(10) NOT NULL,
department_Id int,
CONSTRAINT fk_employee_Id
    	FOREIGN KEY (employee_Id)
    	REFERENCES employee(employee_Id),
CONSTRAINT fk_job_Id
    	FOREIGN KEY (job_Id)
    	REFERENCES jobs(job_ID),
CONSTRAINT fk_department_Id
    	FOREIGN KEY (department_Id)
    	REFERENCES department(department_Id),
 CONSTRAINT pk_job_history
    	PRIMARY KEY (employee_Id, job_Id,department_Id));

insert into job_history
values(101,"2000-06-06","2023-01-01","S01",100),
(102,"2020-09-06","2020-10-19","HR02",200),
(103,"2002-07-06","2008-01-01","RD03",300),
(104,"2008-02-06","2016-11-18","A04",400),
(105,"2001-12-06","2022-06-01","R05",500);

drop table job_history;
drop table employee;
drop table department;

select * from employee;
select * from department;
select * from locations;
select * from countries;
select * from jobs;
select * from job_history;

select employee_Id, last_name, job_Id, hire_date "STARTDATE"
from employee;

alter table department
drop constraint Fk_Manager_Id; -- didn't want it as a FK because it is then a cyclic relationship

insert into employee
values(176, "Louise","Fallon","fallon@gmail.com","07814898888","2022-06-06","HR02",5000.60,302.2,801,200);

insert into employee
values(201, "Louise","Taylor","taylor@gmail.com","07814890088","2021-06-06","HR02",10000.60,302.2,801,200),
(554, "Louise","Matos","matos@gmail.com","07800898888","2020-06-06","S01",62000.60,302.2,801,100);

select 
employee_Id "Emp #", 
last_name "Employee",
job_Id "Job", 
hire_date "Hire Date"
from employee;

select
concat(last_name,", ",job_Id) "Employee and Title"
from employee;

select
concat(employee_Id,", ",first_name,", ",last_name,", ",email,", ",phone_number,", ",hire_date,", ",job_Id,", ",salary,", ",manager_id,", ",department_Id) "THE_OUTPUT"
from employee;

select * from employee
WHERE salary > 12000;

select * from employee 
WHERE employee_Id = 176;

select * from employee
WHERE last_name = "Matos" or last_name = "Taylor";

select last_name from employee
WHERE department_Id = 200 or department_Id = 500;

select 
last_name "Employee",
salary "Monthly Salary"
from employee
WHERE department_Id in(200,500) AND salary BETWEEN 5000 and 12000;

select * from employee 
WHERE hire_date like "1994-%";

select * from employee
WHERE manager_Id IS NULL;

select
concat(last_name,", ",salary,", ",commission_PCT) from employee
WHERE commission_PCT IS NOT NULL;

select count(*) from employee
WHERE department_Id = 100;

select max(salary)
from employee;

select min(salary)
from employee
where department_Id = 300;

select department_Id, count(department_Id)
from employee
group by department_Id;

select department_Id, max(salary), min(salary), sum(salary)
from employee
-- where department_Id != 100 (Can add more queries into the table)
group by department_Id
having max(salary)>20000;

select max(salary) "Maximum", min(salary) "Minimum", sum(salary) "Sum", sum(salary)/count(salary) "Average"
from employee;

select department_Id, max(salary) "Maximum", min(salary) "Minimum", sum(salary) "Sum", sum(salary)/count(salary) "Average"
from employee
group by department_Id;

select distinct job_Id, count(job_Id)
from employee
group by job_Id;

select count(distinct manager_Id)
from employee;

select max(salary) - min(salary) "Difference"
from employee;