/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.Scanner;
import javamod10list.pkg3.entidades.alumno;
import static oracle.jrockit.jfr.events.Bits.intValue;

/**
 *
 * @author agust
 */
public class alumnoService {

    public Scanner leer = new Scanner(System.in);
    ArrayList<alumno> ListaAlumnos = new ArrayList();

    public void crearAlumnos() {
        String cont = "s", nombre = "";

        do {
            System.out.println("ingrese el nombre del alumno");

            nombre = leer.nextLine();
            System.out.println("ingrese la primera nota");
            int a = leer.nextInt();
            System.out.println("ingrese la segunda nota");
            int b = leer.nextInt();
            System.out.println("ingrese la tercera nota");
            int c = leer.nextInt();
            leer.nextLine();

            ListaAlumnos.add(new alumno(nombre, a, b, c));

            System.out.println("desea ingresar otro alumno ?");
            System.out.println("ingrese s");
            System.out.println("si desea finalizar ingrese n");
            cont = leer.nextLine();
        } while (cont.equals("s"));
        System.out.println(" ingrese el nombre del alumno que desea calcular su promedio ");
        int I = buscarIndex(leer.nextLine());
        notaFinal(I);
    }

    public void notaFinal(int Index) {
        double notaPromedio = 0.0;

        for (int i = 0; i < 3; i++) {
            notaPromedio = notaPromedio + ListaAlumnos.get(Index).getNotas().get(i);
        }
        System.out.println("el alumno " + ListaAlumnos.get(Index).getNombre() + " tiene la nota final de " + (notaPromedio/3));
    }

    public int buscarIndex(String nombre) {
        int index = (-1);
        for (alumno Alumno : ListaAlumnos) {
            if (Alumno.getNombre().equals(nombre)) {
                index = ListaAlumnos.indexOf(Alumno);
                break;
            }   
        }
        return index;
    }
}