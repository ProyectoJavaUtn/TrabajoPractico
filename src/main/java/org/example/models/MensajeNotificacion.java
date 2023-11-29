package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "mensaje_notificacion")
public class MensajeNotificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;
   /* private String tituloDeMensaje;
    private String cuerpoDeMensaje;
    private Incidente incidente;
    private boolean enviado;

    public MensajeNotificacion resume(List<MensajeNotificacion> mensajesNotificacion){
        return mensajesNotificacion.get(0);
    }*/

}
