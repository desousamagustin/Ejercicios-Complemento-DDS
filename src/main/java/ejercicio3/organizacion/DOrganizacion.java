package ejercicio3.organizacion;

import ejercicio3.encuesta.Encuesta;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class DOrganizacion {
    private String razonSocial;
    private Localizacion localizacion;
    private VolumenDeVentas volumenDeVentas;
    private List<Contacto> contactos;
    private List<Encuesta> encuestas;

    public void crearOrganizacion() {
        Scanner scanner = new Scanner(System.in);

        List<DOrganizacion> organizaciones = new ArrayList<>();

        Categoria categoria1 = new Categoria("De $0 a $10.000");
        List<Categoria> categorias1 =new ArrayList<Categoria>();
        categorias1.add(categoria1);

        VolumenDeVentas volumen = new VolumenDeVentas(categorias1, "5000");

        Contacto contacto1 = new Contacto("Agustin","De Sousa","Ayudante",organizaciones);
        List<Contacto>contactos = new ArrayList<Contacto>();
        List<Encuesta> encuestas = new ArrayList<>();
        Localizacion localizacion1 = new Localizacion();

        System.out.print("Razon social: ");
        this.razonSocial = scanner.nextLine();
        this.localizacion = localizacion1;
        this.volumenDeVentas = volumen;
        this.contactos = contactos;
        this.encuestas = encuestas;
    }

    public void mostrarOrganizacion() {
        System.out.println("Razon social: " + this.razonSocial);
        System.out.println("Localizacion: " + this.localizacion.getProvincia() + " | " + this.localizacion.getCiudad() + " | " + this.localizacion.getBarrio());
        System.out.println("Volumen de ventas: " + this.volumenDeVentas.getValor());
    }
}
