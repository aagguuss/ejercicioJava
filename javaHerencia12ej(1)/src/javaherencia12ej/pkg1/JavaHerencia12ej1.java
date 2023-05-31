/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaherencia12ej.pkg1;

import entidades.Perro;
import entidades.caballo;
import entidades.gato;

/**
 *
 * @author agust
 */
public class JavaHerencia12ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1 = new Perro("indio",10,"Perro");
        Perro p2 = new Perro("ana",5,"Perro");
        caballo c1 = new caballo("loco",15,"caballo");
        gato g1 = new gato("michi",2,"gato");
        p1.mostrarAimentacion();
        p2.mostrarAimentacion();
        g1.mostrarAimentacion();
        c1.mostrarAimentacion();
        
       
    }
    
}
