package ejercicio1.alumno;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private List<Cursada> cursadas;

    public Alumno(String nombre, String apellido, int legajo, List<Cursada> cursadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.cursadas = cursadas;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Legajo: " + this.legajo);
        System.out.println("Cursadas: ");
        cursadas.forEach(cursada -> System.out.println("Materia: " + cursada.getMateria().getNombre() + " | " + "Estado: " + cursada.getStrategyEstado().getClass().getSimpleName() + "\n"));
    }
}
