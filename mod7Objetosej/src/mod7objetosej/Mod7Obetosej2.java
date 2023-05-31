/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej;

import java.util.Scanner;
import mod7objetosej.javaobjetos.circunferencia;

public class Mod7Obetosej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //trs maneras de ingresar informacion a ls artibutos de la clase 
        // constructor , setter y metodo
        circunferencia r1 = new circunferencia(leer.nextInt());
        r1.setRadio(leer.nextInt());
        r1.crearCircunferencia(leer.nextInt());
        //
        r1.construirArea(r1.getRadio());
        //
        r1.construirPerimetro(r1.getRadio());
    }

}
