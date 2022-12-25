package ejercicio3.organizacion;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
public class Localizacion {
    private String provincia;
    private String ciudad;
    private String barrio;

    public Localizacion() { // Simulo que provienen de alguna API o base de datos
        ListadoProvincias listadoProvincias = new ListadoProvincias();
        ListadoCiudades listadoCiudades = new ListadoCiudades();
        ListadoBarrios listadoBarrios = new ListadoBarrios();

        setProvincia(listadoProvincias.getProvincias().get(0));
        setCiudad(listadoCiudades.getCiudades().get(0));
        setBarrio(listadoBarrios.getBarrios().get(0));
    }

    public void filtrarCiudades() {  }; // Metodo que, al elegir una provincia, deja visible aquellas ciudades pertenecientes a la misma
    public void filtrarBarrios() {  }; // Misma logica que arriba pero con los barrios
}