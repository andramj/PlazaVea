# PlazaVea
En este repositorio contiene la automatizacion del proceso de compra de un producto en https://www.plazavea.com.pe/. 
esta solucion se automatizo con el uso del patrón ScreenPlay, el Lenguaje de programación Java, Gradle, Serenity BDD
aplicando diversos conocimientos como los principios SOLID

#Estructura del proyecto 
````
+ model
    Clases que usan el patrón object builder o relcionadas con el modelo de dominio
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interacion
    Clases que representan las interacciones directas con la interfaz de usuario
+ user_interface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
    Objectos usados para consultar acerca del estado de la aplicación
    
````

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle

## Para correr el proyecto
````
gradle clean test aggregate
````
este comando correrá los tests y generará el reporte en la carpeta /target/site/serenity/