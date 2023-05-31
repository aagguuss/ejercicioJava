/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import clases.clases;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class cafeteraService {

    Scanner leer = new Scanner(System.in);
    clases C1 = new clases(1.7,0);   
    
    public void llenarCafetera() {
        
        C1.setCantidadActual(C1.getCapacidadMáxima());
    }
    
    public void servirTaza (double servida){
    if (C1.getCantidadActual()>servida){
        System.out.println("la taza esta llena");
    C1.setCantidadActual(C1.getCantidadActual()-servida);
    }else{
        System.out.println("la taza se lleno con la siguiente cantidad "+C1.getCantidadActual());
    C1.setCantidadActual(0);
    }
        
    }
    
    public void vaciarCafetera(){
    C1.setCantidadActual(0);
    }
    
    public void agregarCafe(double cafeAgregado){
        if (cafeAgregado<C1.getCapacidadMáxima()){
    C1.setCantidadActual(C1.getCantidadActual()+cafeAgregado);
        }else{
        C1.setCantidadActual(C1.getCapacidadMáxima());
        }
    }
    }
