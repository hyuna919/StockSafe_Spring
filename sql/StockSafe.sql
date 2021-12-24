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
    stock_yesterday int,
    primary key(id)
);

create table predict(
	id varchar(10),
    predict_day int,
    predict_month int,
    predict_year int,
    predict_graph mediumblob,
    primary key(id)
);

create table memberStock(
    id int auto_increment,
	member_id varchar(20),
    predict_id varchar(10),
    primary key(id),
	foreign key(member_id) references member(id),
    foreign key(predict_id) references predict(id)
);

create table likeStock(
    id int auto_increment,
	member_id varchar(20),
    predict_id varchar(10),
    primary key(id),
    foreign key(member_id) references member(id),
    foreign key(predict_id) references predict(id)
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

# 멤버 추가  
insert into member
values("ssafy","ssafy","ssafy",now(),"ssafy","ssafy");

insert into member
values("a","a","a",now(),"a","a");

# 주식 추가
insert into stock
values("005930","삼성전자","KOSPI","전기전자","반도체와반도체장비",476388600000000, 5969782550, 51.89, 13.65,1.88,42227,3.75,77000);

insert into stock
values("051910","LG화학","KOSPI","화학","화학",44614400000000, 70592343, 46.67, 16.49, 2.31,273781,1.58,400000);

# 예상가 추가
insert into predict
values("005930","70000","80000","90000","100000");

insert into predict
values("051910","70000","80000","90000","100000");

# 내종목 추가
insert into memberstock(member_id, predict_id)
values("a","005930");

# 관심종목 추가
insert into likestock(member_id, predict_id)
values("a","051910");