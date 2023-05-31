/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod8ejercicio1;

import clases.CuentaBancaria;
import service.cuentaBancariaService;
import java.util.Scanner;

/**
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los
 * siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
 * saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 * Método para crear cuenta pidiéndole los datos al usuario. Método
 * ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al
 * saldo actual. Método retirar(double): recibe una cantidad de dinero a retirar
 * y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero
 * a retirar se retirará el máximo posible hasta dejar la cuenta en 0. Método
 * extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el
 * usuario no saque más del 20%. Método consultarSaldo: permitirá consultar el
 * saldo disponible en la cuenta. Método consultarDatos: permitirá mostrar todos
 * los datos de la cuenta.
 *
 *
 *
 *
 *
 * @author agust
 */
public class Javamod8ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cuentaBancariaService c1 = new cuentaBancariaService();
        System.out.println("ingrese ");
        CuentaBancaria C1 = c1.crearCuenta(leer.nextInt(), leer.nextInt(), leer.nextDouble());
        System.out.println("ingrese saldo");
        c1.ingresar(leer.nextDouble());
        System.out.println("retire saldo");
        c1.retirar(leer.nextDouble());
        System.out.println("retire saldo rapidamente");
        c1.extraccionRapida(leer.nextDouble());
        System.out.println("consultando saldo");
        c1.consultarSaldo();
        System.out.println("Consultando datos");
        c1.consultaDatos();
    }
    
}
