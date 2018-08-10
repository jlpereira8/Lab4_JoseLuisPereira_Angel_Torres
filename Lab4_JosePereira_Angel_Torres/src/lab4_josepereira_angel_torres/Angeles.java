/*
 * -
-Color
-Descripción del Ángel
-Color de la sangre (Por defecto es azul)
-fecha en que fue encontrado
-Nombre
-Si puede volar o no
-Potencia del campo AT(Es un numero cualquiera)

 */
package lab4_josepereira_angel_torres;

import java.util.Date;

/**
 *
 * @author j0c3lwiz
 */
public class Angeles extends RazaAncestral{
    private String color;
    private String Descripcion;
    private String color_sangre;
    private Date fecha;
    private String nombre;
    private String vuela_sn;
    private int potencia;

    public Angeles() {
    }

    public Angeles(String color, String Descripcion, String color_sangre, Date fecha, String nombre, String vuela_sn, int potencia) {
        this.color = color;
        this.Descripcion = Descripcion;
        this.color_sangre = color_sangre;
        this.fecha = fecha;
        this.nombre = nombre;
        this.vuela_sn = vuela_sn;
        this.potencia = potencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getColor_sangre() {
        return color_sangre;
    }

    public void setColor_sangre(String color_sangre) {
        this.color_sangre = color_sangre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVuela_sn() {
        return vuela_sn;
    }

    public void setVuela_sn(String vuela_sn) {
        this.vuela_sn = vuela_sn;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void moverse() {
    }

    @Override
    public void atacar() {
    }
    
    
  
    
}
