# CURSO COMPLETO DE JAVA

## INSTALACIONES

Para empezar a trabajar con Java, es requerido descargar e instalar el JDK de Oracle.

> https://www.oracle.com/java/technologies/javase-jdk11-downloads.html

Posteriormente, es necesario instalar un Entorno de Desarollo Integrado, se recomienda usar Apache NetBeans.

> https://netbeans.apache.org/download/nb120/nb120.html

## FUNDAMENTOS DE JAVA

### VARIABLES

Una variable nos va a permitir almacenar información, esta información, esta información va a ser los datos que vamos a procesar en nuestro programa, por tanto, estos datos van a variar, según la información que estemos recibiendo por parte del usuario o la información que estemos procesando.

Una variable va a tener un identificador y va a almacenar un valor, pero este valor puede cambiar al paso del tiempo.

Las variables pueden almacenar valores con distintos tipos de datos.

En Java, existen diferentes tipos de datos, los cuales, se clasifican en dos categorias:

- Tipos Primitivos
  - Tipos Enteros
  - Tipos Flotantes

* Tipos Referenciados (Tipo Object)
  - Clases
  - Interfaces
  - Arreglos

#### USO DE VAR

A partir de la versión 10 de Java, podemos usar la palabra reservada `var` para declarar una variable, y `var`, definirá el tipo de dato de la variable de acuerdo a su literal o valor.

Para poder hacer uso de la palabra reservada `var` en la definición de variables, es obligatorio asginar una literal.

#### REGLAS DE IDENTIFICADOR

Existen reglas para definir el identificador de una variable.

- El primer caracter del identificador puede ser cualquier letra del alfabeto inglés.
- El primer caracter no debe ser un numero o caracteres especiales.
- Por convención se recomienda que la primera letra sea minúlcula, y si el nombre se conforma por dos o mas palabras conviene que esten juntos pero la inicial de cada palabra inicie en mayúscula excepto la primera.
- Los caracteres permitidos como inicio para definición de identificadores son el guión bajo `_` y el signo del dolar `$`.