/*
 * Color
-Año de producción
-Altura ( en metros )
-Alma (La persona que “ofreció” su alma solo se requiere el nombre)
-Numero de ojos
-País donde fue producido
-Piloto
-Código de serie
-Porcentaje de daños

 */
package lab4_josepereira_angel_torres;

import java.util.Date;

public class Eva extends RazaAncestral{
    String Color;
    Date fecha;
    double altura;
    String alma;
    int num_ojos;
    String pais;
    Piloto piloto;
    String codigo;
    double porcentaje_dano;

    public Eva() {
    }

    public Eva(String Color, Date fecha, double altura, String alma, int num_ojos, String pais, Piloto piloto, String codigo, double porcentaje_dano) {
        this.Color = Color;
        this.fecha = fecha;
        this.altura = altura;
        this.alma = alma;
        this.num_ojos = num_ojos;
        this.pais = pais;
        this.piloto = piloto;
        this.codigo = codigo;
        this.porcentaje_dano = porcentaje_dano;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public int getNum_ojos() {
        return num_ojos;
    }

    public void setNum_ojos(int num_ojos) {
        this.num_ojos = num_ojos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPorcentaje_dano() {
        return porcentaje_dano;
    }

    public void setPorcentaje_dano(double porcentaje_dano) {
        this.porcentaje_dano = porcentaje_dano;
    }

    @Override
    public String toString() {
        return "Eva{" + "Color=" + Color + ", fecha=" + fecha + ", altura=" + altura + ", alma=" + alma + ", num_ojos=" + num_ojos + ", pais=" + pais + ", piloto=" + piloto + ", codigo=" + codigo + ", porcentaje_dano=" + porcentaje_dano + '}';
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
