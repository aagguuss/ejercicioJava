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
public class Lavadora extends electrodomesticos {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, int peso, String color, String consumo) {
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        System.out.println("Ingrese la capacidad de carga de la lavadora");
        int Carga = leer.nextInt();
        System.out.println("¿cuanto pesa?");
        int Peso = leer.nextInt();
        leer.nextLine();
        System.out.println("¿cual es el tipo de consumo?");
        String Consumo = leer.nextLine();
        System.out.println("¿de que color quiere su lavadora?");
        String Color = comprobarColor(leer.nextLine());
        Consumo = comprobarConsumo(Consumo);
        int Precio = precioFinal(Consumo, Peso, Carga);
        Lavadora l1 = new Lavadora(Carga, Precio, Peso, Color, Consumo);
        return l1;
    }

    public int precioFinal(String Consumo, int Peso, int carga) {
        int Precio = super.precioFinal(Consumo, Peso);
        int adicionalCarga;
        if (carga > 30) {
            adicionalCarga = (carga - 30) * 500;
        } else {
            adicionalCarga = 500;
        }
       Precio = Precio + adicionalCarga;
        return Precio;
    }

}
