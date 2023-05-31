/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamo9ejercicioextra.objetos.objestoService;

import java.util.Scanner;
import javamo9ejercicioextra.objetos.ahorcado;

/**
 *
 * @author agust
 */
public class ahorcadoService {

    Scanner leer = new Scanner(System.in);
    int letrasEncontradas = 0, intentosFallidos = 0;

    public ahorcado crearJuego(String palabra, int maximas) {
        System.out.println();

        ahorcado A = new ahorcado(palabra.split(""), maximas, palabra.length());
        return A;
    }

    public void longitud(ahorcado A) {

        System.out.println("la longitud de la palabra es de " + A.getPalabraA().length);
    }

    public void imprimirPalabraEncontrada(ahorcado A) {
        System.out.println("Usted ha encontrado :" + letrasEncontradas + " letras del ahorcado, le restan " + (A.getPalabraA().length - letrasEncontradas));
        for (int i = 0; i < A.getPalabraA().length; i++) {
            if ((A.getPalaraD(i) == null)) {
                System.out.print("-");
            } else {
                System.out.print(A.getPalaraD(i));
            }

        }
        System.out.println("");
    }

    public void encontradas(String a, ahorcado A) {
        boolean encontrado = false;
        String aa = " ";
        for (int i = 0; i < A.getPalabraA().length; i++) {
            if (A.getPalabraA()[i].equals(a)) {
                A.setPalabraA(aa, i);
                letrasEncontradas = letrasEncontradas + 1;
                A.setPalaraD(a, i);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            intentosFallidos = intentosFallidos + 1;
        }

    }

    public void intentos(ahorcado A) {
        System.out.println("A usted le quedan " + (A.getJmaximas() - intentosFallidos) + " intentos para adivinar la palabra.");
    }

    public void juego() {
        System.out.println("Jugador 1 ingrse la palabra a adivinar");
        System.out.println("luego los intentos para adivinarla");
        ahorcado A = crearJuego(leer.nextLine(), leer.nextInt());
        longitud(A);
        System.out.println("jugador 2 ingrese una letra");
        while ((A.getJmaximas() != intentosFallidos) && (letrasEncontradas != A.getPalabraA().length)) {
            encontradas(leer.next(), A);
            imprimirPalabraEncontrada(A);
            intentos(A);
        }
        if (A.getJmaximas() == intentosFallidos) {
            System.out.println("perdiste suerte la proxima");
        }
        if (letrasEncontradas==A.getPalabraA().length) {
            System.out.println("Ganaste Felicidades sos el rey del ahorcado");
        }
    }
}
