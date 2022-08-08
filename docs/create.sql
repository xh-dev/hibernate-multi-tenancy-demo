-- docker run --name mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d -p 3306:3306 mysql:latest

create database cdb;
create database db1;
create database db2;
use db1;
use db2;
create table city(
                     name varchar(200),
                     id int,
                     primary key(id)
);

-- insert into city(id, name) value(1, 'abc');
-- insert into city(id, name) value(2, 'cde');

-- insert into city(id, name) value(3, 'hij');
-- insert into city(id, name) value(4, 'lmn');
-- insert into city(id, name) value(5, 'opq');
-- insert into city(id, name) value(6, 'rst');
select * from city;