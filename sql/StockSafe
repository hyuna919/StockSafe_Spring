create database stocksafe_db;

use stocksafe_db;

create table userinfo(
    id varchar(20),
    userinfo_pw varchar(30) not null,
    userinfo_name varchar(20) not null,
    userinfo_regdate datetime default now(),
    primary key(id)
);

create table stock(
    id varchar(10),
    stock_name varchar(40) not null,
    stock_market varchar(10) not null,
    primary key(id)
);

create table theme(
    id int auto_increment,
    theme_name varchar(30),
    primary key(id)
);

create table stockTheme(
    id int primary key auto_increment,
    stock_id varchar(10),
    theme_id int,
    foreign key(stock_id) references stock(id),
    foreign key(theme_id) references theme(id)
);

create table userinfoStock(
    userinfo_id varchar(20),
    stock_id varchar(10),
    foreign key(userinfo_id) references userinfo(id),
    foreign key(stock_id) references stock(id)
);

create table likeStock(
    userinfo_id varchar(20),
    stock_id varchar(10),
    foreign key(userinfo_id) references userinfo(id),
    foreign key(stock_id) references stock(id)
);

create table stockdetail(
    stock_id varchar(10),
    stockdetail_marketcap long,
    stockdetail_count long,
    stockdetail_foreigner float,
    stockdetail_per float,
    stockdetail_pbr  float,
    stockdetail_bps float,
    stockdetail_divyield float,
    primary key(stock_id),
    foreign key(stock_id) references stock(id)
);

create table reply(
    id int auto_increment,
    stock_id varchar(10),
    reply_content varchar(200) not null,
    userinfo_id varchar(20) not null,
    reply_regdate datetime default now(),
    reply_level int not null,
    reply_parent int not null,
    primary key(id),
    foreign key(stock_id) references stock(id)
);
