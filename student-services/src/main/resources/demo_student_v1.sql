create schema demo;

use demo;

create table users(user_id varchar(10), user_pass varchar(50));

alter table demo.users add primary key(user_id);

select * from demo.users;

insert into demo.users values('test','test');

insert into demo.users values('darsh','darsh');

commit;

delete from demo.users where user_id='test';
