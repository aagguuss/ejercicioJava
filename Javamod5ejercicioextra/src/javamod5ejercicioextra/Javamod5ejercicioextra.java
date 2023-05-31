/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod5ejercicioextra;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Javamod5ejercicioextra {

    /**Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
     * con los valores ingresados por el usuario.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int N =leer.nextInt();
       int [] vector = new int [N]; 
       for  (int i=0; i>N;i++){
       vector[i]=leer.nextInt();
       }
           
    }
    
}
