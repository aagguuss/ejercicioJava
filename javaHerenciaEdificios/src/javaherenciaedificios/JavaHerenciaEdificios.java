/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaherenciaedificios;

import entidades.edificio;
import entidades.edificioOficinas;
import entidades.polideportivo;
import java.util.ArrayList;


/**
 *
 * @author agust
 */
public class JavaHerenciaEdificios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<edificio> listaEdificio= new ArrayList();
       polideportivo p1 = new polideportivo(20,10,15,true);
       polideportivo p2 = new polideportivo(25,15,10,false);
       edificioOficinas e1 = new edificioOficinas(6,10,3,2,16,7,20);
       edificioOficinas e2 = new edificioOficinas(9,10,3,3,16,7,20);
       listaEdificio.add(e2);
       listaEdificio.add(e1);
       listaEdificio.add(p1);
       listaEdificio.add(p2);
       int contTechado=0;
       int contSinTecho=0;
       
        for (edificio var : listaEdificio) {
             System.out.println(var.calcularSuperficie());
            System.out.println(var.calcularVolumen());
              if (var instanceof polideportivo){
                   System.out.println(((polideportivo) var).isTechado());
                  if (((polideportivo) var).isTechado()==true){
                  contTechado=contTechado+1;
                  }
                   if (((polideportivo) var).isTechado()==false){
                  contSinTecho=contSinTecho+1;
                  }
           
        }
              if (var instanceof edificioOficinas){
                  ((edificioOficinas) var).cantidadPersonas();
              }
        }
          
       
    }
    
}
