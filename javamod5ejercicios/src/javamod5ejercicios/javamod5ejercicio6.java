/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod5ejercicios;

import java.util.Scanner;

/**Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
 * sus columnas y sus diagonales son idénticas. 
 * Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.

 *
 * @author agust
 */
public class javamod5ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner leer= new Scanner(System.in);
        int[][] valores = new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                do{
                    valores[i][j]=leer.nextInt();
                }while((valores[i][j]>0)&&(valores[i][j]<9));
            }
        }
        int fila1=valores[0][0]+valores[0][1]+valores[0][2];
        int fila2=valores[1][0]+valores[1][1]+valores[1][2];
        int fila3=valores[2][0]+valores[2][1]+valores[2][2];
        int columna1=valores[0][0]+valores[1][0]+valores[2][0];
        int columna2=valores[0][1]+valores[1][1]+valores[2][1];
        int columna3=valores[0][2]+valores[1][2]+valores[2][2];
        int diagonal1=valores[0][0]+valores[1][1]+valores[2][2];
        int diagonal2=valores[0][0]+valores[1][1]+valores[2][2];
        if((fila1==fila2)==(fila3==columna1)==(columna2==columna3)==(diagonal1==diagonal2)){
            System.out.println("el cuadrado es magico");
        }else{
            System.out.println("el cuadrado no es magico");
        }
    }
}


  


