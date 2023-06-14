create database di004;
use di004;

create table course(
courseid int primary key,
coursename varchar(25));

create table teacher(
teacherid int primary key,
teachername varchar(25),
teacherAddress varchar(40));

create table student(
rollNo int primary key,
feePaid date,
name varchar(20),
dob date,
courseid int,
teacherid int,
address varchar(40),
constraint foreign key(courseid) REFERENCES course(courseid),
constraint foreign key(teacherid) REFERENCES teacher(teacherid)
);

insert into course
values(1, "Computer Science"),
(2, "Medicine"),
(3, "Chemistry"),
(4, "Mathamatic");

insert into teacher
values(1, "Ms. May", "London"),
(2, "Ms. Long", "Sheffield"),
(3, "Mr. Smith", "Bristol"),
(4, "Ms. Joy", "Manchester");

select * from course;
select * from teacher;

insert into student
values(1,"2023-06-10", "AAAA", "2002-04-20", 1,1, "Brixton"),
(2,"2023-06-10", "BBBB", "2000-10-30", 2,4, "Calpham"),
(3,"2023-06-10", "CCCC", "2001-05-16", 3,3, "Fulham"),
(4,"2023-06-10", "DDDD", "2001-09-02", 4,2, "Hackney");

select * from student;