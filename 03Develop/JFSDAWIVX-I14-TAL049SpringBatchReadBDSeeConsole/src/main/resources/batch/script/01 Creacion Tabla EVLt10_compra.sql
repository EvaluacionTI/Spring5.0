/*=====================================================================================
	Proyecto				:	Módulo de Compas
	Modulo					:	COM - COMPRAS - 
	Programa/Funcion		:	Comandos - SQL - 
	Analista				:	ALDV
	Fecha Inicio/Termino	:	04/12/2018
	Objetivo				:	Creación tabla de tipo de plan
	Descripcion				:
=====================================================================================*/
DROP TABLE IF EXISTS aemsa.EVLt10_compra;

CREATE TABLE aemsa.EVLt10_compra
(
	id					INTEGER				NOT NULL,
	precio				NUMERIC(10,2)		NOT NULL,
	cantidad			NUMERIC(10,2)		NOT NULL,
	txt_nom				VARCHAR(100)		NOT NULL,
	fecha				VARCHAR(20)			NOT NULL,

	CONSTRAINT PKEVLt10_id				PRIMARY KEY (id)
);
