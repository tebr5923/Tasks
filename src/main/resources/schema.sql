DROP TABLE IF EXISTS machines;
DROP SEQUENCE IF EXISTS machines_id_seq;
DROP TABLE IF EXISTS groups;
DROP SEQUENCE IF EXISTS groups_id_seq;

--CREATE SEQUENCE machines_id_seq START 1;

CREATE TABLE machines
(
    id         SERIAL PRIMARY KEY,
    name       varchar(255) NOT NULL,
    dimensions varchar(255) NOT NULL
);


CREATE SEQUENCE groups_id_seq START 1;

CREATE TABLE groups
(
    id   int DEFAULT NEXTVAL('groups_id_seq') NOT NULL PRIMARY KEY,
    name varchar(5)                           NOT NULL
);

