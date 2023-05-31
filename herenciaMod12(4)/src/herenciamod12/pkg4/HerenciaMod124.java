/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciamod12.pkg4;

import entidades.circulo;
import entidades.formaGeometrica;
import entidades.rectangulo;

/**
 *
 * @author agust
 */
public class HerenciaMod124 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circulo c = new circulo(5, 10);
        c = new circulo(5, 10, c.calcualrPerimetro(), c.calcularArea());
        rectangulo r = new rectangulo(5, 10);
        r = new rectangulo(5, 10, r.calcualrPerimetro(), r.calcularArea());
        System.out.println(c.toString());
        System.out.println(r.toString());
    }

}
