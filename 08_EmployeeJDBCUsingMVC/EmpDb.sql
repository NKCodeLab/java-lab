create database citibankdb;

use citibankdb;

create table employee_details(
	employee_id int primary key,
    name varchar(20),
    salary double 
)

select * from employee_details;

insert into employee_details values(101,'Vivek Gohil',1000);
insert into employee_details values(102,'Virat Kohli',2000);
insert into employee_details values(103,'Reema Rao',2000);
