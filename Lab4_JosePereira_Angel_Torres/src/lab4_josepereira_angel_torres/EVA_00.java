package lab4_josepereira_angel_torres;

import java.util.Date;

/**
 *
 * @author j0c3lwiz
 */
public class EVA_00 extends Eva {

    public EVA_00() {
        super();
    }

    public EVA_00(String Color, Date fecha, double altura, String alma, int num_ojos, String pais, Piloto piloto, String codigo, double porcentaje_dano) {
        super(Color, fecha, altura, alma, num_ojos, pais, piloto, codigo, porcentaje_dano);
    }

    @Override
    public boolean moverse(int i, int j, int i2, int j2) {
        boolean b = false;
        if (i2 == i - 1 && j2 == j) {
            b = true;
        } else if (i2 == i - 1 && j2 == j + 1) {
            b = true;
        } else if (i2 == i && j2 == j + 1) {
            b = true;
        } else if (i2 == i + 1 && j2 == j + 1) {
            b = true;
        } else if (i2 == i + 1 && j2 == j) {
            b = true;
        } else if (i2 == i + 1 && j2 == j - 1) {
            b = true;
        } else if (i2 == i && j2 == j - 1) {
            b = true;
        } else if (i2 == i - 1 && j2 == j - 1) {
            b = true;
        }
        return b;
    }

    @Override
    public boolean atacar(int i, int j, int i2, int j2) {
        boolean b = true;
        return b;
    }
}
