package ejercicio1.estado;

import ejercicio1.alumno.Alumno;
import ejercicio1.alumno.Materia;

public class Peligro extends Estado {
    public void generarHojaDeRuta(Materia materia, Alumno alumno) {
        ServicioAPI servicioAPI = new ServicioAPI();
        servicioAPI.generarHojaDeRuta(materia.getCodigoMateria());
    }
}
