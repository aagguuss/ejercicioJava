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
public class clases {
    private double capacidadMáxima, cantidadActual;
      
    public clases() {
    }

    public clases(double capacidadMáxima, double cantidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMáxima(double capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
      
    
}
