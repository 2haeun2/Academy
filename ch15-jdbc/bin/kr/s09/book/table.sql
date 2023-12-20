CREATE TABLE member(
 me_num number primary key,
 me_id varchar2(10) unique not null,
 me_passwd varchar2(10) not null,
 me_name varchar2(30) not null,
 me_phone varchar2(13) not null,
 me_regdate date default SYSDATE not null
 );

 CREATE SEQUENCE member_seq;
 
 CREATE TABLE book(
  bk_num number primary key,
  bk_name varchar2(90) not null,
  bk_category varchar2(30) not null,
  bk_regdate date default SYSDATE not null
 );
 
 CREATE SEQUENCE book_seq;
 
 CREATE TABLE reservation(
  re_num number primary key,
  re_status number(1) not null,/*0.반납(미대출),1.대출중*/
  bk_num number not null references book (bk_num),/*도서 번호*/
  me_num number not null references member (me_num),/*회원 번호*/
  re_redate date default SYSDATE not null,/*대출일*/
  re_modifydate date/*반납일*/
  );
  
  CREATE SEQUENCE reservation_seq;