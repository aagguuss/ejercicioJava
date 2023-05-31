/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidades.Asiento;
import entidades.Sala;
import entidades.cliente;
import entidades.pelicula;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Servicio {
//    Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
//ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
//ocupado el asiento).

    Asiento[][] sal = new Asiento[8][6];
    ArrayList<cliente> Clientes = new ArrayList();
    ArrayList<pelicula> cartelera = new ArrayList();
    Scanner leer = new Scanner(System.in);
    Sala s1;

    public void crearSala() {
        s1 = new Sala(cartelera.get((int) (Math.random() * cartelera.size())));
    }

    public void CargarLista() {
        
        for (int i = 0; i < (int) (Math.random() * 20) + 1; i++) {
            String nombre = "fulano" + i;
            int edad = (int) (Math.random() * 99);
            int plata = (int) (Math.random() * 5000);
            cliente c1 = new cliente(nombre, edad, plata);
            Clientes.add(c1);
        }

    }

    public void CargarCartelera() {
        for (int i = 0; i < (int) (Math.random() * 3) + 1; i++) {
            String nombre = "harry potter" + i;
            String director = "jkrowling";
            int duracion = (int) (Math.random() * 200);
            int valor = (int) (Math.random() * 500);
            int edadMinima = (int) (Math.random() * 21);
            pelicula p1 = new pelicula(nombre, director, duracion, valor, edadMinima);
            cartelera.add(p1);
        }

    }

    public void cargarSala() {
        Random random = new Random();
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (random.nextBoolean() == true && cont <= Clientes.size()) {
                    cont++;
                    int x = 8 - i;
                    String b = buscarLetra(j);
                    cliente ClienteAleatorio = CaleatorioControl();
                    Asiento a1 = new Asiento(b, x);
                    a1.setEspectador(ClienteAleatorio);
                    sal[i][j] = a1;
                } else {
                    int x = 8 - i;
                    String b = buscarLetra(j);
                    cliente Clientevacio;
                    Clientevacio = new cliente(" ", 0, 0);
                    Clientevacio.setSentado(false);
                    Asiento a1 = new Asiento(b, x);
                    a1.setEspectador(Clientevacio);
                    sal[i][j] = a1;
                }
            }

        }
        s1.setSala(sal);

    }

    private String buscarLetra(int fila) {
        String letra = "";

        switch (fila) {
            case 0:
                letra = "A";
                break;
            case 1:
                letra = "B";
                break;
            case 2:
                letra = "C";
                break;
            case 3:
                letra = "D";
                break;
            case 4:
                letra = "E";
                break;
            case 5:
                letra = "F";
                break;

        }
        return letra;

    }

    private cliente CaleatorioControl() {
        boolean ok = false;
        cliente c;
        do {
            int azar = (int) (Math.random() * Clientes.size());
            c = Clientes.get(azar);
            if (c.isSentado()== false) {
                Clientes.get(azar).setSentado(true);
                ok = true;
            }
        } while (ok = false);
        return c;
    }

    public void imprimirMatriz() {
        String equis = " ";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (sal[i][j].getEspectador().isSentado() == true) {
                    equis = "X";
                }else{
                equis=" ";
                }
                System.out.print(sal[i][j].getColumnas() + sal[i][j].getFilas() + equis);
            }
            System.out.println("");
        }
    }

    public void menu() {
        CargarCartelera();
        CargarLista();
        crearSala();
        cargarSala();
        imprimirMatriz();
    }
}
