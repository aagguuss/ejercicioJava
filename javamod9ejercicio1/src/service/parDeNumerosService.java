/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import javamod9ejercicio1.clase.parDeNumeros;

/**
 *
 * @author agust
 */
public class parDeNumerosService {
    Scanner leer = new Scanner(System.in);
    parDeNumeros p1 = new parDeNumeros();

    public parDeNumeros parDeNumerosService() {
        return p1;
    }
    

    public void mostrarValores() {
        System.out.println("valor de A: " + p1.getA() + "valor de  B:  " + p1.getB());
    }

    public double devolverMayor() {
        double may=0;
        if (p1.getA() > p1.getB()) {
            System.out.println("El atributo a es mayor");
            may=p1.getA();
        }
        if (p1.getA() < p1.getB()) {
            System.out.println("el atributo b es mayor");
            may=p1.getB();
        }
        if (p1.getA() == p1.getB()) {
            System.out.println("los valores son iguales");
            may=p1.getA();
        }
        return may;
    }

    public void calcularPotencia() {
        System.out.println("calculando potencia...");
        int a=(int) Math.floor(p1.getA());
        int b=(int) Math.floor(p1.getB());
        if (p1.getA() > p1.getB()) {
            System.out.println(Math.pow(p1.getA(), p1.getB()));
        }
        if (p1.getA() < p1.getB()) {
            System.out.println(Math.pow(p1.getB(), p1.getA()));
        }
    }
    
     public void calculaRaiz (){
         System.out.println("calculando raiz...");
     int a=(int) Math.floor(p1.getA());
        int b=(int) Math.floor(p1.getB());
        if (a > b) {
           System.out.println(Math.floor(Math.pow(b,1.0/ a)));
        }
        if (a < b) {
            
             System.out.println(Math.floor(Math.pow(a,1.0/ b)));
        }
     }
}
