
package Grafica;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarGrafico {
    
    public static void writeToFile(String fileName, String text) {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(fileName))) {
            buffer.write(text);
            System.out.println("Se guardo pero esto no hace nada.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("No se guardo.");
        }
    }

    public static void writeToFile(String fileName, byte[] data) throws FileNotFoundException, IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(data);
            System.out.println("Archivo binario guardado exitosamente.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Archivo no encontrado.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al guardar el archivo binario.");
        }
    }
}

