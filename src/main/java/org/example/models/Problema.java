package org.example.models;

import lombok.Data;

import javax.persistence.*;
<<<<<<< HEAD
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

=======
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
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03
}
