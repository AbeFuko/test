set names utf8;
set foreign_key_checks = 0;

drop database if exists ecsite_a;

create database if not exists ecsite_a;
use ecsite_a;

drop table if exists login_user_transaction;

create table login_user_transaction(
	id int not null primary key auto_increment,
	login_id varchar(16) unique,
	login_pass varchar(16),
	user_name varchar(50),
	insert_date datetime,
	updated_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
	id int not null primary key auto_increment,
	item_name varchar(30),
	item_price int,
	item_stock int,
	insert_date datetime,
	update_date datetime
);