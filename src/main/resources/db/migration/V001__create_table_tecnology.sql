CREATE TABLE TECNOLOGY (
	ID INTEGER NOT NULL PRIMARY KEY,
	DESCRIPTION VARCHAR(50) NOT NULL
);

CREATE SEQUENCE TECNOLOGY_ID
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

ALTER TABLE TECNOLOGY ALTER COLUMN ID SET DEFAULT NEXTVAL('TECNOLOGY_ID' :: regclass);