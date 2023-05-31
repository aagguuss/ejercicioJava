/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class Sala {
    private Asiento[][] Sala = new Asiento[8][6];
    private pelicula Pelicula;

    public Sala() {
    }

    public Asiento[][] getSala() {
        return Sala;
    }

    public void setSala(Asiento[][] Sala) {
        this.Sala = Sala;
    }

    public pelicula getPelicula() {
        return Pelicula;
    }

    public void setPelicula(pelicula Pelicula) {
        this.Pelicula = Pelicula;
    }

    public Sala(pelicula Pelicula) {
        this.Pelicula = Pelicula;
    }
    
}
