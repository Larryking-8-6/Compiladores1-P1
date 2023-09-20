/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

public class GraficoBarras {
    private String titulo;
    private String tituloX;
    private String tituloY;
    private List<String> ejeX;
    private List<Double> valores;

    public GraficoBarras(String titulo, String tituloX, String tituloY, List<String> ejeX, List<Double> valores) {
        this.titulo = titulo;
        this.tituloX = tituloX;
        this.tituloY = tituloY;
        this.ejeX = ejeX;
        this.valores = valores;
    }

    // Getters y setters para título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getters y setters para título del eje X
    public String getTituloX() {
        return tituloX;
    }

    public void setTituloX(String tituloX) {
        this.tituloX = tituloX;
    }

    // Getters y setters para título del eje Y
    public String getTituloY() {
        return tituloY;
    }

    public void setTituloY(String tituloY) {
        this.tituloY = tituloY;
    }

    // Getters y setters para el eje X
    public List<String> getEjeX() {
        return ejeX;
    }

    public void setEjeX(List<String> ejeX) {
        this.ejeX = ejeX;
    }

    // Getters y setters para los valores
    public List<Double> getValores() {
        return valores;
    }

    public void setValores(List<Double> valores) {
        this.valores = valores;
    }
}

