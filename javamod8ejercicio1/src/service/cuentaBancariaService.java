/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import clases.CuentaBancaria;

import java.util.Scanner;

/**
 *
 * @author agust
 */
@SuppressWarnings("InitializerMayBeStatic")
public class cuentaBancariaService {

    private Scanner leer = new Scanner(System.in);
    CuentaBancaria C1 = new CuentaBancaria();

    public CuentaBancaria crearCuenta(int numeroCuenta, int dniCliente, double saldoActual) {
        C1.setNumeroCuenta(numeroCuenta);
        C1.setDniCliente(dniCliente);
        C1.setSaldoActual(saldoActual);
        return C1;
    }

    public void ingresar(double saldoIgreso) {
        C1.setSaldoActual(saldoIgreso + C1.getSaldoActual());
    }

    public void retirar(double saldoEgreso) {
        boolean retiro = true;
        int respuesta=0;
        do {
            if (C1.getSaldoActual() - saldoEgreso >= 0) {
                retiro=true;
                C1.setSaldoActual(C1.getSaldoActual() - saldoEgreso);
            } else {
                System.out.println("usted no puede retirar esa cantidad de dinero ingrese una canitad igual o menor a " + C1.getSaldoActual());
                retiro = false;
                 System.out.println("ingrese 0 si quiere reirar o ingrese 1 si quiere salir");
                 respuesta=leer.nextInt();
                 if(respuesta==0){
                System.out.println("ingrese el saldo que desea retirar ");
                saldoEgreso = leer.nextDouble();
                 }
            }
           
        } while ((retiro == false)||(respuesta==0));
    }
    
    public void extraccionRapida(double saldoEgreso) {
        boolean retiro = true;
        do {
            if (C1.getSaldoActual() - saldoEgreso > C1.getSaldoActual()*0.20) {
                 retiro=true;
                C1.setSaldoActual(C1.getSaldoActual() - saldoEgreso);
            } else {
                System.out.println("usted no puede retirar esa cantidad de dinero ingrese una canitad igual o menor a " + C1.getSaldoActual()*0.20);
                retiro = false;
                System.out.println("ingrese el saldo que desea retirar ");
                saldoEgreso = leer.nextDouble();
            }
        } while (retiro == false);
    }
    
    public void consultarSaldo(){
        System.out.println("su saldo es "+ C1.getSaldoActual());
    }
     
    public void consultaDatos(){
        System.out.println("su numero de Dni es : "+C1.getDniCliente());
        System.out.println("su numero de cuenta es : "+C1.getNumeroCuenta());
        System.out.println("su saldo es :  "+C1.getSaldoActual());
        
    }
}
