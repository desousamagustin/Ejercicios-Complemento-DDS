package ejercicio3.encuesta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PreguntaAbierta extends Pregunta {
    public PreguntaAbierta(Seccion seccion, String pregunta) {
        super(seccion, pregunta);
    }
}
