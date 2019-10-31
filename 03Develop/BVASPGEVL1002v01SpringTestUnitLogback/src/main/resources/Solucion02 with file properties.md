# SPRING 5.0 : TEST UNITS WITH LOGBACK #

## A. Solución utilizando el archivo properties ##

1. En el archivo de propiedades application.properties
	Los mensajes de registro de la consola se muestran como zona horaria CST y los mensajes de registro de archivos se muestran como zona horaria UTC.
	El archivo de mensajes se denominará : bbva_spring_apx.log
	
~~~~~
	logging.level.=TRACE
	logging.level.org.springframework=OFF
	logging.level.pe.bbva.architecture.paas=DEBUG
	logging.file=bbva_spring_apx.log
	logging.pattern.console= %date{"yyyy-MM-dd'T'HH:mm:ss,SSSXXX", CST} CST - %msg%n
	logging.pattern.file= %date{"yyyy-MM-dd'T'HH:mm:ss,SSSXXX", UTC} UTC [%thread] %-5level %logger{36} - %msg%n
~~~~~

2. Verificar el archivo log generado en la carpeta del proyecto

3. Observar el log de la consola

