/*여러줄 주석*/
#한줄 주석
-- 한줄 주석
/*SQL질의어*/
/*
	1. 주의할 점
	-sql문장을 입력후 ;으로 마침
    -문자처리 '' 혹은 ""
    -명령어/키워드에서는 대소문자 구분을 안함, 데이터/자료는 당연히 구분함
    2. 실행
    -명령어 단위 실행, 전체 실행
    -명령어 단위 실행: 실행 명령어에 커서 두고 ctrl+엔터, 상단 번개모양의I있는
    -전체 명령어 실행: ctrl+shift+엔터 상단 번개모양I없는
    3. 실행 결과
    -하단 result창
    -하단 output창 
    -------------------------------------------
    DDL(data Definition Language) 데이터 정의어
		1. create
			create database '새로운DB명';			:데이터베이스 생성
            create table 새로운T명();				:테이블 생성
        2. drop
			drop database '삭제할DB명';			:데이터베이스 삭제
            -drop database if exists '삭제할DB명'
            drop table 삭제할T명;
            -drop table if exists '삭제할T명';
		- 그외
        show
			show databases						:DBSERVER 내 데이터베이스 목록 확인
			show variables like 'datadir'		:DBSERVER 내 데이터베이스 local 위치 확인
		use
			use 사용할데이터베이스명					:DBSERVER 내 조작/사용 할 데이터베이스 선택
    DML(data Manipulation Language) 데이터 조작어
    
    DCL(data Control Language) 데이터 제어어
*/
# 1.현재 DB SERVER 존재하는 데이터베이스 확인
show databases;

# 2.현재 DB SERVER 존재하는 로컬(C:드라이브) 위치 확인
show variables like 'datadir'; #C:\ProgramData\MySQL\MySQL Server 8.0\Data\

# 3.현재 DB SERVER내 데이터베이스 생성
create database myDB; #C:\ProgramData\MySQL\MySQL Server 8.0\Data\생성DB명

# 4.데이터베이스 삭제
drop database mydb;
# 4-2 만약에 해당 데이터베이스 존재하면 삭제
drop database if exists mydb;

# 5.DB SERVER 에는 여러개의 데이터베이스 존재
use mydb;

#
drop database if exists test2;
create database test2;
show databases;
show variables like 'datadir';
use test2;
