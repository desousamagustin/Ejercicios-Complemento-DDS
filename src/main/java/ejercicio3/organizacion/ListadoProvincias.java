package ejercicio3.organizacion;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Setter
@Getter
public class ListadoProvincias {
    private List<String> provincias = new ArrayList<>();

    public ListadoProvincias() {
        provincias.add("Buenos Aires");
        provincias.add("Cordoba");
        provincias.add("Mendoza");
    }
}