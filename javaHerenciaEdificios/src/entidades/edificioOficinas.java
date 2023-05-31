/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class edificioOficinas extends edificio{
    private int oficinas;
    private int personasPorOficina;
    private int pisos;
    private int oficinasPorPiso;

    public edificioOficinas(int oficinas, int personasPorOficina, int pisos, int oficinasPorPiso, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personasPorOficina = personasPorOficina;
        this.pisos = pisos;
        this.oficinasPorPiso = oficinasPorPiso;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getOficinasPorPiso() {
        return oficinasPorPiso;
    }

    public void setOficinasPorPiso(int oficinasPorPiso) {
        this.oficinasPorPiso = oficinasPorPiso;
    }

    @Override
    public int getAncho() {
        return ancho;
    }
 @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
 @Override
    public int getAlto() {
        return alto;
    }
 @Override
    public void setAlto(int alto) {
        this.alto = alto;
    }
 @Override
    public int getLargo() {
        return largo;
    }
 @Override
    public void setLargo(int largo) {
        this.largo = largo;
    }

public void cantidadPersonas(){
    System.out.println(personasPorOficina*oficinasPorPiso*pisos);
}

    @Override
    public int calcularSuperficie() {
       return ancho*largo;}

    @Override
    public int calcularVolumen() {
        return ancho*largo*alto;
    }
    
  
}
