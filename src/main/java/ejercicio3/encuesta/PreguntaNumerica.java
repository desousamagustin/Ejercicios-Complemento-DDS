package ejercicio3.encuesta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PreguntaNumerica extends PreguntaCerrada {
     private int valorInf ;
     private int valorSup ;

     public PreguntaNumerica(Seccion seccion, String pregunta, int valorInf, int valorSup) {
          super(seccion, pregunta);
          this.valorInf = valorInf;
          this.valorSup = valorSup;
     }
}
