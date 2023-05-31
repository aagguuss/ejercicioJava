/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod8ejercicio3.service;

import java.util.Scanner;
import javamod8ejercicio3.entidades.persona;

/**
 *
 * @author agust
 */
public class personaService {

    Scanner leer = new Scanner(System.in);
    persona p1 = new persona();

    public personaService() {
    }

   

    public boolean esMayor() {
        boolean respuesta = false;
        if (p1.getEdad() >= 18) {
            respuesta = true;
            return respuesta;
        } else {
            return respuesta;
        }
    }

    public persona crearPersona(String nombre, String sexo, int edad, int peso, int altura) {
        
        p1.setNombre(nombre);
        boolean inf = false;
        do {

            if (sexo != "H" || sexo != "M") {
                System.out.println("usted a ingresado mal el sexo de la persona ingrese H para hombre y M para mujer ");
                sexo = leer.nextLine();

            } else {
                inf = true;
                p1.setSexo(sexo);
            }
        } while (inf == false);

        p1.setEdad(edad);
        p1.setPeso(peso);
        p1.setAltura(altura);

        return p1;
    }

    public int calculaIMC() {
        int respuesta = 0;
        if (p1.getPeso() / p1.getAltura() * 2 < 20) {
            respuesta = -1;
        }
        if (p1.getPeso() / p1.getAltura() * 2 > 25) {
            respuesta = 1;
        }

        return respuesta;
    }
}
