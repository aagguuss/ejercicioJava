/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod9ejercicio3;

import service.arregloService;

/**
 * rear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo
 * B de 20 números reales. Crear la clase ArregloService, en el paquete
 * servicio, con los siguientes métodos: Método inicializarA recibe un arreglo
 * por parámetro y lo inicializa con números aleatorios. Método mostrar recibe
 * un arreglo por parámetro y lo muestra por pantalla. 
 * Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 * Método inicializarB copia
 * los primeros 10 números del arreglo A en el arreglo B. Luego llenar las
 * últimas 10 posiciones del arreglo B con 0.5. En el Main nuevamente:
 * inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 *
 *
 * @author agust
 */
public class Javamod9ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] a = new double[50];
        double[] b = new double[20];
        arregloService A1 = new arregloService();
        System.out.println("inicializando a ");
        A1.incializarArreglo(a);
        System.out.println("inicializando b ");
        A1.incializarArreglo(b);
        System.out.println("imprimiendo a ");
        A1.imprimirArreglo(a);
        System.out.println("imprimiendo b  ");
        A1.imprimirArreglo(b);
        A1.ordenar(a);
        A1.ordenar(b);
        System.out.println("segund inicializacion");
        A1.inicializarB(a, b);
        System.out.println("imprimiendo a ");
        A1.imprimirArreglo(a);
        System.out.println("imprimiendo b  ");
        A1.imprimirArreglo(b);
    }

}
