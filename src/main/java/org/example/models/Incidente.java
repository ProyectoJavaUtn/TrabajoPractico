package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    /*
    @OneToMany
    @JoinColumn(name = "especialidadIncidente")
    private Especialidad especialidadIncidente;
    @ManyToMany
    @JoinTable( name = "incidente_cliente",
                joinColumns = @JoinColumn(name = "incidente_id"),
                inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    private Cliente client;
    @Enumerated(EnumType.STRING)
    private EstadosIncidente estado;
    private String feedbackIncidente;*/


}
