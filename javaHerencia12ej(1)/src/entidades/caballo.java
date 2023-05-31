/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class caballo extends Animal {
    
    public caballo(String nombre,  int edad,String raza) {
        super(nombre, "herbivoro", edad, raza);
    }

    @Override
    public void mostrarAimentacion() {
        super.mostrarAimentacion(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
