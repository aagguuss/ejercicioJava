/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej.javaobjetos;

/**
 *
 * @author agust
 */
public class cuenta {

    private int saldo;
    private int Titular;

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(int Titular) {
        this.Titular = Titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getTitular() {
        return Titular;
    }

    public cuenta() {
    }

    public void reitrar_dinero(int dinero) {
        if (saldo - dinero >= 0) {
            saldo = saldo - dinero;
        }
        System.out.println("el saldo retirado es de " + dinero);
    }

}
