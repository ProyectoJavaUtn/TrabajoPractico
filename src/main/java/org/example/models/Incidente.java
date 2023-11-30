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

    @Enumerated(EnumType.STRING)
    private EstadosIncidente estado;
    private String feedbackIncidente;

    @ManyToOne
    @JoinColumn(name = "cliente_servicio_id")
    private ClienteServicio clienteServicio;
    @OneToMany (mappedBy = "incidente")
    private List<Problema> problemas;

}
