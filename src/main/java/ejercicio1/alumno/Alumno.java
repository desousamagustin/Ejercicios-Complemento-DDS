package ejercicio1.alumno;

import ejercicio1.estado.Estado;
import ejercicio1.estado.bien.Bien;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private List<Cursada> cursadas;

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Legajo: " + this.legajo);
        System.out.println("Cursadas");
        cursadas.forEach(cursada -> System.out.println("Materia: " + cursada.getMateria().getNombre() + " | " + "Estado: " + cursada.getStrategyEstado().getClass().getSimpleName() + "\n"));
    }

    public void generarAlumno(Cursada cursada) {
        List<Cursada> cursadas = new ArrayList<>();

        this.nombre = "Agustin";
        this.apellido = "De Sousa";
        this.legajo = 1714193;
        this.cursadas = cursadas;

        Materia materia = new Materia(1234,"Disenio de sistemas");
        Estado estadoCursada = new Bien();

        cursada.asignarValores(this,materia,estadoCursada);

        cursadas.add(cursada);
    }
}
