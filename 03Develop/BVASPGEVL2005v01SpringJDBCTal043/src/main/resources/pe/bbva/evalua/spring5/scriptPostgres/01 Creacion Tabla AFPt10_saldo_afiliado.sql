/*=====================================================================================
	Proyecto				:	Módulo de Fondo de Pensiones
	Modulo					:	AFP - SALDO AFILIADOS 
	Programa/Funcion		:	Comandos - SQL - 
	Analista				:	ALDV
	Fecha Inicio/Termino	:	23/07/2020
	Objetivo				:	Creación tabla saldo_afiliado
	Descripcion				:
=====================================================================================*/
DROP TABLE IF EXISTS aemsa.AFPt10_saldo_afiliado;

CREATE TABLE aemsa.AFPt10_saldo_afiliado
(
	id					INTEGER			NOT NULL,
	cod_afiliado		VARCHAR(10)		NOT NULL,
	saldo_afiliado		NUMERIC(18,2)	NOT NULL,

	CONSTRAINT PKAFPt10_id				PRIMARY KEY (id),
	CONSTRAINT UQAFPt10_cod_afiliado	UNIQUE (cod_afiliado)
);
