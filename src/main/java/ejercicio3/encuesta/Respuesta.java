package ejercicio3.encuesta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Respuesta {
    private String respuesta;
    private Pregunta pregunta ;

    public Respuesta(String respuesta, Pregunta pregunta) {
        this.respuesta = respuesta;
        this.pregunta = pregunta;
    }
}
