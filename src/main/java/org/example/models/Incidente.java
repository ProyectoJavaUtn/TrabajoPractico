package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "incidente")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    @Basic
    @Column(name = "fechaIncidente")
    private LocalDateTime fechaIncidente;

    @Basic
    @Column(name = "fechaRevolucionIncidente")
    private LocalDate fechaResolucionIncidente;

    @OneToMany
    @JoinColumn(name = "especialidadIncidente")
    private Especialidad especialidadIncidente;

    @ManyToMany
    @JoinTable(
                name = "incidente_cliente",
                joinColumns = @JoinColumn(name = "incidente_id"),
                inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )

    @Enumerated(EnumType.STRING)
    private Servicios servicioIncidente;

    @Enumerated(EnumType.STRING)
    private EstadosIncidente estado;

    @Basic
    private String feedbackIncidente;

}
