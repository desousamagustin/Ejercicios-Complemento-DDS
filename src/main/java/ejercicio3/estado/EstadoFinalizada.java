package ejercicio3.estado;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstadoFinalizada extends Estado {

    public void enviarNotificacion() {
        System.out.println("Enviada notificacion por e-mail");
        System.out.println("Enviada notificacion por Whatsapp");
    }
}



