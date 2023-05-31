/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoService;

import java.util.Date;
import java.util.Scanner;
import javamod9ejercicio5.objetos.persona;

/**
 *
 * @author agust
 */
public class personaService {

    Scanner leer = new Scanner(System.in);

    public persona crearPersona() {
        System.out.println("ingrese su fecha de nacimiento en el siguiente orden : año , mes , dia .");
        Date D1 = new Date(leer.nextInt() - 1900, leer.nextInt(), leer.nextInt());
        System.out.println("ingrese su nombre y apellido ");
        persona P1 = new persona(leer.nextLine(), D1);
        return P1;
    }

    public void calcularEdad(persona p1) {
        Date Da = new Date();
        System.out.println("es edad es de ...");
        System.out.println(Da.getYear()-p1.getYear());
    }
    
    public boolean menorQue ( persona p1 , int edad){
    boolean mQ=false;
    System.out.println("¿es la persona menor que la edad que ingreso?");
    if (p1.getYear()<edad ){  
    mQ=true;
    }
    if (p1.getYear()==edad){
        System.out.println("usted ha adivinado la edad de la persona ");
    }
    return mQ ;
    }
    
    public void mostrarPersona (persona p1){
    p1.toString();
    
    }
}
