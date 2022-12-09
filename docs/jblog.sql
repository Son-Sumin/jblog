show tables;
desc user;
desc blog;
desc category;
desc post;

-- USER----------------------------
alter table user add column role enum('user', 'admin') default 'user';

-- insert
select * from user;

delete from user where name='짱구';

insert into user values('zzanggu', '짱구', '1234', 'user');
insert into user values('menggu', '맹구', '1234', 'user');
insert into user values('chulsu', '철수', '1234', 'user');
insert into user values('admin', '관리자', '1234', 'admin');

-- select
select id, name, role
  from user
 where id = 'menggu'
   and password = '1234';


-- BLOG----------------------------
select * from blog; 

insert into blog values('menggu', '맹구의블로그', 'profile');


-- CATEGORY----------------------------
select * from category; 

insert into category values(null, '맹구 카테고리', 'menggu');


-- POST----------------------------
select * from post; 

insert into post values(null, '오늘의 메뉴', '찜닭찜닭', now(), '1');