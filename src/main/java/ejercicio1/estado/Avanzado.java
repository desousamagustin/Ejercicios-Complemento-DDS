package ejercicio1.estado;

import ejercicio1.alumno.Alumno;
import ejercicio1.alumno.Materia;

public class Avanzado extends Estado {
    public void generarHojaDeRuta(Materia materia, Alumno alumno) {
        System.out.println("Generada hoja de ruta para cursada en estado avanzado");
    }
}
