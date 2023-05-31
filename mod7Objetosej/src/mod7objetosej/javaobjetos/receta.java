/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej.javaobjetos;

import java.util.Scanner;

/**
 *
 * @author agust
// */
//public class receta {
// Scanner leer = new Scanner(System.in);
//    private final String ingrediente[];
//    private String nombreReceta;
//    private int cantidadIngredientes;
//
//    public receta(String nombreReceta, int cantidadIngredientes) {
//        this.nombreReceta = nombreReceta;
//        this.cantidadIngredientes = cantidadIngredientes;
//        this.ingrediente = new String[cantidadIngredientes];
//    }
//
//    public void setNombreReceta(String nombreReceta) {
//        this.nombreReceta = nombreReceta;
//    }
//
//    public void setCantidadIngredientes(int cantidadIngredientes) {
//        this.cantidadIngredientes = cantidadIngredientes;
//    }
//
//    public String getNombreReceta() {
//        return nombreReceta;
//    }
//
//    public int getCantidadIngredientes() {
//        return cantidadIngredientes;
//    }
//
//    public void ingresarIngredientes(String nombreIngrediente) {
//       
//        for (int i = 0; i < cantidadIngredientes; i++) {
//            ingrediente[i] = leer.nextLine();
//        }
//    }
//    }

  
import java.util.List;

public class receta {

    private String nombre;
    private List<String> ingredientes;

    public receta(String nombre, List<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean sePuedePrepararCon(List<String> ingredientesDisponibles) {
        for (String ingrediente : ingredientes) {
            if (!ingredientesDisponibles.contains(ingrediente)) {
                return false;
            }
        }
        return true;
    }

}

