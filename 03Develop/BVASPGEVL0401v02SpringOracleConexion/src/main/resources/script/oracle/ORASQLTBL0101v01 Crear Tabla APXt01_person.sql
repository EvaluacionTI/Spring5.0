/*
	ORACLE 12G con Spring en Arquitectura
*/
DROP TABLE  APXt01_person;

CREATE TABLE APXt01_person
(
	id   			NUMBER(19),
	first_name 		VARCHAR(50),
	last_name 		VARCHAR(50),
	address 		VARCHAR(100),
	
	CONSTRAINT PKAPXt01_id PRIMARY KEY(id)
);

