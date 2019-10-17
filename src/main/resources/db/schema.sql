create table if not exists tb_user
(
    id int not null primary key ,
    username varchar(14),
    name varchar(14),
    age varchar(3),
    balance int
);