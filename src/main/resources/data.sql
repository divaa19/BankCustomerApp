Drop table IF Exists customer;

Create Table customer(
accountid INT primary key,
name varchar(100) not null,
age INT ,
address varchar(250),
account_type varchar(100));


Insert into customer values(1001,'Customer1', 25,'Address 1 , Bangalore, India','Savings');
Insert into customer values(1002,'Customer2', 26,'Address 2, Delhi , India','Savings');
Insert into customer values(1003,'Customer3', 27,'Address 3, Mumbai, India','Current');
Insert into customer values(1004,'Customer4', 28,'Address 5, Mumbai, India','Current');
Insert into customer values(1005,'Customer5', 29,'Address 6, Kolkata, India','Savings');



