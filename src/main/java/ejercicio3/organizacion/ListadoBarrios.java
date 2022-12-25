package ejercicio3.organizacion;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ListadoBarrios {
    private List<String> barrios = new ArrayList<>();

    public ListadoBarrios() {
        barrios.add("Caballito");
        barrios.add("Barrio de Cordoba");
        barrios.add("Barrio de Mendoza");
    }
}