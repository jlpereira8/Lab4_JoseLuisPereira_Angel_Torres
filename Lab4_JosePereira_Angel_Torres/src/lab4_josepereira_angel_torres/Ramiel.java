
package lab4_josepereira_angel_torres;

import java.util.Date;


public class Ramiel extends Angeles{

    public Ramiel() {
        super();
    }

    public Ramiel(String color, String Descripcion, String color_sangre, Date fecha, String nombre, String vuela_sn, int potencia) {
        super(color, Descripcion, color_sangre, fecha, nombre, vuela_sn, potencia);
    }
    
    
    
   @Override
    public boolean moverse(int i, int j, int i2, int j2) {
        boolean b = false;
        if (i2==i-1&&j2==j+1) {
            b=true;
        }else if (i2==i+1&&j2==j-1) {
            b=true;
        }else if (i2==i-1&&j2==j-1) {
            b=true;
        }else if (i2==i+1&&j2==j+1) {
            b=true;
        }else if (i2==i-1&&j2==j) {
           b=true;
       }else if (i2==i&&j2==j+1) {
           b=true;
       }else if (i2==i+1&&j2==j) {
           b=true;
       }else if (i2==i&&j2==j-1) {
           b=true;
       }
        return b;
    }

    @Override
        public boolean atacar(int i, int j, int i2, int j2) {
        boolean b = true;
        return b;
    }
}
