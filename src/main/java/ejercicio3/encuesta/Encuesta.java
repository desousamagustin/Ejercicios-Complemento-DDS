package ejercicio3.encuesta;

import ejercicio3.estado.Estado;
import ejercicio3.estado.EstadoFinalizada;
import ejercicio3.estado.EstadoIniciada;
import ejercicio3.organizacion.DOrganizacion;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Encuesta {
    private List<Seccion> secciones = new ArrayList<>();
    private List<Respuesta> respuestas = new ArrayList<>();
    private Estado estado = new EstadoIniciada();
    private DOrganizacion organizacion;

    public void notificar() {
        this.estado.enviarNotificacion();
    }

    public void cambiarEstado() {
        this.estado = new EstadoFinalizada();
    }

    public void crearEncuesta() {
        List<Seccion> secciones = new ArrayList<Seccion>();
        List<Pregunta> listadoPreguntas1 = new ArrayList<Pregunta>();
        List<Pregunta> listadoPreguntas2 = new ArrayList<Pregunta>();
        List<Respuesta> listadoRespuestas = new ArrayList<Respuesta>();

        // Seccion 1
        Seccion seccion1 = new Seccion("Seccion 1");
        Pregunta preguntaAbierta1;
        Respuesta respuestaAbierta1;
        Pregunta preguntaNumerica;
        Respuesta respuestaNumerica;

        // Seccion 2
        Seccion seccion2 = new Seccion("Seccion 2");
        Pregunta preguntaVoF;
        Respuesta respuestaVoF;

        Scanner sn = new Scanner(System.in);
        System.out.println("Encuesta iniciada");
        this.notificar();

        preguntaAbierta1 = new PreguntaAbierta(seccion1, "¿Que opina sobre el mundial?");
        System.out.println("Pregunta 1: " + preguntaAbierta1.getPregunta());
        System.out.print("Ingrese su respuesta: ");
        String respuestaPregAbierta1 = sn.nextLine();
        respuestaAbierta1 = new Respuesta(respuestaPregAbierta1, preguntaAbierta1);
        System.out.println("Respuesta 1: " + respuestaPregAbierta1);

        listadoPreguntas1.add(preguntaAbierta1);
        listadoRespuestas.add(respuestaAbierta1);

        preguntaNumerica = new PreguntaNumerica(seccion1, "Del uno al diez, como calificarias nuestra atencion?", 1, 10);
        System.out.println("Pregunta 2: " + preguntaNumerica.getPregunta());
        System.out.print("Ingrese su respuesta: ");
        String respuestaPreguntaNumerica = sn.nextLine();
        System.out.println("Respuesta 2: " + respuestaPreguntaNumerica);
        respuestaNumerica = new Respuesta(respuestaPreguntaNumerica, preguntaNumerica);
        listadoPreguntas1.add(preguntaNumerica);
        listadoRespuestas.add(respuestaNumerica);
        seccion1.setPreguntas(listadoPreguntas1);
        secciones.add(seccion1);

        preguntaVoF = new PreguntaVoF(seccion2, "Argentina salio campeon del mundial Qatar 2022 (V o F)");
        System.out.println("Pregunta 3: " + preguntaVoF.getPregunta());
        System.out.print("Ingrese su respuesta: ");
        String respuestaPreguntaVoF = sn.nextLine();
        respuestaVoF = new Respuesta(respuestaPreguntaVoF, preguntaVoF);
        System.out.println("Respuesta 3: " + respuestaPreguntaVoF);
        listadoPreguntas2.add(preguntaVoF);
        listadoRespuestas.add(respuestaVoF);
        seccion2.setPreguntas(listadoPreguntas2);
        secciones.add(seccion2);

        System.out.println("Encuesta finalizada");
        this.cambiarEstado();
        this.notificar();

        this.respuestas = listadoRespuestas;
        this.secciones = secciones;
    }

    public void mostrarEncuesta() {
        int i = 0, j = 0 , k = 0;

        while(i < this.secciones.size()) {
            System.out.println(this.secciones.get(i).getNombre());

            while(j < this.secciones.get(i).getPreguntas().size()) {
                System.out.println("Pregunta: " + this.secciones.get(i).getPreguntas().get(j).getPregunta());
                while((k < this.respuestas.size()) && !(this.respuestas.get(k).getPregunta().getPregunta().equals(this.secciones.get(i).getPreguntas().get(j).getPregunta())))
                    k++;

                System.out.println("Respuesta asociada: " + this.respuestas.get(k).getRespuesta());
                k = 0;
                j++;
            }

            i++;
            j = 0;
        }
    }
}