set names utf8;
set foreign_key_checks = 0;

drop database if exists ecsite2;
create database ecsite2;
use ecsite2;

create table login_user_transaction(
	id int not null primary key auto_increment,
	login_id varchar(16) unique,
	login_pass varchar(16),
	user_name varchar(50),
	insert_date datetime,
	updated_date datetime
);

create table item_info_transaction(
	id int not null primary key auto_increment,
	item_name varchar(30),
	item_price int,
	item_stock int,
	insert_date datetime,
	update_date datetime
);

create table user_buy_item_transaction(
	id int not null primary key auto_increment,
	item_transaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	delete_date datetime
);

insert into item_info_transaction(item_name, item_price, item_stock) values("NoteBook", 100, 50),("Pencil", 50, 100);

insert into login_user_transaction(login_id, login_pass, user_name) values("internous", "internous01", "test");