/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej.javaobjetos;

/**
 *
 * @author agust
 */
public class operacion {

    private int num1;
    private int num2;

    public operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int crearOperacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        return 1;
    }

    public int sumar(int num1, int num2) {
        int resultadoSuma = num1 + num2;
        return resultadoSuma;
    }

    public int restar(int num1, int num2) {
        int resultadoResta = num1 - num2;
        return resultadoResta;
    }

    public int multiplicar(int num1, int num2) {
        if ((num1 == 0) || (num2 == 0)) {
            System.out.println("No deber ingresar mulpiplicaciones por 0");
        } else {
            int resultadoMultiplicar = num1 * num2;
            return resultadoMultiplicar;
        }
        return 0;
    }

    public int dividir(int num1, int num2) {
        if ((num1 == 0) || (num2 == 0)) {
            System.out.println("no divida a 0 o numeros por 0");
        } else {
            int resultadoDivicion = num1 / num2;
            return resultadoDivicion;
        }
        return 0;
    }

}
