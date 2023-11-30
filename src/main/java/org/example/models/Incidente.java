package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "INCIDENTE")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;
    private String titulo;
    private LocalDateTime fechaIncidente;
    private LocalDate fechaResolucionIncidente;

    @OneToMany(mappedBy = "incidente")
    private List<MensajeNotificacion> mensajesNotificacion;
    @ManyToOne
    @JoinColumn(name = "servicio_id", referencedColumnName = "servicio_id")
    private ClienteServicio servicioReportado;
}