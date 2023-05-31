/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author agust
 */
public class PerroArraylist {
     private String raza; 

    public PerroArraylist(String raza ) {
        this.raza = raza;
       
    }
public PerroArraylist() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro   " + "raza: " + raza + '}';
    }
    

}