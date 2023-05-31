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
public class rectangulo {

    private int base;
    private int altura;

    public rectangulo() {
    }

    public rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calcularSuperfice(int base, int altura) {
        return (base * altura);
    }

    public int calcularPerimetro(int base, int altura) {
        return ((base + altura) * 2);
    }

    public void imprimirCuadrado(int base, int altura) {
        System.out.println("Dibujando cuadrado");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if ((i > 0) && (i < altura - 1) && (j > 0) && (j < base - 1)) {
                    System.out.print("  ");
                }
                if ((i == 0) || (i == altura - 1) || (j == 0) || (j == base - 1)) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
    public boolean validacion (int base, int altura){
    boolean V=true;
    if ( base != altura ){
    V=false;
                } else{
        System.out.println("error usted  ingreso un cuadrado");
        }
    return V;
}
}
