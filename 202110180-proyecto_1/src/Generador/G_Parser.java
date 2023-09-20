/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generador;

/**
 * Esta clase genera un parser utilizando Java Cup.
 * Especifica las opciones para Java Cup y ejecuta el generador del parser.
 * 
 * @author Rodrigo González
 */
public class G_Parser {
    
    public static void main(String[] args) {
        // Definir las opciones para Java Cup
        String[] opcionesCup = {
            "-destdir", "src/Analizadores",   // Carpeta de destino
            "-symbols", "sym",                // Carpeta de símbolos
            "-parser", "Parser",             // Carpeta del parser
            "src/Analizadores/Parser.cup"    // Ruta del archivo .cup
        }; 
        
        try {
            // Ejecuta Java Cup
            java_cup.Main.main(opcionesCup);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
}

