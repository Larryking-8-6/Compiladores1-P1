/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generador;

import java.io.File;

/**
 * This class generates a scanner using JFlex.
 * It specifies the path to the JFlex file and calls the method to generate the lexer.
 * 
 * @author Rodrigo Gonzalez
 */
public class G_Scanner {
    
    /**
     * Main method to generate the lexer from a JFlex file.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Specify the path to the JFlex file
        String jflexFilePath = "src/Analizadores/Scanner.jflex";
        
        // Generate the lexer
        generateLexer(jflexFilePath);
    }
    
    /**
     * Generates the lexer from the JFlex file.
     * 
     * @param jflexFilePath The path to the JFlex file.
     */
    public static void generateLexer(String jflexFilePath) {
        File jflexFile = new File(jflexFilePath);
        jflex.Main.generate(jflexFile);
    }
}