# --- !Ups 

-- Table users for storing users' firstname, lastname, username and password
CREATE TABLE users (
  firstname varchar,
  lastname varchar,
  username varchar,
  password varchar
);

-- Table destinations for storing users' destination username, host and password
CREATE TABLE destinations (
  username varchar,
  destination_username varchar,
  destination_hostname varchar,
  destination_password varchar
);

# --- !Downs

-- DROP TABLE IF EXISTS users;
-- DROP TABLE IF EXISTS destinations;

