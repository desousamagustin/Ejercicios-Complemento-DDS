package ejercicio3.estado;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstadoIniciada extends Estado {
    public void enviarNotificacion() {
        System.out.println("Enviada notificacion por e-mail");
    }
}
