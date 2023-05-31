/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author agust
 */
public class veleros extends barco {
    private int mastiles;

    public veleros(int mastiles, int matricula, int slora, int anioConstruccion, int Mod) {
        super(matricula, slora, anioConstruccion,Mod);
        this.mastiles = mastiles;
    }
 public int calcularMod(int slora, int mastiles){
    return slora*10*mastiles ;
    }
    public veleros(int mastiles) {
        this.mastiles = mastiles;
    }

    

    public veleros() {
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
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
