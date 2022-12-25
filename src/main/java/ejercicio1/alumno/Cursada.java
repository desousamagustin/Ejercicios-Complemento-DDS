package ejercicio1.alumno;

import ejercicio1.estado.Estado;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cursada {
    private Alumno alumno;
    private Materia materia;
    private Estado strategyEstado;

    public void generarHojaDeRuta() {
        strategyEstado.generarHojaDeRuta(materia,alumno);
    }

    public void asignarValores(Alumno alumno,Materia materia,Estado estado) {
        this.alumno = alumno;
        this.materia = materia;
        this.strategyEstado = estado;
    }
}
