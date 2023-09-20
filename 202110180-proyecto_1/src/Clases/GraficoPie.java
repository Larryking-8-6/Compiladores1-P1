/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

public class GraficoPie {
    private String titulo;
    private String tituloEjeX;
    private String tituloEjeY;
    private List<String> ejeX;
    private List<Double> valores;

    public GraficoPie(String titulo, String tituloEjeX, String tituloEjeY, List<String> ejeX, List<Double> valores) {
        this.titulo = titulo;
        this.tituloEjeX = tituloEjeX;
        this.tituloEjeY = tituloEjeY;
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
    public String getTituloEjeX() {
        return tituloEjeX;
    }

    public void setTituloEjeX(String tituloEjeX) {
        this.tituloEjeX = tituloEjeX;
    }

    // Getters y setters para título del eje Y
    public String getTituloEjeY() {
        return tituloEjeY;
    }

    public void setTituloEjeY(String tituloEjeY) {
        this.tituloEjeY = tituloEjeY;
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