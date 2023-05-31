/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Arrays;

/**
 *
 * @author agust
 */
public class arregloService {

    public arregloService() {
    }

    public void incializarArreglo(double[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 100;

        }
    }

    public void imprimirArreglo(double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(" " + a[i] + " ");
        }
    }

    public void ordenar(double[] A) {
        Arrays.sort(A);
        double[] B = new double[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        int x = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            A[i] = B[x];
            x = x - 1;
        }

    }

    public void inicializarB(double[] A, double[] B) {
        for (int i = 0; i < B.length; i++) {
            if (i <= 9) {
                B[i] = A[i];
            } else {
                B[i] = 0.5;
            }
        }
    }
}
