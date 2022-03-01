drop database if exists stocksafe_db;
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
    stock_industry varchar(20),
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
values("AAPL", "애플", "NASDAQ", "Technology", "Consumer Electronics");

insert into stock
values("MSFT", "마이크로소프트", "NASDAQ", "Technology", "Software—Infrastructure");

insert into stock
values("AMZN", "아마존", "NASDAQ", "Consumer Cyclical", "Internet Retail");

insert into stock
values("GOOG", "구글", "NASDAQ", "Communication Services", "Internet Content & Information");

insert into stock
values("FB", "페이스북", "NASDAQ", "Communication Services", "Internet Content & Information");


insert into stock
values("AMZN", "아마존", "NASDAQ", "Consumer Cyclical", "Internet Retail");

insert into stock
values("TSLA", "테슬라", "NASDAQ", "Consumer Cyclical", "Auto Manufacturers");


insert into stock
values("NFLX", "넷플릭스", "NASDAQ", "Communication Services", "Entertainment");

insert into stock
values("AMZN", "아마존", "NASDAQ", "Consumer Cyclical", "Internet Retail");

insert into stock
values("BRK-A", "버크셔 해서웨이 A", "NASDAQ", "Financial Services", "Insurance—Diversified");

insert into stock
values("BRK-B", "버크셔 해서웨이 B", "NASDAQ", "Financial Services", "Insurance—Diversified");


insert into stock
values("NVDA", "엔비디아", "NASDAQ", "Technology", "Semiconductors");

insert into stock
values("BA", "보잉", "NASDAQ", "Industrials", "Aerospace & Defense");

insert into stock
values("COST", "코스트코", "NASDAQ", "Consumer Defensive", "Discount Stores");

insert into stock
values("CL", "콜게이트", "NASDAQ", "Consumer Defensive", "Household & Personal Products");

insert into stock
values("AMD", "AMD", "NASDAQ", "Technology", "Semiconductors");

insert into stock
values("INTC", "인텔", "NASDAQ", "Technology", "Semiconductors");


insert into stock
values("IBM", "IBM", "NASDAQ", "Technology", "Information Technology Services");

insert into stock
values("KHC", "크래프트 하인즈", "NASDAQ", "Consumer Defensive", "Packaged Foods");

insert into stock
values("WMT", "월마트", "NASDAQ", "Consumer Defensive", "Discount Stores");

insert into stock
values("COKE", "코카콜라", "NASDAQ", "Consumer Defensive", "Beverages—Non-Alcoholic");

insert into stock
values("PEP", "펩시", "NASDAQ", "Consumer Defensive", "Beverages—Non-Alcoholic");



# 예상가 추가
insert into predict
values("AAPL",70000,8000,90000,100000);

insert into predict
values("MSFT",390000,380000,450000,100000);

insert into predict
values("AMZN",128000,120000,121000,100000);


# 뉴스 추가
insert into news
values(1, "AAPL","① 삼성과 치킨게임 아닌 윈윈 생태계 구축","2021.12.27","https://finance.naver.com/item/news_read.naver?article_id=0004001373&office_id=011&code=005930&sm=title_entity_id.basic");
insert into news
values(2, "MSFT","삼성전자, 부산 에코델타시티에 \'스마트홈\' 구축","2021.12.27","https://finance.naver.com/item/news_read.naver?article_id=0004762649&office_id=014&code=005930&sm=title_entity_id.basic");
insert into news
values(3, "AMAZ","LG화학, 시총 3위서 8위로 추락…속타는 개미들 언제쯤 웃을까","2021.12.27","https://finance.naver.com/item/news_read.naver?article_id=0004899389&office_id=009&code=051910&sm=title_entity_id.basic");

# 댓글