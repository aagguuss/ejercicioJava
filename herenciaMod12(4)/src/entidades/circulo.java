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
public  class circulo extends formaGeometrica implements calculoDeFormas{
    int Radio;
    int diametro;

    public circulo(int Radio, int diametro, int Perimetro, int Area) {
        super(Perimetro, Area);
        this.Radio = Radio;
        this.diametro = diametro;
    }

    public circulo(int Radio, int diametro) {
        this.Radio = Radio;
        this.diametro = diametro;
    }

    public int getRadio() {
        return Radio;
    }

    public void setRadio(int Radio) {
        this.Radio = Radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

//    @Override
//    public int calcularAreaCirculo(int Radio) {
//
//    }
//
//    @Override
//    public int calcularPerimetroCirculo(int Diametro) {
//        
//    }
//
//    @Override
//    public int calcularAreaRectangulo(int base, int altura) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public int calcularPerimetroRectangulo(int base, int altura) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
@Override
    public String toString() {
        
        return super.toString()+"circulo{" + "Radio=" + Radio + ", diametro=" + diametro + '}'; 
    }

    @Override
    public int calcularArea() {
        return (int) Math.pow( Math.PI*Radio,2);
    }

    @Override
    public int calcualrPerimetro() {
      return (int)Math.PI*diametro;  
    }
  

    

}
