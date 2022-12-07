show tables;
desc user;
desc blog;
desc category;
desc post;

-- USER----------------------------
alter table user add column role enum('user', 'admin') default 'user';

-- insert
select * from user;

delete from user where name='맹구';

insert into user values('zzanggu', '짱구', '1234');
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