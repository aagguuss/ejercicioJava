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
public class Poliza {

    private Vehiculo v1;
    private Date d1;
    //private Date d2;
    private String formaDePago;
    private String tipoDeCobertura;
    private boolean coberturaGranizo;
    private int cantidadDeCuotas;
    private int montoTotalAsegurado;
    private int montoTotalGranizo;
    private int numeroDePoliza;

    public Poliza(Vehiculo v1, Date d1, String formaDePago, String tipoDeCobertura, boolean coberturaGranizo, int cantidadDeCuotas, int montoTotalAsegurado, int montoTotalGranizo, int numeroDePoliza) {
        this.v1 = v1;
        this.d1 = d1;
        this.formaDePago = formaDePago;
        this.tipoDeCobertura = tipoDeCobertura;
        this.coberturaGranizo = coberturaGranizo;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.montoTotalGranizo = montoTotalGranizo;
        this.numeroDePoliza = numeroDePoliza;
    }

    public Vehiculo getV1() {
        return v1;
    }

    public void setV1(Vehiculo v1) {
        this.v1 = v1;
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public boolean isCoberturaGranizo() {
        return coberturaGranizo;
    }

    public void setCoberturaGranizo(boolean coberturaGranizo) {
        this.coberturaGranizo = coberturaGranizo;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public int getMontoTotalGranizo() {
        return montoTotalGranizo;
    }

    public void setMontoTotalGranizo(int montoTotalGranizo) {
        this.montoTotalGranizo = montoTotalGranizo;
    }

    public int getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public void setNumeroDePoliza(int numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
    }

  
    
}
