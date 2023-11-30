package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Problema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;
    private TipoProblema tipoProblema;
    private LocalDate fechaEstimada, fechaDeResolucion;
    private List<Integer> horasExtras;
    private String consideraciones;

    @ManyToOne
    @JoinColumn (name = "servicio_id")
    private Servicio servicios;

}
