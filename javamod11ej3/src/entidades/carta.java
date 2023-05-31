/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class carta {
    private int numero;
    private String Palo;
    boolean repartida= false;

    public int getNumero() {
        return numero;
    }

    public boolean isRepartida() {
        return repartida;
    }

    public void setRepartida(boolean repartida) {
        this.repartida = repartida;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return Palo;
    }

    public void setPalo(String Palo) {
        this.Palo = Palo;
    }

    public carta(int numero, String Palo) {
        this.numero = numero;
        this.Palo = Palo;
    }
    
}
