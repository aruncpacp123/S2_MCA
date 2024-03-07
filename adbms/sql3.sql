create schema university;
use university;
create table student(name varchar(50),Student_number int primary key,Class int,Major varchar(25));
create table course(Course_name varchar(100),Course_number varchar(25) primary key,Credit_hours int,Department varchar(50));
create table section(Section_identifier int primary key,Course_number varchar(25),Semester varchar(25),Year int,Instructor varchar(50),foreign key(Course_number) references course(Course_number));
create table grade_report(Student_number int ,Section_identifier int,Grade varchar(10),primary key(Student_number,Section_identifier),foreign key(Student_number)references student(Student_number),foreign key(Section_identifier) references section(Section_identifier));
create table prerequisite(Course_number varchar(25) ,Prerequisite_number varchar(25),primary key(Course_number,Prerequisite_number),foreign key(Course_number) references course(Course_number),foreign key(Prerequisite_number) references course(Course_number));

insert into student values('Smith',17,1,'CS');
insert into student values('Brown',8,2,'CS');

insert into course values('Intro to Computer Science','CS1310',4,'CS');
insert into course values('Data Structures','CS3320',4,'CS');
insert into course values('Discrete Mathematics','MATH2410',3,'MATH');
insert into course values('Database','CS3380',3,'CS');

insert into section values(85,'MATH2410','Fall',07,'King');
insert into section values(92,'CS1310','Fall',07,'Anderson');
insert into section values(102,'CS3320','Spring',08,'Knuth');
insert into section values(112,'MATH2410','Fall',08,'Chang');
insert into section values(119,'CS1310','Fall',08,'Anderson');
insert into section values(135,'CS3380','Fall',08,'Stone');

insert into grade_report values(17,112,'B');
insert into grade_report values(17,119,'C');
insert into grade_report values(8,85,'A');
insert into grade_report values(8,92,'A');
insert into grade_report values(8,102,'B');
insert into grade_report values(8,135,'A');

insert into prerequisite values('CS3380','CS3320');
insert into prerequisite values('CS3380','MATH2410');
insert into prerequisite values('CS3320','CS1310');


