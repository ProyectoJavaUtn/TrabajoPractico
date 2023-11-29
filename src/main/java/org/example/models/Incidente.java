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
    private String titulo;
    private LocalDateTime fechaIncidente;
    /*private LocalDate fechaResolucionIncidente;
    private Servicios servicioIncidente;
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
