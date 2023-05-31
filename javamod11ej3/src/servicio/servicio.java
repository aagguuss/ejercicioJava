/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidades.carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class servicio {

    Scanner leer = new Scanner(System.in);
    Random end = new Random();
    private final ArrayList<carta> Mazo = new ArrayList(); // Creo la lista

    public void menu() {
        boolean salir=false;
        do {
        cargarMazo(Mazo);
        imprimirMenu();
        
        int var = leer.nextInt();
        switch (var) {
            case 1:
                mezclarMazo(end);
                break;
            case 2:
                repartirSiguiente();
                break;
            case 3:
                cartasDisponibles();
                break;
            case 4:
                System.out.println("ingrese la cantidad de cartas que desa repartir ");
                darCartas(leer.nextInt());
                break;
            case 5:
                cartasMonton();
                break;
            case 6:
                mostrarBaraja();
                break;
                case 7:
               salir=Salir();
                break;
            default:
                System.out.println("Error");
        }
        }while (salir);
    }

    public void cargarMazo(ArrayList<carta> Mazo) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 3; j++) {
                if (i > 6 && i < 9) {

                } else {
                    carta C1 = new carta(i + 1, TraducirPalo(j));
                    Mazo.add(C1);
                }
            }
        }
    }

    private String TraducirPalo(int j) {
        String palo = "";
        switch (j) {
            case 0:
                palo = "espada";
                break;
            case 1:
                palo = "basto";
                break;
            case 2:
                palo = "copa";
                break;
            case 3:
                palo = "oro";
                break;
        }
        return palo;

    }// convierto j del bucle for al´palo

    public void mezclarMazo(Random rnd) {
        Collections.shuffle(Mazo, rnd);
    }

    public void repartirSiguiente() {
        int contador = 0;
        int controladorMazo = 0;
        for (carta var : Mazo) {
            if (var.isRepartida() == false) {
                controladorMazo = controladorMazo + 1;
            }
        }

        if (controladorMazo >= 1) {
            for (carta var : Mazo) {
                if (var.isRepartida() == false && contador < 1) {
                    var.setRepartida(true);
                    contador = contador + 1;

                }
            }
        } else {
            System.out.println("no hay mas cartas en el mazo");
        }
    }

    public void cartasDisponibles() {
        int contador = 0;
        for (carta VAR : Mazo) {
            if (VAR.isRepartida() == false) {
                contador = contador + 1;
            }
        }
        System.out.println("las cartas disponibles para reartir son : " + contador);
    }

    public void darCartas(int cantidad) {
        int contador = 0;
        int controladorMazo = 0;
        for (carta var : Mazo) {
            if (var.isRepartida() == false) {
                controladorMazo = controladorMazo + 1;
            }
        }
        if (controladorMazo >= cantidad) {
            for (carta var : Mazo) {
                if (var.isRepartida() == false && contador < cantidad) {
                    var.setRepartida(true);
                    contador = contador + 1;
                }
            }
        } else {
            System.out.println("no hay tal cantidad de cartas en el mazo");
        }
    }

    public void cartasMonton() {
        int controlVacio = 0;
        System.out.println("---Las cartas que ya han sido repartidas son : ----");
        for (carta var : Mazo) {
            if (var.isRepartida() == true) {
                System.out.println("|" + var.getNumero() + "|" + " de " + var.getPalo());
                controlVacio = controlVacio + 1;
            }

        }
        if (controlVacio == 0) {
            System.out.println("Todavia no se ha repartido ninguna carta.");
        }
    }

    public void mostrarBaraja() {
        int controlVacio = 0;
        System.out.println("---Las cartas que se encuentran en la baraja  son : ----");
        for (carta var : Mazo) {
            if (var.isRepartida() == false) {
                System.out.println("|" + var.getNumero() + "|" + " de " + var.getPalo());
                controlVacio = controlVacio + 1;
            }

        }
        if (controlVacio == 0) {
            System.out.println("no queda ninguna carta en el mazo .");
        }
    }
    
    public void imprimirMenu(){
        System.out.println("Bienvenido");
        System.out.println("1- barajar");
        System.out.println("2- Repartir siguiente carta ");
        System.out.println("3- ver cartas del mazo ");
        System.out.println("4- repartir x cantidad de cartas");
        System.out.println("5- ver cartas en la mesa ");
        System.out.println("6- ver cartas del mazo");
        System.out.println("7- Salir");
    }

    private boolean Salir() {
     boolean salir= true;  
        return salir;
    } 
}
