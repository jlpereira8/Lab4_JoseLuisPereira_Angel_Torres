package lab4_josepereira_angel_torres;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4_JosePereira_Angel_Torres {

    static String[][] battlefield = new String[10][10];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        Eva ev = new Eva();
        Angeles an = new Angeles();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                battlefield[i][j] = "  ";
            }
        }
        battlefield[9][0] = "PM";
        battlefield[9][2] = "PM";
        battlefield[9][7] = "PM";
        battlefield[9][9] = "PM";

        battlefield[9][3] = "E0";
        battlefield[9][6] = "E0";

        battlefield[9][5] = "E1";
        battlefield[9][4] = "E2";

        battlefield[0][2] = "RR";
        battlefield[0][7] = "RR";

        battlefield[1][8] = "ZZ";
        battlefield[1][1] = "ZZ";
        battlefield[3][2] = "ZZ";
        battlefield[3][7] = "ZZ";

        battlefield[1][4] = "SS";
        battlefield[1][5] = "SS";

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
        Piloto pil = new Piloto("Shinji", "20", "Pedro", "No tiene familia", "", 99, null);
        Piloto pil2 = new Piloto("S666", "666", "Juan", "No tiene familia", "", 199, null);

        lista.add(eva00);
        lista.add(eva01);
        lista.add(eva02);
        lista.add(evaPM);
        lista.add(angel_sachiel);
        lista.add(angel_ramiel);
        lista.add(angel_zeruel);
        lista.add(pil);
        lista.add(pil2);

        menu();
        String menu = "";
        do {
            menu = sc.next();
            switch (menu) {
                case "A"://Listar EVA
                case "a":
                    String sEva = "";
                    int indiceE = 0;
                    System.out.println("Lista de Eva's\n");
                    for (Object object : lista) {
                        if (object instanceof Eva) {
                            sEva += indiceE + " - " + ((Eva) object).getCodigo() + "\n";
                            indiceE++;
                        }
                    }
                    System.out.println(sEva);

                    break;
                case "B"://Listar Angeles
                case "b":
                    String sAngel = "";
                    int indiceA = 0;
                    System.out.println("Lista de Ángeles\n");
                    for (Object object : lista) {
                        if (object instanceof Angeles) {
                            sAngel += indiceA + " - " + ((Angeles) object).getNombre() + "\n";
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

                                        System.out.println("Lista de Pilotos\n");
                                        for (int i = 0; i < lista.size(); i++) {
                                            if (lista.get(i) instanceof Piloto) {
                                                System.out.println(i + " ) " + lista.get(i).toString());
                                            }
                                        }
                                        //System.out.println();
                                        break;
                                    case 2://Modificar Pilotos

                                        System.out.println("Modificar Pilotos\n");

                                        System.out.println("Lista de Pilotos\n");
                                        for (int i = 0; i < lista.size(); i++) {
                                            if (lista.get(i) instanceof Piloto) {
                                                System.out.println(i + " ) " + lista.get(i).toString());
                                            }
                                        }

                                        System.out.println("Posición a modificar: ");
                                        int pos = sc.nextInt();

                                        if (pos >= 0 && pos < lista.size() && lista.get(pos) instanceof Piloto) {
                                            System.out.println(((Piloto) lista.get(pos)).getInfo());
                                            System.out.println("Dato a modificar: ");
                                            int poModif = sc.nextInt();

                                            if (poModif == 1) {
                                                System.out.println("Nuevo Nombre: ");
                                                String nNombre = sc.next();
                                                ((Piloto) lista.get(pos)).setNombre(nNombre);
                                            }
                                            if (poModif == 2) {
                                                System.out.println("Nuevo Edad: ");
                                                String nEdad = sc.next();
                                                ((Piloto) lista.get(pos)).setEscuela(nEdad);
                                            }
                                            if (poModif == 3) {
                                                System.out.println("Nuevo Familiar: ");
                                                String nFamiliar = sc.next();
                                                ((Piloto) lista.get(pos)).setNombre_familiar(nFamiliar);

                                            }
                                            if (poModif == 4) {
                                                System.out.println("Nuevo Encargado NERC: ");
                                                String nEncar = sc.next();
                                                ((Piloto) lista.get(pos)).setEncargado_nerv(nEncar);
                                            }
                                            if (poModif == 5) {
                                                System.out.println("Nuevo Escuela: ");
                                                String nEscuela = sc.next();
                                                ((Piloto) lista.get(pos)).setEscuela(nEscuela);
                                            }
                                            if (poModif == 6) {
                                                System.out.println("Porcentaje Sincronización: ");
                                                int pSync = sc.nextInt();
                                                ((Piloto) lista.get(pos)).setSincronizacion(pSync);
                                            }
                                            if (poModif == 7) {
                                                System.out.println("");
                                            }

                                        }

                                        break;
                                    case 3://
                                        System.out.println("Eliminar Pilotos\n");

                                        System.out.println("Lista de Pilotos\n");
                                        for (int i = 0; i < lista.size(); i++) {
                                            if (lista.get(i) instanceof Piloto) {
                                                System.out.println(i + " ) " + lista.get(i).toString());
                                            }
                                        }

                                        System.out.println("Posición a Eliminar: ");
                                        int posE = sc.nextInt();

                                        if (posE >= 0 && posE < lista.size() && lista.get(posE) instanceof Piloto) {
                                            lista.remove(posE);

                                        }

                                        break;
                                    case 4://Crear Pilotos
                                        //String Nombre, String edad, String nombre_familiar, String encargado_nerv, String escuela, double sincronizacion, Eva eva_asignado
                                        boolean v = true;
                                        while (v) {
                                            try {
                                                System.out.println("Nombre: ");
                                                String nombre = sc.next();
                                                System.out.println("Edad: ");
                                                String edad = sc.next();
                                                System.out.println("Familiar: ");
                                                String familiar = sc.next();
                                                System.out.println("Encargado: ");
                                                String encargado = sc.next();
                                                System.out.println("Escuela: ");
                                                String escuela = sc.next();
                                                System.out.println("Porcentaje sincronización: ");
                                                int sync = sc.nextInt();

                                                Piloto piloto = new Piloto(nombre, edad, familiar, encargado, escuela, sync, new Eva());
                                                lista.add(piloto);

                                                v = false;
                                            } catch (InputMismatchException ex) {
                                                System.out.println("Dato no valido");
                                                v = true;
                                            }
                                        }
                                        System.out.println("");
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
                            System.out.println("Ingrese un valor numérico");
                            b = false;
                        }

                    }

                    break;
                case "D"://Simulación
                case "d":
                    try {
                        int aux = 1;
                        boolean bo = true;
                        while (bo) {
                            imprimir(battlefield);
                            if (aux % 2 != 0) {

                                System.out.println("Ingrese la pieza x");
                                int x = sc.nextInt();
                                System.out.println("Ingrese la pieza y");
                                int y = sc.nextInt();
                                System.out.println("Ingrese a donde desea mover x");
                                int x2 = sc.nextInt();
                                System.out.println("Ingrese a donde desea mover y");
                                int y2 = sc.nextInt();
                                if (battlefield[x][y].equals("PM")) {
                                    EVA_PM pm = new EVA_PM();

                                    boolean p = pm.moverse(x, y, x2, y2);
                                    if (!battlefield[x][y].equals(" ")) {
                                        p = false;
                                    }
                                    if (p == false) {
                                        System.out.println("");
                                        System.out.println("Dato No Valido");
                                        System.out.println("");
                                        System.out.println("Ingrese hasta que sea Valido");
                                        System.out.println("");
                                        boolean t = true;
                                        while (t) {
                                            imprimir(battlefield);
                                            System.out.println("Ingrese la pieza x");
                                            x = sc.nextInt();
                                            System.out.println("Ingrese la pieza y");
                                            y = sc.nextInt();
                                            System.out.println("Ingrese a donde desea mover x");
                                            x2 = sc.nextInt();
                                            System.out.println("Ingrese a donde desea mover y");
                                            y2 = sc.nextInt();
                                            if (battlefield[x][y].equals("PM")) {
                                                pm = new EVA_PM();
                                                boolean e = pm.moverse(x, y, x2, y2);
                                                if (e == true) {
                                                    t = false;
                                                }
                                            }
                                        }
                                        battlefield[x][y] = "  ";
                                        battlefield[x2][y2] = "PM";
                                        aux++;
                                    } else {
                                        battlefield[x][y] = " ";
                                        battlefield[x2][y2] = "PM";
                                        aux++;
                                    }
                                } else if (battlefield[x][y].equals("E0")) {
                                    imprimir(battlefield);

                                    EVA_00 pm = new EVA_00();
                                    boolean p = pm.moverse(x, y, x2, y2);
                                    if (!battlefield[x][y].equals("  ")) {
                                        p = false;
                                    }
                                    if (p == false) {
                                        System.out.println("");
                                        System.out.println("Dato No Valido");
                                        System.out.println("");
                                        System.out.println("Ingrese hasta que sea Valido");
                                        System.out.println("");
                                        boolean t = true;
                                        while (t) {
                                            imprimir(battlefield);
                                            System.out.println("Ingrese la pieza x");
                                            x = sc.nextInt();
                                            System.out.println("Ingrese la pieza y");
                                            y = sc.nextInt();
                                            System.out.println("Ingrese a donde desea mover x");
                                            x2 = sc.nextInt();
                                            System.out.println("Ingrese a donde desea mover y");
                                            y2 = sc.nextInt();
                                            if (battlefield[x][y].equals("E0")) {
                                                pm = new EVA_00();
                                                boolean e = pm.moverse(x, y, x2, y2);
                                                if (e == true) {
                                                    t = false;
                                                }
                                            }
                                        }
                                        battlefield[x][y] = "  ";
                                        battlefield[x2][y2] = "E0";

                                    } else {
                                        battlefield[x][y] = " ";
                                        battlefield[x2][y2] = "E0";
                                    }

                                } else if (battlefield[x][y].equals("E1")) {
                                    imprimir(battlefield);

                                    EVA_01 pm = new EVA_01();
                                    boolean p = pm.moverse(x, y, x2, y2);
                                    if (!battlefield[x][y].equals("  ")) {
                                        p = false;
                                    }
                                    if (p == false) {
                                        System.out.println("");
                                        System.out.println("Dato No Valido");
                                        System.out.println("");
                                        System.out.println("Ingrese hasta que sea Valido");
                                        System.out.println("");
                                        boolean t = true;
                                        while (t) {
                                            imprimir(battlefield);
                                            System.out.println("Ingrese la pieza x");
                                            x = sc.nextInt();
                                            System.out.println("Ingrese la pieza y");
                                            y = sc.nextInt();
                                            System.out.println("Ingrese a donde desea mover x");
                                            x2 = sc.nextInt();
                                            System.out.println("Ingrese a donde desea mover y");
                                            y2 = sc.nextInt();
                                            if (battlefield[x][y].equals("E1")) {
                                                pm = new EVA_01();
                                                boolean e = pm.moverse(x, y, x2, y2);
                                                if (e == true) {
                                                    t = false;
                                                }
                                            }
                                        }
                                        battlefield[x][y] = "  ";
                                        battlefield[x2][y2] = "E1";

                                    } else {
                                        battlefield[x][y] = " ";
                                        battlefield[x2][y2] = "E1";
                                    }
                                } else if (battlefield[x][y].equals("E2")) {
                                    imprimir(battlefield);

                                    EVA_02 pm = new EVA_02();
                                    boolean p = pm.moverse(x, y, x2, y2);
                                    if (!battlefield[x][y].equals("  ")) {
                                        p = false;
                                    }
                                    if (p == false) {
                                        System.out.println("");
                                        System.out.println("Dato No Valido");
                                        System.out.println("");
                                        System.out.println("Ingrese hasta que sea Valido");
                                        System.out.println("");
                                        boolean t = true;
                                        while (t) {
                                            imprimir(battlefield);
                                            System.out.println("Ingrese la pieza x");
                                            x = sc.nextInt();
                                            System.out.println("Ingrese la pieza y");
                                            y = sc.nextInt();
                                            System.out.println("Ingrese a donde desea mover x");
                                            x2 = sc.nextInt();
                                            System.out.println("Ingrese a donde desea mover y");
                                            y2 = sc.nextInt();
                                            if (battlefield[x][y].equals("E0")) {
                                                pm = new EVA_02();
                                                boolean e = pm.moverse(x, y, x2, y2);
                                                if (e == true) {
                                                    t = false;
                                                }
                                            }
                                        }
                                        battlefield[x][y] = "  ";
                                        battlefield[x2][y2] = "E2";

                                    } else {
                                        battlefield[x][y] = " ";
                                        battlefield[x2][y2] = "E2";
                                    }

                                } else if (battlefield[x][y].equals("ZZ")) {
                                    imprimir(battlefield);

                                    Zeruel pm = new Zeruel();
                                    boolean p = pm.moverse(x, y, x2, y2);
                                    if (!battlefield[x][y].equals("  ")) {
                                        p = false;
                                    }
                                    if (p == false) {
                                        System.out.println("");
                                        System.out.println("Dato No Valido");
                                        System.out.println("");
                                        System.out.println("Ingrese hasta que sea Valido");
                                        System.out.println("");
                                        boolean t = true;
                                        while (t) {
                                            imprimir(battlefield);
                                            System.out.println("Ingrese la pieza x");
                                            x = sc.nextInt();
                                            System.out.println("Ingrese la pieza y");
                                            y = sc.nextInt();
                                            System.out.println("Ingrese a donde desea mover x");
                                            x2 = sc.nextInt();
                                            System.out.println("Ingrese a donde desea mover y");
                                            y2 = sc.nextInt();
                                            if (battlefield[x][y].equals("E0")) {
                                                pm = new Zeruel();
                                                boolean e = pm.moverse(x, y, x2, y2);
                                                if (e == true) {
                                                    t = false;
                                                }
                                            }
                                        }
                                        battlefield[x][y] = "  ";
                                        battlefield[x2][y2] = "ZZ";

                                    } else {
                                        battlefield[x][y] = " ";
                                        battlefield[x2][y2] = "ZZ";
                                    }
                                }else if (battlefield[x][y].equals("SS")) {
                                    imprimir(battlefield);
                                

                                        Sachiel pm = new Sachiel();
                                        boolean p = pm.moverse(x, y, x2, y2);                                      
                                        if (!battlefield[x][y].equals("  ")) {
                                            p = false;
                                        }
                                        if (p == false) {
                                            System.out.println("");
                                            System.out.println("Dato No Valido");
                                            System.out.println("");
                                            System.out.println("Ingrese hasta que sea Valido");
                                            System.out.println("");
                                            boolean t = true;
                                            while (t) {
                                                imprimir(battlefield);
                                                System.out.println("Ingrese la pieza x");
                                                x = sc.nextInt();
                                                System.out.println("Ingrese la pieza y");
                                                y = sc.nextInt();
                                                System.out.println("Ingrese a donde desea mover x");
                                                x2 = sc.nextInt();
                                                System.out.println("Ingrese a donde desea mover y");
                                                y2 = sc.nextInt();
                                                if (battlefield[x][y].equals("E0")) {
                                                    pm = new Sachiel();
                                                    boolean e = pm.moverse(x, y, x2, y2);
                                                    if (e == true) {
                                                        t = false;
                                                    }
                                                }
                                            }
                                            battlefield[x][y] = "  ";
                                            battlefield[x2][y2] = "SS";

                                        } else {
                                            battlefield[x][y] = " ";
                                            battlefield[x2][y2] = "SS";
                                        }
                            }
                        }
                        }

                    } catch (Exception e) {
                        System.out.println("Dato no valido");
                    }

                    break;

                case "E"://salir
                case "e"://salir
                    //menu= "e";
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }
            menu();
            //menu = sc.next();
        } while (!menu.equalsIgnoreCase("E"));

    }

    public static void matriz() {

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

    public static void imprimir(String[][] x) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + x[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
