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
public class servicioConsigna {
    ArrayList<electrodomesticos> listaElectrodomesticos = new ArrayList();
    public void menu(){
    Lavadora l1 = new Lavadora();
    l1=new Lavadora(25, l1.precioFinal("A", 50, 25), 50, "blanca", "A");
    listaElectrodomesticos.add(l1);
    Lavadora l2 = new Lavadora();
     l2=new Lavadora(20, l2.precioFinal("B", 30, 20), 30, "Blanca", "B");
     listaElectrodomesticos.add(l2);
    televisor t1 = new televisor();
    t1=new televisor(43,true,t1.precioFinal("A", 50, true, 43),50,"blanco","A");
   listaElectrodomesticos.add(t1);
    televisor t2 = new televisor();
    t2 = new televisor (50 ,true, t1.precioFinal("B", 30, true, 50),30,"negro","B");
    listaElectrodomesticos.add(t2);
     int contPrecioTotal=0;
                    for (electrodomesticos aux : listaElectrodomesticos) {
                        System.out.println("Electrodomestico " + listaElectrodomesticos.indexOf(aux) + " posee el precio de " + aux.getPrecio());
                        contPrecioTotal=contPrecioTotal+aux.getPrecio();
                    }
                    System.out.println("El precio total :"+contPrecioTotal);
    }
}
