show tables;
desc user;
desc blog;
desc category;
desc post;

-- USER----------------------------
alter table user add column role enum('user', 'admin') default 'user';

-- insert
select * from user;

delete from user where name='';

insert into user values('zzanggu', '짱구', '1234', 'user');
insert into user values('menggu', '맹구', '1234', 'user');
insert into user values('chulsu', '철수', '1234', 'user');
insert into user values('admin', '관리자', '1234', 'admin');

-- insert into;

-- select
select id, name, role
  from user
 where id = 'menggu'
   and password = '1234';


-- BLOG----------------------------
select * from blog; 

insert into blog values('menggu', '맹구의블로그', 'profile');
insert into blog values('menggu', concat('맹구','의블로그'), 'profile');

delete from blog where id='menggu';


-- CATEGORY----------------------------
select * from category; 

insert into category values(null, '맹구 카테고리', 0, '맹구맹구', 'menggu');
insert into category
		values(null, 'first category', 'pororo');
       
select a.no, a.title, a.num_post as numPost, a.desc, b.id
  from category a, blog b
 where a.id = b.id
 order by a.no desc;


-- POST----------------------------
select * from post; 

insert into post values(null, '오늘의 메뉴', '찜닭찜닭', now(), '1');