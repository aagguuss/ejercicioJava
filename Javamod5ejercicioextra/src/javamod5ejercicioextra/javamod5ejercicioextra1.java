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
public class javamod5ejercicioextra1 {

    /**Escriba un programa que averigüe si dos vectores de N enteros son iguales 
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int buscador=0;
        Scanner leer = new Scanner(System.in);
        int N= leer.nextInt();
        int [] vector = new int [N];
        for (int i=0;i<N;i++){
        vector[i]=leer.nextInt();
        }
        do{
        buscador=leer.nextInt();
        for (int i=0;i<N;i++){
            if (i!=buscador){
                
        if((vector[i])==vector[buscador]){
            System.out.println("Se encontro una coincidencia");
           break;
        }
            }
        }
        buscador=leer.nextInt();
        }while (buscador !=-1);
    }
    
}

