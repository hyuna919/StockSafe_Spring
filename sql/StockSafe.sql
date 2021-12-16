use stocksafe_db;

create table userinfo(
    id varchar(20),
    userinfo_pw varchar(30) not null,
    userinfo_name varchar(20) not null,
    userinfo_regdate datetime default now(),
    userinfo_email_id varchar(30) not null,
    userinfo_email_domain varchar(30) not null,
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

create table userinfoStock(
    id int auto_increment,
	userinfo_id varchar(20),
    stock_id varchar(10),
    primary key(id),
	foreign key(userinfo_id) references userinfo(id),
    foreign key(stock_id) references stock(id)
);

create table likeStock(
    id int auto_increment,
	userinfo_id varchar(20),
    stock_id varchar(10),
    primary key(id),
    foreign key(userinfo_id) references userinfo(id),
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