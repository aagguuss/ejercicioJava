/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod5ejercicios;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class javamod5ejercio4 {

    /**Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
     * y muestre la traspuesta de la matriz. 
     * La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando
     * sus filas por columnas (o viceversa).

     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] valores = new int[4][4];
       for (int i=0;i<4;i++){
           for (int j=0;j<4;j++){
       valores[i][j]= (int) (Math.random()*10);
        }
       }
       for (int i=0;i<4;i++){
             for (int j=0;j<4;j++){
           System.out.print(valores[i][j]+"  ");
             }
             System.out.println("");
             
       }
        for (int i=0;i<4;i++){
             for (int j=0;j<4;j++){
           System.out.print(valores[j][i]+"  ");
             }
             System.out.println("");
             
       }
    }
    
}
