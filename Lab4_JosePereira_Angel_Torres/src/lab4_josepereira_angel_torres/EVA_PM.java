package lab4_josepereira_angel_torres;

import java.util.Date;

public class EVA_PM extends Eva {
    
    public EVA_PM() {
        super();
    }
    
    public EVA_PM(String Color, Date fecha, double altura, String alma, int num_ojos, String pais, Piloto piloto, String codigo, double porcentaje_dano) {
        super(Color, fecha, altura, alma, num_ojos, pais, piloto, codigo, porcentaje_dano);
    }
    
    @Override
    public boolean moverse(int i, int j, int i2, int j2) {
        boolean b = false;
        if (i2>=0&&i2<=9) {
            b=true;
        }else if (j2>=0&&j2<=9) {
            b=true;
        }
        return b;
    }
    
    @Override
    public boolean atacar(int i, int j, int i2, int j2) {
        boolean b = false;
        if (i2 == i+ 1 && j2 == j + 1) {
            b = true;
        }
        if (i2 == i - 1 && j2 == j - 1) {
            b = true;
        }
        if (i2 == i + 1 && j2 == j - 1) {
            b = true;
        }
        if (i2 == i - 1 && j2 == j + 1) {
            b = true;
        }
        if (i2== i + 1) {
            b = true;
        }
        if (i2 == i - 1) {
            b = true;
        }
        if (j2 == j + 1) {
            b = true;
        }
        if (j2 == j - 1) {
          b = true;
        }
        return b;
    }
}
