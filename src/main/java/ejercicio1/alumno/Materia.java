package ejercicio1.alumno;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Materia {
    private  int codigoMateria;
    private String nombre;

    public Materia(int codigoMateria, String nombreMateria) {
        this.codigoMateria = codigoMateria;
        this.nombre = nombreMateria;
    }
}
