
package lab4_josepereira_angel_torres;

import java.util.Date;


public class Zeruel extends Angeles{

    public Zeruel() {
        super();
    }

    public Zeruel(String color, String Descripcion, String color_sangre, Date fecha, String nombre, String vuela_sn, int potencia) {
        super(color, Descripcion, color_sangre, fecha, nombre, vuela_sn, potencia);
    }
    
   @Override
    public boolean moverse(int i, int j, int i2, int j2) {
        boolean b = true;
        return b;
    }

    @Override
        public boolean atacar(int i, int j, int i2, int j2) {
        boolean b = true;
        return b;
    }
}
