/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod9ejercicio4.service;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class fechaService {
    Scanner leer = new Scanner(System.in);

    /**
     *
     * @return
     */
    public Date fechaNacimiento(){
        System.out.println("ingrese su año, mes y dia de nacimiento en ese orden");
    Date D1 = new Date(leer.nextInt()-1900,leer.nextInt(),leer.nextInt());
    return D1;
}
    public Date fechaActual(){
    Date fechaActual = new Date() ;
    return fechaActual;
    }
    public void diferencia(Date A, Date B){
        System.out.println("la diferencia de edad es de : ");
        System.out.println(B.getYear()-A.getYear());
    }
    
            
}
