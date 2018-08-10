package lab4_josepereira_angel_torres;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4_JosePereira_Angel_Torres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        menu();
        String menu = sc.next();
        do {

            switch (menu) {
                case "A":
                case "a":
                    break;
                case "B":
                case "b":
                    break;
                case "C":
                case "c":
                    boolean b = true;
                    while (b) {
                        try {
                            pilotos();
                            int menuPiloto = sc.nextInt();
                            do {
                                switch (menuPiloto) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
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
                + "A - Listar EVA\n"
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
