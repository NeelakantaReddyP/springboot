DROP table if exists user_test;

create table user_test
(
  id  SERIAL,
 username VARCHAR(45) NULL,
 password VARCHAR(45) NULL,
  PRIMARY KEY (id)
);