/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod5ejercicioextra;

/**Crear una función rellene un vector con números aleatorios, 
 * pasándole un arreglo por parámetro. Después haremos otra función 
 * o procedimiento que imprima el vector.

 *
 * @author agust
 */
public class javamod5ejercicioextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] vector = new int [7];
       relleno( vector);
      escribir (vector);
       
    }
  public static void relleno( int vector[]) {
  for (int i=0;i<vector.length;i++){
      vector[i]=(int) (Math.random()*1000);
  }
  //escribir(vector);
  
  } 
  public static void escribir(int vector[]){
   for (int i=0;i<vector.length;i++){
       System.out.print(vector[i]+" ");
  }
  }
          }
