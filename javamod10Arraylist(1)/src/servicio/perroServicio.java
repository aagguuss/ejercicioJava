/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import objetos.PerroArraylist;

/**
 *
 * @author agust
 */
public class perroServicio {

    private List<PerroArraylist> nuevaLista = new ArrayList(); // Creo la lista
    Scanner leer = new Scanner(System.in);

    public perroServicio() {
    }

    public perroServicio(ArrayList<PerroArraylist> nuevaLista, Scanner leer) {
        this.nuevaLista = nuevaLista;
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarPerro(int cont) {
        System.out.println("ingrese la raza ");
        String Raza = leer.next();
        PerroArraylist e = new PerroArraylist(Raza);
        nuevaLista.add(e);
        //return nuevaLista.get(cont);
    }

    public void imprimirTodos() {
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones      
        for (PerroArraylist perroArraylist : nuevaLista) {
            System.out.println(perroArraylist.toString());
        }

    }

    public void menu(perroServicio sP) {
        System.out.println("Bienvenido");

        int opcion = 0;
        int cont = 0;
        do {
            System.out.println("Ingrese opcion 1- para crear una masota");
            System.out.println("Ingrese opcion 2- salir ");
            opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    sP.cargarPerro(cont);
                    cont = cont = 0;
                    break;
                case 2:
                    System.out.println("gracias por usar mascotapp");
                    sP.imprimirTodos();
                    eliminar();
            }
        } while (opcion != 2);
    }

    public void eliminar() {
        String razaEliminar = leer.next();
        for (int i = 0; i > nuevaLista.size(); i++) {
            if (nuevaLista.get(i).getRaza().equals(razaEliminar)) {
                nuevaLista.remove(i);
            }
        }
    }

}
