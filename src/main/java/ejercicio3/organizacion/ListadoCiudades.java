package ejercicio3.organizacion;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ListadoCiudades {
    private List<String> ciudades = new ArrayList<>();

    public ListadoCiudades() {
        ciudades.add("CABA");
        ciudades.add("Cordoba");
        ciudades.add("Mendoza");
    }
}
