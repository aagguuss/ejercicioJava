/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej.javaobjetos;

/**
 *Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método 
 * "calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un
 * objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y 
 * imprime el área del rectángulo.

 * @author agust
 */
public class rectanguloB {
    private int lado1;
    private int lado2;
  
    public int calcularSuperfice() {
        rectangulo Rec = new rectangulo(6,4);
        Rec.imprimirCuadrado(lado1,lado2);
        return (lado1 * lado2);
    }  
}

  