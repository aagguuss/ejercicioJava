/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author agust
 */
public class Pelicula {
    private String  Titulo,Director;
    private double duracionHoras;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public Pelicula() {
    }

    @Override
    public String toString() {
        return "Pelicula|"+Titulo+"| Director:" + Director + ", Duracion de "+duracionHoras+"horas." ;
    }


    public Pelicula(String Titulo, String Director, double duracionHoras) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.duracionHoras = duracionHoras;
    }
    
    
    
}
