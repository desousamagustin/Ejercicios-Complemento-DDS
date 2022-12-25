package ejercicio3.encuesta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PreguntaVoF extends PreguntaCerrada {
    private String valor;

    public PreguntaVoF(Seccion seccion, String pregunta) {
        super(seccion, pregunta);
    }
}
