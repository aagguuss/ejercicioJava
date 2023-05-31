/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class formaGeometrica {
    private int Perimetro;
    private int Area;

    public formaGeometrica(int Perimetro, int Area) {
        this.Perimetro = Perimetro;
        this.Area = Area;
    }

    public formaGeometrica() {
    }

    public int getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(int Perimetro) {
        this.Perimetro = Perimetro;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    @Override
    public String toString() {
        return "formaGeometrica{" + "Perimetro=" + Perimetro + ", Area=" + Area + '}';
    }
    
}
