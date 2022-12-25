package ejercicio3.encuesta;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Seccion {
    private List<Pregunta> preguntas;
    private String nombre;

    public Seccion(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarPreguntasYSusRespuestas() {
        preguntas.forEach(pregunta -> System.out.println("Pregunta: " + pregunta.getPregunta()));
    }
}
