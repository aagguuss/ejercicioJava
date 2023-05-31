/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaisesServicee;

import Paises.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class PaisesService {
    ArrayList<Paises>ListaPaises = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
     public void menu() {
        boolean salir = true;
        int Menu;
        do {
            System.out.println("Ingrese 1 para ingresar paises a la lista ");
            System.out.println("Ingrese 2 para eliminar paises de la lista ");
            System.out.println("Para SALIR ingrese 10");
            Menu = leer.nextInt();
            leer.nextLine();
            switch (Menu) {
                case 1:
                    crearPaises();

                     ordenarAlfabeticamente();
                     mostrarPaises();
                    break;
                case 2:
                    EliminarPais();
                    mostrarPaises();
                    break;
                case 10:      
                    salir = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (salir);
    }
       public void ordenarAlfabeticamente() {
        Collections.sort(ListaPaises, (Paises A, Paises B) -> A.getNombre().compareTo(B.getNombre()));
    }
         public void EliminarPais() {
             String delete=leer.nextLine();
        for (Paises pais : ListaPaises) {
            if (pais.getNombre().equals(delete) ){
              ListaPaises.remove(ListaPaises.indexOf(pais));
            }
            
        }
  
        }
     public void crearPaises(){
      int boton = 0;

        do {
            System.out.println("Ingrese el nombre del pais");
            Paises P1 = new Paises(leer.nextLine());
            ListaPaises.add(P1);
            System.out.println("¿Desea añadir otra pais a la lista ?");
            System.out.println("1-para si |||| 2- para no");
            boton = leer.nextInt();
            leer.nextLine();
        } while (boton == 1);

     }
     public void mostrarPaises(){
       for (Paises paises : ListaPaises) {
            String tostring = paises.toString();
            System.out.println(tostring);
        }
     }
}
