/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import objetos.AdivinarMes;

/**
 *
 * @author agust
 */
public class AdivinarMesService {

    Scanner leer = new Scanner(System.in);

    public void iniciarJuego() {

        boolean repe = false;
        System.out.println("__________Bienvenido _____________");
        AdivinarMes AM = new AdivinarMes();

        System.out.println("¿Adivine en que mes es el secreto?");
        intento(AM, leer.next());

    }

    
    public void intento(AdivinarMes AM, String A) {
        boolean a = false;
        int intentos = 0, memo = 0;

        String repe[] = new String[6];
        iniciarAyudaMemoria(repe);
        while ((intentos < 6) && (a = false)){
        
            if (AM.getMesSecreto().equals(toLowerCase(A))) {
                System.out.println("     Felicidades lo lograste    ");
                System.out.println("el mes era " + AM.getMesSecreto() + "!");
                a = true;
            } else {
                System.out.println("lo siento el mes era otro");
                intentos = intentos + 1;
                memo=controlMemoria(repe, A, intentos);
                System.out.println("memo=" + memo);
                System.out.println(intentos);
                System.out.println(a);
                if (memo > 1) {
                    System.out.println("usted ha repetido dos veces el mismo mes ");
                    System.out.println("estos son los meses que ha elegido");
                    imprimirAyuda(repe);
                }
                System.out.println("ingrese otro mes, le quedan " + (6 - intentos) + " intentos");
                A = leer.next();

            }
        }
    }

    public void iniciarAyudaMemoria(String[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = "X";
        }
    }

    public int controlMemoria(String[] AdivinandoFail, String Adivinando, int intentos) {
        int Disparador = 0;
        for (int i = 0; i < AdivinandoFail.length; i++) {

            if (i == intentos) {
                AdivinandoFail[i] = Adivinando;
            }
            if (AdivinandoFail[i].equals(Adivinando)) {
                Disparador = Disparador + 1;
            }
        }
        System.out.println("Disparador=" + Disparador);
        return Disparador;
    }

    private void imprimirAyuda(String[] repe) {
        for (String repe1 : repe) {
            System.out.print("--" + repe1 + "--");
        }
    }

}
