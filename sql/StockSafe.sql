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

create table news(
    id int auto_increment,
    stock_id varchar(10),
    news_title varchar(50),
    news_date varchar(20),
    news_uri varchar(512),
    primary key(id),
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

insert into stock
values("000660","SK하이닉스","KOSPI","전기전자","반도체와반도체장비",92092300000000, 728002365, 48.87, 11.44, 1.48,85338,0.92,126000);

# 예상가 추가
insert into predict
values("005930",70000,8000,90000,100000);

insert into predict
values("051910",390000,380000,450000,100000);

insert into predict
values("000660",128000,120000,121000,100000);

# 내종목 추가
insert into memberstock(member_id, predict_id)
values("a","005930");

insert into memberstock(member_id, predict_id)
values("a","000660");

# 관심종목 추가
insert into likestock(member_id, predict_id)
values("a","051910");

# 뉴스 추가
insert into news
values(1, "005930","① 삼성과 치킨게임 아닌 윈윈 생태계 구축","2021.12.27","https://finance.naver.com/item/news_read.naver?article_id=0004001373&office_id=011&code=005930&sm=title_entity_id.basic");
insert into news
values(2, "005930","삼성전자, 부산 에코델타시티에 \'스마트홈\' 구축","2021.12.27","https://finance.naver.com/item/news_read.naver?article_id=0004762649&office_id=014&code=005930&sm=title_entity_id.basic");
insert into news
values(3, "051910","LG화학, 시총 3위서 8위로 추락…속타는 개미들 언제쯤 웃을까","2021.12.27","https://finance.naver.com/item/news_read.naver?article_id=0004899389&office_id=009&code=051910&sm=title_entity_id.basic");

# 댓글