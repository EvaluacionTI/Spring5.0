# SPRING 5.0 : TEST UNITS WITH LOGBACK #

## A. Solución utilizando el archivo XML logback-test ##

1. Crear una carpeta denominada resources en src/test

2. En el archivo de propiedades logback-spring.xml o tambien sólo logbak. Si se asigna un nombre diferente al que inicia con logback no se generará nada.

2. Observar que se creará la carpeta : bbva_spring_logtest

3. Este contendrá los archivos bbva_spring_info.log y bbva_spring_error.log

4. Observar la ejecicón en consola y observar los archivos log generados

5. El paquete necesario es logback-classic-1.2.3.jar y logback-core-1.2.3.jar

6. La clase de interés es ch.qos.logback.classic.encoder y ch.qos.logback.core.rolling

7. Generar un jar y copiar con otra versión 1.2.0

8. Copiar el archivo jar a temporal

9. Ejecutar el jar y revise los resultados


