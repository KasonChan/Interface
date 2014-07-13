# --- !Ups 

-- Table users for storing users' firstname, lastname, username and password
CREATE TABLE users (
  firstname varchar(35),
  lastname varchar(35),
  username varchar(35),
  password varchar(35),
  PRIMARY KEY (username)
);

-- Table destinations for storing users' destination username, host and password
CREATE TABLE destinations (
  username varchar(35),
  destinationUsername varchar(35),
  destinationHostname varchar(50),
  destinationPassword varchar(35),
  PRIMARY KEY (destinationUsername, destinationHostname),
  CONSTRAINT fk_username FOREIGN KEY (username)
  REFERENCES users(username)
);

# --- !Downs

DROP TABLE if exists users;
DROP TABLE if exists destinations;
