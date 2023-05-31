/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamo9ejercicioextra.objetos;

/**
 *
 * @author agust
 */
public class ahorcado {
    private String [] palabraA, palaraD;
    private int ltrasEncontradas, Jmaximas, intentoFallidos ;//hubo un problema con los contadores no podia hacer que guardaran los valores pero puede que se deba a otro problema probar si despues funciona 
   
    
    public ahorcado(String [] palabra,int Jmaximas,int largo) {
        this.Jmaximas=Jmaximas;
        palabraA = new String[largo];
        palabraA=palabra;
        palaraD = new String[largo];
        
    }

    public String[] getPalabraA() {
        return palabraA;
    }

    public void setPalabraA(String[] palabraA) {
        this.palabraA = palabraA;
    }
    public void setPalabraA(String palabraA, int i) {
        this.palabraA[i] = palabraA;
    }
    
    public String[] getPalaraD() {
        return palaraD;
    }
    
    public String getPalaraD(int i ) {
        return palaraD[i];
    }

    public void setPalaraD(String palabra,int i ) {
        this.palaraD[i] = palabra;
    }

    public int getLtrasEncontradas() {
        return ltrasEncontradas;
    }

    public void setLtrasEncontradas(int ltrasEncontradas) {
        this.ltrasEncontradas = ltrasEncontradas+1;
    }

    public int getJmaximas() {
        return Jmaximas;
    }

    public void setJmaximas(int Jmaximas) {
        this.Jmaximas = Jmaximas;
    }

    public int getIntentoFallidos() {
        return intentoFallidos;
    }

    public void setIntentoFallidos(int intentoFallidos) {
        this.intentoFallidos = intentoFallidos+1;
    }
   
    public static void iniciarArreglo(String palabra, String [] palabraA ){
   for (int i = 0; i>palabra.length();i++){
       palabraA[i]=palabra.substring(i, i);
   }
    }
}
