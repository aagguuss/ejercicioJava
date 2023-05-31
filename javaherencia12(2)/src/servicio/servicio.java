/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidades.Lavadora;
import entidades.electrodomesticos;
import entidades.televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class servicio {

    Scanner leer = new Scanner(System.in);
    ArrayList<electrodomesticos> listaElectrodomesticos = new ArrayList();
    
    
    public void menu() {
        boolean salir = false;
        while (salir == false) {
            System.out.println("1)- nuevo televisor 2)-nueva lavadora 3)- ver electrodomesticos 4)- salir ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1 -> {
                    televisor t1 = new televisor();
                    t1 = t1.crearTelevisor();
                    listaElectrodomesticos.add(t1);
                }
                case 2 -> {
                    Lavadora l1 = new Lavadora();
                    l1 = l1.crearLavadora();
                    listaElectrodomesticos.add(l1);
                }
                case 3 -> {
                    int contPrecioTotal=0;
                    for (electrodomesticos aux : listaElectrodomesticos) {
                        System.out.println("Electrodomestico " + listaElectrodomesticos.indexOf(aux) + " posee el precio de " + aux.getPrecio());
                        contPrecioTotal=contPrecioTotal+aux.getPrecio();
                       
                    }
                    System.out.println("El precio total :"+contPrecioTotal);
//                        System.out.println("la lavadora (" + listaLavadoras.indexOf(aux) + ") posee el precio de " + aux.getPrecio() + " es de color " + aux.getColor() + " su consumo energetico es de  tipo "
//                                + aux.getConsumo().toUpperCase() + " y la carga del lavarropas es de: " + aux.getCarga() + " y el peso es de :" + aux.getPeso());
//                
//                    
//                        System.out.println("el televisor (" + listaTelevisores.indexOf(aux) + ") posee el precio de " + aux.getPrecio() + " es de color " + aux.getColor() + "  su consumo energetico es de tipo "
//                                + aux.getConsumo() + "el televisor es de:" + aux.getPulgadas() + " pulgadas " + " y el peso es de :" + aux.getPeso());
//                        if (aux.isTdt() == true) {
//                            System.out.println(" posse transmisor TDT");

                }
                case 4->{
                salir=true;
            }
        }

    }
}
}
