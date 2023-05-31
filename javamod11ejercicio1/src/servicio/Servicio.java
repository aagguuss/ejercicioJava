/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Servicio {

    ArrayList<Perro> ListaPerros = new ArrayList();
    ArrayList<Persona> ListaPersona = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int eleccionMascota;

    public void menu() {
        IngresarArrayPerro(ListaPerros);//se cargan las listas
        IngresarArrayPersonas(ListaPersona);

        for (Persona aux : ListaPersona) {
            // agregar funcion que muestre los perros disponibles 
            System.out.println("ingrese el codigo del perro que desa adoptar");
            eleccionMascota = leer.nextInt();
            aux.adoptar(ListaPerros.get(comprobarDueño(eleccionMascota)));// en el Leer va el index de la mascota  
            ListaPerros.get(eleccionMascota).adoptar(aux);//le agrego a la clase perro el atributo de dueño para poder comprobar que no a sido adoptado
            //Existe la posibilidad de que no haya mas perros disponibles en ese caso deberia termina el ciclo foreach o modificar el bucle while denro de comprobaDueño()
        }
    }

    private static void imprimir1() {
        System.out.println("ingrese nombre de los dos  perros, la raza , su edad y su peso ");

    }

    private static void imprimir2() {
        System.out.println("luego ingrese el nombre de las personas , con su apellido ,su dni y se edad ");
    }

    public void IngresarArrayPerro(ArrayList<Perro> ListaPerros) {
        String Fin = "N";
        do {
            imprimir1();
            Perro p1 = new Perro(leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextInt());
            leer.nextLine();//checkar si no es inutil tener esto por el delimiter.
            ListaPerros.add(p1);
            System.out.println("desea seguir ingresando perros S/N");
            Fin = leer.nextLine();
        } while (Fin.equalsIgnoreCase("s"));
        System.out.println("");
    }

    public void IngresarArrayPersonas(ArrayList<Persona> ListaPersonas) {
        String Fin = "N";
        do {
            imprimir2();
            Persona P1 = new Persona(leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextInt());
            leer.nextLine();
            ListaPersonas.add(P1);
            System.out.println("desea seguir ingresando personas S/N");
        } while (Fin.equalsIgnoreCase("s"));
        System.out.println("");
    }

    public int comprobarDueño(int Perro) {
        boolean Fin = false;
        do {
            if (ListaPerros.get(Perro).getDueño() == null) {
                Fin = true;
            } else {
                Perro = leer.nextInt();
            }
        } while (Fin = false);
        return Perro;
    }
}
