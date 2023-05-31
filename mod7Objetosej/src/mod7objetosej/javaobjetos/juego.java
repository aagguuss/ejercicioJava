/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej.javaobjetos;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class juego {

    private int num;
    private int numA;
private int p1w=0;
private int p2w=0;
    public juego() {
    }

    public int getNumA() {
        return numA;
    }

    public int getP1w() {
        return p1w;
    }

    public int getP2w() {
        return p2w;
    }

    public int getNum() {
        return num;
    }

    public void iniciarJuego(int num) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        boolean win = false;
        
        while ((contador <= 3)||(win=true)) {
            System.out.println("adivine el numero ingresado por el jugador 1");
            numA = leer.nextInt();
            if (num == numA) {
                System.out.println("felicidades adivinaste");
                win=true;
                this.p2w=p2w+1;
                System.out.println("el numero de intetnos fue"+contador);
            } else {
                if (numA > num) {
                    System.out.println("buscas un numero mas bajo");
                    contador = contador + 1;
                } else {
                    System.out.println("buscas un numero mas alto");
                    contador = contador + 1;
                }
            }
        }
        if (contador==3){
        this.p1w=p1w+1;
         
        }
    }
}
