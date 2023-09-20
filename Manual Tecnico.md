# Manual Tecnico

## Compiladores 1 - Seccion N - Juan Carlos Gonzalez Valdez - 202110180

Este proyecto tiene el fin de la creacion y demostracion de la creacion de un compilador con funcion Statpy y Json para el analisis de archivos en base a su formato y caracrteres,
El proposito es que el estudiante entienda los conceptos de la creacion de un compilador.

## Requisitos del Sistema para poder usar neatbeans

### Requisitos del Sistema Operativo
- **Sistema Operativo**: Windows, macOS o Linux.

### Hardware
- **Procesador**: Un procesador de al menos 1 GHz o superior.
- **Memoria RAM**: Se recomienda un mínimo de 2 GB de RAM. Para un rendimiento óptimo, se recomienda 4 GB o más.
- **Espacio en Disco Duro**: Se recomienda al menos 2 GB de espacio libre en disco para la instalación de NetBeans y espacio adicional para tus proyectos.

### Software
- **Java Development Kit en este caso la version 16.0 (JDK 16):
El Kit de Desarrollo de Java (JDK) 16 es la plataforma de desarrollo principal que proporciona todas las herramientas y bibliotecas necesarias para desarrollar y ejecutar aplicaciones Java. JDK 16 incluye el compilador Java, las bibliotecas estándar y otras herramientas esenciales para la programación en Java

### Librerias generales

- jflex-full1.7.0.jar:

JFlex (Generador de Analizadores Léxicos en Java) es una herramienta que se utiliza para generar analizadores léxicos personalizados en Java. Esta biblioteca es necesaria para compilar y ejecutar el analizador léxico de tu proyecto. Permite definir reglas de análisis léxico para tu lenguaje de programación.

- jcommon-1.0.23.jar:

JCommon es una biblioteca que proporciona clases y utilidades comunes para la creación de gráficos en Java. Es utilizada por muchas bibliotecas de gráficos, como JFreeChart, para proporcionar funcionalidades básicas y componentes de representación gráfica.

- java-cup-11b.jab:

CUP (Constructor de Analizadores Sintácticos en Java) es una herramienta que se utiliza para generar analizadores sintácticos en Java. Esta biblioteca es necesaria para compilar y ejecutar el generador de analizadores sintácticos (parser) de tu proyecto. Permite definir reglas de análisis sintáctico para tu lenguaje de programación.

- jfreechart-1.0.1.9.jar:
  
JFreeChart es una biblioteca de gráficos en Java que permite crear una variedad de gráficos, como gráficos de barras, gráficos de líneas y gráficos de tartas. Esta biblioteca es útil cuando necesitas visualizar datos en tu aplicación Java, como datos estadísticos o de rendimiento.

- jflex-1.9.1.jar:
 
jflex-full1.7.0.jar, esta es una versión más antigua de JFlex, que también se utiliza para generar analizadores léxicos personalizados en Java. Si estás utilizando una versión específica de JFlex en tu proyecto, puedes necesitar esta biblioteca en lugar de la versión más reciente, esto lo deje ya que no me corria el programa si lo borraba ya que inicie con la misma.

- java-cup-11b-runtime.jar:
Esta es la biblioteca de tiempo de ejecución necesaria para ejecutar analizadores sintácticos generados por CUP. Si tienes un parser generado por CUP en tu proyecto, necesitarás esta biblioteca para que funcione correctamente.

### Funciones y clases

| Función o Clase           | Descripción                                                                                                                                                  |
|---------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `BufferedWriter`          | Se utiliza para escribir caracteres en un búfer de salida y proporciona métodos para escribir texto en archivos.                                           |
| `FileOutputStream`        | Proporciona un flujo de salida para escribir datos en un archivo.                                                                                           |
| `FileWriter`              | Se utiliza para escribir caracteres en un archivo.                                                                                                           |
| `File`                    | Representa un archivo o directorio en el sistema de archivos.                                                                                                 |
| `BufferedReader`          | Se utiliza para leer caracteres de un flujo de entrada de caracteres en búfer.                                                                              |
| `StringReader`            | Se utiliza para leer caracteres desde una cadena de texto.                                                                                                     |
| `Logger`                  | Proporciona un registro de eventos y mensajes para el seguimiento y diagnóstico de aplicaciones.                                                            |
| `Parser`                  | Representa un analizador sintáctico generado por JavaCUP para analizar la sintaxis del código fuente.                                                        |
| `Scanner`                 | Representa un analizador léxico generado por JFlex para analizar el código fuente y generar tokens.                                                        |
| `ArrayList`               | Implementa una lista dinámica en Java que puede almacenar elementos en una secuencia ordenada.                                                              |
| `List`                    | Define una interfaz que representa una colección ordenada de elementos.         
| `Parser.cup`              | Este archivo contiene la especificación gramatical del lenguaje de programación en la forma de reglas de producción establecidas. |
| `Parser.java`             | Este es el resultado generado por la herramienta JavaCUP a partir del archivo parser.cup. Contiene el código Java del analizador sintáctico que sigue las reglas gramaticales definidas en parser.cup. |
| `scanner.jflex`           | Este archivo contiene las especificaciones para generar el analizador léxico (scanner) utilizando la herramienta JFlex. Define las reglas para reconocer tokens individuales en el código fuente, como palabras clave, identificadores, números, operadores, sumbolos y mas funciones. |
| `scanner.java`            | Es el resultado de la generación automática a partir del archivo Scanner.jflex |
| `sym.java`                | Este archivo se genera automáticamente junto con el analizador léxico y sintáctico y contiene constantes que representan los símbolos terminales utilizados en el proceso de análisis. Cada símbolo tiene un valor entero asociado. |

Estas son las funciones y clases que se importan y utilizan en el codigo.

# Gramática del Lenguaje

## Terminales
- `PTCOMA`
- `PARIZQ`
- `PARDER`
- `LLAVDER`
- `LLAVIZQ`
- `CORDER`
- `CORIZQ`
- `IGUAL`
- `PUNTO`
- `COMA`
- `DOSPUNTOS`
- `DOLLAR`
- `MAS`
- `MENOS`
- `POR`
- `DIVIDIDO`
- `MENORQUE`
- `MAYORQUE`
- `EQUALS`
- `MAYOROIGUAL`
- `MENOROIGUAL`
- `DISTINTO`
- `AND`
- `OR`
- `NOT`
- `ENTERO`
- `DECIMAL`
- `BOOLEANO`
- `ID`
- `STR`
- `CHAR`
- `UMENOS`
- `PR_VOID`
- `PR_MAIN`
- `PR_DGLOBALES`
- `PR_INT`
- `PR_STRING`
- `PR_CHAR`
- `PR_DOUBLE`
- `PR_BOOL`
- `PR_CONSOLE`
- `PR_WRITE`
- `PR_NEWVALOR`
- `PR_IF`
- `PR_ELSE`
- `PR_FOR`
- `PR_SWITCH`
- `PR_CASE`
- `PR_DEFAULT`
- `PR_BREAK`
- `PR_WHILE`
- `PR_DO`
- `PR_GBARRAS`
- `PR_GPIE`
- `PR_TITULO`
- `PR_EJEX`
- `PR_VALORES`
- `PR_TITULOX`
- `PR_TITULOY`
- `vacio`

## No Terminales
- `ini`
- `entradas`
- `sentencias`
- `sentencia`
- `funciones`
- `funcion`
- `funcion_globales`
- `sentencias_globales`
- `sentencia_global`
- `funcion_grafica`
- `valor_string`
- `valor_double`
- `sentencias_graficas`
- `sentencia_grafica`
- `elementos_string`
- `elementos_double`
- `sentencia_print`
- `sentencia_declaracion`
- `sentencia_globales`
- `sentenciaIf`
- `sentenciaElse`
- `sentenciaSwitch`
- `sentenciasCase`
- `sentenciasExtra`
- `usoBreak`
- `sentenciaFor`
- `sentenciaDoWhile`
- `sentenciaWhile`
- `expresion`
- `tipo_dato`
- `lista`
- `elementos`
- `referencia_json`
- `archivo_json`
- `miembro`

## Producciones
- `ini ::= entradas`
- `entradas ::= PR_VOID PR_MAIN PARIZQ PARDER LLAVIZQ sentencias LLAVDER`
- `entradas ::= archivo_json`
- `sentencias ::= sentencias sentencia`
- `sentencias ::= sentencias error`
- `sentencias ::= sentencia`
- `sentencias ::= expresion`
- `funciones ::= PR_VOID ID PARIZQ expresion PARDER LLAVIZQ sentencias LLAVDER`
- `funciones ::= PR_VOID ID PARIZQ PARDER LLAVIZQ sentencias LLAVDER`
- `lista ::= LLAVIZQ elementos LLAVDER`
- `elementos ::= expresion`
- `elementos ::= elementos COMA elementos`
- `tipo_dato ::= PR_INT`
- `tipo_dato ::= PR_DOUBLE`
- `tipo_dato ::= PR_STRING`
- `tipo_dato ::= PR_BOOL`
- `tipo_dato ::= PR_CHAR`
- `expresion ::= expresion MAS expresion`
- `expresion ::= expresion POR expresion`
- `expresion ::= expresion MENOS expresion`
- `referencia_json ::= DOLLAR LLAVIZQ PR_NEWVALOR COMA STR COMA STR LLAVDER`
- `archivo_json ::= LLAVIZQ miembro LLAVDER`
- `miembro ::= STR DOSPUNTOS STR`
- `miembro ::= STR DOSPUNTOS DECIMAL`
- `miembro ::= miembro COMA miembro`

##Sym.java

- `EOF`: Representa el final del archivo.
- `error`: Se utiliza para indicar un error durante el análisis.
- `ID`: Representa un identificador.
- `ENTERO`: Representa un número entero.
- `PR_IF`: Representa la palabra clave "if".
- `PLUS`: Representa el operador de suma "+".

Estas son algunas funciones de la misma ya que se genera de manera automatica.

##Parser.java

Analiza el codigo fuente de un programa escrito en un lenguaje de programación y determinar si cumple con la gramática y la estructura sintáctica definida por ese lenguaje

### Funciones Parser

Análisis Sintáctico ,  Árbol de Análisis, Generación de Errores.

- Flujo de trabajo:

Escaneo (Lexer o Analizador Léxico): El código fuente se divide en tokens o lexemas por el analizador léxico. Cada token representa una unidad léxica, como palabras clave, identificadores, números y símbolos.

Análisis Sintáctico (Parser): El analizador sintáctico (parser) toma los tokens generados por el analizador léxico y verifica si se ajustan a la gramática del lenguaje. Si el código es sintácticamente válido, se construye un árbol de análisis sintáctico.

Manejo de Errores: Si se encuentran errores sintácticos, se generan mensajes de error y se informa al programador sobre la ubicación y naturaleza de los errores.

Generación de Árbol de Análisis: Se construye el árbol de análisis sintáctico que representa la estructura jerárquica del programa.

Acciones Semánticas: En algunos casos, el parser realiza acciones semánticas adicionales, como verificar tipos de datos, calcular expresiones o generar código intermedio.

### Funciones scanner

Analisis de caracteres, reconocimiento de tokens, manejo de comentarios y espacios, generar tokens, manejo de errores lexicos.

- Flujo de trabajo:

Análisis de Caracteres: El scanner comienza por leer el código fuente de entrada carácter por carácter. Su tarea principal es reconocer patrones y lexemas en el código fuente.

Reconocimiento de Tokens: A medida que se leen los caracteres, el scanner busca patrones que coincidan con las palabras clave, identificadores, literales (como números y cadenas), operadores y otros elementos léxicos definidos por la gramática del lenguaje. Cuando se encuentra un token, se crea una estructura de datos que almacena el tipo del token y, en algunos casos, su valor.

Manejo de Espacios en Blanco y Comentarios: El scanner también es responsable de ignorar o manejar espacios en blanco y comentarios, ya que generalmente no son relevantes para el análisis posterior.

Generación de Tokens: Cada vez que se encuentra un token, el scanner lo envía al parser junto con su tipo y, si es necesario, su valor. Los tokens se generan en el orden en que aparecen en el código fuente.

Manejo de Errores Lexicales: Si el scanner encuentra caracteres que no forman parte de ningún token válido o patrón conocido, puede generar un error léxico. Estos errores indican que el código fuente contiene caracteres o secuencias de caracteres que no se ajustan a la gramática del lenguaje.

# Graficas

## Clase GraficoPie

La clase `GraficoPie` representa un gráfico de pie y almacena la información necesaria para crear y mostrar dicho gráfico. Esta clase se utiliza para generar visualizaciones de datos circulares.

### Atributos

- `titulo`: Una cadena de texto que representa el título del gráfico de pie.
- `tituloEjeX`: Una cadena de texto que representa el título del eje X del gráfico.
- `tituloEjeY`: Una cadena de texto que representa el título del eje Y del gráfico (generalmente no utilizado en gráficos de pie).
- `ejeX`: Una lista de cadenas de texto que contiene las etiquetas o categorías para las partes del gráfico de pie.
- `valores`: Una lista de valores numéricos (de tipo `Double`) que representan el tamaño o la proporción de cada parte del gráfico de pie.

### Constructor

La clase `GraficoPie` tiene un constructor que permite inicializar todos los atributos necesarios para crear un gráfico de pie. Los parámetros del constructor son:

- `titulo`: El título del gráfico de pie.
- `tituloEjeX`: El título del eje X del gráfico.
- `tituloEjeY`: El título del eje Y del gráfico.
- `ejeX`: Una lista de etiquetas o categorías.
- `valores`: Una lista de valores numéricos.

### Métodos

La clase `GraficoPie` proporciona métodos para acceder y modificar los atributos:

- `getTitulo()`: Devuelve el título del gráfico de pie.
- `setTitulo(String titulo)`: Establece el título del gráfico de pie.
- `getTituloEjeX()`: Devuelve el título del eje X.
- `setTituloEjeX(String tituloEjeX)`: Establece el título del eje X.
- `getTituloEjeY()`: Devuelve el título del eje Y.
- `setTituloEjeY(String tituloEjeY)`: Establece el título del eje Y.
- `getEjeX()`: Devuelve la lista de etiquetas o categorías.
- `setEjeX(List<String> ejeX)`: Establece la lista de etiquetas o categorías.
- `getValores()`: Devuelve la lista de valores numéricos.
- `setValores(List<Double> valores)`: Establece la lista de valores numéricos.

## Clase GraficoBarras

La clase `GraficoBarras` representa un gráfico de barras y almacena la información necesaria para crear y mostrar dicho gráfico. Este tipo de gráfico se utiliza para visualizar datos de manera comparativa entre diferentes categorías.

### Atributos

- `titulo`: Una cadena de texto que representa el título del gráfico de barras.
- `tituloX`: Una cadena de texto que representa el título del eje X del gráfico.
- `tituloY`: Una cadena de texto que representa el título del eje Y del gráfico.
- `ejeX`: Una lista de cadenas de texto que contiene las etiquetas o categorías para las barras del gráfico.
- `valores`: Una lista de valores numéricos (de tipo `Double`) que representan la longitud o altura de cada barra en el gráfico.

### Constructor

La clase `GraficoBarras` tiene un constructor que permite inicializar todos los atributos necesarios para crear un gráfico de barras. Los parámetros del constructor son:

- `titulo`: El título del gráfico de barras.
- `tituloX`: El título del eje X del gráfico.
- `tituloY`: El título del eje Y del gráfico.
- `ejeX`: Una lista de etiquetas o categorías para las barras.
- `valores`: Una lista de valores numéricos que representan las longitudes de las barras.

### Métodos

La clase `GraficoBarras` proporciona métodos para acceder y modificar los atributos:

- `getTitulo()`: Devuelve el título del gráfico de barras.
- `setTitulo(String titulo)`: Establece el título del gráfico de barras.
- `getTituloX()`: Devuelve el título del eje X.
- `setTituloX(String tituloX)`: Establece el título del eje X.
- `getTituloY()`: Devuelve el título del eje Y.
- `setTituloY(String tituloY)`: Establece el título del eje Y.
- `getEjeX()`: Devuelve la lista de etiquetas o categorías de las barras.
- `setEjeX(List<String> ejeX)`: Establece la lista de etiquetas o categorías.
- `getValores()`: Devuelve la lista de valores numéricos que representan las longitudes de las barras.
- `setValores(List<Double> valores)`: Establece la lista de valores numéricos.


### Almacenamiento de datos de la grafica

La clase `GuardarGrafico` proporciona métodos para guardar datos y gráficos en archivos en diferentes formatos, como texto y binario. Está diseñada para facilitar la persistencia de información generada por la aplicación de gráficos.

### Métodos

#### `writeToFile(String fileName, String text)`

Este método permite guardar datos de texto en un archivo con el nombre especificado. Toma dos argumentos:

- `fileName`: Una cadena de texto que representa el nombre del archivo en el que se guardarán los datos.
- `text`: Una cadena de texto que contiene los datos que se guardarán en el archivo.

El método crea un archivo de texto y escribe el contenido proporcionado en él. Si se realiza con éxito, muestra un mensaje de confirmación en la consola. Si ocurre un error, muestra un mensaje de error.

#### `writeToFile(String fileName, byte[] data)`

Este método permite guardar datos binarios en un archivo con el nombre especificado. Toma dos argumentos:

- `fileName`: Una cadena de texto que representa el nombre del archivo en el que se guardarán los datos binarios.
- `data`: Un arreglo de bytes que contiene los datos binarios que se guardarán en el archivo.

El método crea un archivo binario y escribe los datos binarios proporcionados en él. Si se realiza con éxito, muestra un mensaje de confirmación en la consola. Si ocurre un error, muestra un mensaje de error.

# Reportes

La clase `LexicoReportes` es una clase de utilidad utilizada para el análisis léxico y la generación de reportes a partir de un texto de entrada. Contiene métodos para realizar tareas específicas relacionadas con el análisis de texto y la generación de informes.

### Colores de Consola

La clase define algunas constantes que representan códigos de colores ANSI utilizados para mostrar mensajes de consola con colores. Estos códigos son útiles para resaltar ciertos tipos de mensajes.

- `ANSI_RESET`: Restablece el color de la consola al valor predeterminado.
- `ANSI_CYAN`: Establece el color de la consola a cian.
- `ANSI_YELLOW`: Establece el color de la consola a amarillo.
- `ANSI_GREEN`: Establece el color de la consola a verde.
- `ANSI_RED`: Establece el color de la consola a rojo.

#### `reemplazarComentarios(String texto)`

Este método recibe un texto de entrada y reemplaza los comentarios en el texto. Elimina tanto los comentarios de línea (//) como los comentarios de bloque (/* ... */). Los comentarios se reemplazan por espacios en blanco.

#### `erroresLexicosJSON(String texto)`

Este método identifica errores léxicos en el texto de entrada y genera un informe en formato HTML. Examina cada carácter en el texto y verifica si es un carácter válido en JSON. Si encuentra un carácter inválido, registra un error léxico en el informe.

#### `erroresLexicosStatPy(String texto)`

Similar al método `erroresLexicosJSON`, este método identifica errores léxicos en el texto de entrada, pero está diseñado para un lenguaje específico. Examina cada carácter en el texto y verifica si es un carácter válido en el lenguaje particular. Si encuentra un carácter inválido, registra un error léxico en el informe.

#### `ReporteLexemas(String texto)`

Este método realiza un análisis léxico del texto de entrada utilizando un analizador léxico y sintáctico proporcionado por la clase `Parser`. Luego, genera un informe en formato HTML que muestra los lexemas identificados, sus tokens correspondientes y sus ubicaciones (línea y columna) en el texto de entrada.

#### `Traducir(String texto)`

Este método realiza un análisis léxico y sintáctico del texto de entrada utilizando un analizador léxico y sintáctico proporcionado por la clase `Parser`. Luego, devuelve el resultado del análisis, que puede ser una traducción o cualquier otra información generada por el análisis.

#### `agregarTab(String texto)`

Este método agrega tabulaciones adecuadas al texto de entrada para mejorar la legibilidad. Se utiliza para formatear el código fuente y mantener la estructura de tabulación correcta después del análisis.

#### `tabulaciones(int cantidad)`

Un método auxiliar que devuelve una cadena de tabulaciones según la cantidad especificada. Se utiliza para agregar tabulaciones en el proceso de formateo.

### Uso

La clase `LexicoReportes` es útil para realizar análisis léxicos, generar informes de errores léxicos y presentar resultados de análisis en un formato legible. Puede ser una parte importante de un sistema de generación de informes y depuración para lenguajes de programación o formatos de datos específicos.

## Menu de graficas

La clase `InterfazGraficas` representa una interfaz de usuario que permite al usuario generar y visualizar gráficos en dos tipos: gráficos de barras y gráficos de pie.

## Componentes de la Interfaz

- **Etiqueta de Título**: `jLabel1` muestra el título "Graficas generadas".

- **Panel de Gráficos de Barras**: `jPanel1` es un panel donde se mostrarán los gráficos de barras.

- **Botón de Gráficos de Barras**: `jButton1` es un botón con la etiqueta "Barras" que permite al usuario generar un gráfico de barras.

- **Panel de Gráficos de Pie**: `jPanel2` es un panel donde se mostrarán los gráficos de pie.

- **Botón de Gráficos de Pie**: `jButton2` es un botón con la etiqueta "Pie" que permite al usuario generar un gráfico de pie.

## Generación de Gráficos de Barras

- Cuando se hace clic en el botón "Barras" (`jButton1`), se recopilan los datos necesarios del gráfico de barras desde la clase `graficoBarrasGlobal`.

- Luego, se crea un gráfico de barras (`grafico_barras`) utilizando la biblioteca JFreeChart.

- Los datos se asignan al gráfico, y se personaliza su aspecto utilizando colores.

- Finalmente, el gráfico se muestra en el `jPanel1`.

## Generación de Gráficos de Pie

- Cuando se hace clic en el botón "Pie" (`jButton2`), se recopilan los datos necesarios del gráfico de pie desde la clase `graficoPieGlobal`.

- Luego, se crea un gráfico de pie (`graficoPie`) utilizando la biblioteca JFreeChart.

- Los datos se asignan al gráfico y se personaliza su aspecto.

- Finalmente, el gráfico se muestra en el `jPanel2`.

## Método `main`

- El método `main` se utiliza para iniciar la aplicación y mostrar la interfaz de usuario. Cuando se ejecuta la aplicación, se crea una instancia de `InterfazGraficas` y se muestra la interfaz.










