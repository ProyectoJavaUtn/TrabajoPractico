package org.example.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

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
