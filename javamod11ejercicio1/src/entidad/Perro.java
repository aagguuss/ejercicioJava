/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author agust
 */
public class Perro {
  private String nombre, raza ;
  private int edad , tamanio;
  private Persona Dueño;

    public Perro(String nombre, String raza, int edad, int tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getDueño() {
        return Dueño;
    }

    public void setDueño(Persona Dueño) {
        this.Dueño = Dueño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    public void adoptar(Persona dueño){
    this.Dueño = dueño;
    }
}
