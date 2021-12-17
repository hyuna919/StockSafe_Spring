drop database stocksafe_db;
create database stocksafe_db;

use stocksafe_db;

create table member(
    id varchar(20),
    member_pw varchar(30) not null,
    member_name varchar(20) not null,
    member_regdate datetime default now(),
    member_email_id varchar(30) not null,
    member_email_domain varchar(30) not null,
    primary key(id)
);

create table stock(
	id varchar(10),
    stock_name varchar(40) not null,
    stock_market varchar(10) not null,
    stock_sector varchar(20),
    stock_wics varchar(20),
    stock_marketcap long,
    stock_count long,
    stock_foreigner float,
    stock_per float,
    stock_pbr  float,
    stock_bps float,
    stock_divyield float,
    primary key(id)
);

create table memberStock(
    id int auto_increment,
	member_id varchar(20),
    stock_id varchar(10),
    primary key(id),
	foreign key(member_id) references member(id),
    foreign key(stock_id) references stock(id)
);

create table likeStock(
    id int auto_increment,
	member_id varchar(20),
    stock_id varchar(10),
    primary key(id),
    foreign key(member_id) references member(id),
    foreign key(stock_id) references stock(id)
);

create table reply(
    id int auto_increment,
    stock_id varchar(10),
    reply_content varchar(200) not null,
    member_id varchar(20) not null,
    reply_regdate datetime default now(),
    reply_level int not null,
    reply_parent int not null,
    primary key(id),
    foreign key(member_id) references member(id),
    foreign key(stock_id) references stock(id)
);