/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class Perro extends Animal {
    
    public Perro(String nombre,  int edad, String raza) {
        super(nombre, "omnivoro", edad, raza);
    }
    @Override
    public void mostrarAimentacion() {
        super.mostrarAimentacion(); 
    }

}
