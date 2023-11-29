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

    private Servicio servicioIncidente;

    private List<Problema> problema;

    @ManyToMany
    @JoinTable( name = "incidente_cliente",
                joinColumns = @JoinColumn(name = "incidente_id"),
                inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    private Cliente client;

    @Enumerated(EnumType.STRING)
    private EstadosIncidente estado;

    private String feedbackIncidente;


}
