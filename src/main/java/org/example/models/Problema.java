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

    public Problema(Servicio servicios, TipoProblema tipoProblema, LocalDate fechaEstimada, LocalDate fechaDeResolucion, List<Integer> horasExtras, String consideraciones) {
        this.servicios = servicios;
        this.tipoProblema = tipoProblema;
        this.fechaEstimada = fechaEstimada;
        this.fechaDeResolucion = fechaDeResolucion;
        this.horasExtras = horasExtras;
        this.consideraciones = consideraciones;
    }
}
