package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
public class Problema implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "tipo_problema_id")
    private TipoProblema tipoProblema;

    private LocalDateTime fechaEstimada;
    private LocalDateTime fechaDeResolucion;
    private Integer horasExtras;
    private String consideraciones;

    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "incidente_id")
    private Incidente incidente;

    public Problema(LocalDateTime fechaEstimada, LocalDateTime fechaDeResolucion, Integer horasExtras, String consideraciones) {
        this.fechaEstimada = fechaEstimada;
        this.fechaDeResolucion = fechaDeResolucion;
        this.horasExtras = horasExtras;
        this.consideraciones = consideraciones;
    }
}
