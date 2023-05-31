/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod10list.pkg3.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agust
 */
public class alumno {

    private String nombre;
    private ArrayList<Integer> Notas=new ArrayList<>();

    public alumno() {
        
    }

    public alumno(String nombre, int a , int b, int c ) {
        this.nombre = nombre;
        
        this.Notas.add(0,a);
        this.Notas.add(1, b);
        this.Notas.add(2, c);
    }

    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", Notas=" + Notas+ '}';
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Integer> Notas) {
        this.Notas = Notas;
    }

}
