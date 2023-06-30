create database DVDLib;
use DVDLib;
select * from dvd;
use Employee;
select * from employee;
create table DVD(
dvd_ID int primary key,
title varchar(40),
MPAA_rating int,
director_name varchar(50),
studio varchar(40),
user_rating int);

insert into DVD
values(1,"Harry Potter",8,"J.K Rowling","Warner Bros",7),
(2,"Dune",10,"Mr Film","MMG",8),
(3,"500 Days of Summer",7,"Kelly May","Disney",7),
(4,"Marvin",8,"Susan Boyle","Warner Bros",5),
(5,"Love Actually",2,"Brad Pitt","Disney",8),
(6,"SummerTime",9,"Jim Bobby","Warner Bros",2),
(7,"Mr Bean",4,"Kevin Lang","LoveFilm",9),
(8,"Toy Story",7,"Wendy Wells","Disney",8),
(9,"Troy",5,"Danny Prond","Warner Bros",7),
(10,"The Holiday",10,"Terry Hall","Disney",6),
(11,"Barbie",4,"Frances Long","New Film",5);

update DVD
set user_rating=7 
where dvd_ID=11;

select * from DVD;