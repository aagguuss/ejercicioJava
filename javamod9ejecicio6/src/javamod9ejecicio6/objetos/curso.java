/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod9ejecicio6.objetos;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class curso {
    Scanner leer = new Scanner(System.in);
    private String[] alumnos;
    private String nombreCurso;
    private int cantidadHorasPorDia, cantidadDiasPorSemana, precioPorHora;
    boolean tarde;

    public curso(String[] alumnos, String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, int precioPorHora, boolean tarde) {
        this.alumnos = alumnos;
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
        this.tarde = tarde;
    }

    public curso() {
    }

   
    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public boolean isTarde() {
        return tarde;
    }

    public void setTarde(boolean tarde) {
        this.tarde = tarde;
    }
    
        public String[] cargarAlumnor(){
            String [] A = new String[5];
    for (int i=0; i>A.length;i++){
        
        System.out.println("ingrese el nombre de alumno nro"+i+1);
    A[i]=leer.nextLine();
    }
    return A;
    }

}
