/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoService;

import java.util.Scanner;
import objetos.estudiante;

/**
 *
 * @author agust
 */
public class estudianteService {

    Scanner leer = new Scanner(System.in);

    public void Inicio() {
        estudiante[] E = new estudiante[8];
        E=ingresandoDatos(E);
        System.out.println("el porcentaje de aprovacion de los estudiantes es de " + calcularPorcentaje(E) + " sobre diez");
        String[] Sp = new String[CantidadSobrePromedio(E, calcularPorcentaje(E))];
        Sp=inicializar0(Sp);
        Sp=cargandoSobrePromedio(Sp, E);
        mostrarSp(Sp);
    }

    private estudiante[] ingresandoDatos(estudiante[] E) {
        for (int i = 0; i < E.length; i++) {
            System.out.println(" ingrese nota y nombre del esudiante ");
            E[i] = crearEstudiante(leer.next(), leer.nextInt());

        }
        return E;
    }

    private estudiante crearEstudiante(String nombre, int nota) {
        estudiante e = new estudiante(nombre, nota);
        return e;
    }

    private int calcularPorcentaje(estudiante[] e) {
        int sumaNotas = 0;
        for (int i = 0; i < e.length; i++) {
            sumaNotas = e[i].getNota() + sumaNotas;
        }

        return (sumaNotas / 8);
    }

    private String[] cargandoSobrePromedio(String[] Sp, estudiante[] E) {
        int cont=0;
        for (int i = 0; i < E.length; i++) {
            if (E[i].getNota() > calcularPorcentaje(E)) {
                Sp[cont]=E[i].getNombre();
                cont=cont+1;
                        //Aniadiendo(E, Sp, i);
            }
        }
        return Sp;
    }

    private int CantidadSobrePromedio(estudiante[] E, int prom) {
        int cantidad = 0;
        for (int i = 0; i < E.length; i++) {
            if (E[i].getNota() > prom) {
                cantidad = cantidad + 1;
            }
        }
        return cantidad;
    }
//sp [cont]= new estudiante (E[i].getNombre, E[I].getNota);
//usando el constructor por parametros
// si Sp es un array de objetos estudiantes
    public estudiante[] Aniadiendo(estudiante[] E, estudiante[] Sp, int i) {
        for (int j = 0; j < Sp.length; j++) {
            
                Sp[j] = E[i];   
        }
        return Sp;
    }

    public void mostrarSp(String[] Sp) {
        System.out.println("Los estudiantes sobre promedio son:    ");
        for (int i = 0; i < Sp.length; i++) {
            System.out.println(Sp[i]);
        }
    }

    public String[] inicializar0(String[] Sp) {
      for (int i=0; i>Sp.length;i++){
      Sp[i]=" ";
      }
        
      return Sp; 
    }

}
