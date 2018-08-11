/*
 * -Nombre
-Edad
-Nombre del familiar cercano
-Encargado en Nerv
-Escuela a la que asiste
-Porcentaje de Sincronización con el EVA
-Eva asignado

 */
package lab4_josepereira_angel_torres;

/**
 *
 * @author j0c3lwiz
 */
public class Piloto {
    String Nombre;
    String edad;
    String nombre_familiar;
    String encargado_nerv;
    String escuela;
    double sincronizacion;
    Eva eva_asignado;

    public Piloto() {
    }

    public Piloto(String Nombre, String edad, String nombre_familiar, String encargado_nerv, String escuela, double sincronizacion, Eva eva_asignado) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.nombre_familiar = nombre_familiar;
        this.encargado_nerv = encargado_nerv;
        this.escuela = escuela;
        this.sincronizacion = sincronizacion;
        this.eva_asignado = eva_asignado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre_familiar() {
        return nombre_familiar;
    }

    public void setNombre_familiar(String nombre_familiar) {
        this.nombre_familiar = nombre_familiar;
    }

    public String getEncargado_nerv() {
        return encargado_nerv;
    }

    public void setEncargado_nerv(String encargado_nerv) {
        this.encargado_nerv = encargado_nerv;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public double getSincronizacion() {
        return sincronizacion;
    }

    public void setSincronizacion(double sincronizacion) {
        this.sincronizacion = sincronizacion;
    }

    public Eva getEva_asignado() {
        return eva_asignado;
    }

    public void setEva_asignado(Eva eva_asignado) {
        this.eva_asignado = eva_asignado;
    }

    public String getInfo(){
        String m="";
        m+="\n"+1 +" - Nombre: "+this.Nombre;
        m+="\n"+2 +" - Apellido: "+this.edad;
        m+="\n"+3 +" - Familiar: "+this.nombre_familiar;
        m+="\n"+4 +" - Encargado Nerv: "+this.encargado_nerv;
        m+="\n"+5 +" - Escuela: "+this.escuela;
        m+="\n"+6 +" - Porcentaje Sincronización: "+this.sincronizacion;
        m+="\n"+7 +" - Eva Asignado: "+this.eva_asignado;
        
        return m;
    }
    
    @Override
    public String toString() {
        return "Piloto{" + "Nombre=" + Nombre + ", edad=" + edad + ", nombre_familiar=" + nombre_familiar + ", encargado_nerv=" + encargado_nerv + ", escuela=" + escuela + ", sincronizacion=" + sincronizacion + ", eva_asignado=" + eva_asignado + '}';
    }
    
    
}
