/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author agust
 */
public class CuentaBancaria {

    private int numeroCuenta;
    private int dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

}
