package ejercicio3.organizacion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Categoria {
    private String descripcion;

    public Categoria(String descripcion) {
        this.descripcion = descripcion;
    }
}
