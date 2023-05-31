/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


/**
 *
 * @author agust
 */
public class barco {
    protected int matricula;
    protected int slora;
    protected int anioConstruccion;
    protected int mod;

    public barco(int matricula, int slora, int anioConstruccion,int mod) {
        this.matricula = matricula;
        this.slora = slora;
        this.anioConstruccion = anioConstruccion;
        this.mod=mod;
    }

    public barco() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getSlora() {
        return slora;
    }

    public void setSlora(int slora) {
        this.slora = slora;
    }

    public int getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(int anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }
    
}
