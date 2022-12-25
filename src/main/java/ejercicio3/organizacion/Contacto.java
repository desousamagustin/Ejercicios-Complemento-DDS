package ejercicio3.organizacion;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Contacto {
    private String nombre ;
    private String apellido ;
    private String posicionEnOrg ;
    private List<DOrganizacion> organizaciones ;

    public Contacto(String nombre, String apellido, String posicionEnOrg, List<DOrganizacion> organizaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicionEnOrg = posicionEnOrg;
        this.organizaciones = organizaciones;
    }
}
