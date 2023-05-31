/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidades.Amarres;
import entidades.aMotor;
import entidades.barco;
import entidades.veleros;
import entidades.yate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author agust
 */
public class servicio {

    ArrayList<barco> listaBarcos;
    ArrayList<Amarres> listaAmarres;

    public void menu() {
        veleros v1 = new veleros();
        v1 = new veleros(3, 3145, 30, 1920, v1.calcularMod(30, 3));
        listaBarcos.add(v1);
        aMotor m1 = new aMotor();
        m1 = new aMotor(10, 55, 20, 1950, m1.calcularMod(20, 10));
        listaBarcos.add(m1);
        yate y = new yate();
        y = new yate(10, 2, 778, 25, 2000, y.calcularMod(25, 10, 2));
        listaBarcos.add(y);
        Amarres a1 = new Amarres(250000, new Date(2023 / 04 / 25), new Date(2023 / 04 / 29), "carlos", "proa", v1);
        listaAmarres.add(a1);
        Amarres a2 = new Amarres(250000, new Date(2023 / 04 / 25), new Date(2023 / 04 / 29), "carlos", "proa", m1);
        listaAmarres.add(a2);
        Amarres a3 = new Amarres(250000, new Date(2023 / 04 / 25), new Date(2023 / 04 / 29), "carlos", "proa", y);
        listaAmarres.add(a3);
        for (Amarres aux : listaAmarres) {
            aux.calcularAlquiler();
        }
    }
}
