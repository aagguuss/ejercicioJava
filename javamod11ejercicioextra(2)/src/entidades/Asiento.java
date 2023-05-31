/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class Asiento {
    private String columnas;
    private int Filas;
    private cliente espectador;

    public String getColumnas() {
        return columnas;
    }

    public void setColumnas(String columnas) {
        this.columnas = columnas;
    }

    public int getFilas() {
        return Filas;
    }

    public void setFilas(int Filas) {
        this.Filas = Filas;
    }

    public cliente getEspectador() {
        return espectador;
    }

    public void setEspectador(cliente espectador) {
        this.espectador = espectador;
    }

    public Asiento(String columnas, int Filas) {
        this.columnas = columnas;
        this.Filas = Filas;
    }
    
}
