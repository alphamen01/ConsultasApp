## Bienvenido al repositorio de alphamen01

**Instalacion**

Debes tener instalado [Node.js](https://nodejs.org/en "Node.js").js una vez hayas clonado el proyecto, posteriormente ejecutar el comando :

*$ npm install*

Una vez ejecutado este comando, podran ejecutar el proyecto sin tener inconvenientes al momento de la generacion del reporte.

**Pre-requisitos**

Tener instalado:

Maven (apache-maven-3.9.1)

Java 8

**Entorno**

Cucumber 7.12.1

Java 8

Maven 3.11.0

JUnit 5

Selenium 4.10.0

Intellij IDEA CE - plugins(Cucumber, Cucumber for java, Gherkin)
<img src="https://drive.google.com/uc?id=12ZQY_cGrXZU3f68a0EeWWo3H_u4IHlYb">

**Ejecución de pruebas**

Podemos ejecutar:

- A través del IDE. En la clase runner RunCucumberTest menú contextual Run  -> RunCucumberTest.

<img src="https://drive.google.com/uc?id=1YboOnj_vJJEmPHm4_ASzx_ZPdMT2lG0l">

<img src="https://drive.google.com/uc?id=1qd_hbQo7Q6yUI7TSJZNiGnaqNbhMrj0Q">

- Por línea de comandos, con maven:

*$ mvn test -Dtest=RunCucumberTest*

<img src="https://drive.google.com/uc?id=1qO00plm21Wk5RJHhPl2lRhAoSwinlEoO">


**Informes**

Al finalizar la ejecucion de las pruebas se generara un informe en html.

<img src="https://drive.google.com/uc?id=1NNEhf5YEYZcfpOwdvDOjx1knw0RhvGkg">

