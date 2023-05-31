/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej.javaobjetos;

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
 * "salario". Luego, crea un método "calcular_aumento" que calcule el aumento
 * salarial de un empleado en función de su edad y salario actual. El aumento
 * salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si
 * tiene menos de 30 años.
 *
 * @author agust
 */
public class empleado {

    private String nombre;
    private int edad;
    private double salario;

    public empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcular_aumento() {
        if (getEdad()>30){
        salario=salario*0.10;
        }else {
        salario=salario*0.05;
        }
    }
}
