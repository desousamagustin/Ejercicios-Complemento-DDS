package ejercicio3.interfazDeUsuario;

import ejercicio3.encuesta.*;
import ejercicio3.organizacion.*;

import java.util.Scanner;

public class InterfazDeUsuario3 {
    DOrganizacion organizacion = new DOrganizacion();
    Encuesta encuesta = new Encuesta();

    public InterfazDeUsuario3() {
        this.iniciarMenu();
    }

    public void iniciarMenu() {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Elija una opcion: ");
            System.out.println("0. Salir del programa");
            System.out.println("1. Crear una encuesta");
            System.out.println("2. Mostrar encuesta");
            System.out.println("3. Crear y mostrar organizacion");

            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    encuesta.crearEncuesta();
                    break;
                case 2:
                    encuesta.mostrarEncuesta();
                    break;
                case 3:
                    organizacion.crearOrganizacion();
                    organizacion.mostrarOrganizacion();
                default:
                    break;
            }

        } while(opcion != 0);
    }
}
