/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author agust
 */
public class Amarres {
    private int Dni;
    private Date fechaIngreso;
    private Date fechaDevolucion;
    private String nombre;
    private String tipoAmarre;
    private barco B;   

    public Amarres(int Dni, Date fechaIngreso, Date fechaDevolucion, String nombre, String tipoAmarre, barco B) {
        this.Dni = Dni;
        this.fechaIngreso = fechaIngreso;
        this.fechaDevolucion = fechaDevolucion;
        this.nombre = nombre;
        this.tipoAmarre = tipoAmarre;
        this.B = B;
    }

    public Amarres() {
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAmarre() {
        return tipoAmarre;
    }

    public void setTipoAmarre(String tipoAmarre) {
        this.tipoAmarre = tipoAmarre;
    }

    public barco getB() {
        return B;
    }

    public void setB(barco B) {
        this.B = B;
    }
public int calcularDias (){
    long diasMili = fechaDevolucion.getTime()- fechaIngreso.getTime();
        long dias = Math.abs(diasMili/(24*60*60*1000));
     return (int)dias; 
//return (fechaDevolucion.getYear()-fechaIngreso.getYear())*365+(((fechaDevolucion.getMonth()+1)-(fechaIngreso.getMonth()+1))*30+(fechaDevolucion.getDate()+fechaIngreso.getDate());
         }
public void calcularAlquiler(){
        
    System.out.println("el valor de arancel para el amarre es : "+B.mod+calcularDias());  
}
    
}
