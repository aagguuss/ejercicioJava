/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumerador;

/**
 *
 * @author agust
 */
public enum enumerador {

A(0),B(1),C(2),D(3),E(4),F(5);
    
private int posicion;

    private enumerador() {
    }

    private enumerador(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
