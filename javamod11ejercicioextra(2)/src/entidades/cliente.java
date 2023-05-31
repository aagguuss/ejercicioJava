/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class cliente {
    
    private String nombre;
    private int edad;
    private int plata;
    private boolean sentado;

    public cliente(String nombre, int edad, int plata) {
        this.nombre = nombre;
        this.edad = edad;
        this.plata = plata;
        this.sentado=false;
    }

    public cliente() {
    }

    public boolean isSentado() {
        return sentado;
    }

    public void setSentado(boolean sentado) {
        this.sentado = sentado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }
    
}
