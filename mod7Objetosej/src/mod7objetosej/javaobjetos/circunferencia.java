/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej.javaobjetos;

public class circunferencia {

    private int radio;
    private double area;
    private double perimetro;

    public circunferencia(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int crearCircunferencia(int radio) {
        this.radio = radio;
        return radio;
    }

    public double construirArea(double area) {
        this.area = (3.14 * radio) * 2;
        return area;
    }

    public double construirPerimetro(double perimetro) {
        this.perimetro = 2 * 3.14 * radio;
        return perimetro;
    }
}
