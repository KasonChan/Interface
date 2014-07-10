# --- !Ups 

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
  username varchar(30),
  destinationUsername varchar,
  destinationHostname varchar,
  destinationPassword varchar,
  PRIMARY KEY (destinationUsername),
  CONSTRAINT fk_PerOrders FOREIGN KEY (username)
  REFERENCES users(username)
);

# --- !Downs

-- DROP TABLE if exists users;
-- DROP TABLE if exists destinations;