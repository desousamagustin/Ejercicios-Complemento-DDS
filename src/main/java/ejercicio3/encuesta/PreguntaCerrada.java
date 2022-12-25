package ejercicio3.encuesta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PreguntaCerrada extends Pregunta {
    public PreguntaCerrada(Seccion seccion, String pregunta) {
        super(seccion, pregunta);
    }
}
