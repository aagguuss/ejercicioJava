/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej;

import java.util.Scanner;
import mod7objetosej.javaobjetos.juego;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo"
 * después de cada intento. El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos necesarios
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 *
 * @author agust
 */
public class mod7Objetosej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        juego j1 = new juego();
        int opcion = leer.nextInt();
        while (opcion == 1) {
            switch (opcion) {
                case 1:
                    j1.iniciarJuego(leer.nextInt());
                    break;
                case 2:
                    System.out.println("La cantidad de partidas ganadas por el jugador 1 es de:"+j1.getP1w());
                    System.out.println("La cantidad de partidas ganadas por el jugador 1 es de:"+j1.getP2w());
            }
        }
    }
}

