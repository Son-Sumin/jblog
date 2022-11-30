show tables;
desc user;
desc blog;
desc category;
desc post;

-- USER----------------------------
-- insert
select * from user;

delete from user where name='';

insert into user values('zzanggu', '짱구', '1234');
insert into user values('menggu', '맹구', '1234');
insert into user values('chulsu', '철수', '1234');