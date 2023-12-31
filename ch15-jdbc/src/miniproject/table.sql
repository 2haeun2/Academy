CREATE TABLE m_member(
   me_num NUMBER PRIMARY KEY,
   me_id VARCHAR2(30) UNIQUE NOT NULL,
   me_passwd VARCHAR2(30) NOT NULL,
   me_name VARCHAR2(30) NOT NULL,
   me_age NUMBER NOT NULL,
   me_phone VARCHAR2(13)
);
CREATE SEQUENCE m_member_seq;

CREATE TABLE m_movie(
   mo_num NUMBER PRIMARY KEY,
   mo_title VARCHAR2(90) NOT NULL,
   mo_date DATE NOT NULL,
   mo_seats NUMBER DEFAULT(5) NOT NULL
);
CREATE SEQUENCE m_movie_seq;

CREATE TABLE m_reservation(
   re_num NUMBER PRIMARY KEY,
   me_num NUMBER NOT NULL REFERENCES m_member (me_num),
   mo_num NUMBER NOT NULL REFERENCES m_movie (mo_num),
   re_seats NUMBER NOT NULL
);
CREATE SEQUENCE m_reservation_seq;