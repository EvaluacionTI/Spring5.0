/*
	ORACLE 12G con Spring en Arquitectura
*/

DROP SEQUENCE SQ_APXt01_PERSON;

CREATE SEQUENCE SQ_APXt01_PERSON 
	START WITH 1 
	INCREMENT BY 1 
	MINVALUE 1
	MAXVALUE 100
	CACHE 10;

--	
ALTER SEQUENCE SQ_APXt01_PERSON 
	LASTNUMBER 8
	MAXVALUE 999;

-- Secuencial actual 
SELECT SQ_APXt01_PERSON.CURRVAL FROM dual;

-- Incrementa el valor y que asinado
SELECT SQ_APXt01_PERSON.NEXTVAL FROM dual;

-- Retornar el valor del secuencial
-- Está en 6 en la tabla la secuencia
-- Nextval está en 9
-- Se debe colocar en 6 para ello restar -3 y luego nextval para actuaizar el nuevo incremento

ALTER SEQUENCE SQ_APXt01_PERSON 
	INCREMENT BY -3
SELECT SQ_APXt01_PERSON.NEXTVAL FROM dual;
ALTER SEQUENCE SQ_APXt01_PERSON 
	INCREMENT BY 1
-- Revisar el valor sino incrementar hasta confirmar el correcto.

