/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod8ejercicio3;

import java.util.Scanner;
import javamod8ejercicio3.service.personaService;

/**
 *
 * @author agust
 */
public class Javamod8ejercicio3 {

    /**
     * Realizar una clase llamada Persona en el paquete de entidades que tengan
     * los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para
     * mujer, ‘O’ para otro), peso y altura. * Si desea añadir algún otro
     * atributo, puede hacerlo. Agregar constructores, getters y setters. En el
     * paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
     *
     * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
     * devuelve un booleano.
     *
     * Metodo crearPersona(): el método crear persona, le pide los valores de
     * los atributos al usuario y después se le asignan a sus respectivos
     * atributos para llenar el objeto Persona. Además, comprueba que el sexo
     * introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
     * mostrar un mensaje
     *
     *
     * Método calcularIMC(): calculara si la persona está en su peso ideal (peso
     * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor
     * que 20, significa que la persona está por debajo de su peso ideal y la
     * función devuelve un -1. Si la fórmula da por resultado un número entre 20
     * y 25 (incluidos), significa que la persona está en su peso ideal y la
     * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
     * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
     * devuelve un 1.
     *
     *
     * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de
     * tipo Persona con distintos valores, a continuación, llamaremos todos los
     * métodos para cada objeto, deberá comprobar si la persona está en su peso
     * ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para
     * cada objeto si la persona es mayor de edad. Por último, guardaremos los
     * resultados de los métodos calcularIMC y esMayorDeEdad en distintas
     * variables(arrays), para después calcular un porcentaje de esas 4 personas
     * cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos,
     * por encima, y también calcularemos un porcentaje de cuantos son mayores
     * de edad y cuantos menores. Para esto, podemos crear unos métodos
     * adicionales.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("creando Scanner arreglos y Services");
        Scanner leer = new Scanner(System.in);
        boolean[] edades = new boolean[4];
        int[] IMC = new int[4];
        personaService P1 = new personaService();
        personaService P2 = new personaService();
        personaService P3 = new personaService();
        personaService P4 = new personaService();
        System.out.println("ingrese el nombre, el sexo , la edad , el peso  y la altura de la persona ");
        P1.crearPersona(leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextInt(), leer.nextInt());
        System.out.println("ingrese el nombre, el sexo , la edad , el peso  y la altura de la persona ");
        P2.crearPersona(leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextInt(), leer.nextInt());
        System.out.println("ingrese el nombre, el sexo , la edad , el peso  y la altura de la persona ");
        P3.crearPersona(leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextInt(), leer.nextInt());
        System.out.println("ingrese el nombre, el sexo , la edad , el peso  y la altura de la persona ");
        P4.crearPersona(leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextInt(), leer.nextInt());
        System.out.println("confirmando mayoria de edad ...");
        
      
        int may = 0;
        for (int i = 0; i > edades.length; i++) {

            if (i == 0) {
                edades[i] = P1.esMayor();
            }
            if (i == 1) {
                edades[i] = P2.esMayor();
            }
            if (i == 2) {
                edades[i] = P3.esMayor();
            }
            if (i == 3) {
                edades[i] = P4.esMayor();
            }
        }
        for (int i = 0; i > edades.length; i++) {
            if (edades[i] == true) {
                may = may + 1;
            }
            System.out.println("el porcentaje de mayores de edad es de " + may * 100 / 4 + "porciento");
        }
        int ok=0, sobre=0, bajo=0;
        for (int i = 0; i > IMC.length; i++) {
            if (i == 0) {
                IMC[i] = P1.calculaIMC();
            }
            if (i == 1) {
                IMC[i] = P2.calculaIMC();
            }
            if (i == 2) {
                IMC[i] = P3.calculaIMC();
            }
            if (i == 3) {
                IMC[i] = P4.calculaIMC();
            }
            if (IMC[i]==0){
            ok=ok+1;
            }
            if (IMC[i]==-1){
            bajo=bajo+1;
            }
            if (IMC[i]==1){
            sobre=sobre+1;
            }
            
        }
        System.out.println("");

    }
    
    public boolean[] calcularPorcentajes(boolean edades[]){
        int may = 0;
        for (int i = 0; i > edades.length; i++) {

            if (i == 0) {
                edades[i] = P1.esMayor();
            }
            if (i == 1) {
                edades[i] = P2.esMayor();
            }
            if (i == 2) {
                edades[i] = P3.esMayor();
            }
            if (i == 3) {
                edades[i] = P4.esMayor();
            }
        }
        for (int i = 0; i > edades.length; i++) {
            if (edades[i] == true) {
                may = may + 1;
            }
            System.out.println("el porcentaje de mayores de edad es de " + may * 100 / 4 + "porciento");
        }
    return ;
    }
}
