package ejercicio3.organizacion;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class VolumenDeVentas {
    private List<Categoria> categorias;
    private String valor;

    public VolumenDeVentas(List<Categoria> categorias, String valor) {
        this.categorias = categorias;
        this.valor = valor;
    }
}
