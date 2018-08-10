
package lab4_josepereira_angel_torres;

import java.util.Date;

/**
 *
 * @author j0c3lwiz
 */
public class EVA_00 extends Eva{

    public EVA_00() {
        super();
    }

    public EVA_00(String Color, Date fecha, double altura, String alma, int num_ojos, String pais, Piloto piloto, String codigo, double porcentaje_dano) {
        super(Color, fecha, altura, alma, num_ojos, pais, piloto, codigo, porcentaje_dano);
    }
    
    
    
     @Override
    public void moverse() {
    }

    @Override
    public void atacar() {
    }
}
