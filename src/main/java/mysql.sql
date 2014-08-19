--创建数据库
create database demo character set utf8;

--使用数据库
use demo;

--创建用户表
create table user(id int primary key auto_increment,username varchar(128),password varchar(128)) ENGINE=InnoDB DEFAULT CHARSET=utf8;