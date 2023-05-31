/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;



/**
 *
 * @author agust
 */
public class AdivinarMes {
    private final String [] meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviebre","diciembre"};



    public AdivinarMes() {
        
        mesSecreto=meses[(int)(Math.random()*12)];
    }
    
        public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    private final String mesSecreto;
}
