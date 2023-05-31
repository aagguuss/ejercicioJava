/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;



/**
 *
 * @author agust
 */
public class Persona {
   
    private Perro mascota;
    private String nombre, apellido;
    private int Dni, edad;

    public Persona( String nombre, String apellido, int Dni, int edad) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.Dni = Dni;
        this.edad = edad;
    }
    
    
    
    public void adoptar(Perro mascota){
    this.mascota = mascota;
    }
    
  public void mostrar() {
      System.out.println(nombre+" "+apellido+"  tiene "+edad+"años su Dni es : "+Dni);
      if (mascota==null){
          System.out.println("no tiene ningun perrito :(");
      }else {
          System.out.println(nombre+"  ademas tiene un perro que se llama :"+ mascota.getNombre()+" de raza : "+mascota.getRaza()+"  tiene "+mascota.getEdad()+"años  y pesa"+mascota.getTamanio());
      }
  }  
}
