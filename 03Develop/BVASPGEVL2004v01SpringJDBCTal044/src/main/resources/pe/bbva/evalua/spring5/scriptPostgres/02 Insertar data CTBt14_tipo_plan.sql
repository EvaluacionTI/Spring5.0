/*=====================================================================================
	Proyecto				:	Módulo de Contabilidad
	Modulo					:	CTB - CONTABILIDAD - 
	Programa/Funcion		:	Comandos - SQL - 
	Analista				:	ALDV
	Fecha Inicio/Termino	:	04/12/2018
	Objetivo				:	Creación tabla de tipo de plan
	Descripcion				:
=====================================================================================*/
SELECT * FROM aemsa.CTBt14_tipo_plan;

INSERT INTO aemsa.CTBt14_tipo_plan VALUES ('S', '05', 'ES', 'PCSBS', 'PLAN CONTABLE SBS', TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, 'EDIAZ', '05/01/2002', NULL, NULL);
INSERT INTO aemsa.CTBt14_tipo_plan VALUES ('G', '02', 'ES', 'PCGB', 'PLAN CONTABLE GUBERNAMENTAL', TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, 'IDIAZ', '22/08/2014', NULL, NULL);
INSERT INTO aemsa.CTBt14_tipo_plan VALUES ('C', '01', 'ES', 'PCGE', 'PLAN CONTABLE GENERAL EMPRESARIAL', TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, 'ADIAZ', '30/07/2017', NULL, NULL);

SELECT * FROM aemsa.CTBt14_tipo_plan;