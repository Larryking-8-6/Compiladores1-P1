package Grafica;

import Analizadores.Parser;
import Analizadores.Scanner;

import java.io.BufferedReader;
import java.io.StringReader;

public class LexicoReportes {
    
    // Colores de consola
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    
       static String reemplazarComentarios(String texto) {
        String comentario;
        while (texto.contains("//")) {
            int apuntador = texto.indexOf("//");
            comentario = texto.substring(apuntador);
            comentario = comentario.split("\n")[0];
            texto = texto.replace(comentario, " ");
            System.out.println(ANSI_CYAN + "Comentario ignorado: '" + comentario + "'" + ANSI_RESET);
        }
        
         while (texto.contains("/*") && texto.contains("*/")) {
            comentario = texto.substring(texto.indexOf("/*"), texto.indexOf("*/") + 2);
            int cantidadSaltos = comentario.split("\n").length;
            String saltos = " ";
            for (int j = 1; j < cantidadSaltos; j++) {
                saltos += "\n";
            }
            texto = texto.replace(comentario, saltos);
            System.out.println(ANSI_CYAN + "Comentario ignorado: " + comentario + ANSI_RESET);
        }

        return texto;
    }
       
    static String inicioHTML = "<html>\n" +
            "<meta charset=\"utf-8\">\n" +
            "<table border=\"1\">";
    
    static String finalHTML = "\n</table>\n</html>";
    
    static String erroresLexicosJSON(String texto){
        String[] lineas = texto.split("\n");
        String html = inicioHTML;
        html +="\n\t<tr style=\"background-color: DarkOrange\">";
        html +="\n\t<td>Lexema</td>\n" +
        "\t\t<td>Descripción</td>\n" +
        "\t\t<td>Línea</td>\n" +
        "\t\t<td>Columna</td>";
        html +="</tr>";
        
        for (int j=0; j< lineas.length; j++){    
            for(int i=0; i< lineas[j].length(); i++){
                if (!Character.isDigit(lineas[j].charAt(i)) && !Character.isAlphabetic(lineas[j].charAt(i)) 
                    && lineas[j].charAt(i)!='"'&& lineas[j].charAt(i)!=' '&& lineas[j].charAt(i)!='\\'
                    && lineas[j].charAt(i)!='/'&& lineas[j].charAt(i)!='{'&& lineas[j].charAt(i)!='}'
                    && lineas[j].charAt(i)!='.'&& lineas[j].charAt(i)!=':'&& lineas[j].charAt(i)!=','&& lineas[j].charAt(i)!='\t'){
                    html +="\n\t<tr>";
                    html +="\n\t\t<td>"+lineas[j].charAt(i)+"</td>\n" +
                    "\t\t<td>Error Léxico</td>\n" +
                    "\t\t<td>"+j+"</td>\n" +
                    "\t\t<td>"+i+"</td>";
                    html +="</tr>";
                    
                    System.out.println("Error: "+lineas[j].charAt(i)+ "en la fila "+(j) +" y columna "+i);
                }
            }
        }
        html +=finalHTML;
        return html;
    }
    static String erroresLexicosStatPy(String texto){
        String[] lineas = texto.split("\n");
        String html = inicioHTML;
        html +="\n\t<tr style=\"background-color: skyblue\">";
        html +="\n\t<td>Lexema</td>\n" +
        "\t\t<td>Descripción</td>\n" +
        "\t\t<td>Línea</td>\n" +
        "\t\t<td>Columna</td>";
        html +="</tr>";
        
        for (int j=0; j< lineas.length; j++){   
            //lineas[j] = lineas[j].replaceAll("	", "  "); //Representa la linea/columna del texto ingresado
            //
            for(int i=0; i< lineas[j].length(); i++){
                if (!Character.isDigit(lineas[j].charAt(i)) && !Character.isAlphabetic(lineas[j].charAt(i)) 
                    && lineas[j].charAt(i)!='"' && lineas[j].charAt(i)!=' ' && lineas[j].charAt(i)!='\\'
                    && lineas[j].charAt(i)!='/' && lineas[j].charAt(i)!='{' && lineas[j].charAt(i)!='}'
                    && lineas[j].charAt(i)!='.' && lineas[j].charAt(i)!=':' && lineas[j].charAt(i)!=','
                    && lineas[j].charAt(i)!='\t' && lineas[j].charAt(i)!='+' && lineas[j].charAt(i)!='*'
                    && lineas[j].charAt(i)!='=' && lineas[j].charAt(i)!='(' && lineas[j].charAt(i)!=')'
                    && lineas[j].charAt(i)!='<' && lineas[j].charAt(i)!='>' && lineas[j].charAt(i)!=';'
                    && lineas[j].charAt(i)!='$' && lineas[j].charAt(i)!='[' && lineas[j].charAt(i)!=']'){
                    html +="\n\t<tr>";
                    html +="\n\t\t<td>"+lineas[j].charAt(i)+"</td>\n" +
                    "\t\t<td>Error Léxico</td>\n" +
                    "\t\t<td>"+j+"</td>\n" +
                    "\t\t<td>"+i+"</td>";
                    html +="</tr>";
                    //System.out.println(lineas[j]);
                    System.out.println("Error en la fila "+(j) +" y columna "+i+" :"+lineas[j].charAt(i));
                }
            }
        }
        html +=finalHTML;
        return html;
    }
    
    /*
    */
    
    static String ReporteLexemas(String texto){
        String html = inicioHTML;
        html +="\n\t<tr style=\"background-color: Violet\">";
        html +="\n\t<td>Lexema</td>\n" +
        "\t\t<td>Token</td>\n" +
        "\t\t<td>Línea</td>\n" +
        "\t\t<td>Columna</td>";
        html +="</tr>";
        
        texto= reemplazarComentarios(texto);
        Scanner lexico  = new Scanner(new BufferedReader( new StringReader(texto)));
        Parser sintactico =new Parser(lexico);
        //System.out.println("Salidas --- "+sintactico.salidas+"---");
        String result = "";
        try {   
            //Se ejecuta el lexico y sintactico.
            
            sintactico.parse();
            
            for (int i = 0; i < sintactico.salidas.size(); i++) {
                result += sintactico.salidas.get(i) + '\n';
            }
        }catch (Exception ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error fatal en compilación de entrada.");
        }
            System.out.println("Resultado << "+result+" >>");
            for (int i = 0; i < lexico.lexemas.size(); i++) {
                /*System.out.println("Lexema: "+lexico.lexemas.get(i).lexema+
                        " | Token: "+lexico.lexemas.get(i).token+
                        " | Fila: "+lexico.lexemas.get(i).fila+
                        " | Columna: "+lexico.lexemas.get(i).columna);*/
                html +="\n\t<tr>";
                html +="\n\t\t<td>"+lexico.lexemas.get(i).lexema+"</td>\n" +
                "\t\t<td>"+lexico.lexemas.get(i).token+"</td>\n" +
                "\t\t<td>"+lexico.lexemas.get(i).fila+"</td>\n" +
                "\t\t<td>"+lexico.lexemas.get(i).columna+"</td>";
                html +="</tr>";
            }

        
        html +=finalHTML;
        return html;
    }  
    static String Traducir(String texto){
        String result = "";
        
        texto= reemplazarComentarios(texto);
        Scanner lexico  = new Scanner(new BufferedReader( new StringReader(texto)));
        Parser sintactico =new Parser(lexico);
        
        try {   
            //Se ejecuta el lexico y sintactico.
            
            sintactico.parse();
            
            for (int i = 0; i < sintactico.salidas.size(); i++) {
                result += sintactico.salidas.get(i) + '\n';
            }
        }catch (Exception ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error fatal en compilación de entrada.");
        }
        
        return agregarTab(result);
    }
    static    String agregarTab(String texto){
        String salida="";
        String [] lineas=texto.split("\n");
        int cTabs =0;
        
        for (String linea : lineas) {
            salida += "\n"+tabulaciones(cTabs) + linea;
            if (linea.contains(":{")) {
                cTabs++;
            } else if (linea.contains("}") && !(linea.contains("{"))) {
                cTabs--;
            }
            salida = salida.replaceAll(";", "");
            salida = salida.replace(":{", ":");            
            //salida = salida.replace("\n}", "\n");            
            salida = salida.replace("\t}", "\t");
        }
        
        return salida;
    }
    
    
    static String tabulaciones(int cantidad){
            String tabulaciones="";
            for(int c=0; c<cantidad;c++){
                tabulaciones+="\t";
            }
            return tabulaciones;
        }
    
}