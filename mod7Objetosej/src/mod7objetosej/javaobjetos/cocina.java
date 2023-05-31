package mod7objetosej.javaobjetos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
import mod7objetosej.javaobjetos.receta;
//
//public class cocina {
//    Scanner leer = new Scanner(System.in);
//    List<receta> listaDeRecetas = new ArrayList<>();
//       
//    public cocina() {
//    }
//    
////   public void listadeRecetas(int listaRecetas){
////   for(int i=0;i<listaRecetas;i++){
////   
////   }
////       
// //  }
//    public void crearReceta() {
//        receta Re = new receta(leer.nextLine(), leer.nextInt());
//        leer.nextLine(); 
//        Re.ingresarIngredientes(leer.nextLine());
//       listaDeRecetas.add(Re);
//        
//    }
import java.util.ArrayList;
import java.util.List;

public class cocina {

    private List<receta> recetas;

    public cocina() {
        recetas = new ArrayList<>();
    }

    public void agregarReceta(receta receta) {
        recetas.add(receta);
    }

    public receta buscarReceta(String nombre) {
        for (receta receta : recetas) {
            if (receta.getNombre().equals(nombre)) {
                return receta;
            }
        }
        return null;
    }

    public List<receta> recetasDisponibles(List<String> ingredientesDisponibles) {
        List<receta> recetasDisponibles = new ArrayList<>();
        for (receta receta : recetas) {
            if (receta.sePuedePrepararCon(ingredientesDisponibles)) {
                recetasDisponibles.add(receta);
            }
        }
        return recetasDisponibles;
    }

}
    
    

