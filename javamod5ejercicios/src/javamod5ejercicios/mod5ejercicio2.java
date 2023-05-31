/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod5ejercicios;

import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y
 * le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 * @author agust
 */
public class mod5ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int N = leer.nextInt();
       int [] valores = new int[N];
       for (int i=0;i<N;i++){
       valores[i]= (int) (Math.random()*5);
       }
       String seguir="no";
       while ("si".equals(seguir)){
       int num = leer.nextInt();
       int contador= 0;
       for (int i=0;i<N;i++){
           //
           if (num==valores[i]){
           } else {
               System.out.println("el numero se encuentra en la posicion"+i);
               contador=contador+1;
           }
       }
       if (contador >1){
           System.out.println("El numero esta repetido ");
       }
           System.out.println("Desea continuar");
         seguir=leer.nextLine();
         seguir= seguir.toLowerCase();
    }
    } 
}
