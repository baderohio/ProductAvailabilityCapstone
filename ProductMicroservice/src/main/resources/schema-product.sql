-- User Creation Script for the productdb Database
-- Drop the user.
drop user productdb cascade;

-- create the user
create user productdb
identified by p4ssw0rd
default tablespace users
temporary tablespace temp
quota 10m on users;

grant connect to productdb;
grant resource to productdb;
grant create session to productdb;
grant create table to productdb;
grant create view to productdb;



DROP TABLE IF EXISTS Product;

CREATE TABLE Product (
	id_Product number NOT NULL,
	name varchar(100),
        dept_Id number,
        dept_Name varchar(100)
);
