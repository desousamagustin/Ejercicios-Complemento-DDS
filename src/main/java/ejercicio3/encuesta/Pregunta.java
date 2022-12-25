package ejercicio3.encuesta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pregunta {
    private Seccion seccion;
    private String pregunta;

    public Pregunta(Seccion seccion, String pregunta) {
        this.seccion = seccion;
        this.pregunta = pregunta;
    }
}
