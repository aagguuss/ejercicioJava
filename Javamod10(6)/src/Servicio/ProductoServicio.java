/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class ProductoServicio {

    private Scanner leer;
    private HashMap<Integer, Producto> listaProducto;

    public void menu() {
        this.listaProducto = new HashMap<>(); // Creo el espacio en memoria del MAPA
        this.leer = new Scanner(System.in);
                
        boolean salir = false;
        int Menu=0;
        do { 
            System.out.println("Elija la opcion segun el NUMERO");
            System.out.println("1- Introducir un nuevo producto");
            System.out.println("2- Modificar Precio");
            System.out.println("3- Eliminat un producto");
            System.out.println("4- Imprimir lista de productos ");
            System.out.println("10- Salir");

            Menu=leer.nextInt();
            switch(Menu){
                case 1 :
                    IntroducirProducto();
                    break;
                case 2:
                    ModificarPrecio(listaProducto);
                    break;
                case 3:
                    EliminarProducto(listaProducto);
                    break;
                case 4:
                    ImprimirProducto(listaProducto);
                    break;
                case 10:
                    salir=true;
                    break;
                
            }
        } while (salir=true);
    }
 private void IntroducirProducto() {
     System.out.println("Ingrese el Numero de Producto");
      int NumeroProducto=leer.nextInt();
      leer.nextLine();
      System.out.println("¿nombre de producto, entre parentesis modelo?");
      System.out.println("¿ingrese  el precio ?");
      Producto P1 = new Producto(leer.nextLine().toUpperCase(),leer.nextInt());
      listaProducto.put(NumeroProducto, P1);
      
    }

    private void ModificarPrecio(HashMap<Integer, Producto> listaProducto) {
        System.out.println("ingrese el Codigo del producto que desea modificar el precio ");
       Producto P1 = listaProducto.get(leer.nextInt());
       P1.setPrecio(leer.nextInt());
      
    }

    private void EliminarProducto(HashMap<Integer, Producto> listaProducto) {
        System.out.println("Ingrese el producto a eliminar ");
          int ProductoAeliminar = leer.nextInt();
         listaProducto.remove(ProductoAeliminar);    
    
    }

    private void ImprimirProducto(HashMap<Integer, Producto> listaProducto) {
       for (Map.Entry<Integer, Producto> entry : listaProducto.entrySet()) {
            System.out.println("Numero de Producto:  " + entry.getKey() + "  , Datos del Producto: " + entry.getValue().getNombre()+"con un valor de "+entry.getValue().getPrecio());
    }

}
}

   