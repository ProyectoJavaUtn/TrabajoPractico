package org.example.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Setter @Getter
public class Problema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;
    private Servicio servicios;
    private TipoProblema tipoProblema;
    private LocalDate fechaEstimada, fechaDeResolucion;
    private List<Integer> horasExtras;
    private String consideraciones;


}
