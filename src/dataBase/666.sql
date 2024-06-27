drop database if exists day06;
create database day06;
use day06;

# 1. 회원테이블
drop table if exists member;
create table member(# 아이디, 비밀번호, 이름, 연락처, 가입일
mid varchar(30) not null unique,
mpwd varchar(30) not null,
mname varchar(20) not null,
mphone varchar(15) not null,
mdate datetime default now(),
mno int auto_increment,
primary key(mno)
);
insert into member(mid,mpwd,mname,mphone) values('dkeiqks','12345','기성용','010-1234-5678');
insert into member(mid,mpwd,mname,mphone) values('zfjdkei','12345','이청용','010-1356-5678');
insert into member(mid,mpwd,mname,mphone) values('cnqowej','12345','이승우','010-5643-5678');
insert into member(mid,mpwd,mname,mphone) values('zqwef','12345','이임생','010-3451-5678');
insert into member(mid,mpwd,mname,mphone) values('fdftwq','12345','이강인','010-6421-5678');
select*from member;

# 2. 게시물테이블
drop table if exists board;
create table board(# 글제목, 글내용, 글작성일, 글작성자, 글조회수
btitle varchar(100) not null,
bcontent longtext,
bdate datetime default now(),
bview smallint default 0,
mno int,
bno int auto_increment,
primary key(bno),
foreign key(mno) references member(mno)
);
insert into board(btitle,bcontent,mno) values('안녕하세요.1','반갑습니다.1',1);
insert into board(btitle,bcontent,mno) values('안녕하세요.2','반갑습니다.2',2);
insert into board(btitle,bcontent,mno) values('안녕하세요.3','반갑습니다.3',3);
insert into board(btitle,bcontent,mno) values('안녕하세요.4','반갑습니다.4',4);
insert into board(btitle,bcontent,mno) values('안녕하세요.5','반갑습니다.5',5);
select*from board;

# 3. 댓글테이블
drop table if exists reply;
create table reply(# 댓글내용, 댓글작성일, 댓글작성자
rcontent varchar(200) not null,
rdate datetime default now(),
mno int,
bno int,
rno int auto_increment,
primary key(rno),
foreign key(mno) references member(mno),
foreign key(bno) references board(bno)
);
insert into reply(rcontent,mno,bno) values('ㅎㅇ.1',1,1);
insert into reply(rcontent,mno,bno) values('ㅎㅇ.2',2,2);
insert into reply(rcontent,mno,bno) values('ㅎㅇ.3',3,3);
insert into reply(rcontent,mno,bno) values('ㅎㅇ.4',4,4);
insert into reply(rcontent,mno,bno) values('ㅎㅇ.5',5,5);
select*from reply;

# 검색
# 1. 전체 검색
select * from member;
# 2. 조건 검색
select * from member where mno=1; -- mno가 '1'인 회원 레코드 검색
select * from member where mid='dkeiqks'; -- mid가 'dkeiqks'인 회원 레코드 검색
select * from member where mphone='010-1234-5678'; -- mphone이 '010-1234-5678'인 회원 레코드 검색
# 아이디찾기(회원명과 연락처가 동일한 회원 검색)
# 비교연산자: >초과 <미만 >=이상 <=이하 =같다 !=같지않다
# 관계연산자: and or not, java: && || !
select * from member where mname = '기성용' and mphone = '010-1234-5678'; # java: a==1 && b==2
	# JDBC 매개변수 대입: select * from member where mname=? and mphone =?;
# 비밀번호찾기(아이디와 연락처가 동일한 회원 검색)
select * from member where mid = 'dkeiqks' and mphone = '010-1234-5678';
	# JDBC 매개변수 대입: select * from member where mid=? and mphone=?;
# 로그인/비교(아이디와 비밀번호가 동일한 회원 검색)
select * from member where mid='dkeiqks' and mpwd='12345';
	# JDBC 매개변수 대입: select * from member where mid=? and mpwd=?;