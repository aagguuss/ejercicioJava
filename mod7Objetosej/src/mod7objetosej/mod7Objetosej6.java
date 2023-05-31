/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej;

import java.util.Scanner;
import mod7objetosej.javaobjetos.punto;

/**
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos. Para conocer como calcular la distancia entre dos
 * puntos consulte el siguiente link:
 *
 * @author agust
 */
public class mod7Objetosej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        punto P1 = new punto();
        punto P2 = new punto();
        P1.crearPuntos(leer.nextInt(), leer.nextInt());
        P2.crearPuntos(leer.nextInt(), leer.nextInt());
        System.out.println( P1.calcularDistancia(P1.getX(), P1.getY(),P2.getX(),P2.getY()));
        
    }

}
