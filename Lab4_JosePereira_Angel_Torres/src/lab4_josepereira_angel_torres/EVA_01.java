/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josepereira_angel_torres;

import java.util.Date;


public class EVA_01 extends Eva{

    public EVA_01() {
        super();
    }

    public EVA_01(String Color, Date fecha, double altura, String alma, int num_ojos, String pais, Piloto piloto, String codigo, double porcentaje_dano) {
        super(Color, fecha, altura, alma, num_ojos, pais, piloto, codigo, porcentaje_dano);
    }
    
    
     @Override
    public void moverse(String[][]x,int i,int j,int i2,int j2) {
    }

    @Override
    public void atacar(String[][]x,int i,int j,int i2,int j2) {
    }
}
