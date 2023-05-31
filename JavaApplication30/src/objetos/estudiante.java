/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author agust
 */
public class estudiante {
    private int nota;
    private String nombre;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public estudiante() {
      
    }

    public estudiante( String nombre, int nota) {
        this.nota = nota;
        this.nombre = nombre;
    }
    
}
