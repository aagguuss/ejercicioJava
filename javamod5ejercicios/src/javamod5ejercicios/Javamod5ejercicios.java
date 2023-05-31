/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod5ejercicios;

/**Realizar un algoritmo que llene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.

 *
 * @author agust
 */
public class Javamod5ejercicios {

    /**Realizar un algoritmo que llene un vector con los 100 primeros números enteros
     * y los muestre por pantalla en orden descendente.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numeros =new int [101];
        for(int i=100; i < numeros.length ;i--){
           numeros[i]=i;
        System.out.println(numeros[i]);
       }
    }
    
}
