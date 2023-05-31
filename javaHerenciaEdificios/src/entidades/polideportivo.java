/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class polideportivo extends edificio{
    boolean techado;

    public polideportivo(int ancho, int alto, int largo,boolean techado) {
        super(ancho, alto, largo);
        this.techado=techado;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public int getAncho() {
        return ancho;
    }

    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public int getAlto() {
        return alto;
    }

    @Override
    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public int getLargo() {
        return largo;
    }

    @Override
    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public int calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public int calcularVolumen() {
       return ancho*largo*alto;
    }
    
    
}
