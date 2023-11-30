package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Problema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "tipo_problema_id")
    private TipoProblema tipoProblema;

    private LocalDate fechaEstimada;
    private LocalDate fechaDeResolucion;
    private Integer horasExtras;
    private String consideraciones;

    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicios;

    @ManyToOne
    @JoinColumn(name = "incidente_id")
    private Incidente incidente;
}
