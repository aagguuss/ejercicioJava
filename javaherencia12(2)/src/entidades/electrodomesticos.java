/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class electrodomesticos {

    protected Scanner leer = new Scanner(System.in);
    protected int precio;
    protected int peso;
    protected String color;
    protected String consumo;

    public electrodomesticos() {
    }

    public electrodomesticos(int precio, int peso, String color, String consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public electrodomesticos crearElecrodomestico() {
        int Precio = 0;
        
        System.out.println("ingrese el peso del eletctrodomestico");
        int Peso = leer.nextInt();
        System.out.println("¿de que color quiere el electrodomestico?");
        String Color = leer.nextLine();
        Color = comprobarColor(Color);
        System.out.println("¿cual es el tipo de consumo?");
        String Consumo = leer.nextLine();
        Consumo = comprobarConsumo(Consumo);
        Precio = precioFinal( Consumo, Peso);
        electrodomesticos e1 = new electrodomesticos(Precio, Peso, Color, Consumo);
        return e1;
    }

    public String comprobarColor(String color) {
        boolean ok = false;
        while (ok =false) {
            if ("blanco".equalsIgnoreCase(color) && "negro".equalsIgnoreCase(color) && "gris".equalsIgnoreCase(color) && "rojo".equalsIgnoreCase(color) && "azul".equalsIgnoreCase(color)) {
                ok = true;
            } else {
                color = leer.nextLine();
            }
        }
        return color;
    }

    public String comprobarConsumo(String Consumo) {
        switch (Consumo.toUpperCase()) {
            case  "A" -> {
            }
            case "B" -> {
            }
            case "C" -> {
            }
            case "D" -> {
            }
            case "E" -> {
            }
            case "F" -> {
            }
            default ->
                Consumo = "f";
        }
        return Consumo;
    }

    public int precioFinal( String Consumo, int Peso) {
       int  Precio = 1000 + calcularCargoConsumo(Consumo) + calcularCargoPeso(Peso);
        return Precio;
    }

    public int calcularCargoPeso(int Peso) {
        if (Peso <= 1 || (Peso > 19)) {
            peso = 100;
        }
        if (Peso <= 20 || (Peso > 49)) {
            peso = 500;
        }
        if (Peso <= 50 || (Peso > 79)) {
            peso = 800;
        }
        if (Peso <= 80) {
            peso = 1000;
        }
        return Peso;
    }

    public int calcularCargoConsumo(String Consumo) {
        int Precio = 0;
        switch (Consumo) {
            case "A" -> {
                Precio = 1000;
            }
            case "B" -> {
                Precio = 800;
            }
            case "C" -> {
                Precio = 600;
            }
            case "D" -> {
                Precio = 500;
            }
            case "E" -> {
                Precio = 300;
            }
            case "F" -> {
                Precio = 100;
            }

        }
        return Precio;
    }
}
