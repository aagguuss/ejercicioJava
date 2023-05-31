/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod9ejercicio5.objetos;

import java.util.Date;

/**
 *
 * @author agust
 */
public class persona {
    private String nombre;
    private Date nacimiento;

    public persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public int getYear(){
return nacimiento.getYear();
}     

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + '}';
    }
    
}
