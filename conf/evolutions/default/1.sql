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
  destination_username varchar,
  destination_hostname varchar,
  destination_password varchar,
  PRIMARY KEY (destination_username),
  CONSTRAINT fk_PerOrders FOREIGN KEY (username)
  REFERENCES users(username)
);


# --- !Downs

DROP TABLE users;
DROP TABLE destinations;