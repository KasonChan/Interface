-- # --- !Downs

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS destinations;

-- # --- !Ups 

-- Table users for storing users' firstname, lastname, username and password
CREATE TABLE users (
  firstname varchar,
  lastname varchar,
  username varchar(30),
  password varchar,
  PRIMARY KEY (username)
);

-- Table destinations for storing users' destination username, host and password
CREATE TABLE destinations (
  FOREIGN KEY (username) REFERENCES User(username),
  destination_username varchar(30),
  destination_hostname varchar,
  destination_password varchar
);


