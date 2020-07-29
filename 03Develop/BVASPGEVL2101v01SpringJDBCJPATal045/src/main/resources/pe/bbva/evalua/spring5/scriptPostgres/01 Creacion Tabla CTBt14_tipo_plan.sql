/*=====================================================================================
	Proyecto				:	Módulo de Contabilidad
	Modulo					:	CTB - CONTABILIDAD - 
	Programa/Funcion		:	Comandos - SQL - 
	Analista				:	ALDV
	Fecha Inicio/Termino	:	04/12/2018
	Objetivo				:	Creación tabla de tipo de plan
	Descripcion				:
=====================================================================================*/
DROP TABLE IF EXISTS aemsa.CTBt14_tipo_plan;

CREATE TABLE aemsa.CTBt14_tipo_plan
(
	cod_tipo_plan		VARCHAR(01)		NOT NULL,
	cod_emp				VARCHAR(02)		NOT NULL,
	cod_iso_idio_orgn	VARCHAR(02)		NOT NULL,
	txt_abrv			VARCHAR(10)		NOT NULL,
	txt_desc			VARCHAR(50)		NOT NULL,
	sn_ver				BOOLEAN,
	sn_upd				BOOLEAN,
	sn_anu				BOOLEAN,
	sn_del				BOOLEAN,
	sn_dflt				BOOLEAN,
	sn_act				BOOLEAN,
	txt_user			VARCHAR(20),
	fec_user			TIMESTAMP,
	txt_last_user		VARCHAR(20),
	fec_last_user		TIMESTAMP,

	CONSTRAINT PKCTBt14_cod_tipo_plan	PRIMARY KEY (cod_tipo_plan),
	CONSTRAINT UQCTBt14_cod_tipo_plan	UNIQUE (cod_emp, cod_iso_idio_orgn),
	CONSTRAINT FKCTBt14_txt_abrv		UNIQUE (cod_emp, cod_iso_idio_orgn, txt_abrv),
	CONSTRAINT FKCTBt14_txt_desc		UNIQUE (cod_emp, cod_iso_idio_orgn, txt_desc)
);
