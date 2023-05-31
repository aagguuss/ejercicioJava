/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class yate extends barco {

    private int potenciaCv;
    private int camarotes;

    public yate() {
    }

    public yate(int potenciaCv, int camarotes, int matricula, int slora, int anioConstruccion, int Mod) {
        super(matricula, slora, anioConstruccion,Mod);
        this.potenciaCv = potenciaCv;
        this.camarotes = camarotes;
    }
     public int calcularMod(int slora, int potenciaCV, int camarotes){
    return slora*10*potenciaCV*camarotes ;
    }

    public yate(int potenciaCv, int camarotes) {
        this.potenciaCv = potenciaCv;
        this.camarotes = camarotes;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public int getSlora() {
        return slora;
    }

    @Override
    public void setSlora(int slora) {
        this.slora = slora;
    }

    @Override
    public int getAnioConstruccion() {
        return anioConstruccion;
    }

    @Override
    public void setAnioConstruccion(int anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

}
