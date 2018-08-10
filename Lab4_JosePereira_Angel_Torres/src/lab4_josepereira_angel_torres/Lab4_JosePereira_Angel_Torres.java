package lab4_josepereira_angel_torres;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4_JosePereira_Angel_Torres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        
        //String Color, Date fecha, double altura, String alma, int num_ojos, String pais, Piloto piloto, String codigo, double porcentaje_dano
        Eva eva00 = new EVA_00("Amarallo", new Date(), 99, "Baal", 6, "Japón", new Piloto(), "EVA00", 100);
        Eva eva01 = new EVA_01("Rojo", new Date(), 99, "Mr. Satan", 6, "Alemania", new Piloto(), "EVA01", 200);
        Eva eva02 = new EVA_02("Verde", new Date(), 99, "Lucifer", 6, "Japón", new Piloto(), "EVA02", 300);
        Eva evaPM = new EVA_PM("Negro", new Date(), 99, "Chespirito", 6, "Japón", new Piloto(), "EVA03", 300);
        
        //String color, String Descripcion, String color_sangre, Date fecha, String nombre, String vuela_sn, int potencia) {
    
        Angeles angel_sachiel = new Sachiel("Azul", "Venenoso", "Verde", new Date(), "Sachiel", "Si", 99);
        Angeles angel_ramiel = new Ramiel("Rojo", "Ácido", "Gris", new Date(), "Ramiel", "No", 199);
        Angeles angel_zeruel = new Zeruel("Verde", "Agua", "Azul", new Date(), "Zeruel", "No", 99);
        
        //Piloto genérico: (String Nombre, String edad, String nombre_familiar, String encargado_nerv, String escuela, double sincronizacion, Eva eva_asignado) {
        Piloto pil = new Piloto("Shinji", 20, "Pedro", encargado_nervs, escuela, 0, evaPM);
        
        lista.add(eva00);
        lista.add(eva01);
        lista.add(eva02);
        lista.add(evaPM);
        lista.add(angel_sachiel);
        lista.add(angel_ramiel);
        lista.add(angel_zeruel);
        
        
        menu();
        String menu = sc.next();
        do {

            switch (menu) {
                case "A"://Listar EVA
                case "a":
                    String sEva="";
                    int indiceE=0;
                    System.out.println("Lista de Eva's\n");
                    for (Object object : lista) {
                        if (object instanceof Eva){
                            sEva+=indiceE+" - "+((Eva)object).getCodigo()+"\n";
                            indiceE++;
                        }
                    }
                    System.out.println(sEva);
                    break;
                case "B"://Listar Angeles
                case "b":
                    String sAngel="";
                    int indiceA=0;
                    System.out.println("Lista de Eva's\n");
                    for (Object object : lista) {
                        if (object instanceof Angeles){
                            sAngel+=indiceA+" - "+((Angeles)object).getNombre()+"\n";
                            indiceA++;
                        }
                    }
                    System.out.println(sAngel);
                    break;
                case "C"://CRUD Pilotos
                case "c":
                    boolean b = true;
                    while (b) {
                        try {
                            pilotos();
                            int menuPiloto = sc.nextInt();
                            do {
                                switch (menuPiloto) {
                                    case 1://Listar Pilotos
                                        break;
                                    case 2://Modificar Pilotos
                                        break;
                                    case 3://
                                        break;
                                    case 4://Crear Pilotos
                                        break;
                                    case 0://salir
                                        break;
                                    default:
                                        break;
                                }
                                b = false;
                                pilotos();
                                menuPiloto = sc.nextInt();
                            } while (menuPiloto != 0);

                        } catch (InputMismatchException ex) {
                            ex.printStackTrace();
                            System.out.println("Ingrese un valor numérico");
                            b = false;
                        }

                    }

                    break;
                case "D":
                case "d":
                    break;
                case "E"://salir
                case "e"://salir
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }
            menu();
            menu = sc.next();
        } while (!menu.equalsIgnoreCase("E"));

    }

    public static void menu() {
        System.out.println("Opciones\n"
                + "A - Listar EVAs\n"
                + "B - Listar Angeles\n"
                + "C - CRUD Pilotos\n"
                + "D - Simulación\n"
                + "E - Salir\n");
    }

    public static void pilotos() {
        System.out.println("Opciones\n"
                + "1 - Listar\n"
                + "2 - Modificar\n"
                + "3 - Eliminar\n"
                + "4 - Crear\n"
                + "0 - Regresar\n");
    }

}
