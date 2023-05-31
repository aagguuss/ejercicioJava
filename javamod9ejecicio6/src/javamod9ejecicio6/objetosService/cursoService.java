/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod9ejecicio6.objetosService;

import java.util.Scanner;
import javamod9ejecicio6.objetos.curso;

/**
 *
 * @author agust
 */
public class cursoService {
    Scanner leer = new Scanner(System.in);

    
    public curso crearCurso(){
        String [] A = new String[5];
        System.out.println("ingrese el nombre del curso, la cantidad de horas por dia , cantidad de dias por semana , el precio de la hora y si es cierto que estas en turno tarde ");
        curso C1 = new curso(A,leer.nextLine(),leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextBoolean());
        A=C1.cargarAlumnor();
       C1.setAlumnos(A);
    return C1;
    }
    
    public void calcularGananciaSemanal( curso C){
        System.out.println("la cantidad de ganancia semanal es de :"+C.getAlumnos().length*C.getCantidadDiasPorSemana()*C.getCantidadHorasPorDia()*C.getPrecioPorHora());
    
    }
}
