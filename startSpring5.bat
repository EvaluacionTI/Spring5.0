@echo on
set IDE_STS_HOME=%cd%
set JAVA_HOME=D:\Programs\jdk1.8.0_241
set M2_HOME=D:\Programs\apache-maven-3.6.1
set MAVEN_OPTS=
set PATH=%JAVA_HOME%\bin;%M2_HOME%\bin;%IDE_STS_HOME%;%PATH%;
cd D:\BBVA2020\08Spring5.0\03Develop

reg Query "HKLM\Hardware\Description\System\CentralProcessor\0" | find /i "x86" > NUL && set start SpringToolSuite4.exe -clean -refresh -data %IDE_STS_HOME%/workspace -vm %IDE_STS_HOME%\tools\jdk-1.8\jre\bin\client\jvm.dll  || start SpringToolSuite4.exe -clean -refresh -data %IDE_STS_HOME%/workspace -vm %IDE_STS_HOME%\tools\jdk-1.8\jre\bin\server\jvm.dll 
