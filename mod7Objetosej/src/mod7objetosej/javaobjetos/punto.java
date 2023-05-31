/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej.javaobjetos;

import static jdk.nashorn.internal.objects.NativeMath.sqrt;
import java.lang.Math;

/**
 *
 * @author agust
 */
public class punto {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void crearPuntos(int x, int y){
    this.x=x;
    this.y=y;
    }
    public double calcularDistancia(int x2 , int y2 ,int x1, int y1){
      
       
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2)) ;
    }
}
