Create database FlightManagementDB;

create table users(
username varchar(15) primary key not null,
password varchar(12) not null);
 
 select  * from user;
 show tables;
 
 insert into user values ("anamika","1234");
 insert into user values ("john" , "0987");
 
 create table flight(
   flight_number varchar(5) not null ,
	valid_till date not null,
    time varchar(5) not null,
    dep_loc varchar(5) not null,
	arr_loc varchar(5) not null,
	duration double not null,
	fare integer not null,
	status varchar(5) not null,
	class varchar(5) not null,
    primary key(flight_number,valid_till)
    
    );
    desc flight;
    select * from flight;
    
);


	