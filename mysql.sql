create database ep;
use ep;
create table student(no int,name varchar(30),email varchar(50),marks int,class  varchar(1));
insert into student values(126,"damon","damon.salvatore@gmail.com",88,"A");
insert into student values(127,"caroline","caroline.forbes@gmail.com",76,"A");
insert into student values(128,"jeremy","jeremy.gilbert@gmail.com",92,"A");
insert into student values(129,"klaus","klaus.michealson@gmail.com",56,"A");
insert into student values(130,"noah","noah.weird@gmail.com",98,"A");
select * from student;
alter table student modify  no  int primary key;
delete from student where no=126;
update student set name="ria" where no=130;
alter table student add age int;
desc student;
alter table student drop column age;




