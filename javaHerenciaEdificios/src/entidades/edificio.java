/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
 public abstract class edificio {
    protected int ancho;
    protected int alto;
    protected int largo;

    public edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    
  abstract  public int calcularSuperficie();
  
    
 abstract   public int calcularVolumen();
}
