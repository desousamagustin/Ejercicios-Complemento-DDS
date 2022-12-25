package ejercicio1.interfazDeUsuario;

import ejercicio1.alumno.Alumno;
import ejercicio1.alumno.Cursada;
import ejercicio1.alumno.Materia;
import ejercicio1.estado.Avanzado;
import ejercicio1.estado.Estado;
import ejercicio1.estado.Peligro;
import ejercicio1.estado.bien.Bien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfazDeUsuario1 {
    Alumno alumno = new Alumno();
    Cursada cursada = new Cursada();


    public InterfazDeUsuario1() {
        this.mostrarMenu();
    }

    public void mostrarMenu() {
        int opcion;

        alumno.generarAlumno(cursada);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Elija una opcion: ");
            System.out.println("1. Mostrar datos alumno y su cursada");
            System.out.println("2. Generar plan");
            System.out.println("3. Modificar estado actual de la cursada");
            System.out.print("Opcion: ");

            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    alumno.mostrarDatos();
                    break;
                case 2:
                    cursada.generarHojaDeRuta();
                    break;
                case 3:
                    System.out.println("Estado actual: " + cursada.getStrategyEstado().getClass().getSimpleName());
                    System.out.println("Seleccione una opcion: ");
                    System.out.println("1. Estado peligro");
                    System.out.println("2. Estado bien");
                    System.out.println("3. Estado avanzado");
                    Scanner sc = new Scanner(System.in);
                    int op;
                    Estado nuevoEstado;
                    op = sc.nextInt();

                    switch(op) {
                        case 1:
                            nuevoEstado = new Peligro();
                            cursada.setStrategyEstado(nuevoEstado);
                            break;
                        case 2:
                            nuevoEstado = new Bien();
                            cursada.setStrategyEstado(nuevoEstado);
                            break;
                        case 3:
                            nuevoEstado = new Avanzado();
                            cursada.setStrategyEstado(nuevoEstado);
                            break;
                        default:
                            break;
                    }

                    break;
                default:
                    break;
            }
        } while(opcion != 0);
    }
}
