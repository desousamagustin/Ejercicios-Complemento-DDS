package ejercicio3.estado;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Estado {
    public abstract void enviarNotificacion();
}
