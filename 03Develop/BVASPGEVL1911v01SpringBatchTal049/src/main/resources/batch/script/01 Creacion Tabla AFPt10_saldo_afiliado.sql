/*=====================================================================================
	Proyecto				:	Modulo AFP
	Modulo					:	AFP - AFP 25% - 
	Programa/Funcion		:	Comandos - SQL - 
	Analista				:	ALDV
	Fecha Inicio/Termino	:	04/10/2020
	Objetivo				:	Creación tabla de tipo de plan
	Descripcion				:
=====================================================================================*/
DROP TABLE IF EXISTS aemsa.AFPt10_saldo_afiliado;

CREATE TABLE aemsa.AFPt10_saldo_afiliado
(
	id					INTEGER			NOT NULL,
	cod_afiliado		VARCHAR(100)	NOT NULL,
	saldo_afiliado		NUMERIC(15,2)	NOT NULL,

	CONSTRAINT PKAFPt10_id	PRIMARY KEY (id)
);
