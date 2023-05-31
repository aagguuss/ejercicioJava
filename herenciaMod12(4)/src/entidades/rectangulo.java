/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import interfaces.calculoDeFormas;

/**
 *
 * @author agust
 */
public  class rectangulo extends formaGeometrica implements calculoDeFormas {
 int base;   
 int altura;

    public rectangulo(int base, int altura, int Perimetro, int Area) {
        super(Perimetro, Area);
        this.base = base;
        this.altura = altura;
    }

    public rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        return super.toString()+"rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public int calcularArea() {
        return (base*altura);
    }

    @Override
    public int calcualrPerimetro() {
       return (int) Math.pow(2,base*altura);
    }
    
}
