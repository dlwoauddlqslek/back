/*
	제약조건
		1.not null		: 해당 필드에 null 값을 포함하지 않는다.
        2.default		: 해당 필드의 기본값 설정
        3.unique		:
        4.auto_increment
*/

#데이터베이스 생성
drop database if exists day03;
create database day03;

#테이블 생성
use day03;
drop table if exists member;
create table member(
	회원번호 int, 아이디 varchar(30), 비밀번호 varchar(30),
    연락처 char(13), 광고전송여부 boolean, 가입일 datetime
);
show tables;			# 현재 DB내 모든 테이블 확인
select * from member; 	# 테이블 검색

#제약조건
#1. not null: 해당 필드에 null 값을 포함하지 않는다.
	-- 레코드[insert] 등록시 해당 필드에 대입 값이 없을 때 기본적으로 null 대입
drop  table t1;
create table t1(tno int not null, tname varchar(10));
	# 레코드/행/튜플 추가
		# values(값1, 값2) 만약에 앞에 필드명을 생략시 필드명순서대로 값 대입
insert into t1 values(1,'유재석');
		# values(값1, 값2) 만약에 앞에 필드명을 작성시 명시된순서대로 값 대입
insert into t1 (tno,tname) values(2,'강호동');
insert into t1 (tname, tno) values( '하하', 3);

insert into t1 (tname) values('서장훈'); #오류O 값을 대입하지 않는 필드가 not null이기 때문에
insert into t1 (tno) values( 4);	    #오류X 값을 대입하지 않는 필드가 not null이 아니기 때문에
#확인
select * from t1;

#2.default: 해당 필드의 기본값 설정
	-- 만약에 레코드 삽입 시 해당 필드에 값을 대입하지 않으면 기본값으로 설정할 값
drop table t2;
create table t2(tno int not null, 
tname varchar(10), 
tdate datetime default now(),
tstate int default 10
);
	#레코드 추가
insert into t2(tno, tname) values(1, '유재석');
insert into t2 values(2, '강호동', '2024-06-21 11:00:30',3);

#확인
select * from t2;

#3.unique: 해당 필드 내 중복된 값을 허용하지 않는다.[중복제거]
	-- 만약에 레코드 삽입시 해당 필드에 값을 대입할 때 기존 레코드내 동일값이 있으면 오류발생/중복제거
drop table t3;
create table t3(tno int not null unique, tname varchar(10), tpoint int default 100);

insert into t3(tno) values(1);
insert into t3(tno, tname) values(1, '유재석'); #?? tno에 동일한 값이 존재해서 오류

select * from t3;

#4.auto_increment: 레코드 삽입시 해당 필드내 자동번호 부여
drop table t4;
create table t4(tno int not null unique auto_increment
, tname varchar(10) default '아무개');
insert into t4(tname) values('유재석'); #실행하면 자동으로 tno가 1씩 증가하면서 대입.
delete from t4 where tno=3; #tno가 '3'인 레코드 삭제
	#레코드 삭제 후 레코드 생성: 삭제된 자동번호는 더이상 생성되지 않고 마지막번호에 이어서 1씩 증가
select * from t4;

#5. primary key: 기본(primary)키, 레코드 내 식별 가능한 고유값 가진 키, 참조 당하는 키
	-- unique 포함, not null 포함
    -- primary key(선정할필드명)
drop table t5;
create table t5(
	tno int,
    tname varchar(30),
    primary key(tno)
);
select * from t5;

#6. foreign key: 외래(foreign)키, 다른 테이블 내 기본키를 참조하는 키, 참조 하는 키
create table t6(
	title text, tno int, 
    foreign key(tno) references t5(tno)
);
select * from t6;
#워크벤치 상단 메뉴 ctrl+R

#예시

#1. 회원
drop table m;
create table m(mno_pk int, mname varchar(10), mphone char(13),
	primary key(mno_pk) -- 해당 필드를 pk로 설정
);

#2. 게시물
drop table b;
create table b(bno_pk int, btitle varchar(100), bcontent longtext, bdate datetime default now(),
	primary key(bno_pk), -- 해당 필드를 pk로 설정
	mno_fk int, foreign key(mno_fk) references m(mno_pk) -- 해당 필드를 fk로 설정
);

#3. 게시물 댓글
drop table r;
create table r(
	rno_pk int, rcontent text, rpw varchar(20),
    primary key(rno_pk), -- 해당 필드를 pk로 설정
    bno_fk int, foreign key(bno_fk) references b(bno_pk), -- 해당 필드를 fk로 설정
    mno_fk int, foreign key(mno_fk) references m(mno_pk)
);

#관계 확인: reverse engine ctrl+R
drop table if exists 카테고리;
create table 카테고리(
	카테고리코드 int,
    primary key(카테고리코드),
    카테고리명 varchar(20)
);

drop table if exists 제품;
create table 제품(
	제품코드 int,
    primary key(제품코드),
    제품명 varchar(20),
    가격 int,
    카테고리코드 int, foreign key(카테고리코드) references 카테고리(카테고리코드)
);

drop table if exists 주문;
create table 주문(
	주문코드 int,
    primary key(주문코드),
    주문날짜 datetime
);

drop table if exists 주문상세;
create table 주문상세(
	주문상세코드 int,
    primary key(주문상세코드),
    제품코드 int, foreign key(제품코드) references 제품(제품코드),
    수량 int,
    주문코드 int, foreign key(주문코드) references 주문(주문코드)
);


