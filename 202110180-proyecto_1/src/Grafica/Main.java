/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Grafica;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import Analizadores.Parser;
import Analizadores.Scanner;
import Clases.GraficoBarras;
import Clases.GraficoPie;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase principal del programa.
 * 
 * @author Rodrigo Gonzalez
 */
public class Main {

    public static void main(String[] args) {

        new InterfazInicial().setVisible(true);

        // Ejemplos de entrada
        String jsonInput = "{\n" +
                "   \"Titulo\":\"titulo Pie\",\n" +
                "   \"variable1\": 4.5,\n" +
                "   \"Titulo2\": \"titulo barras\",\n" +
                "   \"variable2\": 5.0\n" +
                "}";
        
        String codigoEjemplo = 
            "void main() {\n" +
            "   int b = 2;\n" +
            "   double a = 4.55;\n" +
            "   int var1 = 5 + 8 * 9;\n" +
            "   bool var2 = true;\n" +
            "   Console.write(a);\n" +
            "}\n\n" +
            "// Ya salió compi1 :)\n\n" +
            "void main() {\n" +
            "   Console.write(a);\n" +
            "   Console.write(5.58);\n" +
            "   Console.write(99);\n" +
            "   Console.write(True);\n" +
            "   Console.write(a + 5);\n" +
            "   Console.write(b + b);\n" +
            "}";

        // Codigo de pruebas
        String codigoPruebas = 
            "Console.Write(\"el valor de a es: \" + a);\n" +
            "a = a + 1;\n";

        System.out.println(codigoPruebas);
        
    }

    // Declaración de listas y gráficos globales
    static List<String> ejeX = new ArrayList<>();
    static List<Double> values = new ArrayList<>();
    public static GraficoPie graficoPieGlobal = new GraficoPie("T", "X", "Y", ejeX, values);
    public static GraficoBarras graficoBarrasGlobal = new GraficoBarras("T", "X", "Y", ejeX, values);
}
