/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import javamod8ejercicio4.clases.raices;

/**
 *
 * @author agust
 */
public class raicesService {

    Scanner leer = new Scanner(System.in);
    raices r1 = new raices(leer.nextInt(), leer.nextInt(), leer.nextInt());

    public double getDiscriminante() {
        return Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getB();
    }

    public boolean tieneRaiz() {
        boolean ret = true;
        if (getDiscriminante() == 0) {
            ret = false;
        } else {
        }
        return ret;
    }

    public void obtenerRaices() {
        if (tieneRaiz() == true) {
            System.out.println(Math.pow(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()), 1.0 / r1.getB()) + " y   " + Math.pow(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()), -1.0 / r1.getB()));

        }
    }
    
}
