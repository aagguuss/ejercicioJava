/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class aMotor extends barco {

    private int potenciaCV;

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
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

    public aMotor(int potenciaCV, int matricula, int slora, int anioConstruccion, int Mod) {

        super(matricula, slora, anioConstruccion, Mod);
        this.potenciaCV = potenciaCV;
    }

    public int calcularMod(int slora, int potenciaCV) {
        return slora * 10 * potenciaCV;
    }

    public aMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public aMotor() {
    }

}
