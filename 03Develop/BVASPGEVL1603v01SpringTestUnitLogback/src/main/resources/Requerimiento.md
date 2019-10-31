# SPRING 5.0 : TEST UNITS WITH LOGBACK #

## A. Requerimiento ##

1. Implementar una aplicación de arranque de Spring para demostrar las funciones fundamentales del Logback:

* Cómo registrar los mensajes
* Cómo filtrar los mensajes de registro
* Dónde colocar los mensajes de registro
* Cómo formatear los mensajes de registro

2. Considerar que las pruebas unitarias utilizando la librería Logback de cuatro maneras:

* Spring boot sin utilizar archivo de propiedades
* Spring boot application.properties
* Spring boot logback-spring.xml o logback.xml
* logback-test.xml


## B. Análisis de Requerimiento ##

### 1. Arquitectura ###

La arquitectura de Logback incluye tres clases:

Logger.- la clase con la que la aplicación interactúa para crear mensajes de registro
Appender.- el destino que contiene mensajes de registro
Layout.- la interfaz que prepara y formatea los mensajes para la salida

La mayoría de las aplicaciones Java registran los mensajes a través de objetos **Logger** y configuran **Appenders** con el 
patrón de diseño deseado en un archivo de configuración.


### 2. Tecnologías utilizadas ###

El código de ejemplo puede ser construido y ejecutado usando:

Java 1.8.0_172
Apache Maven 3.5.3
Spring boot 2.1.0.BUILD-SNAPSHOT
Logback 1.2.3
Spring Tool Suite 3.9.2.RELEASE

