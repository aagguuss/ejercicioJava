/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private String color;
    private String tipo;
    private int anio;
    private int chasis;
    private int motor;
    private Cliente C1;

    public Vehiculo(String marca, String modelo, String color, String tipo, int anio, int chasis, int motor, Cliente C1) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.anio = anio;
        this.chasis = chasis;
        this.motor = motor;
        this.C1 = C1;
    }

    public Cliente getC1() {
        return C1;
    }

    public void setC1(Cliente C1) {
        this.C1 = C1;
    }

   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

}
