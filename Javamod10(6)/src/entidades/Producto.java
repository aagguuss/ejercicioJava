/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author agust
 */
public class Producto {

    private String nombre;
    private int Precio;

    public Producto() {
    }

    public Producto(String nombre, int Precio) {
        this.nombre = nombre;
        this.Precio = Precio;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
 
}
