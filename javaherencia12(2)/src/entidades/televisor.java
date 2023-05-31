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
public class televisor extends electrodomesticos {

    Scanner leer = new Scanner(System.in);
    private int pulgadas;
    private boolean Tdt;

    public televisor(int pulgadas, boolean Tdt, int precio, int peso, String color, String consumo) {
        super(precio, peso, color, consumo);
        this.pulgadas = pulgadas;
        this.Tdt = Tdt;
    }

    public televisor() {
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isTdt() {
        return Tdt;
    }

    public televisor crearTelevisor() {
        System.out.println("ingrese la cantidad de pulgadas del televisor ");
        int Pulgadas = leer.nextInt();
        System.out.println("¿el televisor posee TDT?");
        boolean TDT = leer.nextBoolean();
        System.out.println("ingrese el peso del eletctrodomestico");
        int Peso = leer.nextInt();
        leer.nextLine();
        System.out.println("¿de que color quiere el electrodomestico?");
        String Color = leer.nextLine();
        System.out.println("¿cual es el tipo de consumo?");
        String Consumo = leer.nextLine();
        
        Color = comprobarColor(Color);
        Consumo = comprobarConsumo(Consumo);
        int Precio = precioFinal(Consumo, Peso,TDT,Pulgadas);
        televisor T1 = new televisor(Pulgadas, TDT, Precio, Peso, Color, Consumo);
        return T1;
    }

    public int precioFinal(String Consumo, int Peso, boolean TDT, int pulgadas) {
        int adicionalPrecio = super.precioFinal(Consumo, Peso);
        if (TDT = true) {
            adicionalPrecio = adicionalPrecio + 500;
        }
        if (pulgadas > 40) {
            adicionalPrecio = adicionalPrecio + (int) (adicionalPrecio * 0.3);
        }
        return adicionalPrecio;
    }

}
