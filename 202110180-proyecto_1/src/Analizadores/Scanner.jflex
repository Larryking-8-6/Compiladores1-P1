

/* 1. Package e importaciones */
package Analizadores;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;

%%
/* 2. Configuraciones para el analisis (Opciones y Declaraciones) */
%{
    //Codigo de usuario en sintaxis java
    //Agregar clases, variables, arreglos, objetos etc...
    public class Lexema{        
            public String lexema;
            public String token;
            public int fila;
            public int columna;


            public Lexema(String lexema, String token, int fila, int columna){
            this.lexema = lexema;
            this.token = token;
            this.fila = fila;
            this.columna = columna;
        }
    }

    public List<Lexema> lexemas = new ArrayList<Lexema>();

%}

//Directivas
%class Scanner
%public 
%cup
%char
%column
%full
%line
%unicode
%ignorecase
//%debug

//Inicializar el contador de yychar y fila con 1
%init{ 
    yyline = 1; 
    yychar = 1; 
%init}

//Expresiones regulares
BLANCOS=[ \r\t]+
ENTERO=[0-9]+
DECIMALES=[0-9]+("."[  |0-9]+)?
ID = [A-Za-z_][A-Za-z0-9_]*
BOOL = "true"| "false"
STR  =   \"([^\"]|"\\\"")+\"
CHAR = '[^']'
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

comentarioSimple = "//"(InputCharacter)*(LineTerminator)?

//Reglas Semanticas
//Palabras reservadas
%%
"void" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_VOID,yyline,yychar,yytext());}     
"main" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("main","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_MAIN,yyline,yychar,yytext());         
} 
"definirglobales" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("DefinirGlobales","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_DGLOBALES,yyline,yychar,yytext());         
}
"graficabarras" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("DefinirGlobales","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_GBARRAS,yyline,yychar,yytext());         
}
"graficaPIE" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("DefinirGlobales","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_GPIE,yyline,yychar,yytext());         
}
"titulo" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("DefinirGlobales","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_TITULO,yyline,yychar,yytext());         
}
"ejex" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("DefinirGlobales","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_EJEX,yyline,yychar,yytext());         
}
"valores" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("DefinirGlobales","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_VALORES,yyline,yychar,yytext());         
}
"titulox" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("DefinirGlobales","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_TITULOX,yyline,yychar,yytext());         
}
"tituloy" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("DefinirGlobales","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_TITULOY,yyline,yychar,yytext());         
}
"int" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("int","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_INT,yyline,yychar,yytext());         
} 
"double" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("double","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_DOUBLE,yyline,yychar,yytext());         
} 
"bool" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("bool","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_BOOL,yyline,yychar,yytext());     
} 
"string" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("string","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_STRING,yyline,yychar,yytext());     
}  
"CHAR" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("char","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_CHAR,yyline,yychar,yytext());     
} 
"console" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("console","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_CONSOLE,yyline,yychar,yytext());     
} 
"write" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema("write","Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_WRITE,yyline,yychar,yytext());     
} 
"if" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_IF,yyline,yychar,yytext());     
} 
"else" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_ELSE,yyline,yychar,yytext());     
}  
"for" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_FOR,yyline,yychar,yytext());     
}
"switch" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_SWITCH,yyline,yychar,yytext());     
}  
"case" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_CASE,yyline,yychar,yytext());     
}
"break" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_BREAK,yyline,yychar,yytext());     
}
"default" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_DEFAULT,yyline,yychar,yytext());     
}
"while" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_WHILE,yyline,yychar,yytext());     
}
"do" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_DO,yyline,yychar,yytext());     
}
"NewValor" {  
    System.out.println("Reconocio PR: "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Palabra Reservada",yyline,yychar));
    return new Symbol(sym.PR_NEWVALOR,yyline,yychar,yytext());     
}

//Simbolos importantes
";" { 
    System.out.println("Reconocio "+yytext()+" punto y coma"); 
    lexemas.add( new Lexema(";"," punto y coma",yyline,yychar));
    return new Symbol(sym.PTCOMA,yyline,yychar,yytext());     
} 
"(" { 
    System.out.println("Reconocio "+yytext()+" parentesis abre"); 
    lexemas.add( new Lexema("(","Abre parentesis",yyline,yychar));    
    return new Symbol(sym.PARIZQ,yyline,yychar,yytext());
} 
")" { 
    System.out.println("Reconocio "+yytext()+" parentesis cierra"); 
    lexemas.add( new Lexema(")","Cierra parentesis",yyline,yychar));
    return new Symbol(sym.PARDER,yyline,yychar,yytext());
} 
"}" { 
    System.out.println("Reconocio "+yytext()+" llave cierra"); 
    lexemas.add( new Lexema("}","Abre llave",yyline,yychar));
    return new Symbol(sym.LLAVDER,yyline,yychar,yytext());    
} 
"{" { 
    System.out.println("Reconocio "+yytext()+" llave abre"); 
    lexemas.add( new Lexema("{","Cierra llave",yyline,yychar));
    return new Symbol(sym.LLAVIZQ,yyline,yychar,yytext());
} 
 
"[" { 
    System.out.println("Reconocio "+yytext()+" parentesis abre"); 
    lexemas.add( new Lexema("(","Abre corchetes",yyline,yychar));    
    return new Symbol(sym.CORIZQ,yyline,yychar,yytext());
} 
"]" { 
    System.out.println("Reconocio "+yytext()+" parentesis cierra"); 
    lexemas.add( new Lexema(")","Cierra corchetes",yyline,yychar));
    return new Symbol(sym.CORDER,yyline,yychar,yytext());
} 
"=" { 
    System.out.println("Reconocio "+yytext()+" igual"); 
    lexemas.add( new Lexema("=","Igual",yyline,yychar));
    return new Symbol(sym.IGUAL,yyline,yychar,yytext());
} 
"." { 
    System.out.println("Reconocio "+yytext()+" punto"); 
    lexemas.add( new Lexema(".","Punto",yyline,yychar));
    return new Symbol(sym.PUNTO,yyline,yychar,yytext()); 
} 
"," { 
    System.out.println("Reconocio "+yytext()+" coma"); 
    lexemas.add( new Lexema(yytext(),"Coma",yyline,yychar));
    return new Symbol(sym.COMA,yyline,yychar,yytext());
 
} 
":" { 
    System.out.println("Reconocio "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Dos Puntos",yyline,yychar));
    return new Symbol(sym.DOSPUNTOS,yyline,yychar,yytext()); 
} 
"$" { 
    System.out.println("Reconocio "+yytext()); 
    lexemas.add( new Lexema(yytext(),"Simbolo monetario",yyline,yychar));
    return new Symbol(sym.DOLLAR,yyline,yychar,yytext()); 
} 



//Operaciones
"+" {
    lexemas.add( new Lexema("+","Operador Más",yyline,yychar));
    return new Symbol(sym.MAS,yyline,yychar,yytext());
} 
"-" {
    lexemas.add( new Lexema("-","Operador Menos",yyline,yychar));
    return new Symbol(sym.MENOS,yyline,yychar,yytext());
} 
"*" {
    lexemas.add( new Lexema("*","Operador Multiplicador",yyline,yychar));
    return new Symbol(sym.POR,yyline,yychar,yytext());
} 
"/" {
    lexemas.add( new Lexema("/","Operador Division",yyline,yychar));
    return new Symbol(sym.DIVIDIDO,yyline,yychar,yytext());
} 
"<" {
    lexemas.add( new Lexema(yytext(),"Operador Menorque",yyline,yychar));
    return new Symbol(sym.MENORQUE,yyline,yychar,yytext());
} 
">" {
    lexemas.add( new Lexema(yytext(),"Operador Mayorque",yyline,yychar));
    return new Symbol(sym.MAYORQUE,yyline,yychar,yytext());
} 
"<=" {
    lexemas.add( new Lexema(yytext(),"Operador Mayor O Igual Que",yyline,yychar));
    return new Symbol(sym.MENOROIGUAL,yyline,yychar,yytext());
} 
">=" {
    lexemas.add( new Lexema(yytext(),"Operador Mayor O Igual Que",yyline,yychar));
    return new Symbol(sym.MAYOROIGUAL,yyline,yychar,yytext());
}
"==" {
    lexemas.add( new Lexema(yytext(),"Operador Igual Que",yyline,yychar));
    return new Symbol(sym.EQUALS,yyline,yychar,yytext());
} 
"!=" {
    lexemas.add( new Lexema(yytext(),"Operador Distinto Que",yyline,yychar));
    return new Symbol(sym.DISTINTO,yyline,yychar,yytext());
} 
"&&" {
    lexemas.add( new Lexema(yytext(),"Operador And",yyline,yychar));
    return new Symbol(sym.AND,yyline,yychar,yytext());
}
"||" {
    lexemas.add( new Lexema(yytext(),"Operador Or",yyline,yychar));
    return new Symbol(sym.OR,yyline,yychar,yytext());
} 
"!" {
    lexemas.add( new Lexema(yytext(),"Operador Not",yyline,yychar));
    return new Symbol(sym.NOT,yyline,yychar,yytext());
}

\n {yychar=1;}

{BLANCOS} {} 
{comentarioSimple} {System.out.println("Comentario: "+yytext()); }
{BOOL} {System.out.println("Reconocio BOOL: "+yytext());  
    lexemas.add( new Lexema(yytext(),"Boolean",yyline,yychar));
    return new Symbol(sym.BOOLEANO,yyline,yychar, yytext());} 
{ID} {System.out.println("Reconocio ID: "+yytext());    
    lexemas.add( new Lexema(yytext(),"ID",yyline,yychar));
    return new Symbol(sym.ID,yyline,yychar, yytext()); } 
{ENTERO} {
    lexemas.add( new Lexema(yytext(),"Número Entero",yyline,yychar));
    return new Symbol(sym.ENTERO,yyline,yychar, yytext());} 
{DECIMALES} {
    lexemas.add( new Lexema(yytext(),"Numero Decimal",yyline,yychar));
    return new Symbol(sym.DECIMAL,yyline,yychar, yytext());}
{STR} {
    lexemas.add( new Lexema(yytext(),"Cadena de caracteres",yyline,yychar));
    return new Symbol(sym.STR,yyline,yychar, yytext());}
{CHAR} {
    lexemas.add( new Lexema(yytext(),"Caracter",yyline,yychar));
    return new Symbol(sym.CHAR,yyline,yychar, yytext());}
. {
    //Aqui se debe guardar los valores (yytext(), yyline, yychar ) para posteriormente generar el reporte de errores Léxicos.
    System.out.println("Este es un error lexico: "+yytext()+ ", en la linea: "+yyline+", en la columna: "+yychar);
}