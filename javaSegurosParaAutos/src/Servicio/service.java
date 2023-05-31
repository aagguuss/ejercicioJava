/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import entidades.Cliente;
import entidades.Poliza;
import entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class service {

    Scanner leer = new Scanner(System.in);
    ArrayList<Vehiculo> autos;
    ArrayList<Cliente> clientes;
    ArrayList<Poliza> polizas;

    public void crearCliente() {
        String ok = "si";
        int cont = 0;
        while ("si".equals(ok)) {
            String nombre = "cosme";
            String apellido = "fulanito" + clientes.size();
            String mail = "cosmefulanito" + clientes.size() + "@gmail.com";
            String domicilio = "Calle 49 entre " + (51 + clientes.size()) + " y " + (52 + clientes.size());
            int telefono = (int) (Math.random() * 100000);
            Cliente c1 = new Cliente(nombre, apellido, mail, domicilio, telefono);
            clientes.add(c1);
            cont = cont + 1;
            System.out.println("se ha ingresado un nuevo cliente desea ingresar otro");
            ok = leer.nextLine();
        }
    }

    public void crearAuto() {
        String ok = "si";
        int cont = 0;
        while ("si".equals(ok)) {
            String marca = "Fiat";
            String modelo = "espacio";
            String color = "blanco";
            String tipo = "Auto";
            int chasis = (int) (Math.random() * 999999999);
            int anio = (int) (Math.random() * 2023);
            int motor = (int) (Math.random() * 999999999);
            Cliente c1 = clientes.get(cont);
            Vehiculo V1 = new Vehiculo(marca, modelo, color, tipo, anio, chasis, motor, c1);
            autos.add(V1);
            cont = cont + 1;
            System.out.println("se ha ingresado un nuevo vehiculo desea ingresar otro");
            ok = leer.nextLine();
        }
    }

    public void crearPoliza() {
        String ok = "si";
        int cont = 0;
        while ("si".equals(ok)) {

            Vehiculo V1 = autos.get(cont);
            System.out.println("ingrese la forma de pago ");
            String formaDePago = leer.nextLine();
            System.out.println("ingrese la fecha de inicio ");
            Date date = new Date(leer.nextInt() - 1900, leer.nextInt(), leer.nextInt());
            System.out.println("ingrese el tipo de cobertura");
            String tipoDeCobertura = leer.nextLine();
            System.out.println("ingrese true si tiene cobertura de granizo y false si no la tiene");
            boolean coberturaGranizo = leer.nextBoolean();
            int cantidadCuotas = (int) (Math.random() * 12);
            int montoTotalAsegurado = (int) (Math.random() * 999999);
            int montoTotalGranizo = (int) (Math.random() * 999999);
            int numeroDePoliza = cont;
            
            Poliza P1 = new Poliza(V1, date, formaDePago, tipoDeCobertura, coberturaGranizo, cantidadCuotas, montoTotalAsegurado, montoTotalGranizo, numeroDePoliza);
            polizas.add(P1);
            cont = cont + 1;
            System.out.println("se ha ingresado un nueva poliza desea ingresar otro");
            ok = leer.nextLine();
        }
    }
    
    public void mostrarClientes(){
        for (Cliente aux : clientes) {
            System.out.println(aux.getNombre()+"  "+aux.getApellido()+"  Correo: "+aux.getMail()+" Domicilio "+aux.getDomicilio()+" numero de telefono  "+aux.getTelefono());
        }
            
        }
    
    public void mostarVehiculos(){
        for (Vehiculo aux : autos) {
            System.out.println("Este Vehiculo es un "+aux.getMarca()+" "+aux.getModelo()+" de color :"+aux.getColor()+"de tipo "+aux.getTipo()+" asegurado en la fecha "+aux.getAnio());
            System.out.println("su numero de chasis es : "+aux.getChasis());
            System.out.println("su numero de motor es : "+aux.getMotor());
            System.out.println("su Dueño es el clinete :"+aux.getC1().getNombre()+" "+aux.getC1().getApellido());
        }
    }
    
    public void mostrarPolizas(){
        for (Poliza  aux : polizas) {
            System.out.println("El cliente :"+aux.getV1().getC1().getNombre()+" "+aux.getV1().getC1().getApellido());
            System.out.println("Dueño del auto :"+aux.getV1().getMarca()+" "+aux.getV1().getModelo()+" de color :"+aux.getV1().getColor()+"de tipo "+aux.getV1().getTipo()+" asegurado en la fecha "+aux.getV1().getAnio());
            System.out.println("su numero de chasis es : "+aux.getV1().getChasis());
            System.out.println("su numero de motor es : "+aux.getV1().getMotor());
            System.out.println("su numero de poliza es :"+aux.getNumeroDePoliza());
            System.out.println("La fecha en que comezo a usar nuestros servicios es :" +aux.getD1().toString());
            System.out.println("su forma de pago es :"+aux.getFormaDePago());
            System.out.println("la cantidad de cuotas a pagar son : "+aux.getCantidadDeCuotas());
            System.out.println("El monto total asegurado es de :"+aux.getMontoTotalAsegurado()+"de pesos");
            if (aux.isCoberturaGranizo()==true) {
              System.out.println("Cuenta con cobertura para granizo ");
                System.out.println("el monto total asegurado para el mismo es de :"+aux.getMontoTotalGranizo());
                
            }else {
                System.out.println("no cuenta con cobertura para granizo");
            }
          
        }
    }
    
    
    }

