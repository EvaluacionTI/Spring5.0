# SPRING 5.0 : TEST UNITS WITH LOGBACK #

## A. Solución no utilizando el archivo properties ##

1. Hay muchas maneras de crear una aplicación de inicio Spring. La forma sencilla es utilizando la herramienta de inicio 
Spring con los pasos a continuación:

* En el IDE Spring Tool Suite: File/New/Spring Starter Project
* En la ventana New Spring Starter Project, registrar los datos siguientes:

	| Etiqueta	  | Dato de entrada										|
	|-------------|-----------------------------------------------------|
	| Service URL | http:/start.spring.io								|
	| Name 		  | BVASPGEVL0602v01AplicacionPruebasUnitariasLogback	|
	| Group		  | pe.bbva.architecture.paas							|
	| Artifact	  | BVASPGEVL0602v01AplicationTestUnitsLogback			|
	| Version	  | 1.0.0-SNAPSHOT										|
	| Description | Test Units with Logback								|
	| Package	  | pe.bbva.architecture.paas.view						|
	
* Se generará un proyecto maven y se descargará a su estación de trabajo. 
* Se generará la sección de paquete para java y la sección de paquete de test
* Se generará el paquete vista: pe.bbva.architecture.paas.view en ambas secciones
* Se generará la clase CV0602v01AplicacionPruebasUnitariasLogback en el paquete view para Java
* Se generará la clase CV0602v01AplicacionPruebasUnitariasLogbackTests en el paquete view para Test

2. Consideraciones previas
	Observa el archivo POM.xml

~~~~~
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>pe.bbva.architecture.paas</groupId>
	<artifactId>BVASPGEVL0602v01AplicationTestUnitsLogback</artifactId>
	<version>1.0.0-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>BVASPGEVL0602v01AplicacionPruebasUnitariasLogback</name>
	<description>Test Units with Logback</description>

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.0.BUILD-SNAPSHOT</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

</project>

~~~~~

3. Consideraciones posteriores
	No se necesitan modificaciones para los archivos o clases generados en el ejemplo.

4. Sección Código Java de la aplicación en la capa vista o view
	
~~~
package pe.bbva.architecture.paas.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CV0602v01AplicacionPruebasUnitariasLogback {

	public static void main(String[] args) {
		SpringApplication.run(CV0602v01AplicacionPruebasUnitariasLogback.class, args);
		
		CCComponent1 oObjeto = new CCComponent1();
		oObjeto.configuration();
		oObjeto.killed();
		
		CCComponent2 oObjeto2 = new CCComponent2();
		oObjeto2.configuration();
		oObjeto2.killed();
	}
}

~~~

5. Iniciar la aplicación con Sprint boot (Sección Código Java)
* Ubicarse en el paquete : pe.bbva.architecture.paas.view
* Para ejecutar los siguientes pasos:
		Click derecho sobre la clase: CV0602v01AplicacionPruebasUnitariasLogback
		Seleccionar en item Run As
		Seleccionar el item Spring Boot App

	
6. Resultado de la ejecución de la aplicación o Spring Boot App (Consola)
~~~~~

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::  (v2.1.0.BUILD-SNAPSHOT)

2018-08-01 11:05:13.757  INFO 3272 --- [           main] 0602v01AplicacionPruebasUnitariasLogback : Starting CV0602v01AplicacionPruebasUnitariasLogback on DESKTOP-NOCUEDT with PID 3272 (F:\BBVA01Development\Spring5.0\BVASPGEVL0602v01AplicacionPruebasUnitariasLogback\target\classes started by user in F:\BBVA01Development\Spring5.0\BVASPGEVL0602v01AplicacionPruebasUnitariasLogback)
2018-08-01 11:05:13.760  INFO 3272 --- [           main] 0602v01AplicacionPruebasUnitariasLogback : No active profile set, falling back to default profiles: default
2018-08-01 11:05:15.244  INFO 3272 --- [           main] 0602v01AplicacionPruebasUnitariasLogback : Started CV0602v01AplicacionPruebasUnitariasLogback in 2.244 seconds (JVM running for 4.952)
2018-08-01 11:05:15.247  INFO 3272 --- [           main] p.b.a.paas.component.CCComponent1        : log a info message =====> [Iniciando CCComponent1Test.configuration() 
2018-08-01 11:05:15.247  WARN 3272 --- [           main] p.b.a.paas.component.CCComponent1        : log a warn message =====> [Iniciando CCComponent1Test.configuration() 
2018-08-01 11:05:15.247 ERROR 3272 --- [           main] p.b.a.paas.component.CCComponent1        : log an error message =====> [Iniciando CCComponent1Test.configuration() 
2018-08-01 11:05:15.247  INFO 3272 --- [           main] p.b.a.paas.component.CCComponent1        : log a info message ====> [Eliminando CCComponent1Test.killed() 
2018-08-01 11:05:15.248  WARN 3272 --- [           main] p.b.a.paas.component.CCComponent1        : log a warn message ====> [Eliminando CCComponent1Test.killed() 
2018-08-01 11:05:15.248 ERROR 3272 --- [           main] p.b.a.paas.component.CCComponent1        : log an error message ====> [Eliminando CCComponent1Test.killed() 
2018-08-01 11:05:15.248  INFO 3272 --- [           main] p.b.a.paas.component.CCComponent2        : log a info message =====> [Iniciando CTComponent2Test.configuration() 
2018-08-01 11:05:15.248  WARN 3272 --- [           main] p.b.a.paas.component.CCComponent2        : log a warn message =====> [Iniciando CTComponent2Test.configuration() 
2018-08-01 11:05:15.248 ERROR 3272 --- [           main] p.b.a.paas.component.CCComponent2        : log an error message =====> [Iniciando CTComponent2Test.configuration() 
2018-08-01 11:05:15.248  INFO 3272 --- [           main] p.b.a.paas.component.CCComponent2        : log a info message ====> [Eliminando CTComponent2Test.killed() 
2018-08-01 11:05:15.249  WARN 3272 --- [           main] p.b.a.paas.component.CCComponent2        : log a warn message ====> [Eliminando CTComponent2Test.killed() 
2018-08-01 11:05:15.249 ERROR 3272 --- [           main] p.b.a.paas.component.CCComponent2        : log an error message ====> [Eliminando CTComponent2Test.killed() 

~~~~

7. Código Test de la aplicación en la capa vista o view
~~~~~
package pe.bbva.architecture.paas.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Bvaspgevl0602v01AplicacionPruebasUnitariasLogbackApplicationTests {

	@Test
	public void contextLoads() {
	}
}

~~~~~

8. Inicar la aplicación con Sprint boot para Test(Sección Código Test)

* Para ejecutar los siguientes pasos:
		Click derecho sobre la clase: Bvaspgevl0602v01AplicacionPruebasUnitariasLogbackApplicationTests
		Seleccionar en item Run As
		Seleccionar el item JUnit Test

		
9. Resultado de la ejecución de la aplicación o Spring Boot App (Sección Consola Test)

~~~~~
11:49:58.285 [main] DEBUG org.springframework.test.context.junit4.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.294 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
11:49:58.307 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
11:49:58.347 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
11:49:58.363 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests], using SpringBootContextLoader
11:49:58.368 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]: class path resource [pe/bbva/architecture/paas/view/CV0602v01AplicacionPruebasUnitariasLogbackTests-context.xml] does not exist
11:49:58.369 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]: class path resource [pe/bbva/architecture/paas/view/CV0602v01AplicacionPruebasUnitariasLogbackTestsContext.groovy] does not exist
11:49:58.369 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]: no resource found for suffixes {-context.xml, Context.groovy}.
11:49:58.370 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]: CV0602v01AplicacionPruebasUnitariasLogbackTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
11:49:58.438 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.551 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [F:\BBVA01Development\Spring5.0\BVASPGEVL0602v01AplicacionPruebasUnitariasLogback\target\classes\pe\bbva\architecture\paas\view\CV0602v01AplicacionPruebasUnitariasLogback.class]
11:49:58.554 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogback for test class pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests
11:49:58.705 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]: using defaults.
11:49:58.706 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener]
11:49:58.717 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.web.ServletTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [javax/servlet/ServletContext]
11:49:58.719 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.transaction.TransactionalTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttributeSource]
11:49:58.720 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttribute]
11:49:58.721 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@654f0d9c, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@6a400542, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@6580cfdd, org.springframework.test.context.support.DirtiesContextTestExecutionListener@7e0b85f9, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@63355449, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@9353778, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@6a28ffa4, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@48ae9b55, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@1700915]
11:49:58.723 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.724 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.742 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.742 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.743 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.743 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.744 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.744 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.750 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@243c4f91 testClass = CV0602v01AplicacionPruebasUnitariasLogbackTests, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [MergedContextConfiguration@291ae testClass = CV0602v01AplicacionPruebasUnitariasLogbackTests, locations = '{}', classes = '{class pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogback}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@3d99d22e, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6321e813, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@71bbf57e, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@15d0c81b], contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map[[empty]]], class annotated with @DirtiesContext [false] with mode [null].
11:49:58.752 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.752 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests]
11:49:58.765 [main] DEBUG org.springframework.test.context.support.DependencyInjectionTestExecutionListener - Performing dependency injection for test context [[DefaultTestContext@243c4f91 testClass = CV0602v01AplicacionPruebasUnitariasLogbackTests, testInstance = pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogbackTests@479d31f3, testMethod = [null], testException = [null], mergedContextConfiguration = [MergedContextConfiguration@291ae testClass = CV0602v01AplicacionPruebasUnitariasLogbackTests, locations = '{}', classes = '{class pe.bbva.architecture.paas.view.CV0602v01AplicacionPruebasUnitariasLogback}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@3d99d22e, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6321e813, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@71bbf57e, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@15d0c81b], contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map[[empty]]]].
11:49:58.809 [main] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=-1}

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::  (v2.1.0.BUILD-SNAPSHOT)

2018-08-01 11:49:59.211  INFO 12372 --- [           main] 01AplicacionPruebasUnitariasLogbackTests : Starting CV0602v01AplicacionPruebasUnitariasLogbackTests on DESKTOP-NOCUEDT with PID 12372 (started by user in F:\BBVA01Development\Spring5.0\BVASPGEVL0602v01AplicacionPruebasUnitariasLogback)
2018-08-01 11:49:59.214  INFO 12372 --- [           main] 01AplicacionPruebasUnitariasLogbackTests : No active profile set, falling back to default profiles: default
2018-08-01 11:49:59.853  INFO 12372 --- [           main] p.b.architecture.paas.view.CTComponent1  : log a info message =====> [Iniciando CTComponent1Test.configuration() 
2018-08-01 11:49:59.853  WARN 12372 --- [           main] p.b.architecture.paas.view.CTComponent1  : log a warn message =====> [Iniciando CTComponent1Test.configuration() 
2018-08-01 11:49:59.853 ERROR 12372 --- [           main] p.b.architecture.paas.view.CTComponent1  : log an error message =====> [Iniciando CTComponent1Test.configuration() 
2018-08-01 11:49:59.856  INFO 12372 --- [           main] p.b.architecture.paas.view.CTComponent2  : log a info message =====> [Iniciando CTComponent2Test.configuration() 
2018-08-01 11:49:59.856  WARN 12372 --- [           main] p.b.architecture.paas.view.CTComponent2  : log a warn message =====> [Iniciando CTComponent2Test.configuration() 
2018-08-01 11:49:59.856 ERROR 12372 --- [           main] p.b.architecture.paas.view.CTComponent2  : log an error message =====> [Iniciando CTComponent2Test.configuration() 
2018-08-01 11:50:00.178  INFO 12372 --- [           main] 01AplicacionPruebasUnitariasLogbackTests : Started CV0602v01AplicacionPruebasUnitariasLogbackTests in 1.364 seconds (JVM running for 2.722)
2018-08-01 11:50:00.425  INFO 12372 --- [       Thread-2] p.b.architecture.paas.view.CTComponent2  : log a info message ====> [Eliminando CTComponent2Test.killed() 
2018-08-01 11:50:00.425  WARN 12372 --- [       Thread-2] p.b.architecture.paas.view.CTComponent2  : log a warn message ====> [Eliminando CTComponent2Test.killed() 
2018-08-01 11:50:00.425 ERROR 12372 --- [       Thread-2] p.b.architecture.paas.view.CTComponent2  : log an error message ====> [Eliminando CTComponent2Test.killed() 
2018-08-01 11:50:00.426  INFO 12372 --- [       Thread-2] p.b.architecture.paas.view.CTComponent1  : log a info message ====> [Eliminando CTComponent1Test.killed() 
2018-08-01 11:50:00.426  WARN 12372 --- [       Thread-2] p.b.architecture.paas.view.CTComponent1  : log a warn message ====> [Eliminando CTComponent1Test.killed() 
2018-08-01 11:50:00.426 ERROR 12372 --- [       Thread-2] p.b.architecture.paas.view.CTComponent1  : log an error message ====> [Eliminando CTComponent1Test.killed() 

~~~~~
10. Generación del archivo jar

Ubicarse en el proyecto: BVASPGEVL0602v01AplicacionPruebasUnitariasLogback
Clic derecho y seleccionar el item Run As
Seleccionar y clic en el item maven install

Se inicia el proceso de descarga de componentes
~~~~~
[INFO] Scanning for projects...
[INFO] Downloading from spring-snapshots: https://repo.spring.io/snapshot/org/springframework/boot/spring-boot-starter-parent/2.1.0.BUILD-SNAPSHOT/maven-metadata.xml
[INFO] Downloaded from spring-snapshots: https://repo.spring.io/snapshot/org/springframework/boot/spring-boot-starter-parent/2.1.0.BUILD-SNAPSHOT/maven-metadata.xml (643 B at 230 B/s)
[INFO] Downloading from spring-snapshots: https://repo.spring.io/snapshot/org/springframework/boot/spring-boot-starter-parent/2.1.0.BUILD-SNAPSHOT/spring-boot-starter-parent-2.1.0.BUILD-20180801.132229-289.pom
[INFO] Downloaded from spring-snapshots: https://repo.spring.io/snapshot/org/springframework/boot/spring-boot-starter-parent/2.1.0.BUILD-SNAPSHOT/spring-boot-starter-parent-2.1.0.BUILD-20180801.132229-289.pom (12 kB at 47 kB/s)
[INFO] Downloading from spring-snapshots: https://repo.spring.io/snapshot/org/springframework/boot/spring-boot-dependencies/2.1.0.BUILD-SNAPSHOT/maven-metadata.xml
[INFO] Downloaded from spring-snapshots: https://repo.spring.io/snapshot/org/springframework/boot/spring-boot-dependencies/2.1.0.BUILD-SNAPSHOT/maven-metadata.xml (641 B at 1.5 kB/s)
[INFO] Downloading from spring-snapshots: https://repo.spring.io/snapshot/org/springframework/boot/spring-boot-dependencies/2.1.0.BUILD-SNAPSHOT/spring-boot-dependencies-2.1.0.BUILD-20180801.132159-289.pom
[INFO] Downloaded from spring-snapshots: https://repo.spring.io/snapshot/org/springframework/boot/spring-boot-dependencies/2.1.0.BUILD-SNAPSHOT/spring-boot-dependencies-2.1.0.BUILD-20180801.132159-289.pom (134 kB at 197 kB/s)
[INFO] 
~~~~~

11. Ejecución del Jar

Ubicarse en la carpeta target y ubicar el archivo jar generado: BVASPGEVL0602v01AplicationTestUnitsLogback-1.0.0-SNAPSHOT.jar
Copiar el jar en la carpeta d:\temporal
En la carpeta temporal ingresar en modo DOS
En la linea de comandos aplicar:
java -jar BVASPGEVL0602v01AplicationTestUnitsLogback-1.0.0-SNAPSHOT.jar

~~~~~
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::  (v2.1.0.BUILD-SNAPSHOT)

2018-08-01 11:46:00.013  INFO 12800 --- [           main] 0602v01AplicacionPruebasUnitariasLogback : Starting CV0602v01AplicacionPruebasUnitariasLogback v1.0.0-SNAPSHOT on DESKTOP-NOCUEDT with PID 12800 (D:\temporal\BVASPGEVL0602v01AplicationTestUnitsLogback-1.0.0-SNAPSHOT.jar started by user in D:\temporal)
2018-08-01 11:46:00.018  INFO 12800 --- [           main] 0602v01AplicacionPruebasUnitariasLogback : No active profile set, falling back to default profiles: default
2018-08-01 11:46:01.087  INFO 12800 --- [           main] 0602v01AplicacionPruebasUnitariasLogback : Started CV0602v01AplicacionPruebasUnitariasLogback in 1.542 seconds (JVM running for 2.126)
2018-08-01 11:46:01.127  INFO 12800 --- [           main] p.b.a.paas.component.CCComponent1        : log a info message =====> [Iniciando CCComponent1Test.configuration()
2018-08-01 11:46:01.128  WARN 12800 --- [           main] p.b.a.paas.component.CCComponent1        : log a warn message =====> [Iniciando CCComponent1Test.configuration()
2018-08-01 11:46:01.129 ERROR 12800 --- [           main] p.b.a.paas.component.CCComponent1        : log an error message =====> [Iniciando CCComponent1Test.configuration()
2018-08-01 11:46:01.129  INFO 12800 --- [           main] p.b.a.paas.component.CCComponent1        : log a info message ====> [Eliminando CCComponent1Test.killed()
2018-08-01 11:46:01.129  WARN 12800 --- [           main] p.b.a.paas.component.CCComponent1        : log a warn message ====> [Eliminando CCComponent1Test.killed()
2018-08-01 11:46:01.129 ERROR 12800 --- [           main] p.b.a.paas.component.CCComponent1        : log an error message ====> [Eliminando CCComponent1Test.killed()
2018-08-01 11:46:01.130  INFO 12800 --- [           main] p.b.a.paas.component.CCComponent2        : log a info message =====> [Iniciando CTComponent2Test.configuration()
2018-08-01 11:46:01.130  WARN 12800 --- [           main] p.b.a.paas.component.CCComponent2        : log a warn message =====> [Iniciando CTComponent2Test.configuration()
2018-08-01 11:46:01.130 ERROR 12800 --- [           main] p.b.a.paas.component.CCComponent2        : log an error message =====> [Iniciando CTComponent2Test.configuration()
2018-08-01 11:46:01.130  INFO 12800 --- [           main] p.b.a.paas.component.CCComponent2        : log a info message ====> [Eliminando CTComponent2Test.killed()
2018-08-01 11:46:01.130  WARN 12800 --- [           main] p.b.a.paas.component.CCComponent2        : log a warn message ====> [Eliminando CTComponent2Test.killed()
2018-08-01 11:46:01.131 ERROR 12800 --- [           main] p.b.a.paas.component.CCComponent2        : log an error message ====> [Eliminando CTComponent2Test.killed()

~~~~~


## B. Referencia ##

https://examples.javacodegeeks.com/enterprise-java/logback/logback-tutorial-beginners/


