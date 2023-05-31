/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej;

import java.util.Scanner;
import mod7objetosej.javaobjetos.rectangulo;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 *
 * @author agust
 */
public class mod7Objetosej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
            rectangulo R1 = new rectangulo();
          do       
           R1.crearRectangulo(leer.nextInt(), leer.nextInt());
         while (R1.validacion(R1.getBase(), R1.getAltura()));
            System.out.println(R1.calcularPerimetro(R1.getBase(), R1.getAltura()));
            System.out.println(R1.calcularSuperfice(R1.getBase(), R1.getAltura()) + " cuadrados");
            R1.imprimirCuadrado(R1.getBase(), R1.getAltura());

        }

    
}
