package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "incidente")
public class Incidente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;
    private String titulo;
    private LocalDateTime fechaIncidente;
    private LocalDate fechaResolucionIncidente;
    @OneToMany (mappedBy = "incidente")
    private List<MensajeNotificacion> mensajesNotificacion;
    @ManyToOne
    @JoinColumn(name = "servicio_id", referencedColumnName = "servicio_id")
    private ClienteServicio servicioReportado;

    public Incidente() {
        this.mensajesNotificacion = new ArrayList<MensajeNotificacion>();
    }

    public Incidente(String titulo, LocalDateTime fechaIncidente, LocalDate fechaResolucionIncidente) {
        this.titulo = titulo;
        this.fechaIncidente = fechaIncidente;
        this.fechaResolucionIncidente = fechaResolucionIncidente;
        this.mensajesNotificacion = new ArrayList<MensajeNotificacion>();
    }

    public void addMensajeNotificacion(MensajeNotificacion mensaje){
        mensaje.setIncidente(this);
        this.mensajesNotificacion.add(mensaje);
    }

}
