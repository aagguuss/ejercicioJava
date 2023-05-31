/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class PeliculaServicio {

    ArrayList<Pelicula> cartelera = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void menu() {
        boolean salir = true;
        int Menu;
        do {
            System.out.println("Ingrese 1 para ingresar peliculas a la cartalera ");
            System.out.println("Ingrese 2 para mostrar la cartelera ");
            System.out.println("ingrese 3 para ordenarlas de mayor a menor duracion");
            System.out.println("ingrese 4 para ordenarlas de menor a mayor duracion");
            System.out.println("ingrese 5 para ordenar alfabeticamente por titulo");
            System.out.println("ingrese 6 para ordenar alfabeticaente por director ");
            System.out.println("ingrese 7 para ver las peliculas que duren mas de una hora");
            System.out.println("Para SALIR ingrese 10");
            Menu = leer.nextInt();
            leer.nextLine();

            switch (Menu) {
                case 1:
                    crearPelicula();
                    mostrarCartelera();
                    break;
                case 2:
                    mostrarCartelera();
                    break;
                case 3:
                    ordenarDeMayorDuracionaMenor();
                    mostrarCartelera();
                    break;
                case 4:
                    ordednarDeMenoraMayor();
                    mostrarCartelera();
                    break;
                case 5:
                    ordenarPorTitulo();
                    mostrarCartelera();
                    break;
                case 6:
                    ordenarPorDirector();
                    mostrarCartelera();
                    break;
                case 7:
                    mostrar1Hs();
                    break;
                case 10:
                    salir = false;
                    break;
                default:
                    throw new AssertionError();
            }

        } while (salir);
    }

    public void crearPelicula() {
        int boton = 0;

        do {
            System.out.println("Igrese el titulo de la pelicula, seguido de su director y por ultimo ingrese la duracion en horas .");
            Pelicula P1 = new Pelicula(leer.nextLine(), leer.nextLine(), leer.nextDouble());
            cartelera.add(P1);
            System.out.println("¿Desea añadir otra pelicula a la cartelera ?");
            System.out.println("1-para si |||| 2- para no");
            boton = leer.nextInt();
            leer.nextLine();
        } while (boton == 1);

    }

    public void mostrarCartelera() {
        for (Pelicula pelicula : cartelera) {
            String tostring = pelicula.toString();
            System.out.println(tostring);
        }
    }

    public void mostrar1Hs() {
        for (Pelicula pelicula : cartelera) {
            if (pelicula.getDuracionHoras()>1 ){
                System.out.println(pelicula.toString());
            }
            
        }
        //no anda
//        Iterator<Pelicula>  it = cartelera.iterator();
//        while (it.hasNext()) {
//            if (it.next().getDuracionHoras() < 1) {
//                System.out.println(it.next().toString());
//            }
        }

    

    public void ordenarDeMayorDuracionaMenor() {
        Collections.sort(cartelera, (Pelicula A, Pelicula B) -> Double.compare(B.getDuracionHoras(), A.getDuracionHoras()));
    }

    public void ordednarDeMenoraMayor() {   
  Collections.sort(cartelera, (Pelicula A, Pelicula B) -> Double.compare(A.getDuracionHoras(), B.getDuracionHoras()));
    }

    public void ordenarPorTitulo() {
        Collections.sort(cartelera, (Pelicula A, Pelicula B) -> A.getTitulo().compareTo(B.getTitulo()));
    }

    public void ordenarPorDirector() {
        Collections.sort(cartelera, (Pelicula A, Pelicula B) -> A.getDirector().compareTo(B.getDirector()));
    }

}
