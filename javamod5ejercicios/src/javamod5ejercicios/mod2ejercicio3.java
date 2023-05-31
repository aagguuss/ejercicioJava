/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod5ejercicios;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 * @author agust
 */
public class mod2ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int contador1=0;
       int contador2=0;
       int contador3=0;
       int contador4=0;
       int contador5=0;
       Scanner leer = new Scanner(System.in);
       int N = leer.nextInt();
       int [] valores = new int[N];
       for (int i=0;i<N;i++){
           valores[i]=leer.nextInt();
           if ((valores[i]>-1)&&(valores[i]<10)){
               contador1=contador1+1;
       }
           if ((valores[i]>9)&&(valores[i]<100)){
               contador2=contador2+1;
       }
           if ((valores[i]>99)&&(valores[i]<1000)){
               contador3=contador3+1;
       }
           if ((valores[i]>999)&&(valores[i]<10000)){
               contador4=contador4+1;
       }
           if ((valores[i]>9999)&&(valores[i]<100000)){
               contador5=contador5+1;
       }
    }
        System.out.println("La cantidad de numeros de 1 digito es "+contador1);
        System.out.println("La cantidad de numeros de 2 digito es "+contador2);
        System.out.println("La cantidad de numeros de 3 digito es "+contador3);
        System.out.println("La cantidad de numeros de 4 digito es "+contador4);
        System.out.println("La cantidad de numeros de 5 digito es "+contador5);
     }
}
