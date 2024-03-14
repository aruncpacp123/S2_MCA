create schema university;
use university;
create table student(name varchar(50),Student_number int primary key,Class int,Major varchar(25));
create table course(Course_name varchar(100),Course_number varchar(25) primary key,Credit_hours int,Department varchar(50));
create table section(Section_identifier int primary key,Course_number varchar(25),Semester varchar(25),Year int,Instructor varchar(50),foreign key(Course_number) references course(Course_number));
create table grade_report(Student_number int ,Section_identifier int,Grade varchar(10),primary key(Student_number,Section_identifier),foreign key(Student_number)references student(Student_number),foreign key(Section_identifier) references section(Section_identifier));
create table prerequisite(Course_number varchar(25) ,Prerequisite_number varchar(25),primary key(Course_number,Prerequisite_number),foreign key(Course_number) references course(Course_number),foreign key(Prerequisite_number) references course(Course_number));

insert into student values('Smith',17,1,'CS');
insert into student values('Brown',8,2,'CS');
insert into student values('John',10,4,'MATH');
insert into student values('Ram',15,4,'CS');


insert into course values('Intro to Computer Science','CS1310',4,'CS');
insert into course values('Data Structures','CS3320',4,'CS');
insert into course values('Discrete Mathematics','MATH2410',3,'MATH');
insert into course values('Database','CS3380',3,'CS');
insert into course values('Computer Networks','CS3340',3,'CS');

insert into section values(85,'MATH2410','Fall',07,'King');
insert into section values(92,'CS1310','Fall',07,'Anderson');
insert into section values(102,'CS3320','Spring',08,'Knuth');
insert into section values(112,'MATH2410','Fall',08,'Chang');
insert into section values(119,'CS1310','Fall',08,'Anderson');
insert into section values(135,'CS3380','Fall',08,'Stone');
insert into section values(144,'CS3340','Fall',07,'King');

insert into grade_report values(17,112,'B');
insert into grade_report values(17,119,'C');
insert into grade_report values(8,85,'A');
insert into grade_report values(8,92,'A');
insert into grade_report values(8,102,'B');
insert into grade_report values(8,135,'A');
insert into grade_report values(8,135,'A');
insert into grade_report values(15,144,'A');

insert into prerequisite values('CS3380','CS3320');
insert into prerequisite values('CS3380','MATH2410');
insert into prerequisite values('CS3320','CS1310');
insert into prerequisite values('CS3340','CS1310');

-- question3
select Name,Course_name,Grade from grade_report g inner join student on student.Student_number=g.Student_number inner join section on g.Section_identifier=section.section_identifier inner join course on course.Course_number=section.Course_number where Name="Smith";

-- question4  
select name,Course_name,Semester,Grade from section inner join grade_report g on g.Section_identifier= section.Section_identifier inner join course on course.Course_number=section.Course_number inner join student on student.Student_number=g.Student_number where Semester="Fall" and Year=08 and Course_name="Database";

-- question5
select Course_name as prerequiste_name from course where Course_number IN (
select Prerequisite_number from prerequisite p inner join course on course.Course_number=p.Course_number where Course_name="Database");

-- question6(my)
select distinct name from course inner join section on course.Course_number=section.Course_number inner join grade_report on section.Section_identifier=grade_report.Section_identifier inner join student on student.Student_number=grade_report.Student_number where year = (select distinct min(year) from section);

-- select name from student where Major in (
-- select Department from course where Department="CS" and Course_number in (
-- select Course_number from section where Year = (select distinct min(year) from section)));

-- question6
select name from student where major="CS" and class=4;

-- question7
select Course_name,Year from section inner join course on course.Course_number=section.Course_number where Instructor="King" and Year between 07 and 08;

-- question8
select Instructor,Course_number,Year,Semester,count(Student_number) from section inner join grade_report on grade_report.Section_identifier=section.Section_identifier group by grade_report.Section_identifier	having Instructor="King";

-- question9
select name,course.Course_number,Course_name,Credit_hours,Semester,Year,Grade from section inner join grade_report g on g.Section_identifier=section.Section_identifier inner join course on course.Course_number=section.Course_number inner join student on student.Student_number= g.Student_number where Class=4 and Major="CS";

-- question10
insert into student values('Johnson',25,1,'MATH');
update student set Class=2 where Name="Smith";
-- SET SQL_SAFE_UPDATES = 0;
insert into course values('Knowledge Engineering','CS4390',3,'CS');
delete from student where name="Smith" and Student_number=17;
select * from student;
