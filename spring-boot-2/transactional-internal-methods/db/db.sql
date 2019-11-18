-- create db and user
create database if not exists practice;
create user 'practice_admin'@'localhost' identified by 'practice_admin'; 
grant all on practice.* to 'practice_admin'@'localhost';